package com.entity.vo;

import com.entity.MeirongxiangmuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 美容项目
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-04-03 20:27:40
 */
public class MeirongxiangmuVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 美容项目
	 */
	
	private String meirongxiangmu;
		
	/**
	 * 价格
	 */
	
	private Integer jiage;
				
	
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
