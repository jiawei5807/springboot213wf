package com.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.LaichedengjiDao;
import com.entity.LaichedengjiEntity;
import com.service.LaichedengjiService;
import com.entity.vo.LaichedengjiVO;
import com.entity.view.LaichedengjiView;

@Service("laichedengjiService")
public class LaichedengjiServiceImpl extends ServiceImpl<LaichedengjiDao, LaichedengjiEntity> implements LaichedengjiService {

    @Autowired
    private LaichedengjiDao laichedengjiDao;

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<LaichedengjiEntity> page = this.selectPage(
                new Query<LaichedengjiEntity>(params).getPage(),
                new EntityWrapper<LaichedengjiEntity>()
        );
        return new PageUtils(page);
    }

    @Override
    public PageUtils queryPage(Map<String, Object> params, Wrapper<LaichedengjiEntity> wrapper) {
        Page<LaichedengjiView> page = new Query<LaichedengjiView>(params).getPage();
        page.setRecords(baseMapper.selectListView(page, wrapper));
        PageUtils pageUtil = new PageUtils(page);
        return pageUtil;
    }

    @Override
    public Double getLishixiaofei(String name) {
        return laichedengjiDao.laichexiaofei(name);
    }

    @Override
    public List<LaichedengjiVO> selectListVO(Wrapper<LaichedengjiEntity> wrapper) {
        return baseMapper.selectListVO(wrapper);
    }

    @Override
    public LaichedengjiVO selectVO(Wrapper<LaichedengjiEntity> wrapper) {
        return baseMapper.selectVO(wrapper);
    }

    @Override
    public List<LaichedengjiView> selectListView(Wrapper<LaichedengjiEntity> wrapper) {
        return baseMapper.selectListView(wrapper);
    }

    @Override
    public LaichedengjiView selectView(Wrapper<LaichedengjiEntity> wrapper) {
        return baseMapper.selectView(wrapper);
    }


}
