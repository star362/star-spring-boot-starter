package com.start.spring.beans;

/**
 * @author wangyu@mvtech.com.cn
 * @date: 2020-05-29 17:08
 *
 * <p>
 */
public class Test {

    public String a ="a";


    public String getA() {
        return a;
    }

    public Test setA(String a) {
        this.a = a;
        return this;
    }



    public Test() {
        System.out.println("==============Test无参构造函数");
    }
}
