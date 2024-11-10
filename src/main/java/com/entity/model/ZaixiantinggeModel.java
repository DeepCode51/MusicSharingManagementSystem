package com.entity.model;

import com.entity.ZaixiantinggeEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 在线听歌
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-01-11 11:34:28
 */
public class ZaixiantinggeModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 歌曲名称
	 */
	
	private String gequmingcheng;
		
	/**
	 * 标签
	 */
	
	private String biaoqian;
		
	/**
	 * 原唱
	 */
	
	private String yuanchang;
		
	/**
	 * 作曲
	 */
	
	private String zuoqu;
		
	/**
	 * 作词
	 */
	
	private String zuoci;
		
	/**
	 * 音乐
	 */
	
	private String yinle;
		
	/**
	 * 视频
	 */
	
	private String shipin;
		
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 歌曲简介
	 */
	
	private String gequjianjie;
		
	/**
	 * 赞
	 */
	
	private Integer thumbsupnum;
		
	/**
	 * 踩
	 */
	
	private Integer crazilynum;
		
	/**
	 * 最近点击时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date clicktime;
		
	/**
	 * 点击次数
	 */
	
	private Integer clicknum;
				
	
	/**
	 * 设置：歌曲名称
	 */
	 
	public void setGequmingcheng(String gequmingcheng) {
		this.gequmingcheng = gequmingcheng;
	}
	
	/**
	 * 获取：歌曲名称
	 */
	public String getGequmingcheng() {
		return gequmingcheng;
	}
				
	
	/**
	 * 设置：标签
	 */
	 
	public void setBiaoqian(String biaoqian) {
		this.biaoqian = biaoqian;
	}
	
	/**
	 * 获取：标签
	 */
	public String getBiaoqian() {
		return biaoqian;
	}
				
	
	/**
	 * 设置：原唱
	 */
	 
	public void setYuanchang(String yuanchang) {
		this.yuanchang = yuanchang;
	}
	
	/**
	 * 获取：原唱
	 */
	public String getYuanchang() {
		return yuanchang;
	}
				
	
	/**
	 * 设置：作曲
	 */
	 
	public void setZuoqu(String zuoqu) {
		this.zuoqu = zuoqu;
	}
	
	/**
	 * 获取：作曲
	 */
	public String getZuoqu() {
		return zuoqu;
	}
				
	
	/**
	 * 设置：作词
	 */
	 
	public void setZuoci(String zuoci) {
		this.zuoci = zuoci;
	}
	
	/**
	 * 获取：作词
	 */
	public String getZuoci() {
		return zuoci;
	}
				
	
	/**
	 * 设置：音乐
	 */
	 
	public void setYinle(String yinle) {
		this.yinle = yinle;
	}
	
	/**
	 * 获取：音乐
	 */
	public String getYinle() {
		return yinle;
	}
				
	
	/**
	 * 设置：视频
	 */
	 
	public void setShipin(String shipin) {
		this.shipin = shipin;
	}
	
	/**
	 * 获取：视频
	 */
	public String getShipin() {
		return shipin;
	}
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
				
	
	/**
	 * 设置：歌曲简介
	 */
	 
	public void setGequjianjie(String gequjianjie) {
		this.gequjianjie = gequjianjie;
	}
	
	/**
	 * 获取：歌曲简介
	 */
	public String getGequjianjie() {
		return gequjianjie;
	}
				
	
	/**
	 * 设置：赞
	 */
	 
	public void setThumbsupnum(Integer thumbsupnum) {
		this.thumbsupnum = thumbsupnum;
	}
	
	/**
	 * 获取：赞
	 */
	public Integer getThumbsupnum() {
		return thumbsupnum;
	}
				
	
	/**
	 * 设置：踩
	 */
	 
	public void setCrazilynum(Integer crazilynum) {
		this.crazilynum = crazilynum;
	}
	
	/**
	 * 获取：踩
	 */
	public Integer getCrazilynum() {
		return crazilynum;
	}
				
	
	/**
	 * 设置：最近点击时间
	 */
	 
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
				
	
	/**
	 * 设置：点击次数
	 */
	 
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
	}
			
}
