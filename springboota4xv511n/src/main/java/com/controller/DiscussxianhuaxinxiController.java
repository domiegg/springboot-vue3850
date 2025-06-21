package com.controller;

import com.annotation.IgnoreAuth;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.entity.DiscussxianhuaxinxiEntity;
import com.entity.view.DiscussxianhuaxinxiView;
import com.service.DiscussxianhuaxinxiService;
import com.utils.MPUtil;
import com.utils.PageUtils;
import com.utils.R;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * 鲜花信息评论表 
 * 后端接口
 * @author 
 * @email 
 * @date 2024-02-13 09:34:27
 */
@RestController
@RequestMapping("/discussxianhuaxinxi")
public class DiscussxianhuaxinxiController {
    @Autowired
    private DiscussxianhuaxinxiService discussxianhuaxinxiService;





    



    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,DiscussxianhuaxinxiEntity discussxianhuaxinxi, 
		HttpServletRequest request){

        EntityWrapper<DiscussxianhuaxinxiEntity> ew = new EntityWrapper<DiscussxianhuaxinxiEntity>();


		PageUtils page = discussxianhuaxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discussxianhuaxinxi), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,DiscussxianhuaxinxiEntity discussxianhuaxinxi, 
		HttpServletRequest request){
        EntityWrapper<DiscussxianhuaxinxiEntity> ew = new EntityWrapper<DiscussxianhuaxinxiEntity>();

		PageUtils page = discussxianhuaxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discussxianhuaxinxi), params), params));
        return R.ok().put("data", page);
    }


	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( DiscussxianhuaxinxiEntity discussxianhuaxinxi){
       	EntityWrapper<DiscussxianhuaxinxiEntity> ew = new EntityWrapper<DiscussxianhuaxinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( discussxianhuaxinxi, "discussxianhuaxinxi")); 
        return R.ok().put("data", discussxianhuaxinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(DiscussxianhuaxinxiEntity discussxianhuaxinxi){
        EntityWrapper< DiscussxianhuaxinxiEntity> ew = new EntityWrapper< DiscussxianhuaxinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( discussxianhuaxinxi, "discussxianhuaxinxi")); 
		DiscussxianhuaxinxiView discussxianhuaxinxiView =  discussxianhuaxinxiService.selectView(ew);
		return R.ok("查询鲜花信息评论表成功").put("data", discussxianhuaxinxiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        DiscussxianhuaxinxiEntity discussxianhuaxinxi = discussxianhuaxinxiService.selectById(id);
        discussxianhuaxinxi = discussxianhuaxinxiService.selectView(new EntityWrapper<DiscussxianhuaxinxiEntity>().eq("id", id));
        return R.ok().put("data", discussxianhuaxinxi);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        DiscussxianhuaxinxiEntity discussxianhuaxinxi = discussxianhuaxinxiService.selectById(id);
        discussxianhuaxinxi = discussxianhuaxinxiService.selectView(new EntityWrapper<DiscussxianhuaxinxiEntity>().eq("id", id));
        return R.ok().put("data", discussxianhuaxinxi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody DiscussxianhuaxinxiEntity discussxianhuaxinxi, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(discussxianhuaxinxi);

        discussxianhuaxinxiService.insert(discussxianhuaxinxi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody DiscussxianhuaxinxiEntity discussxianhuaxinxi, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(discussxianhuaxinxi);

        discussxianhuaxinxiService.insert(discussxianhuaxinxi);
        return R.ok();
    }



     /**
     * 获取用户密保
     */
    @RequestMapping("/security")
    @IgnoreAuth
    public R security(@RequestParam String username){
        DiscussxianhuaxinxiEntity discussxianhuaxinxi = discussxianhuaxinxiService.selectOne(new EntityWrapper<DiscussxianhuaxinxiEntity>().eq("", username));
        return R.ok().put("data", discussxianhuaxinxi);
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    @IgnoreAuth
    public R update(@RequestBody DiscussxianhuaxinxiEntity discussxianhuaxinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(discussxianhuaxinxi);
        discussxianhuaxinxiService.updateById(discussxianhuaxinxi);//全部更新
        return R.ok();
    }

    
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        discussxianhuaxinxiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	
	/**
     * 前端智能排序
     */
	@IgnoreAuth
    @RequestMapping("/autoSort")
    public R autoSort(@RequestParam Map<String, Object> params,DiscussxianhuaxinxiEntity discussxianhuaxinxi, HttpServletRequest request,String pre){
        EntityWrapper<DiscussxianhuaxinxiEntity> ew = new EntityWrapper<DiscussxianhuaxinxiEntity>();
        Map<String, Object> newMap = new HashMap<String, Object>();
        Map<String, Object> param = new HashMap<String, Object>();
		Iterator<Map.Entry<String, Object>> it = param.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String, Object> entry = it.next();
			String key = entry.getKey();
			String newKey = entry.getKey();
			if (pre.endsWith(".")) {
				newMap.put(pre + newKey, entry.getValue());
			} else if (StringUtils.isEmpty(pre)) {
				newMap.put(newKey, entry.getValue());
			} else {
				newMap.put(pre + "." + newKey, entry.getValue());
			}
		}
		params.put("sort", "clicktime");
        
        params.put("order", "desc");
		PageUtils page = discussxianhuaxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discussxianhuaxinxi), params), params));
        return R.ok().put("data", page);
    }










}
