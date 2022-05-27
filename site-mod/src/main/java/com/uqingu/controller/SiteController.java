package com.uqingu.controller;

import com.uqingu.service.SiteService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@Slf4j
@RestController
public class SiteController {

    @Resource
    private SiteService siteService;
}
