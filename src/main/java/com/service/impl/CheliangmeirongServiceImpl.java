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


import com.dao.CheliangmeirongDao;
import com.entity.CheliangmeirongEntity;
import com.service.CheliangmeirongService;
import com.entity.vo.CheliangmeirongVO;
import com.entity.view.CheliangmeirongView;

@Service("cheliangmeirongService")
public class CheliangmeirongServiceImpl extends ServiceImpl<CheliangmeirongDao, CheliangmeirongEntity> implements CheliangmeirongService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<CheliangmeirongEntity> page = this.selectPage(
                new Query<CheliangmeirongEntity>(params).getPage(),
                new EntityWrapper<CheliangmeirongEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<CheliangmeirongEntity> wrapper) {
		  Page<CheliangmeirongView> page =new Query<CheliangmeirongView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<CheliangmeirongVO> selectListVO(Wrapper<CheliangmeirongEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public CheliangmeirongVO selectVO(Wrapper<CheliangmeirongEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<CheliangmeirongView> selectListView(Wrapper<CheliangmeirongEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public CheliangmeirongView selectView(Wrapper<CheliangmeirongEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
