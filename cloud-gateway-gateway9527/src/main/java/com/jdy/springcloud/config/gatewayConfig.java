package com.jdy.springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Mr.jdy
 * @create 2020-06-10 21:10
 *配置一个id为 path_route_jdy的路由规则，当访问地址http://localhost:9527/u/jdy1022/时
 * 自动转发到地址https://home.cnblogs.com/u/jdy1022/
 *
 */
@Configuration
public class gatewayConfig {
    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder routeLocatorBuilder)
    {
        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();

        routes.route("path_route_jdy",
                r -> r.path("/u/jdy1022/")
                        .uri("https://home.cnblogs.com/u/jdy1022/")).build();

        return routes.build();
    }
}
