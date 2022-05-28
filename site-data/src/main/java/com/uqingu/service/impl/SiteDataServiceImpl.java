package com.uqingu.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.uqingu.entity.Site;
import com.uqingu.mapper.SiteDataMapper;
import com.uqingu.service.SiteDataService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Slf4j
@Transactional
public class SiteDataServiceImpl extends ServiceImpl<SiteDataMapper, Site> implements SiteDataService {

}
