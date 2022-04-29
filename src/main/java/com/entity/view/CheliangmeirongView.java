package com.entity.view;

import com.entity.CheliangmeirongEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 车辆美容
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-03 20:27:40
 */
@TableName("cheliangmeirong")
public class CheliangmeirongView  extends CheliangmeirongEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public CheliangmeirongView(){
	}
 
 	public CheliangmeirongView(CheliangmeirongEntity cheliangmeirongEntity){
 	try {
			BeanUtils.copyProperties(this, cheliangmeirongEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
