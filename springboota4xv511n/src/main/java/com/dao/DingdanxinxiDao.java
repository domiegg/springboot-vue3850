package com.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.entity.DingdanxinxiEntity;
import com.entity.view.DingdanxinxiView;
import com.entity.vo.DingdanxinxiVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * 订单信息
 * 
 * @author 
 * @email 
 * @date 2024-02-13 09:34:26
 */
public interface DingdanxinxiDao extends BaseMapper<DingdanxinxiEntity> {
	
	List<DingdanxinxiVO> selectListVO(@Param("ew") Wrapper<DingdanxinxiEntity> wrapper);
	
	DingdanxinxiVO selectVO(@Param("ew") Wrapper<DingdanxinxiEntity> wrapper);
	
	List<DingdanxinxiView> selectListView(@Param("ew") Wrapper<DingdanxinxiEntity> wrapper);

	List<DingdanxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DingdanxinxiEntity> wrapper);

	
	DingdanxinxiView selectView(@Param("ew") Wrapper<DingdanxinxiEntity> wrapper);
	

}
