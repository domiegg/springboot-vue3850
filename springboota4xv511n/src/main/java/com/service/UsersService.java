
package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.entity.UsersEntity;
import com.utils.PageUtils;

import java.util.List;
import java.util.Map;


/**
 * 系统用户
 */
public interface UsersService extends IService<UsersEntity> {
 	PageUtils queryPage(Map<String, Object> params);
    
   	List<UsersEntity> selectListView(Wrapper<UsersEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<UsersEntity> wrapper);
	   	
}
