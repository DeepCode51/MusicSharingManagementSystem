package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussyinlezixunEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussyinlezixunVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussyinlezixunView;


/**
 * 音乐资讯评论表
 *
 * @author 
 * @email 
 * @date 2021-01-11 11:34:28
 */
public interface DiscussyinlezixunService extends IService<DiscussyinlezixunEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussyinlezixunVO> selectListVO(Wrapper<DiscussyinlezixunEntity> wrapper);
   	
   	DiscussyinlezixunVO selectVO(@Param("ew") Wrapper<DiscussyinlezixunEntity> wrapper);
   	
   	List<DiscussyinlezixunView> selectListView(Wrapper<DiscussyinlezixunEntity> wrapper);
   	
   	DiscussyinlezixunView selectView(@Param("ew") Wrapper<DiscussyinlezixunEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussyinlezixunEntity> wrapper);
   	
}

