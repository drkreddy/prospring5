package com.radi.spring.dependencyInjection.methodLookup;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.util.StopWatch;

@Configuration
@ComponentScan(basePackages = {"com.radi.spring.dependencyInjection.methodLookup"})
public class MethodLookupConfigApp {
    public static void main(String[] args) {
        GenericApplicationContext ctx =
                new AnnotationConfigApplicationContext(MethodLookupConfigApp.class);
        DemoBean abstractBean = ctx.getBean("abstractLookupBean",
                DemoBean.class);
        DemoBean standardBean = ctx.getBean("standardLookupBean",
                DemoBean.class);
        DemoBean singletonBean = ctx.getBean("singletonLookupBean",
                DemoBean.class);
        displayInfo("abstractLookupBean", abstractBean);
        displayInfo("standardLookupBean", standardBean);
        displayInfo("singletonLookupBean", singletonBean);

        ctx.close();
    }
    public static void displayInfo(String beanName, DemoBean bean) {
        Singer singer1 = bean.getMySinger();
        Singer singer2 = bean.getMySinger();
        System.out.println("" + beanName + ": Singer Instances the Same? "
                + (singer1 == singer2));
        StopWatch stopWatch = new StopWatch();
        stopWatch.start("lookupDemo");
        for (int x = 0; x < 5; x++) {
            Singer singer = bean.getMySinger();
            System.out.println(singer);
            singer.sing();
        }
        stopWatch.stop();
        System.out.println("100000 gets took "
                + stopWatch.getTotalTimeMillis() + " ms");
    }
}

