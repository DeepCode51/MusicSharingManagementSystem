package com.entity.view;

import com.entity.YinlezixunEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 音乐资讯
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-01-11 11:34:28
 */
@TableName("yinlezixun")
public class YinlezixunView  extends YinlezixunEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YinlezixunView(){
	}
 
 	public YinlezixunView(YinlezixunEntity yinlezixunEntity){
 	try {
			BeanUtils.copyProperties(this, yinlezixunEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
