package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusszaixiantinggeEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusszaixiantinggeVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusszaixiantinggeView;


/**
 * 在线听歌评论表
 *
 * @author 
 * @email 
 * @date 2021-01-11 11:34:28
 */
public interface DiscusszaixiantinggeService extends IService<DiscusszaixiantinggeEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusszaixiantinggeVO> selectListVO(Wrapper<DiscusszaixiantinggeEntity> wrapper);
   	
   	DiscusszaixiantinggeVO selectVO(@Param("ew") Wrapper<DiscusszaixiantinggeEntity> wrapper);
   	
   	List<DiscusszaixiantinggeView> selectListView(Wrapper<DiscusszaixiantinggeEntity> wrapper);
   	
   	DiscusszaixiantinggeView selectView(@Param("ew") Wrapper<DiscusszaixiantinggeEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusszaixiantinggeEntity> wrapper);
   	
}

