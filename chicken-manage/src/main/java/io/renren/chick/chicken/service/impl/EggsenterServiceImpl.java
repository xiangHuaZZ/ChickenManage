package io.renren.chick.chicken.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.chick.chicken.dao.EggsenterDao;
import io.renren.chick.chicken.entity.EggsenterEntity;
import io.renren.chick.chicken.service.EggsenterService;


@Service("eggsenterService")
public class EggsenterServiceImpl extends ServiceImpl<EggsenterDao, EggsenterEntity> implements EggsenterService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<EggsenterEntity> page = this.page(
                new Query<EggsenterEntity>().getPage(params),
                new QueryWrapper<EggsenterEntity>()
        );

        return new PageUtils(page);
    }

}