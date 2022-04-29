package com.dao;

import com.entity.LaichedengjiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;

import java.util.List;
import java.util.Map;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import com.entity.vo.LaichedengjiVO;
import com.entity.view.LaichedengjiView;
import org.apache.ibatis.annotations.Select;


/**
 * 来车登记
 *
 * @author
 * @email
 * @date 2022-04-03 20:27:40
 */
@Mapper
public interface LaichedengjiDao extends BaseMapper<LaichedengjiEntity> {

    List<LaichedengjiVO> selectListVO(@Param("ew") Wrapper<LaichedengjiEntity> wrapper);

    LaichedengjiVO selectVO(@Param("ew") Wrapper<LaichedengjiEntity> wrapper);

    List<LaichedengjiView> selectListView(@Param("ew") Wrapper<LaichedengjiEntity> wrapper);

    List<LaichedengjiView> selectListView(Pagination page, @Param("ew") Wrapper<LaichedengjiEntity> wrapper);

    LaichedengjiView selectView(@Param("ew") Wrapper<LaichedengjiEntity> wrapper);

    @Select("select SUM(shishoujine) FROM cheliangxiaofei WHERE zhanghao = #{name} AND ispay='已支付'")
    Double laichexiaofei(@Param("name") String name);

}
