package com.uqingu.controller;

import com.uqingu.entity.Site;
import com.uqingu.service.SiteService;
import com.uqingu.utils.IpUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/site")
@Slf4j
@CacheConfig(cacheNames = "cache")
public class SiteController {
    @Resource
    RedisTemplate<Object, Object> redisTemplate;
    @Resource
    private SiteService siteService;

    @GetMapping("/get")
    @Cacheable(key = "'site'")
    public Site getUser(HttpServletRequest request) {
        String ipAddr = IpUtil.getIpAddr(request);
        Site site = siteService.getById(1L);
        return site;
    }

    @PutMapping("/update")
    @CacheEvict(key = "'site'")
    public Site updateUser(Site site, HttpServletRequest request) {
        String ipAddr = IpUtil.getIpAddr(request);
        boolean b = siteService.saveOrUpdate(site);
        return site;
    }

    @GetMapping("/test")
    @CacheEvict(key = "'site'")
    public String testCacheEvict(HttpServletRequest request) {
        String ipAddr = IpUtil.getIpAddr(request);
        return ipAddr + "缓存清除测试!!!";
    }
}
