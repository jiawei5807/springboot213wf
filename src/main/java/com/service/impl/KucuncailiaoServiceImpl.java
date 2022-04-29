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


import com.dao.KucuncailiaoDao;
import com.entity.KucuncailiaoEntity;
import com.service.KucuncailiaoService;
import com.entity.vo.KucuncailiaoVO;
import com.entity.view.KucuncailiaoView;

@Service("kucuncailiaoService")
public class KucuncailiaoServiceImpl extends ServiceImpl<KucuncailiaoDao, KucuncailiaoEntity> implements KucuncailiaoService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<KucuncailiaoEntity> page = this.selectPage(
                new Query<KucuncailiaoEntity>(params).getPage(),
                new EntityWrapper<KucuncailiaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<KucuncailiaoEntity> wrapper) {
		  Page<KucuncailiaoView> page =new Query<KucuncailiaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<KucuncailiaoVO> selectListVO(Wrapper<KucuncailiaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public KucuncailiaoVO selectVO(Wrapper<KucuncailiaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<KucuncailiaoView> selectListView(Wrapper<KucuncailiaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public KucuncailiaoView selectView(Wrapper<KucuncailiaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
