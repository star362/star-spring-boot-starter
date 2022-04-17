package com.start.spring.configurationProperties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author wangyu@mvtech.com.cn
 * @date: 2020-05-29 15:41
 *
 * <p>
 */
@Configuration // 标记当前类是配置类
@ConfigurationProperties( prefix = "star")
public class StarProperties {

    public String name;

    public String starfact;


    public String getName() {
        return name;
    }

    public StarProperties setName(String name) {
        this.name = name;
        return this;
    }

    public String getStarfact() {
        return starfact;
    }

    public StarProperties setStarfact(String starfact) {
        this.starfact = starfact;
        return this;
    }

    @Override
    public String toString() {
        return "StarProperties{" +
                "name='" + name + '\'' +
                ", starfact='" + starfact + '\'' +
                '}';
    }
}
