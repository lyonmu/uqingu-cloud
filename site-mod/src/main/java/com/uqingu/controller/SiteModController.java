package com.uqingu.controller;

import com.uqingu.entity.Site;
import com.uqingu.service.SiteModService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@Slf4j
@RestController
public class SiteModController {

    @Resource
    private SiteModService siteModService;

    @GetMapping("/get")
    public Site getUser() {
        Site site = siteModService.getUser();
        System.out.println("测试连接仓库!");
        return site;
    }

    @PutMapping("/update")
    public Site updateUser(Site site) {
        Site site1 = siteModService.updateUser(site);
        return site1;
    }
}
