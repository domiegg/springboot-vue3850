package com.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.entity.DingdanpingjiaEntity;
import com.entity.view.DingdanpingjiaView;
import com.entity.vo.DingdanpingjiaVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * 订单评价
 * 
 * @author 
 * @email 
 * @date 2024-02-13 09:34:27
 */
public interface DingdanpingjiaDao extends BaseMapper<DingdanpingjiaEntity> {
	
	List<DingdanpingjiaVO> selectListVO(@Param("ew") Wrapper<DingdanpingjiaEntity> wrapper);
	
	DingdanpingjiaVO selectVO(@Param("ew") Wrapper<DingdanpingjiaEntity> wrapper);
	
	List<DingdanpingjiaView> selectListView(@Param("ew") Wrapper<DingdanpingjiaEntity> wrapper);

	List<DingdanpingjiaView> selectListView(Pagination page,@Param("ew") Wrapper<DingdanpingjiaEntity> wrapper);

	
	DingdanpingjiaView selectView(@Param("ew") Wrapper<DingdanpingjiaEntity> wrapper);
	

}
