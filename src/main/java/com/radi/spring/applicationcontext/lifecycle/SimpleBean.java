package com.radi.spring.applicationcontext.lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component
public class SimpleBean implements InitializingBean, DisposableBean, BeanNameAware, ApplicationContextAware {
    int i=1;
    @Override
    public void setBeanName(String s) {
        System.out.println(i+++"================BeanNameAware::setBeanName=====" +
                "=="+s);
    }

    @PostConstruct
    public void postInit(){
        System.out.println(i+++"--------Post Construct========");
    }
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(i+++" InitializingBean::afterpopertiesSet");
    }

    public void initMethod(){
        System.out.println(i+++"========init Method======");
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println(i+++" --------Pre Destory=======");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println(i+++" --------DisposableBean::Destory=======");
    }

    public void destroyMethod(){
        System.out.println(i+++" ======= Destroy Method =========");
    }


    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println(i+++"======applicationContextAware::setApplicationContext(appContext0");
    }
}
