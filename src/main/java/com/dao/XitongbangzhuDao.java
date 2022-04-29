package com.dao;

import com.entity.XitongbangzhuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XitongbangzhuVO;
import com.entity.view.XitongbangzhuView;


/**
 * 系统帮助
 * 
 * @author 
 * @email 
 * @date 2022-04-03 20:27:40
 */
public interface XitongbangzhuDao extends BaseMapper<XitongbangzhuEntity> {
	
	List<XitongbangzhuVO> selectListVO(@Param("ew") Wrapper<XitongbangzhuEntity> wrapper);
	
	XitongbangzhuVO selectVO(@Param("ew") Wrapper<XitongbangzhuEntity> wrapper);
	
	List<XitongbangzhuView> selectListView(@Param("ew") Wrapper<XitongbangzhuEntity> wrapper);

	List<XitongbangzhuView> selectListView(Pagination page,@Param("ew") Wrapper<XitongbangzhuEntity> wrapper);
	
	XitongbangzhuView selectView(@Param("ew") Wrapper<XitongbangzhuEntity> wrapper);
	

}
