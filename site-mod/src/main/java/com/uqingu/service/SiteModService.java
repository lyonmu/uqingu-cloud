package com.uqingu.service;

import com.uqingu.entity.Site;
import com.uqingu.service.impl.SiteModServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;

@Service
@FeignClient(value = "site-data", fallback = SiteModServiceImpl.class)
public interface SiteModService {

    @GetMapping("/site/get")
    Site getUser();

    @PutMapping("/site/update")
    Site updateUser(Site site);
}
