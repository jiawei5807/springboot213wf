package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.CailiaorukuDao;
import com.entity.CailiaorukuEntity;
import com.service.CailiaorukuService;
import com.entity.vo.CailiaorukuVO;
import com.entity.view.CailiaorukuView;

@Service("cailiaorukuService")
public class CailiaorukuServiceImpl extends ServiceImpl<CailiaorukuDao, CailiaorukuEntity> implements CailiaorukuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<CailiaorukuEntity> page = this.selectPage(
                new Query<CailiaorukuEntity>(params).getPage(),
                new EntityWrapper<CailiaorukuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<CailiaorukuEntity> wrapper) {
		  Page<CailiaorukuView> page =new Query<CailiaorukuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<CailiaorukuVO> selectListVO(Wrapper<CailiaorukuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public CailiaorukuVO selectVO(Wrapper<CailiaorukuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<CailiaorukuView> selectListView(Wrapper<CailiaorukuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public CailiaorukuView selectView(Wrapper<CailiaorukuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
