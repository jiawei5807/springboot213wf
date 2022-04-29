package com.entity.model;

import com.entity.GuanyuxitongEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 关于系统
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-04-03 20:27:40
 */
public class GuanyuxitongModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 网站功能
	 */
	
	private String wangzhangongneng;
		
	/**
	 * 联系方式
	 */
	
	private String lianxifangshi;
		
	/**
	 * 邮箱
	 */
	
	private String youxiang;
		
	/**
	 * 发布时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date fabushijian;
		
	/**
	 * 功能介绍
	 */
	
	private String gongnengjieshao;
				
	
	/**
	 * 设置：网站功能
	 */
	 
	public void setWangzhangongneng(String wangzhangongneng) {
		this.wangzhangongneng = wangzhangongneng;
	}
	
	/**
	 * 获取：网站功能
	 */
	public String getWangzhangongneng() {
		return wangzhangongneng;
	}
				
	
	/**
	 * 设置：联系方式
	 */
	 
	public void setLianxifangshi(String lianxifangshi) {
		this.lianxifangshi = lianxifangshi;
	}
	
	/**
	 * 获取：联系方式
	 */
	public String getLianxifangshi() {
		return lianxifangshi;
	}
				
	
	/**
	 * 设置：邮箱
	 */
	 
	public void setYouxiang(String youxiang) {
		this.youxiang = youxiang;
	}
	
	/**
	 * 获取：邮箱
	 */
	public String getYouxiang() {
		return youxiang;
	}
				
	
	/**
	 * 设置：发布时间
	 */
	 
	public void setFabushijian(Date fabushijian) {
		this.fabushijian = fabushijian;
	}
	
	/**
	 * 获取：发布时间
	 */
	public Date getFabushijian() {
		return fabushijian;
	}
				
	
	/**
	 * 设置：功能介绍
	 */
	 
	public void setGongnengjieshao(String gongnengjieshao) {
		this.gongnengjieshao = gongnengjieshao;
	}
	
	/**
	 * 获取：功能介绍
	 */
	public String getGongnengjieshao() {
		return gongnengjieshao;
	}
			
}
