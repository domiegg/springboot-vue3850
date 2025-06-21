package com.entity.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;
 

/**
 * 配送订单
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2024-02-13 09:34:26
 */
public class PeisongdingdanModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 鲜花类型
	 */
	
	private String xianhualeixing;
		
	/**
	 * 鲜花图片
	 */
	
	private String xianhuatupian;
		
	/**
	 * 花语
	 */
	
	private String huayu;
		
	/**
	 * 价格
	 */
	
	private Integer jiage;
		
	/**
	 * 购买数量
	 */
	
	private Integer shuliang;
		
	/**
	 * 商家账号
	 */
	
	private String shangjiazhanghao;
		
	/**
	 * 商家名称
	 */
	
	private String shangjiamingcheng;
		
	/**
	 * 商家地址
	 */
	
	private String shangjiadizhi;
		
	/**
	 * 联系电话
	 */
	
	private String lianxidianhua;
		
	/**
	 * 总金额
	 */
	
	private Integer zongjine;
		
	/**
	 * 下单时间
	 */
	
	private String xiadanshijian;
		
	/**
	 * 收货地址
	 */
	
	private String shouhuodizhi;
		
	/**
	 * 收货人联系方式
	 */
	
	private String shouhuorenlianxifangshi;
		
	/**
	 * 备注
	 */
	
	private String beizhu;
		
	/**
	 * 用户账号
	 */
	
	private String yonghuzhanghao;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 手机
	 */
	
	private String shouji;
		
	/**
	 * 配送接单
	 */
	
	private String peisongjiedan;
		
	/**
	 * 备货时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date beihuoshijian;
				
	
	/**
	 * 设置：鲜花类型
	 */
	 
	public void setXianhualeixing(String xianhualeixing) {
		this.xianhualeixing = xianhualeixing;
	}
	
	/**
	 * 获取：鲜花类型
	 */
	public String getXianhualeixing() {
		return xianhualeixing;
	}
				
	
	/**
	 * 设置：鲜花图片
	 */
	 
	public void setXianhuatupian(String xianhuatupian) {
		this.xianhuatupian = xianhuatupian;
	}
	
	/**
	 * 获取：鲜花图片
	 */
	public String getXianhuatupian() {
		return xianhuatupian;
	}
				
	
	/**
	 * 设置：花语
	 */
	 
	public void setHuayu(String huayu) {
		this.huayu = huayu;
	}
	
	/**
	 * 获取：花语
	 */
	public String getHuayu() {
		return huayu;
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
				
	
	/**
	 * 设置：购买数量
	 */
	 
	public void setShuliang(Integer shuliang) {
		this.shuliang = shuliang;
	}
	
	/**
	 * 获取：购买数量
	 */
	public Integer getShuliang() {
		return shuliang;
	}
				
	
	/**
	 * 设置：商家账号
	 */
	 
	public void setShangjiazhanghao(String shangjiazhanghao) {
		this.shangjiazhanghao = shangjiazhanghao;
	}
	
	/**
	 * 获取：商家账号
	 */
	public String getShangjiazhanghao() {
		return shangjiazhanghao;
	}
				
	
	/**
	 * 设置：商家名称
	 */
	 
	public void setShangjiamingcheng(String shangjiamingcheng) {
		this.shangjiamingcheng = shangjiamingcheng;
	}
	
	/**
	 * 获取：商家名称
	 */
	public String getShangjiamingcheng() {
		return shangjiamingcheng;
	}
				
	
	/**
	 * 设置：商家地址
	 */
	 
	public void setShangjiadizhi(String shangjiadizhi) {
		this.shangjiadizhi = shangjiadizhi;
	}
	
	/**
	 * 获取：商家地址
	 */
	public String getShangjiadizhi() {
		return shangjiadizhi;
	}
				
	
	/**
	 * 设置：联系电话
	 */
	 
	public void setLianxidianhua(String lianxidianhua) {
		this.lianxidianhua = lianxidianhua;
	}
	
	/**
	 * 获取：联系电话
	 */
	public String getLianxidianhua() {
		return lianxidianhua;
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
	 * 设置：下单时间
	 */
	 
	public void setXiadanshijian(String xiadanshijian) {
		this.xiadanshijian = xiadanshijian;
	}
	
	/**
	 * 获取：下单时间
	 */
	public String getXiadanshijian() {
		return xiadanshijian;
	}
				
	
	/**
	 * 设置：收货地址
	 */
	 
	public void setShouhuodizhi(String shouhuodizhi) {
		this.shouhuodizhi = shouhuodizhi;
	}
	
	/**
	 * 获取：收货地址
	 */
	public String getShouhuodizhi() {
		return shouhuodizhi;
	}
				
	
	/**
	 * 设置：收货人联系方式
	 */
	 
	public void setShouhuorenlianxifangshi(String shouhuorenlianxifangshi) {
		this.shouhuorenlianxifangshi = shouhuorenlianxifangshi;
	}
	
	/**
	 * 获取：收货人联系方式
	 */
	public String getShouhuorenlianxifangshi() {
		return shouhuorenlianxifangshi;
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
				
	
	/**
	 * 设置：用户账号
	 */
	 
	public void setYonghuzhanghao(String yonghuzhanghao) {
		this.yonghuzhanghao = yonghuzhanghao;
	}
	
	/**
	 * 获取：用户账号
	 */
	public String getYonghuzhanghao() {
		return yonghuzhanghao;
	}
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：手机
	 */
	 
	public void setShouji(String shouji) {
		this.shouji = shouji;
	}
	
	/**
	 * 获取：手机
	 */
	public String getShouji() {
		return shouji;
	}
				
	
	/**
	 * 设置：配送接单
	 */
	 
	public void setPeisongjiedan(String peisongjiedan) {
		this.peisongjiedan = peisongjiedan;
	}
	
	/**
	 * 获取：配送接单
	 */
	public String getPeisongjiedan() {
		return peisongjiedan;
	}
				
	
	/**
	 * 设置：备货时间
	 */
	 
	public void setBeihuoshijian(Date beihuoshijian) {
		this.beihuoshijian = beihuoshijian;
	}
	
	/**
	 * 获取：备货时间
	 */
	public Date getBeihuoshijian() {
		return beihuoshijian;
	}
			
}
