package com.entity.view;

import com.baomidou.mybatisplus.annotations.TableName;
import com.entity.DingdanpingjiaEntity;
import org.apache.commons.beanutils.BeanUtils;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;


/**
 * 订单评价
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-02-13 09:34:27
 */
@TableName("dingdanpingjia")
public class DingdanpingjiaView  extends DingdanpingjiaEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DingdanpingjiaView(){
	}
 
 	public DingdanpingjiaView(DingdanpingjiaEntity dingdanpingjiaEntity){
 	try {
			BeanUtils.copyProperties(this, dingdanpingjiaEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
