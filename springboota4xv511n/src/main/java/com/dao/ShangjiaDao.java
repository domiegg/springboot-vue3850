package com.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.entity.ShangjiaEntity;
import com.entity.view.ShangjiaView;
import com.entity.vo.ShangjiaVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * 商家
 * 
 * @author 
 * @email 
 * @date 2024-02-13 09:34:26
 */
public interface ShangjiaDao extends BaseMapper<ShangjiaEntity> {
	
	List<ShangjiaVO> selectListVO(@Param("ew") Wrapper<ShangjiaEntity> wrapper);
	
	ShangjiaVO selectVO(@Param("ew") Wrapper<ShangjiaEntity> wrapper);
	
	List<ShangjiaView> selectListView(@Param("ew") Wrapper<ShangjiaEntity> wrapper);

	List<ShangjiaView> selectListView(Pagination page,@Param("ew") Wrapper<ShangjiaEntity> wrapper);

	
	ShangjiaView selectView(@Param("ew") Wrapper<ShangjiaEntity> wrapper);
	

}
