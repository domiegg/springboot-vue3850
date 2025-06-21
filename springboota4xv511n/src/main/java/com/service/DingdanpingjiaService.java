package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.entity.DingdanpingjiaEntity;
import com.entity.view.DingdanpingjiaView;
import com.entity.vo.DingdanpingjiaVO;
import com.utils.PageUtils;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;


/**
 * 订单评价
 *
 * @author 
 * @email 
 * @date 2024-02-13 09:34:27
 */
public interface DingdanpingjiaService extends IService<DingdanpingjiaEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DingdanpingjiaVO> selectListVO(Wrapper<DingdanpingjiaEntity> wrapper);
   	
   	DingdanpingjiaVO selectVO(@Param("ew") Wrapper<DingdanpingjiaEntity> wrapper);
   	
   	List<DingdanpingjiaView> selectListView(Wrapper<DingdanpingjiaEntity> wrapper);
   	
   	DingdanpingjiaView selectView(@Param("ew") Wrapper<DingdanpingjiaEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DingdanpingjiaEntity> wrapper);

   	

}

