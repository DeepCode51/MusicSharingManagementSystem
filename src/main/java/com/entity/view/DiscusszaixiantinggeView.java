package com.entity.view;

import com.entity.DiscusszaixiantinggeEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 在线听歌评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-01-11 11:34:28
 */
@TableName("discusszaixiantingge")
public class DiscusszaixiantinggeView  extends DiscusszaixiantinggeEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscusszaixiantinggeView(){
	}
 
 	public DiscusszaixiantinggeView(DiscusszaixiantinggeEntity discusszaixiantinggeEntity){
 	try {
			BeanUtils.copyProperties(this, discusszaixiantinggeEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
