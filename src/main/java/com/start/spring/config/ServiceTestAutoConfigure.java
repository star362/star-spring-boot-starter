package com.start.spring.config;

import com.start.spring.beans.Test;
import com.start.spring.configurationProperties.StarProperties;
import com.start.spring.service.StarService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author wangyu@mvtech.com.cn
 * @date: 2020-05-29 15:27
 *
 * <p>
 */
@Configuration
@Import(Test.class)
@EnableConfigurationProperties(StarProperties.class) // 使用java类作为配置文件
@ConditionalOnClass(value = {StarProperties.class, StarService.class})
public class ServiceTestAutoConfigure {

    StarProperties starProperties;

    public ServiceTestAutoConfigure(StarProperties starProperties) {
        this.starProperties = starProperties;
    }

    @Bean
    public StarService helloService1() {
        StarService helloService = new StarService();
        helloService.setName(starProperties.getName());
        helloService.setStarfact(starProperties.getStarfact());
        System.out.println("=============默认 bean=========="+helloService.toString());
        return helloService;
    }

    /**
     * @ConditionalOnBean         //	当给定的在bean存在时,则实例化当前Bean
     * @ConditionalOnMissingBean  //	当给定的在bean不存在时,则实例化当前Bean
     * @ConditionalOnClass        //	当给定的类名在类路径上存在，则实例化当前Bean
     * @ConditionalOnMissingClass //	当给定的类名在类路径上不存在，则实例化当前Bean
     *
     * @return
     */
    @Bean("startAutoDemo")
    @ConditionalOnMissingBean(name = "helloService2")
    public StarService startAutoDemo() {
        StarService helloService = new StarService();
        helloService.setName("222222222");
        helloService.setStarfact("33333333333333");
        System.out.println("==================startAutoDemo==============="+helloService.toString());
        return helloService;
    }

    @Bean
    @ConditionalOnBean(name = "helloService1")
    public StarService helloService() {
        StarService helloService = new StarService();
        helloService.setName("4444444444");
        helloService.setStarfact("555555555555555");
        System.out.println("==================helloService==============="+helloService.toString());
        return helloService;
    }


}
