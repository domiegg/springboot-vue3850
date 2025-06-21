package com.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.entity.PeisongdingdanEntity;
import com.entity.view.PeisongdingdanView;
import com.entity.vo.PeisongdingdanVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * 配送订单
 * 
 * @author 
 * @email 
 * @date 2024-02-13 09:34:26
 */
public interface PeisongdingdanDao extends BaseMapper<PeisongdingdanEntity> {
	
	List<PeisongdingdanVO> selectListVO(@Param("ew") Wrapper<PeisongdingdanEntity> wrapper);
	
	PeisongdingdanVO selectVO(@Param("ew") Wrapper<PeisongdingdanEntity> wrapper);
	
	List<PeisongdingdanView> selectListView(@Param("ew") Wrapper<PeisongdingdanEntity> wrapper);

	List<PeisongdingdanView> selectListView(Pagination page,@Param("ew") Wrapper<PeisongdingdanEntity> wrapper);

	
	PeisongdingdanView selectView(@Param("ew") Wrapper<PeisongdingdanEntity> wrapper);
	

}
