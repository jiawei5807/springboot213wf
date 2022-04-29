package com.dao;

import com.entity.CailiaorukuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.CailiaorukuVO;
import com.entity.view.CailiaorukuView;


/**
 * 材料入库
 * 
 * @author 
 * @email 
 * @date 2022-04-03 20:27:40
 */
public interface CailiaorukuDao extends BaseMapper<CailiaorukuEntity> {
	
	List<CailiaorukuVO> selectListVO(@Param("ew") Wrapper<CailiaorukuEntity> wrapper);
	
	CailiaorukuVO selectVO(@Param("ew") Wrapper<CailiaorukuEntity> wrapper);
	
	List<CailiaorukuView> selectListView(@Param("ew") Wrapper<CailiaorukuEntity> wrapper);

	List<CailiaorukuView> selectListView(Pagination page,@Param("ew") Wrapper<CailiaorukuEntity> wrapper);
	
	CailiaorukuView selectView(@Param("ew") Wrapper<CailiaorukuEntity> wrapper);
	

}
