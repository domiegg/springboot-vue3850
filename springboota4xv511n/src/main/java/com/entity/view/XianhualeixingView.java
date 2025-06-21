package com.entity.view;

import com.baomidou.mybatisplus.annotations.TableName;
import com.entity.XianhualeixingEntity;
import org.apache.commons.beanutils.BeanUtils;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;


/**
 * 鲜花类型
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-02-13 09:34:26
 */
@TableName("xianhualeixing")
public class XianhualeixingView  extends XianhualeixingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XianhualeixingView(){
	}
 
 	public XianhualeixingView(XianhualeixingEntity xianhualeixingEntity){
 	try {
			BeanUtils.copyProperties(this, xianhualeixingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
