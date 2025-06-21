package com.controller;

import com.annotation.IgnoreAuth;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.entity.XianhuaxinxiEntity;
import com.entity.view.XianhuaxinxiView;
import com.service.StoreupService;
import com.service.XianhuaxinxiService;
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
 * 鲜花信息 
 * 后端接口
 * @author 
 * @email 
 * @date 2024-02-13 09:34:26
 */
@RestController
@RequestMapping("/xianhuaxinxi")
public class XianhuaxinxiController {
    @Autowired
    private XianhuaxinxiService xianhuaxinxiService;


    @Autowired
    private StoreupService storeupService;



    



    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,XianhuaxinxiEntity xianhuaxinxi, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("shangjia")) {
			xianhuaxinxi.setShangjiazhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<XianhuaxinxiEntity> ew = new EntityWrapper<XianhuaxinxiEntity>();


		PageUtils page = xianhuaxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xianhuaxinxi), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,XianhuaxinxiEntity xianhuaxinxi, 
		HttpServletRequest request){
        EntityWrapper<XianhuaxinxiEntity> ew = new EntityWrapper<XianhuaxinxiEntity>();

		PageUtils page = xianhuaxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xianhuaxinxi), params), params));
        return R.ok().put("data", page);
    }


	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( XianhuaxinxiEntity xianhuaxinxi){
       	EntityWrapper<XianhuaxinxiEntity> ew = new EntityWrapper<XianhuaxinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( xianhuaxinxi, "xianhuaxinxi")); 
        return R.ok().put("data", xianhuaxinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(XianhuaxinxiEntity xianhuaxinxi){
        EntityWrapper< XianhuaxinxiEntity> ew = new EntityWrapper< XianhuaxinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( xianhuaxinxi, "xianhuaxinxi")); 
		XianhuaxinxiView xianhuaxinxiView =  xianhuaxinxiService.selectView(ew);
		return R.ok("查询鲜花信息成功").put("data", xianhuaxinxiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        XianhuaxinxiEntity xianhuaxinxi = xianhuaxinxiService.selectById(id);
        xianhuaxinxi = xianhuaxinxiService.selectView(new EntityWrapper<XianhuaxinxiEntity>().eq("id", id));
        return R.ok().put("data", xianhuaxinxi);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        XianhuaxinxiEntity xianhuaxinxi = xianhuaxinxiService.selectById(id);
        xianhuaxinxi = xianhuaxinxiService.selectView(new EntityWrapper<XianhuaxinxiEntity>().eq("id", id));
        return R.ok().put("data", xianhuaxinxi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody XianhuaxinxiEntity xianhuaxinxi, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(xianhuaxinxi);

        xianhuaxinxiService.insert(xianhuaxinxi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody XianhuaxinxiEntity xianhuaxinxi, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(xianhuaxinxi);

        xianhuaxinxiService.insert(xianhuaxinxi);
        return R.ok();
    }




    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody XianhuaxinxiEntity xianhuaxinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(xianhuaxinxi);
        xianhuaxinxiService.updateById(xianhuaxinxi);//全部更新
        return R.ok();
    }

    
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        xianhuaxinxiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
