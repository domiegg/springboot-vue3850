package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.entity.PeisongyuanEntity;
import com.entity.view.PeisongyuanView;
import com.entity.vo.PeisongyuanVO;
import com.utils.PageUtils;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;


/**
 * 配送员
 *
 * @author 
 * @email 
 * @date 2024-02-13 09:34:26
 */
public interface PeisongyuanService extends IService<PeisongyuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<PeisongyuanVO> selectListVO(Wrapper<PeisongyuanEntity> wrapper);
   	
   	PeisongyuanVO selectVO(@Param("ew") Wrapper<PeisongyuanEntity> wrapper);
   	
   	List<PeisongyuanView> selectListView(Wrapper<PeisongyuanEntity> wrapper);
   	
   	PeisongyuanView selectView(@Param("ew") Wrapper<PeisongyuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<PeisongyuanEntity> wrapper);

   	

}

