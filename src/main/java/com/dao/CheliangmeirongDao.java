package com.dao;

import com.entity.CheliangmeirongEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.CheliangmeirongVO;
import com.entity.view.CheliangmeirongView;


/**
 * 车辆美容
 * 
 * @author 
 * @email 
 * @date 2022-04-03 20:27:40
 */
public interface CheliangmeirongDao extends BaseMapper<CheliangmeirongEntity> {
	
	List<CheliangmeirongVO> selectListVO(@Param("ew") Wrapper<CheliangmeirongEntity> wrapper);
	
	CheliangmeirongVO selectVO(@Param("ew") Wrapper<CheliangmeirongEntity> wrapper);
	
	List<CheliangmeirongView> selectListView(@Param("ew") Wrapper<CheliangmeirongEntity> wrapper);

	List<CheliangmeirongView> selectListView(Pagination page,@Param("ew") Wrapper<CheliangmeirongEntity> wrapper);
	
	CheliangmeirongView selectView(@Param("ew") Wrapper<CheliangmeirongEntity> wrapper);
	

}
