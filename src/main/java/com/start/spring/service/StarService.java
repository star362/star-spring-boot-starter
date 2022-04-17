package com.start.spring.service;

/**
 * @author wangyu@mvtech.com.cn
 * @date: 2020-05-29 15:53
 *
 * <p>
 */
public class StarService {


    public String name;

    public String starfact;

    public String getName() {
        return name;
    }

    public StarService setName(String name) {
        this.name = name;
        return this;
    }

    public String getStarfact() {
        return starfact;
    }

    public StarService setStarfact(String starfact) {
        this.starfact = starfact;
        return this;
    }

    @Override
    public String toString() {
        return "StarService{" +
                "name='" + name + '\'' +
                ", starfact='" + starfact + '\'' +
                '}';
    }
}
