package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.CheliangyongliaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.CheliangyongliaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.CheliangyongliaoView;


/**
 * 车辆用料
 *
 * @author 
 * @email 
 * @date 2022-04-03 20:27:40
 */
public interface CheliangyongliaoService extends IService<CheliangyongliaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<CheliangyongliaoVO> selectListVO(Wrapper<CheliangyongliaoEntity> wrapper);
   	
   	CheliangyongliaoVO selectVO(@Param("ew") Wrapper<CheliangyongliaoEntity> wrapper);
   	
   	List<CheliangyongliaoView> selectListView(Wrapper<CheliangyongliaoEntity> wrapper);
   	
   	CheliangyongliaoView selectView(@Param("ew") Wrapper<CheliangyongliaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<CheliangyongliaoEntity> wrapper);
   	

}

