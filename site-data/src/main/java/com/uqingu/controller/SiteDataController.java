package com.uqingu.controller;

import com.uqingu.entity.Site;
import com.uqingu.service.SiteDataService;
import com.uqingu.utils.IpUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/site")
@Slf4j
@CacheConfig(cacheNames = "cache")
public class SiteDataController {

    @Resource
    private SiteDataService siteDataService;

    @GetMapping("/get")
    @Cacheable(key = "'site'")
    public Site getUser(HttpServletRequest request) {
        String ipAddr = IpUtil.getIpAddr(request);
        Site site = siteDataService.getById(1L);
        return site;
    }

    @PutMapping("/update")
    @CacheEvict(key = "'site'")
    public Site updateUser(Site site, HttpServletRequest request) {
        String ipAddr = IpUtil.getIpAddr(request);
        boolean b = siteDataService.saveOrUpdate(site);
        return site;
    }

    @GetMapping("/test")
    @CacheEvict(key = "'site'")
    public String testCacheEvict(HttpServletRequest request) {
        String ipAddr = IpUtil.getIpAddr(request);
        return ipAddr + "缓存清除测试!!!";
    }
}
