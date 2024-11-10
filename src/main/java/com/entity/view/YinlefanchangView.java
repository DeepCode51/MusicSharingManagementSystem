package com.entity.view;

import com.entity.YinlefanchangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 音乐翻唱
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-01-11 11:34:28
 */
@TableName("yinlefanchang")
public class YinlefanchangView  extends YinlefanchangEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YinlefanchangView(){
	}
 
 	public YinlefanchangView(YinlefanchangEntity yinlefanchangEntity){
 	try {
			BeanUtils.copyProperties(this, yinlefanchangEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
