package com.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.entity.PeisongjiedanEntity;
import com.entity.view.PeisongjiedanView;
import com.entity.vo.PeisongjiedanVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * 配送接单
 * 
 * @author 
 * @email 
 * @date 2024-02-13 09:34:26
 */
public interface PeisongjiedanDao extends BaseMapper<PeisongjiedanEntity> {
	
	List<PeisongjiedanVO> selectListVO(@Param("ew") Wrapper<PeisongjiedanEntity> wrapper);
	
	PeisongjiedanVO selectVO(@Param("ew") Wrapper<PeisongjiedanEntity> wrapper);
	
	List<PeisongjiedanView> selectListView(@Param("ew") Wrapper<PeisongjiedanEntity> wrapper);

	List<PeisongjiedanView> selectListView(Pagination page,@Param("ew") Wrapper<PeisongjiedanEntity> wrapper);

	
	PeisongjiedanView selectView(@Param("ew") Wrapper<PeisongjiedanEntity> wrapper);
	

}
