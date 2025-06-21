package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.entity.XianhualeixingEntity;
import com.entity.view.XianhualeixingView;
import com.entity.vo.XianhualeixingVO;
import com.utils.PageUtils;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;


/**
 * 鲜花类型
 *
 * @author 
 * @email 
 * @date 2024-02-13 09:34:26
 */
public interface XianhualeixingService extends IService<XianhualeixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XianhualeixingVO> selectListVO(Wrapper<XianhualeixingEntity> wrapper);
   	
   	XianhualeixingVO selectVO(@Param("ew") Wrapper<XianhualeixingEntity> wrapper);
   	
   	List<XianhualeixingView> selectListView(Wrapper<XianhualeixingEntity> wrapper);
   	
   	XianhualeixingView selectView(@Param("ew") Wrapper<XianhualeixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XianhualeixingEntity> wrapper);

   	

}

