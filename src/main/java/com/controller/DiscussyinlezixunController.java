package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.DiscussyinlezixunEntity;
import com.entity.view.DiscussyinlezixunView;

import com.service.DiscussyinlezixunService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 音乐资讯评论表
 * 后端接口
 * @author 
 * @email 
 * @date 2021-01-11 11:34:28
 */
@RestController
@RequestMapping("/discussyinlezixun")
public class DiscussyinlezixunController {
    @Autowired
    private DiscussyinlezixunService discussyinlezixunService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,DiscussyinlezixunEntity discussyinlezixun, HttpServletRequest request){
        EntityWrapper<DiscussyinlezixunEntity> ew = new EntityWrapper<DiscussyinlezixunEntity>();
		PageUtils page = discussyinlezixunService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discussyinlezixun), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,DiscussyinlezixunEntity discussyinlezixun, HttpServletRequest request){
        EntityWrapper<DiscussyinlezixunEntity> ew = new EntityWrapper<DiscussyinlezixunEntity>();
		PageUtils page = discussyinlezixunService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discussyinlezixun), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( DiscussyinlezixunEntity discussyinlezixun){
       	EntityWrapper<DiscussyinlezixunEntity> ew = new EntityWrapper<DiscussyinlezixunEntity>();
      	ew.allEq(MPUtil.allEQMapPre( discussyinlezixun, "discussyinlezixun")); 
        return R.ok().put("data", discussyinlezixunService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(DiscussyinlezixunEntity discussyinlezixun){
        EntityWrapper< DiscussyinlezixunEntity> ew = new EntityWrapper< DiscussyinlezixunEntity>();
 		ew.allEq(MPUtil.allEQMapPre( discussyinlezixun, "discussyinlezixun")); 
		DiscussyinlezixunView discussyinlezixunView =  discussyinlezixunService.selectView(ew);
		return R.ok("查询音乐资讯评论表成功").put("data", discussyinlezixunView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        DiscussyinlezixunEntity discussyinlezixun = discussyinlezixunService.selectById(id);
        return R.ok().put("data", discussyinlezixun);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        DiscussyinlezixunEntity discussyinlezixun = discussyinlezixunService.selectById(id);
        return R.ok().put("data", discussyinlezixun);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody DiscussyinlezixunEntity discussyinlezixun, HttpServletRequest request){
    	discussyinlezixun.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(discussyinlezixun);
        discussyinlezixunService.insert(discussyinlezixun);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody DiscussyinlezixunEntity discussyinlezixun, HttpServletRequest request){
    	discussyinlezixun.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(discussyinlezixun);
        discussyinlezixunService.insert(discussyinlezixun);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody DiscussyinlezixunEntity discussyinlezixun, HttpServletRequest request){
        //ValidatorUtils.validateEntity(discussyinlezixun);
        discussyinlezixunService.updateById(discussyinlezixun);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        discussyinlezixunService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<DiscussyinlezixunEntity> wrapper = new EntityWrapper<DiscussyinlezixunEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = discussyinlezixunService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
