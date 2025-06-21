package com.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.entity.DiscussxianhuaxinxiEntity;
import com.entity.view.DiscussxianhuaxinxiView;
import com.entity.vo.DiscussxianhuaxinxiVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * 鲜花信息评论表
 * 
 * @author 
 * @email 
 * @date 2024-02-13 09:34:27
 */
public interface DiscussxianhuaxinxiDao extends BaseMapper<DiscussxianhuaxinxiEntity> {
	
	List<DiscussxianhuaxinxiVO> selectListVO(@Param("ew") Wrapper<DiscussxianhuaxinxiEntity> wrapper);
	
	DiscussxianhuaxinxiVO selectVO(@Param("ew") Wrapper<DiscussxianhuaxinxiEntity> wrapper);
	
	List<DiscussxianhuaxinxiView> selectListView(@Param("ew") Wrapper<DiscussxianhuaxinxiEntity> wrapper);

	List<DiscussxianhuaxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussxianhuaxinxiEntity> wrapper);

	
	DiscussxianhuaxinxiView selectView(@Param("ew") Wrapper<DiscussxianhuaxinxiEntity> wrapper);
	

}
