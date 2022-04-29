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


import com.dao.CheliangyongliaoDao;
import com.entity.CheliangyongliaoEntity;
import com.service.CheliangyongliaoService;
import com.entity.vo.CheliangyongliaoVO;
import com.entity.view.CheliangyongliaoView;

@Service("cheliangyongliaoService")
public class CheliangyongliaoServiceImpl extends ServiceImpl<CheliangyongliaoDao, CheliangyongliaoEntity> implements CheliangyongliaoService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<CheliangyongliaoEntity> page = this.selectPage(
                new Query<CheliangyongliaoEntity>(params).getPage(),
                new EntityWrapper<CheliangyongliaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<CheliangyongliaoEntity> wrapper) {
		  Page<CheliangyongliaoView> page =new Query<CheliangyongliaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<CheliangyongliaoVO> selectListVO(Wrapper<CheliangyongliaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public CheliangyongliaoVO selectVO(Wrapper<CheliangyongliaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<CheliangyongliaoView> selectListView(Wrapper<CheliangyongliaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public CheliangyongliaoView selectView(Wrapper<CheliangyongliaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
