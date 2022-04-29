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


import com.dao.CheliangxiaofeiDao;
import com.entity.CheliangxiaofeiEntity;
import com.service.CheliangxiaofeiService;
import com.entity.vo.CheliangxiaofeiVO;
import com.entity.view.CheliangxiaofeiView;

@Service("cheliangxiaofeiService")
public class CheliangxiaofeiServiceImpl extends ServiceImpl<CheliangxiaofeiDao, CheliangxiaofeiEntity> implements CheliangxiaofeiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<CheliangxiaofeiEntity> page = this.selectPage(
                new Query<CheliangxiaofeiEntity>(params).getPage(),
                new EntityWrapper<CheliangxiaofeiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<CheliangxiaofeiEntity> wrapper) {
		  Page<CheliangxiaofeiView> page =new Query<CheliangxiaofeiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<CheliangxiaofeiVO> selectListVO(Wrapper<CheliangxiaofeiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public CheliangxiaofeiVO selectVO(Wrapper<CheliangxiaofeiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<CheliangxiaofeiView> selectListView(Wrapper<CheliangxiaofeiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public CheliangxiaofeiView selectView(Wrapper<CheliangxiaofeiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
