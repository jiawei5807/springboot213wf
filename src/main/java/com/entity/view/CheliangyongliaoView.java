package com.entity.view;

import com.entity.CheliangyongliaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 车辆用料
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-03 20:27:40
 */
@TableName("cheliangyongliao")
public class CheliangyongliaoView  extends CheliangyongliaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public CheliangyongliaoView(){
	}
 
 	public CheliangyongliaoView(CheliangyongliaoEntity cheliangyongliaoEntity){
 	try {
			BeanUtils.copyProperties(this, cheliangyongliaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
