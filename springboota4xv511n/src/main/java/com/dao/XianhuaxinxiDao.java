package com.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.entity.XianhuaxinxiEntity;
import com.entity.view.XianhuaxinxiView;
import com.entity.vo.XianhuaxinxiVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * 鲜花信息
 * 
 * @author 
 * @email 
 * @date 2024-02-13 09:34:26
 */
public interface XianhuaxinxiDao extends BaseMapper<XianhuaxinxiEntity> {
	
	List<XianhuaxinxiVO> selectListVO(@Param("ew") Wrapper<XianhuaxinxiEntity> wrapper);
	
	XianhuaxinxiVO selectVO(@Param("ew") Wrapper<XianhuaxinxiEntity> wrapper);
	
	List<XianhuaxinxiView> selectListView(@Param("ew") Wrapper<XianhuaxinxiEntity> wrapper);

	List<XianhuaxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<XianhuaxinxiEntity> wrapper);

	
	XianhuaxinxiView selectView(@Param("ew") Wrapper<XianhuaxinxiEntity> wrapper);
	

}
