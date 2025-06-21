package com.entity.view;

import com.baomidou.mybatisplus.annotations.TableName;
import com.entity.PeisongjiedanEntity;
import org.apache.commons.beanutils.BeanUtils;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;


/**
 * 配送接单
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-02-13 09:34:26
 */
@TableName("peisongjiedan")
public class PeisongjiedanView  extends PeisongjiedanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public PeisongjiedanView(){
	}
 
 	public PeisongjiedanView(PeisongjiedanEntity peisongjiedanEntity){
 	try {
			BeanUtils.copyProperties(this, peisongjiedanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
