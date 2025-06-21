package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.entity.ShangjiaEntity;
import com.entity.view.ShangjiaView;
import com.entity.vo.ShangjiaVO;
import com.utils.PageUtils;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;


/**
 * 商家
 *
 * @author 
 * @email 
 * @date 2024-02-13 09:34:26
 */
public interface ShangjiaService extends IService<ShangjiaEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShangjiaVO> selectListVO(Wrapper<ShangjiaEntity> wrapper);
   	
   	ShangjiaVO selectVO(@Param("ew") Wrapper<ShangjiaEntity> wrapper);
   	
   	List<ShangjiaView> selectListView(Wrapper<ShangjiaEntity> wrapper);
   	
   	ShangjiaView selectView(@Param("ew") Wrapper<ShangjiaEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShangjiaEntity> wrapper);

   	

}

