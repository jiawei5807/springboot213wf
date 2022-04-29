package com.dao;

import com.entity.CheliangxiaofeiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.CheliangxiaofeiVO;
import com.entity.view.CheliangxiaofeiView;


/**
 * 车辆消费
 * 
 * @author 
 * @email 
 * @date 2022-04-03 20:27:40
 */
public interface CheliangxiaofeiDao extends BaseMapper<CheliangxiaofeiEntity> {
	
	List<CheliangxiaofeiVO> selectListVO(@Param("ew") Wrapper<CheliangxiaofeiEntity> wrapper);
	
	CheliangxiaofeiVO selectVO(@Param("ew") Wrapper<CheliangxiaofeiEntity> wrapper);
	
	List<CheliangxiaofeiView> selectListView(@Param("ew") Wrapper<CheliangxiaofeiEntity> wrapper);

	List<CheliangxiaofeiView> selectListView(Pagination page,@Param("ew") Wrapper<CheliangxiaofeiEntity> wrapper);
	
	CheliangxiaofeiView selectView(@Param("ew") Wrapper<CheliangxiaofeiEntity> wrapper);
	

}
