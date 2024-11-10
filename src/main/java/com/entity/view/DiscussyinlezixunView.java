package com.entity.view;

import com.entity.DiscussyinlezixunEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 音乐资讯评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-01-11 11:34:28
 */
@TableName("discussyinlezixun")
public class DiscussyinlezixunView  extends DiscussyinlezixunEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussyinlezixunView(){
	}
 
 	public DiscussyinlezixunView(DiscussyinlezixunEntity discussyinlezixunEntity){
 	try {
			BeanUtils.copyProperties(this, discussyinlezixunEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
