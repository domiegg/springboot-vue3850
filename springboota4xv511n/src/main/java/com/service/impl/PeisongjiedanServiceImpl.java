package com.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.dao.PeisongjiedanDao;
import com.entity.PeisongjiedanEntity;
import com.entity.view.PeisongjiedanView;
import com.entity.vo.PeisongjiedanVO;
import com.service.PeisongjiedanService;
import com.utils.PageUtils;
import com.utils.Query;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service("peisongjiedanService")
public class PeisongjiedanServiceImpl extends ServiceImpl<PeisongjiedanDao, PeisongjiedanEntity> implements PeisongjiedanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<PeisongjiedanEntity> page = this.selectPage(
                new Query<PeisongjiedanEntity>(params).getPage(),
                new EntityWrapper<PeisongjiedanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<PeisongjiedanEntity> wrapper) {
		  Page<PeisongjiedanView> page =new Query<PeisongjiedanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<PeisongjiedanVO> selectListVO(Wrapper<PeisongjiedanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public PeisongjiedanVO selectVO(Wrapper<PeisongjiedanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<PeisongjiedanView> selectListView(Wrapper<PeisongjiedanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public PeisongjiedanView selectView(Wrapper<PeisongjiedanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
