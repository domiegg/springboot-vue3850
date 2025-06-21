package com.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.dao.XianhualeixingDao;
import com.entity.XianhualeixingEntity;
import com.entity.view.XianhualeixingView;
import com.entity.vo.XianhualeixingVO;
import com.service.XianhualeixingService;
import com.utils.PageUtils;
import com.utils.Query;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service("xianhualeixingService")
public class XianhualeixingServiceImpl extends ServiceImpl<XianhualeixingDao, XianhualeixingEntity> implements XianhualeixingService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XianhualeixingEntity> page = this.selectPage(
                new Query<XianhualeixingEntity>(params).getPage(),
                new EntityWrapper<XianhualeixingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XianhualeixingEntity> wrapper) {
		  Page<XianhualeixingView> page =new Query<XianhualeixingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<XianhualeixingVO> selectListVO(Wrapper<XianhualeixingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XianhualeixingVO selectVO(Wrapper<XianhualeixingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XianhualeixingView> selectListView(Wrapper<XianhualeixingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XianhualeixingView selectView(Wrapper<XianhualeixingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
