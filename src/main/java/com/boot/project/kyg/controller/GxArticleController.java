package com.boot.project.kyg.controller;


import com.boot.project.kyg.entity.GxArticle;
import com.boot.project.kyg.service.IGxArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 文章信息 前端控制器
 * </p>
 *
 * @author jobob
 * @since 2019-09-26
 */
@RestController
@RequestMapping("/kyg/gx-article")
public class GxArticleController {
    @Autowired
    IGxArticleService articleService;
    @RequestMapping("hello")
    public GxArticle hello(){
        Integer i=0;
        new Thread(){
            @Override
            public  void  run() {
                while (true){
                    synchronized (i) {
                        System.out.println("+++++++++++++++++++++++++");
                    }
                }

            }
        }.start();
        int z=i;

        GxArticle byId = articleService.getById(2);
        return byId;
    }

}
