package com.start.spring.test;

import com.start.spring.config.ServiceTestAutoConfigure;
import com.start.spring.service.StarService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author wangyu@mvtech.com.cn
 * @date: 2020-05-29 15:48
 *
 * <p>
 */
public class Main {



    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac=new AnnotationConfigApplicationContext(ServiceTestAutoConfigure.class);
        StarService b = ac.getBean( "helloService", StarService.class);
        StarService c = ac.getBean( "helloService1",StarService.class);


        StarService a = ac.getBean( "startAutoDemo",StarService.class);

        System.out.println("======bean======[{}]"+a);
        System.out.println("======bean======[{}]"+b);
        System.out.println("======bean======[{}]"+c);
    }


}
