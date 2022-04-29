package com.dao;

import com.entity.CheliangyongliaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.CheliangyongliaoVO;
import com.entity.view.CheliangyongliaoView;


/**
 * 车辆用料
 * 
 * @author 
 * @email 
 * @date 2022-04-03 20:27:40
 */
public interface CheliangyongliaoDao extends BaseMapper<CheliangyongliaoEntity> {
	
	List<CheliangyongliaoVO> selectListVO(@Param("ew") Wrapper<CheliangyongliaoEntity> wrapper);
	
	CheliangyongliaoVO selectVO(@Param("ew") Wrapper<CheliangyongliaoEntity> wrapper);
	
	List<CheliangyongliaoView> selectListView(@Param("ew") Wrapper<CheliangyongliaoEntity> wrapper);

	List<CheliangyongliaoView> selectListView(Pagination page,@Param("ew") Wrapper<CheliangyongliaoEntity> wrapper);
	
	CheliangyongliaoView selectView(@Param("ew") Wrapper<CheliangyongliaoEntity> wrapper);
	

}
