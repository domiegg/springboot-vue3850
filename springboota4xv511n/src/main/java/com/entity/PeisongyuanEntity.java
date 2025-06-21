package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.Date;


/**
 * 配送员
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-02-13 09:34:26
 */
@TableName("peisongyuan")
public class PeisongyuanEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public PeisongyuanEntity() {
		
	}
	
	public PeisongyuanEntity(T t) {
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
	 * 配送账号
	 */
					
	private String peisongzhanghao;
	
	/**
	 * 配送姓名
	 */
					
	private String peisongxingming;
	
	/**
	 * 密码
	 */
					
	private String mima;
	
	/**
	 * 性别
	 */
					
	private String xingbie;
	
	/**
	 * 联系方式
	 */
					
	private String lianxifangshi;
	
	/**
	 * 头像
	 */
					
	private String touxiang;
	
	
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
	 * 设置：配送账号
	 */
	public void setPeisongzhanghao(String peisongzhanghao) {
		this.peisongzhanghao = peisongzhanghao;
	}
	/**
	 * 获取：配送账号
	 */
	public String getPeisongzhanghao() {
		return peisongzhanghao;
	}
	/**
	 * 设置：配送姓名
	 */
	public void setPeisongxingming(String peisongxingming) {
		this.peisongxingming = peisongxingming;
	}
	/**
	 * 获取：配送姓名
	 */
	public String getPeisongxingming() {
		return peisongxingming;
	}
	/**
	 * 设置：密码
	 */
	public void setMima(String mima) {
		this.mima = mima;
	}
	/**
	 * 获取：密码
	 */
	public String getMima() {
		return mima;
	}
	/**
	 * 设置：性别
	 */
	public void setXingbie(String xingbie) {
		this.xingbie = xingbie;
	}
	/**
	 * 获取：性别
	 */
	public String getXingbie() {
		return xingbie;
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
	 * 设置：头像
	 */
	public void setTouxiang(String touxiang) {
		this.touxiang = touxiang;
	}
	/**
	 * 获取：头像
	 */
	public String getTouxiang() {
		return touxiang;
	}

}
