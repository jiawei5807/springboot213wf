package com.dao;

import com.entity.GuanyuxitongEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GuanyuxitongVO;
import com.entity.view.GuanyuxitongView;


/**
 * 关于系统
 * 
 * @author 
 * @email 
 * @date 2022-04-03 20:27:40
 */
public interface GuanyuxitongDao extends BaseMapper<GuanyuxitongEntity> {
	
	List<GuanyuxitongVO> selectListVO(@Param("ew") Wrapper<GuanyuxitongEntity> wrapper);
	
	GuanyuxitongVO selectVO(@Param("ew") Wrapper<GuanyuxitongEntity> wrapper);
	
	List<GuanyuxitongView> selectListView(@Param("ew") Wrapper<GuanyuxitongEntity> wrapper);

	List<GuanyuxitongView> selectListView(Pagination page,@Param("ew") Wrapper<GuanyuxitongEntity> wrapper);
	
	GuanyuxitongView selectView(@Param("ew") Wrapper<GuanyuxitongEntity> wrapper);
	

}
