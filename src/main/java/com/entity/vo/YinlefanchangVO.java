package com.entity.vo;

import com.entity.YinlefanchangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 音乐翻唱
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-01-11 11:34:28
 */
public class YinlefanchangVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 歌曲名称
	 */
	
	private String gequmingcheng;
		
	/**
	 * 原唱
	 */
	
	private String yuanchang;
		
	/**
	 * 标签
	 */
	
	private String biaoqian;
		
	/**
	 * 音频
	 */
	
	private String yinpin;
		
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 翻唱原因
	 */
	
	private String fanchangyuanyin;
		
	/**
	 * 用户名
	 */
	
	private String yonghuming;
		
	/**
	 * 歌曲介绍
	 */
	
	private String gequjieshao;
		
	/**
	 * 赞
	 */
	
	private Integer thumbsupnum;
		
	/**
	 * 踩
	 */
	
	private Integer crazilynum;
				
	
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
	 * 设置：音频
	 */
	 
	public void setYinpin(String yinpin) {
		this.yinpin = yinpin;
	}
	
	/**
	 * 获取：音频
	 */
	public String getYinpin() {
		return yinpin;
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
	 * 设置：翻唱原因
	 */
	 
	public void setFanchangyuanyin(String fanchangyuanyin) {
		this.fanchangyuanyin = fanchangyuanyin;
	}
	
	/**
	 * 获取：翻唱原因
	 */
	public String getFanchangyuanyin() {
		return fanchangyuanyin;
	}
				
	
	/**
	 * 设置：用户名
	 */
	 
	public void setYonghuming(String yonghuming) {
		this.yonghuming = yonghuming;
	}
	
	/**
	 * 获取：用户名
	 */
	public String getYonghuming() {
		return yonghuming;
	}
				
	
	/**
	 * 设置：歌曲介绍
	 */
	 
	public void setGequjieshao(String gequjieshao) {
		this.gequjieshao = gequjieshao;
	}
	
	/**
	 * 获取：歌曲介绍
	 */
	public String getGequjieshao() {
		return gequjieshao;
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
			
}
