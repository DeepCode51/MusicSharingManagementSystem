package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.DiscusszaixiantinggeDao;
import com.entity.DiscusszaixiantinggeEntity;
import com.service.DiscusszaixiantinggeService;
import com.entity.vo.DiscusszaixiantinggeVO;
import com.entity.view.DiscusszaixiantinggeView;

@Service("discusszaixiantinggeService")
public class DiscusszaixiantinggeServiceImpl extends ServiceImpl<DiscusszaixiantinggeDao, DiscusszaixiantinggeEntity> implements DiscusszaixiantinggeService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusszaixiantinggeEntity> page = this.selectPage(
                new Query<DiscusszaixiantinggeEntity>(params).getPage(),
                new EntityWrapper<DiscusszaixiantinggeEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusszaixiantinggeEntity> wrapper) {
		  Page<DiscusszaixiantinggeView> page =new Query<DiscusszaixiantinggeView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusszaixiantinggeVO> selectListVO(Wrapper<DiscusszaixiantinggeEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusszaixiantinggeVO selectVO(Wrapper<DiscusszaixiantinggeEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusszaixiantinggeView> selectListView(Wrapper<DiscusszaixiantinggeEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusszaixiantinggeView selectView(Wrapper<DiscusszaixiantinggeEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
