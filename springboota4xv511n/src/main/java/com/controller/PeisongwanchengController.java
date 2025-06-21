package com.controller;

import com.annotation.IgnoreAuth;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.entity.PeisongwanchengEntity;
import com.entity.view.PeisongwanchengView;
import com.service.PeisongwanchengService;
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
 * 配送完成 
 * 后端接口
 * @author 
 * @email 
 * @date 2024-02-13 09:34:26
 */
@RestController
@RequestMapping("/peisongwancheng")
public class PeisongwanchengController {
    @Autowired
    private PeisongwanchengService peisongwanchengService;





    



    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,PeisongwanchengEntity peisongwancheng, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("shangjia")) {
			peisongwancheng.setShangjiazhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("yonghu")) {
			peisongwancheng.setYonghuzhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("peisongyuan")) {
			peisongwancheng.setPeisongzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<PeisongwanchengEntity> ew = new EntityWrapper<PeisongwanchengEntity>();


		PageUtils page = peisongwanchengService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, peisongwancheng), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,PeisongwanchengEntity peisongwancheng, 
		HttpServletRequest request){
        EntityWrapper<PeisongwanchengEntity> ew = new EntityWrapper<PeisongwanchengEntity>();

		PageUtils page = peisongwanchengService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, peisongwancheng), params), params));
        return R.ok().put("data", page);
    }


	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( PeisongwanchengEntity peisongwancheng){
       	EntityWrapper<PeisongwanchengEntity> ew = new EntityWrapper<PeisongwanchengEntity>();
      	ew.allEq(MPUtil.allEQMapPre( peisongwancheng, "peisongwancheng")); 
        return R.ok().put("data", peisongwanchengService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(PeisongwanchengEntity peisongwancheng){
        EntityWrapper< PeisongwanchengEntity> ew = new EntityWrapper< PeisongwanchengEntity>();
 		ew.allEq(MPUtil.allEQMapPre( peisongwancheng, "peisongwancheng")); 
		PeisongwanchengView peisongwanchengView =  peisongwanchengService.selectView(ew);
		return R.ok("查询配送完成成功").put("data", peisongwanchengView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        PeisongwanchengEntity peisongwancheng = peisongwanchengService.selectById(id);
        peisongwancheng = peisongwanchengService.selectView(new EntityWrapper<PeisongwanchengEntity>().eq("id", id));
        return R.ok().put("data", peisongwancheng);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        PeisongwanchengEntity peisongwancheng = peisongwanchengService.selectById(id);
        peisongwancheng = peisongwanchengService.selectView(new EntityWrapper<PeisongwanchengEntity>().eq("id", id));
        return R.ok().put("data", peisongwancheng);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody PeisongwanchengEntity peisongwancheng, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(peisongwancheng);

        peisongwanchengService.insert(peisongwancheng);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody PeisongwanchengEntity peisongwancheng, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(peisongwancheng);

        peisongwanchengService.insert(peisongwancheng);
        return R.ok();
    }




    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody PeisongwanchengEntity peisongwancheng, HttpServletRequest request){
        //ValidatorUtils.validateEntity(peisongwancheng);
        peisongwanchengService.updateById(peisongwancheng);//全部更新
        return R.ok();
    }

    
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        peisongwanchengService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
