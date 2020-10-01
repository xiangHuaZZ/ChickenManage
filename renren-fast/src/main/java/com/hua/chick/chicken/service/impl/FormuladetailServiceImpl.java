package com.hua.chick.chicken.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hua.common.utils.PageUtils;
import com.hua.common.utils.Query;

import com.hua.chick.chicken.dao.FormuladetailDao;
import com.hua.chick.chicken.entity.FormuladetailEntity;
import com.hua.chick.chicken.service.FormuladetailService;


@Service("formuladetailService")
public class FormuladetailServiceImpl extends ServiceImpl<FormuladetailDao, FormuladetailEntity> implements FormuladetailService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<FormuladetailEntity> page = this.page(
                new Query<FormuladetailEntity>().getPage(params),
                new QueryWrapper<FormuladetailEntity>()
        );

        return new PageUtils(page);
    }

}