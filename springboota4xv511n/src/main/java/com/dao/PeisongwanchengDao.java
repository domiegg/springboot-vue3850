package com.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.entity.PeisongwanchengEntity;
import com.entity.view.PeisongwanchengView;
import com.entity.vo.PeisongwanchengVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * 配送完成
 * 
 * @author 
 * @email 
 * @date 2024-02-13 09:34:26
 */
public interface PeisongwanchengDao extends BaseMapper<PeisongwanchengEntity> {
	
	List<PeisongwanchengVO> selectListVO(@Param("ew") Wrapper<PeisongwanchengEntity> wrapper);
	
	PeisongwanchengVO selectVO(@Param("ew") Wrapper<PeisongwanchengEntity> wrapper);
	
	List<PeisongwanchengView> selectListView(@Param("ew") Wrapper<PeisongwanchengEntity> wrapper);

	List<PeisongwanchengView> selectListView(Pagination page,@Param("ew") Wrapper<PeisongwanchengEntity> wrapper);

	
	PeisongwanchengView selectView(@Param("ew") Wrapper<PeisongwanchengEntity> wrapper);
	

}
