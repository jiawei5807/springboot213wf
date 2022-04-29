package com.dao;

import com.entity.KucuncailiaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.KucuncailiaoVO;
import com.entity.view.KucuncailiaoView;


/**
 * 库存材料
 * 
 * @author 
 * @email 
 * @date 2022-04-03 20:27:40
 */
public interface KucuncailiaoDao extends BaseMapper<KucuncailiaoEntity> {
	
	List<KucuncailiaoVO> selectListVO(@Param("ew") Wrapper<KucuncailiaoEntity> wrapper);
	
	KucuncailiaoVO selectVO(@Param("ew") Wrapper<KucuncailiaoEntity> wrapper);
	
	List<KucuncailiaoView> selectListView(@Param("ew") Wrapper<KucuncailiaoEntity> wrapper);

	List<KucuncailiaoView> selectListView(Pagination page,@Param("ew") Wrapper<KucuncailiaoEntity> wrapper);
	
	KucuncailiaoView selectView(@Param("ew") Wrapper<KucuncailiaoEntity> wrapper);
	

}
