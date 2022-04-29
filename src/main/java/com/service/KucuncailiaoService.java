package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.KucuncailiaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.KucuncailiaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.KucuncailiaoView;


/**
 * 库存材料
 *
 * @author 
 * @email 
 * @date 2022-04-03 20:27:40
 */
public interface KucuncailiaoService extends IService<KucuncailiaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<KucuncailiaoVO> selectListVO(Wrapper<KucuncailiaoEntity> wrapper);
   	
   	KucuncailiaoVO selectVO(@Param("ew") Wrapper<KucuncailiaoEntity> wrapper);
   	
   	List<KucuncailiaoView> selectListView(Wrapper<KucuncailiaoEntity> wrapper);
   	
   	KucuncailiaoView selectView(@Param("ew") Wrapper<KucuncailiaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<KucuncailiaoEntity> wrapper);
   	

}

