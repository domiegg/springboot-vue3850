package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.entity.PeisongwanchengEntity;
import com.entity.view.PeisongwanchengView;
import com.entity.vo.PeisongwanchengVO;
import com.utils.PageUtils;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;


/**
 * 配送完成
 *
 * @author 
 * @email 
 * @date 2024-02-13 09:34:26
 */
public interface PeisongwanchengService extends IService<PeisongwanchengEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<PeisongwanchengVO> selectListVO(Wrapper<PeisongwanchengEntity> wrapper);
   	
   	PeisongwanchengVO selectVO(@Param("ew") Wrapper<PeisongwanchengEntity> wrapper);
   	
   	List<PeisongwanchengView> selectListView(Wrapper<PeisongwanchengEntity> wrapper);
   	
   	PeisongwanchengView selectView(@Param("ew") Wrapper<PeisongwanchengEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<PeisongwanchengEntity> wrapper);

   	

}

