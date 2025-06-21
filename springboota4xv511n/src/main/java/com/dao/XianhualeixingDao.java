package com.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.entity.XianhualeixingEntity;
import com.entity.view.XianhualeixingView;
import com.entity.vo.XianhualeixingVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * 鲜花类型
 * 
 * @author 
 * @email 
 * @date 2024-02-13 09:34:26
 */
public interface XianhualeixingDao extends BaseMapper<XianhualeixingEntity> {
	
	List<XianhualeixingVO> selectListVO(@Param("ew") Wrapper<XianhualeixingEntity> wrapper);
	
	XianhualeixingVO selectVO(@Param("ew") Wrapper<XianhualeixingEntity> wrapper);
	
	List<XianhualeixingView> selectListView(@Param("ew") Wrapper<XianhualeixingEntity> wrapper);

	List<XianhualeixingView> selectListView(Pagination page,@Param("ew") Wrapper<XianhualeixingEntity> wrapper);

	
	XianhualeixingView selectView(@Param("ew") Wrapper<XianhualeixingEntity> wrapper);
	

}
