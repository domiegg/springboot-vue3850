package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.entity.PeisongjiedanEntity;
import com.entity.view.PeisongjiedanView;
import com.entity.vo.PeisongjiedanVO;
import com.utils.PageUtils;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;


/**
 * 配送接单
 *
 * @author 
 * @email 
 * @date 2024-02-13 09:34:26
 */
public interface PeisongjiedanService extends IService<PeisongjiedanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<PeisongjiedanVO> selectListVO(Wrapper<PeisongjiedanEntity> wrapper);
   	
   	PeisongjiedanVO selectVO(@Param("ew") Wrapper<PeisongjiedanEntity> wrapper);
   	
   	List<PeisongjiedanView> selectListView(Wrapper<PeisongjiedanEntity> wrapper);
   	
   	PeisongjiedanView selectView(@Param("ew") Wrapper<PeisongjiedanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<PeisongjiedanEntity> wrapper);

   	

}

