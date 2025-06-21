package com.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.dao.NewstypeDao;
import com.entity.NewstypeEntity;
import com.entity.view.NewstypeView;
import com.entity.vo.NewstypeVO;
import com.service.NewstypeService;
import com.utils.PageUtils;
import com.utils.Query;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service("newstypeService")
public class NewstypeServiceImpl extends ServiceImpl<NewstypeDao, NewstypeEntity> implements NewstypeService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<NewstypeEntity> page = this.selectPage(
                new Query<NewstypeEntity>(params).getPage(),
                new EntityWrapper<NewstypeEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<NewstypeEntity> wrapper) {
		  Page<NewstypeView> page =new Query<NewstypeView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<NewstypeVO> selectListVO(Wrapper<NewstypeEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public NewstypeVO selectVO(Wrapper<NewstypeEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<NewstypeView> selectListView(Wrapper<NewstypeEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public NewstypeView selectView(Wrapper<NewstypeEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
