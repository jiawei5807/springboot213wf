package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.LaichedengjiEntity;

import java.util.List;
import java.util.Map;

import com.entity.vo.LaichedengjiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.LaichedengjiView;


/**
 * 来车登记
 *
 * @author
 * @email
 * @date 2022-04-03 20:27:40
 */
public interface LaichedengjiService extends IService<LaichedengjiEntity> {

    PageUtils queryPage(Map<String, Object> params);

    List<LaichedengjiVO> selectListVO(Wrapper<LaichedengjiEntity> wrapper);

    LaichedengjiVO selectVO(@Param("ew") Wrapper<LaichedengjiEntity> wrapper);

    List<LaichedengjiView> selectListView(Wrapper<LaichedengjiEntity> wrapper);

    LaichedengjiView selectView(@Param("ew") Wrapper<LaichedengjiEntity> wrapper);

    PageUtils queryPage(Map<String, Object> params, Wrapper<LaichedengjiEntity> wrapper);

    Double getLishixiaofei(String name);
}

