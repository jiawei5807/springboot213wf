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
 * 库存材料
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-04-03 20:27:40
 */
@TableName("kucuncailiao")
public class KucuncailiaoEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public KucuncailiaoEntity() {
		
	}
	
	public KucuncailiaoEntity(T t) {
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
	 * 材料号
	 */
					
	private String cailiaohao;
	
	/**
	 * 材料名称
	 */
					
	private String cailiaomingcheng;
	
	/**
	 * 进货单价
	 */
					
	private Integer jinhuodanjia;
	
	/**
	 * 数量
	 */
					
	private Integer shuliang;
	
	/**
	 * 供应商号
	 */
					
	private String gongyingshanghao;
	
	/**
	 * 供应商名称
	 */
					
	private String gongyingshangmingcheng;
	
	/**
	 * 备注
	 */
					
	private String beizhu;
	
	
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
	 * 设置：材料号
	 */
	public void setCailiaohao(String cailiaohao) {
		this.cailiaohao = cailiaohao;
	}
	/**
	 * 获取：材料号
	 */
	public String getCailiaohao() {
		return cailiaohao;
	}
	/**
	 * 设置：材料名称
	 */
	public void setCailiaomingcheng(String cailiaomingcheng) {
		this.cailiaomingcheng = cailiaomingcheng;
	}
	/**
	 * 获取：材料名称
	 */
	public String getCailiaomingcheng() {
		return cailiaomingcheng;
	}
	/**
	 * 设置：进货单价
	 */
	public void setJinhuodanjia(Integer jinhuodanjia) {
		this.jinhuodanjia = jinhuodanjia;
	}
	/**
	 * 获取：进货单价
	 */
	public Integer getJinhuodanjia() {
		return jinhuodanjia;
	}
	/**
	 * 设置：数量
	 */
	public void setShuliang(Integer shuliang) {
		this.shuliang = shuliang;
	}
	/**
	 * 获取：数量
	 */
	public Integer getShuliang() {
		return shuliang;
	}
	/**
	 * 设置：供应商号
	 */
	public void setGongyingshanghao(String gongyingshanghao) {
		this.gongyingshanghao = gongyingshanghao;
	}
	/**
	 * 获取：供应商号
	 */
	public String getGongyingshanghao() {
		return gongyingshanghao;
	}
	/**
	 * 设置：供应商名称
	 */
	public void setGongyingshangmingcheng(String gongyingshangmingcheng) {
		this.gongyingshangmingcheng = gongyingshangmingcheng;
	}
	/**
	 * 获取：供应商名称
	 */
	public String getGongyingshangmingcheng() {
		return gongyingshangmingcheng;
	}
	/**
	 * 设置：备注
	 */
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
	}

}
