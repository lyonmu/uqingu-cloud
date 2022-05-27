package com.uqingu.service;

import com.uqingu.service.impl.SiteServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;

@Service
@FeignClient(value = "site-data", fallback = SiteServiceImpl.class)
public interface SiteService {
}
