package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.entity.NewstypeEntity;
import com.entity.view.NewstypeView;
import com.entity.vo.NewstypeVO;
import com.utils.PageUtils;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;


/**
 * 通知公告分类
 *
 * @author 
 * @email 
 * @date 2024-02-13 09:34:27
 */
public interface NewstypeService extends IService<NewstypeEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<NewstypeVO> selectListVO(Wrapper<NewstypeEntity> wrapper);
   	
   	NewstypeVO selectVO(@Param("ew") Wrapper<NewstypeEntity> wrapper);
   	
   	List<NewstypeView> selectListView(Wrapper<NewstypeEntity> wrapper);
   	
   	NewstypeView selectView(@Param("ew") Wrapper<NewstypeEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<NewstypeEntity> wrapper);

   	

}

