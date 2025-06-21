package com.entity.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;
 

/**
 * 鲜花信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2024-02-13 09:34:26
 */
public class XianhuaxinxiModel  implements Serializable {
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
	 * 鲜花寓意
	 */
	
	private String xianhuayuyi;
		
	/**
	 * 赠送对象
	 */
	
	private String zengsongduixiang;
		
	/**
	 * 上架日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date shangjiariqi;
		
	/**
	 * 鲜花详情
	 */
	
	private String xianhuaxiangqing;
		
	/**
	 * 价格
	 */
	
	private Integer jiage;
		
	/**
	 * 数量
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
	 * 评论数
	 */
	
	private Integer discussnum;
		
	/**
	 * 收藏数
	 */
	
	private Integer storeupnum;
				
	
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
	 * 设置：鲜花寓意
	 */
	 
	public void setXianhuayuyi(String xianhuayuyi) {
		this.xianhuayuyi = xianhuayuyi;
	}
	
	/**
	 * 获取：鲜花寓意
	 */
	public String getXianhuayuyi() {
		return xianhuayuyi;
	}
				
	
	/**
	 * 设置：赠送对象
	 */
	 
	public void setZengsongduixiang(String zengsongduixiang) {
		this.zengsongduixiang = zengsongduixiang;
	}
	
	/**
	 * 获取：赠送对象
	 */
	public String getZengsongduixiang() {
		return zengsongduixiang;
	}
				
	
	/**
	 * 设置：上架日期
	 */
	 
	public void setShangjiariqi(Date shangjiariqi) {
		this.shangjiariqi = shangjiariqi;
	}
	
	/**
	 * 获取：上架日期
	 */
	public Date getShangjiariqi() {
		return shangjiariqi;
	}
				
	
	/**
	 * 设置：鲜花详情
	 */
	 
	public void setXianhuaxiangqing(String xianhuaxiangqing) {
		this.xianhuaxiangqing = xianhuaxiangqing;
	}
	
	/**
	 * 获取：鲜花详情
	 */
	public String getXianhuaxiangqing() {
		return xianhuaxiangqing;
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
	 * 设置：评论数
	 */
	 
	public void setDiscussnum(Integer discussnum) {
		this.discussnum = discussnum;
	}
	
	/**
	 * 获取：评论数
	 */
	public Integer getDiscussnum() {
		return discussnum;
	}
				
	
	/**
	 * 设置：收藏数
	 */
	 
	public void setStoreupnum(Integer storeupnum) {
		this.storeupnum = storeupnum;
	}
	
	/**
	 * 获取：收藏数
	 */
	public Integer getStoreupnum() {
		return storeupnum;
	}
			
}
