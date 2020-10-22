package com.hero.cn.config;

import com.hero.cn.interceptor.MyBaitsInterceptor;
import org.apache.ibatis.plugin.Interceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * myBaits 配置
 *  -MapperScan 扫描包
 * @author sucx
 * @projectName colud-parent
 * @description:
 * @date 2020/10/2116:22
 */
@Configuration
@MapperScan({"com.hero.cn.mappers"})
public class MyBaitsConfiguration {
    /**
     *自定义myBaits拦截器，打印完整sql
     * @return
     */
    @Bean
    public Interceptor getMyBaitsInterceptor() {
        return new MyBaitsInterceptor();
    }
}
