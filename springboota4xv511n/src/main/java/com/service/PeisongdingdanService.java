package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.entity.PeisongdingdanEntity;
import com.entity.view.PeisongdingdanView;
import com.entity.vo.PeisongdingdanVO;
import com.utils.PageUtils;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;


/**
 * 配送订单
 *
 * @author 
 * @email 
 * @date 2024-02-13 09:34:26
 */
public interface PeisongdingdanService extends IService<PeisongdingdanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<PeisongdingdanVO> selectListVO(Wrapper<PeisongdingdanEntity> wrapper);
   	
   	PeisongdingdanVO selectVO(@Param("ew") Wrapper<PeisongdingdanEntity> wrapper);
   	
   	List<PeisongdingdanView> selectListView(Wrapper<PeisongdingdanEntity> wrapper);
   	
   	PeisongdingdanView selectView(@Param("ew") Wrapper<PeisongdingdanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<PeisongdingdanEntity> wrapper);

   	

}

