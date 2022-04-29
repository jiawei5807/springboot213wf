package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.CheliangxiaofeiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.CheliangxiaofeiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.CheliangxiaofeiView;


/**
 * 车辆消费
 *
 * @author 
 * @email 
 * @date 2022-04-03 20:27:40
 */
public interface CheliangxiaofeiService extends IService<CheliangxiaofeiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<CheliangxiaofeiVO> selectListVO(Wrapper<CheliangxiaofeiEntity> wrapper);
   	
   	CheliangxiaofeiVO selectVO(@Param("ew") Wrapper<CheliangxiaofeiEntity> wrapper);
   	
   	List<CheliangxiaofeiView> selectListView(Wrapper<CheliangxiaofeiEntity> wrapper);
   	
   	CheliangxiaofeiView selectView(@Param("ew") Wrapper<CheliangxiaofeiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<CheliangxiaofeiEntity> wrapper);
   	

}

