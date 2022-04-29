package com.entity.model;

import com.entity.CheliangxiaofeiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 车辆消费
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-04-03 20:27:40
 */
public class CheliangxiaofeiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 车牌号码
	 */
	
	private String chepaihaoma;
		
	/**
	 * 账号
	 */
	
	private String zhanghao;
		
	/**
	 * 人工费合计
	 */
	
	private Integer rengongfeiheji;
		
	/**
	 * 材料费合计
	 */
	
	private Integer cailiaofeiheji;
		
	/**
	 * 总金额
	 */
	
	private Integer zongjine;
		
	/**
	 * 实收金额
	 */
	
	private Integer shishoujine;
		
	/**
	 * 是否支付
	 */
	
	private String ispay;
				
	
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
	 * 设置：账号
	 */
	 
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
	}
				
	
	/**
	 * 设置：人工费合计
	 */
	 
	public void setRengongfeiheji(Integer rengongfeiheji) {
		this.rengongfeiheji = rengongfeiheji;
	}
	
	/**
	 * 获取：人工费合计
	 */
	public Integer getRengongfeiheji() {
		return rengongfeiheji;
	}
				
	
	/**
	 * 设置：材料费合计
	 */
	 
	public void setCailiaofeiheji(Integer cailiaofeiheji) {
		this.cailiaofeiheji = cailiaofeiheji;
	}
	
	/**
	 * 获取：材料费合计
	 */
	public Integer getCailiaofeiheji() {
		return cailiaofeiheji;
	}
				
	
	/**
	 * 设置：总金额
	 */
	 
	public void setZongjine(Integer zongjine) {
		this.zongjine = zongjine;
	}
	
	/**
	 * 获取：总金额
	 */
	public Integer getZongjine() {
		return zongjine;
	}
				
	
	/**
	 * 设置：实收金额
	 */
	 
	public void setShishoujine(Integer shishoujine) {
		this.shishoujine = shishoujine;
	}
	
	/**
	 * 获取：实收金额
	 */
	public Integer getShishoujine() {
		return shishoujine;
	}
				
	
	/**
	 * 设置：是否支付
	 */
	 
	public void setIspay(String ispay) {
		this.ispay = ispay;
	}
	
	/**
	 * 获取：是否支付
	 */
	public String getIspay() {
		return ispay;
	}
			
}
