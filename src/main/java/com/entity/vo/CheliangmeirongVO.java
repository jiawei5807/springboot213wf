package com.entity.vo;

import com.entity.CheliangmeirongEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 车辆美容
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-04-03 20:27:40
 */
public class CheliangmeirongVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 车牌号码
	 */
	
	private String chepaihaoma;
		
	/**
	 * 接车部门
	 */
	
	private String jiechebumen;
		
	/**
	 * 美容项目
	 */
	
	private String meirongxiangmu;
		
	/**
	 * 价格
	 */
	
	private Integer jiage;
				
	
	/**
	 * 设置：车牌号码
	 */
	 
	public void setChepaihaoma(String chepaihaoma) {
		this.chepaihaoma = chepaihaoma;
	}
	
	/**
	 * 获取：车牌号码
	 */
	public String getChepaihaoma() {
		return chepaihaoma;
	}
				
	
	/**
	 * 设置：接车部门
	 */
	 
	public void setJiechebumen(String jiechebumen) {
		this.jiechebumen = jiechebumen;
	}
	
	/**
	 * 获取：接车部门
	 */
	public String getJiechebumen() {
		return jiechebumen;
	}
				
	
	/**
	 * 设置：美容项目
	 */
	 
	public void setMeirongxiangmu(String meirongxiangmu) {
		this.meirongxiangmu = meirongxiangmu;
	}
	
	/**
	 * 获取：美容项目
	 */
	public String getMeirongxiangmu() {
		return meirongxiangmu;
	}
				
	
	/**
	 * 设置：价格
	 */
	 
	public void setJiage(Integer jiage) {
		this.jiage = jiage;
	}
	
	/**
	 * 获取：价格
	 */
	public Integer getJiage() {
		return jiage;
	}
			
}
