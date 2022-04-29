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

import com.entity.LaichedengjiEntity;
import com.entity.view.LaichedengjiView;

import com.service.LaichedengjiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;

import java.io.IOException;

/**
 * 来车登记
 * 后端接口
 *
 * @author
 * @email
 * @date 2022-04-03 20:27:40
 */
@RestController
@RequestMapping("/laichedengji")
public class LaichedengjiController {
    @Autowired
    private LaichedengjiService laichedengjiService;


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, LaichedengjiEntity laichedengji,
                  HttpServletRequest request) {
        String tableName = request.getSession().getAttribute("tableName").toString();
        if (tableName.equals("yonghu")) {
            laichedengji.setZhanghao((String) request.getSession().getAttribute("username"));
        }
        EntityWrapper<LaichedengjiEntity> ew = new EntityWrapper<LaichedengjiEntity>();
        PageUtils page = laichedengjiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, laichedengji), params), params));

        return R.ok().put("data", page);
    }

    /**
     * 前端列表
     */
    @IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params, LaichedengjiEntity laichedengji,
                  HttpServletRequest request) {
        EntityWrapper<LaichedengjiEntity> ew = new EntityWrapper<LaichedengjiEntity>();
        PageUtils page = laichedengjiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, laichedengji), params), params));
        return R.ok().put("data", page);
    }

    /**
     * 列表
     */
    @RequestMapping("/lists")
    public R list(LaichedengjiEntity laichedengji) {
        EntityWrapper<LaichedengjiEntity> ew = new EntityWrapper<LaichedengjiEntity>();
        ew.allEq(MPUtil.allEQMapPre(laichedengji, "laichedengji"));
        return R.ok().put("data", laichedengjiService.selectListView(ew));
    }

    /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(LaichedengjiEntity laichedengji) {
        EntityWrapper<LaichedengjiEntity> ew = new EntityWrapper<LaichedengjiEntity>();
        ew.allEq(MPUtil.allEQMapPre(laichedengji, "laichedengji"));
        LaichedengjiView laichedengjiView = laichedengjiService.selectView(ew);
        return R.ok("查询来车登记成功").put("data", laichedengjiView);
    }

    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id) {
        LaichedengjiEntity laichedengji = laichedengjiService.selectById(id);
        Double lishixiaofei = laichedengjiService.getLishixiaofei(laichedengji.getZhanghao());
        if (lishixiaofei == null) {
            lishixiaofei = 0D;
        }
        laichedengji.setLishixiaofei(lishixiaofei);
        return R.ok().put("data", laichedengji);
    }

    /**
     * 前端详情
     */
    @IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id) {
        LaichedengjiEntity laichedengji = laichedengjiService.selectById(id);
        return R.ok().put("data", laichedengji);
    }


    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody LaichedengjiEntity laichedengji, HttpServletRequest request) {
        laichedengji.setId(new Date().getTime() + new Double(Math.floor(Math.random() * 1000)).longValue());
        //ValidatorUtils.validateEntity(laichedengji);
        laichedengjiService.insert(laichedengji);
        return R.ok();
    }

    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody LaichedengjiEntity laichedengji, HttpServletRequest request) {
        laichedengji.setId(new Date().getTime() + new Double(Math.floor(Math.random() * 1000)).longValue());
        //ValidatorUtils.validateEntity(laichedengji);
        laichedengjiService.insert(laichedengji);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody LaichedengjiEntity laichedengji, HttpServletRequest request) {
        //ValidatorUtils.validateEntity(laichedengji);
        laichedengjiService.updateById(laichedengji);//全部更新
        return R.ok();
    }


    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids) {
        laichedengjiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }

    /**
     * 提醒接口
     */
    @RequestMapping("/remind/{columnName}/{type}")
    public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request,
                         @PathVariable("type") String type, @RequestParam Map<String, Object> map) {
        map.put("column", columnName);
        map.put("type", type);

        if (type.equals("2")) {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Calendar c = Calendar.getInstance();
            Date remindStartDate = null;
            Date remindEndDate = null;
            if (map.get("remindstart") != null) {
                Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
                c.setTime(new Date());
                c.add(Calendar.DAY_OF_MONTH, remindStart);
                remindStartDate = c.getTime();
                map.put("remindstart", sdf.format(remindStartDate));
            }
            if (map.get("remindend") != null) {
                Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
                c.setTime(new Date());
                c.add(Calendar.DAY_OF_MONTH, remindEnd);
                remindEndDate = c.getTime();
                map.put("remindend", sdf.format(remindEndDate));
            }
        }

        Wrapper<LaichedengjiEntity> wrapper = new EntityWrapper<LaichedengjiEntity>();
        if (map.get("remindstart") != null) {
            wrapper.ge(columnName, map.get("remindstart"));
        }
        if (map.get("remindend") != null) {
            wrapper.le(columnName, map.get("remindend"));
        }

        String tableName = request.getSession().getAttribute("tableName").toString();
        if (tableName.equals("yonghu")) {
            wrapper.eq("zhanghao", (String) request.getSession().getAttribute("username"));
        }

        int count = laichedengjiService.selectCount(wrapper);
        return R.ok().put("count", count);
    }


}
