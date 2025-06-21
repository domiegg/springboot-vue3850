package com.controller;

import com.annotation.IgnoreAuth;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.entity.DingdanpingjiaEntity;
import com.entity.view.DingdanpingjiaView;
import com.service.DingdanpingjiaService;
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
 * 订单评价 
 * 后端接口
 * @author 
 * @email 
 * @date 2024-02-13 09:34:27
 */
@RestController
@RequestMapping("/dingdanpingjia")
public class DingdanpingjiaController {
    @Autowired
    private DingdanpingjiaService dingdanpingjiaService;





    



    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,DingdanpingjiaEntity dingdanpingjia, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("shangjia")) {
			dingdanpingjia.setShangjiazhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("yonghu")) {
			dingdanpingjia.setYonghuzhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("peisongyuan")) {
			dingdanpingjia.setPeisongzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<DingdanpingjiaEntity> ew = new EntityWrapper<DingdanpingjiaEntity>();


		PageUtils page = dingdanpingjiaService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, dingdanpingjia), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,DingdanpingjiaEntity dingdanpingjia, 
		HttpServletRequest request){
        EntityWrapper<DingdanpingjiaEntity> ew = new EntityWrapper<DingdanpingjiaEntity>();

		PageUtils page = dingdanpingjiaService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, dingdanpingjia), params), params));
        return R.ok().put("data", page);
    }


	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( DingdanpingjiaEntity dingdanpingjia){
       	EntityWrapper<DingdanpingjiaEntity> ew = new EntityWrapper<DingdanpingjiaEntity>();
      	ew.allEq(MPUtil.allEQMapPre( dingdanpingjia, "dingdanpingjia")); 
        return R.ok().put("data", dingdanpingjiaService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(DingdanpingjiaEntity dingdanpingjia){
        EntityWrapper< DingdanpingjiaEntity> ew = new EntityWrapper< DingdanpingjiaEntity>();
 		ew.allEq(MPUtil.allEQMapPre( dingdanpingjia, "dingdanpingjia")); 
		DingdanpingjiaView dingdanpingjiaView =  dingdanpingjiaService.selectView(ew);
		return R.ok("查询订单评价成功").put("data", dingdanpingjiaView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        DingdanpingjiaEntity dingdanpingjia = dingdanpingjiaService.selectById(id);
        dingdanpingjia = dingdanpingjiaService.selectView(new EntityWrapper<DingdanpingjiaEntity>().eq("id", id));
        return R.ok().put("data", dingdanpingjia);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        DingdanpingjiaEntity dingdanpingjia = dingdanpingjiaService.selectById(id);
        dingdanpingjia = dingdanpingjiaService.selectView(new EntityWrapper<DingdanpingjiaEntity>().eq("id", id));
        return R.ok().put("data", dingdanpingjia);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody DingdanpingjiaEntity dingdanpingjia, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(dingdanpingjia);

        dingdanpingjiaService.insert(dingdanpingjia);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody DingdanpingjiaEntity dingdanpingjia, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(dingdanpingjia);

        dingdanpingjiaService.insert(dingdanpingjia);
        return R.ok();
    }




    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody DingdanpingjiaEntity dingdanpingjia, HttpServletRequest request){
        //ValidatorUtils.validateEntity(dingdanpingjia);
        dingdanpingjiaService.updateById(dingdanpingjia);//全部更新
        return R.ok();
    }

    
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        dingdanpingjiaService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
