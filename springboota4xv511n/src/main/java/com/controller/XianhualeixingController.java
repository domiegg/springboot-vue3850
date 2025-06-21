package com.controller;

import com.annotation.IgnoreAuth;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.entity.XianhualeixingEntity;
import com.entity.view.XianhualeixingView;
import com.service.XianhualeixingService;
import com.utils.MPUtil;
import com.utils.PageUtils;
import com.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.Map;

/**
 * 鲜花类型 
 * 后端接口
 * @author 
 * @email 
 * @date 2024-02-13 09:34:26
 */
@RestController
@RequestMapping("/xianhualeixing")
public class XianhualeixingController {
    @Autowired
    private XianhualeixingService xianhualeixingService;





    



    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,XianhualeixingEntity xianhualeixing, 
		HttpServletRequest request){

        EntityWrapper<XianhualeixingEntity> ew = new EntityWrapper<XianhualeixingEntity>();


		PageUtils page = xianhualeixingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xianhualeixing), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,XianhualeixingEntity xianhualeixing, 
		HttpServletRequest request){
        EntityWrapper<XianhualeixingEntity> ew = new EntityWrapper<XianhualeixingEntity>();

		PageUtils page = xianhualeixingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xianhualeixing), params), params));
        return R.ok().put("data", page);
    }


	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( XianhualeixingEntity xianhualeixing){
       	EntityWrapper<XianhualeixingEntity> ew = new EntityWrapper<XianhualeixingEntity>();
      	ew.allEq(MPUtil.allEQMapPre( xianhualeixing, "xianhualeixing")); 
        return R.ok().put("data", xianhualeixingService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(XianhualeixingEntity xianhualeixing){
        EntityWrapper< XianhualeixingEntity> ew = new EntityWrapper< XianhualeixingEntity>();
 		ew.allEq(MPUtil.allEQMapPre( xianhualeixing, "xianhualeixing")); 
		XianhualeixingView xianhualeixingView =  xianhualeixingService.selectView(ew);
		return R.ok("查询鲜花类型成功").put("data", xianhualeixingView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        XianhualeixingEntity xianhualeixing = xianhualeixingService.selectById(id);
        xianhualeixing = xianhualeixingService.selectView(new EntityWrapper<XianhualeixingEntity>().eq("id", id));
        return R.ok().put("data", xianhualeixing);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        XianhualeixingEntity xianhualeixing = xianhualeixingService.selectById(id);
        xianhualeixing = xianhualeixingService.selectView(new EntityWrapper<XianhualeixingEntity>().eq("id", id));
        return R.ok().put("data", xianhualeixing);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody XianhualeixingEntity xianhualeixing, HttpServletRequest request){
        if(xianhualeixingService.selectCount(new EntityWrapper<XianhualeixingEntity>().eq("xianhualeixing", xianhualeixing.getXianhualeixing()))>0) {
            return R.error("鲜花类型已存在");
        }
    	//ValidatorUtils.validateEntity(xianhualeixing);

        xianhualeixingService.insert(xianhualeixing);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody XianhualeixingEntity xianhualeixing, HttpServletRequest request){
        if(xianhualeixingService.selectCount(new EntityWrapper<XianhualeixingEntity>().eq("xianhualeixing", xianhualeixing.getXianhualeixing()))>0) {
            return R.error("鲜花类型已存在");
        }
    	//ValidatorUtils.validateEntity(xianhualeixing);

        xianhualeixingService.insert(xianhualeixing);
        return R.ok();
    }




    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody XianhualeixingEntity xianhualeixing, HttpServletRequest request){
        //ValidatorUtils.validateEntity(xianhualeixing);
        if(xianhualeixingService.selectCount(new EntityWrapper<XianhualeixingEntity>().ne("id", xianhualeixing.getId()).eq("xianhualeixing", xianhualeixing.getXianhualeixing()))>0) {
            return R.error("鲜花类型已存在");
        }
        xianhualeixingService.updateById(xianhualeixing);//全部更新
        return R.ok();
    }

    
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        xianhualeixingService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
