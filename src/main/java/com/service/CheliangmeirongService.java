package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.CheliangmeirongEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.CheliangmeirongVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.CheliangmeirongView;


/**
 * 车辆美容
 *
 * @author 
 * @email 
 * @date 2022-04-03 20:27:40
 */
public interface CheliangmeirongService extends IService<CheliangmeirongEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<CheliangmeirongVO> selectListVO(Wrapper<CheliangmeirongEntity> wrapper);
   	
   	CheliangmeirongVO selectVO(@Param("ew") Wrapper<CheliangmeirongEntity> wrapper);
   	
   	List<CheliangmeirongView> selectListView(Wrapper<CheliangmeirongEntity> wrapper);
   	
   	CheliangmeirongView selectView(@Param("ew") Wrapper<CheliangmeirongEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<CheliangmeirongEntity> wrapper);
   	

}

