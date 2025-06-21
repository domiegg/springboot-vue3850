package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.entity.DiscussxianhuaxinxiEntity;
import com.entity.view.DiscussxianhuaxinxiView;
import com.entity.vo.DiscussxianhuaxinxiVO;
import com.utils.PageUtils;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;


/**
 * 鲜花信息评论表
 *
 * @author 
 * @email 
 * @date 2024-02-13 09:34:27
 */
public interface DiscussxianhuaxinxiService extends IService<DiscussxianhuaxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussxianhuaxinxiVO> selectListVO(Wrapper<DiscussxianhuaxinxiEntity> wrapper);
   	
   	DiscussxianhuaxinxiVO selectVO(@Param("ew") Wrapper<DiscussxianhuaxinxiEntity> wrapper);
   	
   	List<DiscussxianhuaxinxiView> selectListView(Wrapper<DiscussxianhuaxinxiEntity> wrapper);
   	
   	DiscussxianhuaxinxiView selectView(@Param("ew") Wrapper<DiscussxianhuaxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussxianhuaxinxiEntity> wrapper);

   	

}

