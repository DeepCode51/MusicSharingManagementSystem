package com.entity.view;

import com.entity.DiscussyinlefanchangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 音乐翻唱评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-01-11 11:34:28
 */
@TableName("discussyinlefanchang")
public class DiscussyinlefanchangView  extends DiscussyinlefanchangEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussyinlefanchangView(){
	}
 
 	public DiscussyinlefanchangView(DiscussyinlefanchangEntity discussyinlefanchangEntity){
 	try {
			BeanUtils.copyProperties(this, discussyinlefanchangEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
