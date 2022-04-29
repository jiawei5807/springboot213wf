package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 车辆消费
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-04-03 20:27:40
 */
@TableName("cheliangxiaofei")
public class CheliangxiaofeiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public CheliangxiaofeiEntity() {
		
	}
	
	public CheliangxiaofeiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date riqi;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：日期
	 */
	public void setRiqi(Date riqi) {
		this.riqi = riqi;
	}
	/**
	 * 获取：日期
	 */
	public Date getRiqi() {
		return riqi;
	}
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
