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


import com.dao.DiscussyinlezixunDao;
import com.entity.DiscussyinlezixunEntity;
import com.service.DiscussyinlezixunService;
import com.entity.vo.DiscussyinlezixunVO;
import com.entity.view.DiscussyinlezixunView;

@Service("discussyinlezixunService")
public class DiscussyinlezixunServiceImpl extends ServiceImpl<DiscussyinlezixunDao, DiscussyinlezixunEntity> implements DiscussyinlezixunService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussyinlezixunEntity> page = this.selectPage(
                new Query<DiscussyinlezixunEntity>(params).getPage(),
                new EntityWrapper<DiscussyinlezixunEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussyinlezixunEntity> wrapper) {
		  Page<DiscussyinlezixunView> page =new Query<DiscussyinlezixunView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussyinlezixunVO> selectListVO(Wrapper<DiscussyinlezixunEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussyinlezixunVO selectVO(Wrapper<DiscussyinlezixunEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussyinlezixunView> selectListView(Wrapper<DiscussyinlezixunEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussyinlezixunView selectView(Wrapper<DiscussyinlezixunEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
