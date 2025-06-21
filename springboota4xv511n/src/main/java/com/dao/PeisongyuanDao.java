package com.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.entity.PeisongyuanEntity;
import com.entity.view.PeisongyuanView;
import com.entity.vo.PeisongyuanVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * 配送员
 * 
 * @author 
 * @email 
 * @date 2024-02-13 09:34:26
 */
public interface PeisongyuanDao extends BaseMapper<PeisongyuanEntity> {
	
	List<PeisongyuanVO> selectListVO(@Param("ew") Wrapper<PeisongyuanEntity> wrapper);
	
	PeisongyuanVO selectVO(@Param("ew") Wrapper<PeisongyuanEntity> wrapper);
	
	List<PeisongyuanView> selectListView(@Param("ew") Wrapper<PeisongyuanEntity> wrapper);

	List<PeisongyuanView> selectListView(Pagination page,@Param("ew") Wrapper<PeisongyuanEntity> wrapper);

	
	PeisongyuanView selectView(@Param("ew") Wrapper<PeisongyuanEntity> wrapper);
	

}
