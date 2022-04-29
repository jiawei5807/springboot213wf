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


import com.dao.GuanyuxitongDao;
import com.entity.GuanyuxitongEntity;
import com.service.GuanyuxitongService;
import com.entity.vo.GuanyuxitongVO;
import com.entity.view.GuanyuxitongView;

@Service("guanyuxitongService")
public class GuanyuxitongServiceImpl extends ServiceImpl<GuanyuxitongDao, GuanyuxitongEntity> implements GuanyuxitongService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GuanyuxitongEntity> page = this.selectPage(
                new Query<GuanyuxitongEntity>(params).getPage(),
                new EntityWrapper<GuanyuxitongEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GuanyuxitongEntity> wrapper) {
		  Page<GuanyuxitongView> page =new Query<GuanyuxitongView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GuanyuxitongVO> selectListVO(Wrapper<GuanyuxitongEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GuanyuxitongVO selectVO(Wrapper<GuanyuxitongEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GuanyuxitongView> selectListView(Wrapper<GuanyuxitongEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GuanyuxitongView selectView(Wrapper<GuanyuxitongEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
