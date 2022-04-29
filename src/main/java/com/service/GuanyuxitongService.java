package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GuanyuxitongEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GuanyuxitongVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GuanyuxitongView;


/**
 * 关于系统
 *
 * @author 
 * @email 
 * @date 2022-04-03 20:27:40
 */
public interface GuanyuxitongService extends IService<GuanyuxitongEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GuanyuxitongVO> selectListVO(Wrapper<GuanyuxitongEntity> wrapper);
   	
   	GuanyuxitongVO selectVO(@Param("ew") Wrapper<GuanyuxitongEntity> wrapper);
   	
   	List<GuanyuxitongView> selectListView(Wrapper<GuanyuxitongEntity> wrapper);
   	
   	GuanyuxitongView selectView(@Param("ew") Wrapper<GuanyuxitongEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GuanyuxitongEntity> wrapper);
   	

}

