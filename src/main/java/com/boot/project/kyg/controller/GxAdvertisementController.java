package com.boot.project.kyg.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.boot.project.kyg.entity.GxAdvertisement;
import com.boot.project.kyg.service.IGxAdvertisementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 广告宣传 前端控制器
 * </p>
 *
 * @author jobob
 * @since 2019-09-26
 */
@RestController
@RequestMapping("/kyg/gx-advertisement")
public class GxAdvertisementController {

    @Autowired
    private IGxAdvertisementService gxAdvertisementService;
    @RequestMapping("/getone")
    public GxAdvertisement getone(){
        QueryWrapper<GxAdvertisement> wrapper = new QueryWrapper<>();
        wrapper.eq("id",1);
        return this.gxAdvertisementService.getOne(wrapper);
    }

}
