package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.CailiaorukuEntity;
import com.entity.view.CailiaorukuView;

import com.service.CailiaorukuService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 材料入库
 * 后端接口
 * @author 
 * @email 
 * @date 2022-04-03 20:27:40
 */
@RestController
@RequestMapping("/cailiaoruku")
public class CailiaorukuController {
    @Autowired
    private CailiaorukuService cailiaorukuService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,CailiaorukuEntity cailiaoruku,
		HttpServletRequest request){
        EntityWrapper<CailiaorukuEntity> ew = new EntityWrapper<CailiaorukuEntity>();
		PageUtils page = cailiaorukuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, cailiaoruku), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,CailiaorukuEntity cailiaoruku, 
		HttpServletRequest request){
        EntityWrapper<CailiaorukuEntity> ew = new EntityWrapper<CailiaorukuEntity>();
		PageUtils page = cailiaorukuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, cailiaoruku), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( CailiaorukuEntity cailiaoruku){
       	EntityWrapper<CailiaorukuEntity> ew = new EntityWrapper<CailiaorukuEntity>();
      	ew.allEq(MPUtil.allEQMapPre( cailiaoruku, "cailiaoruku")); 
        return R.ok().put("data", cailiaorukuService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(CailiaorukuEntity cailiaoruku){
        EntityWrapper< CailiaorukuEntity> ew = new EntityWrapper< CailiaorukuEntity>();
 		ew.allEq(MPUtil.allEQMapPre( cailiaoruku, "cailiaoruku")); 
		CailiaorukuView cailiaorukuView =  cailiaorukuService.selectView(ew);
		return R.ok("查询材料入库成功").put("data", cailiaorukuView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        CailiaorukuEntity cailiaoruku = cailiaorukuService.selectById(id);
        return R.ok().put("data", cailiaoruku);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        CailiaorukuEntity cailiaoruku = cailiaorukuService.selectById(id);
        return R.ok().put("data", cailiaoruku);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody CailiaorukuEntity cailiaoruku, HttpServletRequest request){
    	cailiaoruku.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(cailiaoruku);
        cailiaorukuService.insert(cailiaoruku);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody CailiaorukuEntity cailiaoruku, HttpServletRequest request){
    	cailiaoruku.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(cailiaoruku);
        cailiaorukuService.insert(cailiaoruku);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody CailiaorukuEntity cailiaoruku, HttpServletRequest request){
        //ValidatorUtils.validateEntity(cailiaoruku);
        cailiaorukuService.updateById(cailiaoruku);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        cailiaorukuService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<CailiaorukuEntity> wrapper = new EntityWrapper<CailiaorukuEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = cailiaorukuService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	







}
