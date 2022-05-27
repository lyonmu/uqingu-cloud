package com.uqingu.routers;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SiteModRouter {
    @Bean
    public RouteLocator testSiteMod(RouteLocatorBuilder routeLocatorBuilder) {
        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();

        routes.route("site-mod", r -> r.path("/test")
                        .uri("lb://site-mod")).build();

        return routes.build();
    }
}
