package io.renren.chick.chicken.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.renren.chick.chicken.entity.MaterialenterdetailEntity;
import io.renren.chick.chicken.service.MaterialenterdetailService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;



/**
 * 原料入库明细
 *
 * @author zhengXiangHua
 * @email 912358463@qq.com
 * @date 2020-10-01 15:30:45
 */
@RestController
@RequestMapping("chicken/materialenterdetail")
public class MaterialenterdetailController {
    @Autowired
    private MaterialenterdetailService materialenterdetailService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = materialenterdetailService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		MaterialenterdetailEntity materialenterdetail = materialenterdetailService.getById(id);

        return R.ok().put("materialenterdetail", materialenterdetail);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody MaterialenterdetailEntity materialenterdetail){
		materialenterdetailService.save(materialenterdetail);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody MaterialenterdetailEntity materialenterdetail){
		materialenterdetailService.updateById(materialenterdetail);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		materialenterdetailService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
