package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.entity.DingdanxinxiEntity;
import com.entity.view.DingdanxinxiView;
import com.entity.vo.DingdanxinxiVO;
import com.utils.PageUtils;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;


/**
 * 订单信息
 *
 * @author 
 * @email 
 * @date 2024-02-13 09:34:26
 */
public interface DingdanxinxiService extends IService<DingdanxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DingdanxinxiVO> selectListVO(Wrapper<DingdanxinxiEntity> wrapper);
   	
   	DingdanxinxiVO selectVO(@Param("ew") Wrapper<DingdanxinxiEntity> wrapper);
   	
   	List<DingdanxinxiView> selectListView(Wrapper<DingdanxinxiEntity> wrapper);
   	
   	DingdanxinxiView selectView(@Param("ew") Wrapper<DingdanxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DingdanxinxiEntity> wrapper);

   	

}

