package spring.di.nish.service;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class SomeComponent implements InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware, ApplicationContextAware, BeanPostProcessor {

    private String javaVer;

    @Value("${java.specification.version}")
    public void setJavaVer(String javaVer) {
        System.out.println("setting properties");
        this.javaVer = javaVer;
        System.out.println(javaVer);
    }


    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("bean fac is set :" );
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("bean name is :" + name);
    }

    @Override
    public void destroy() throws Exception {

        System.out.println("destroying..");
    }

    @PostConstruct
    public void nish() {
        this.javaVer = "22";
        System.out.println("post construction");
        System.out.println(javaVer);
    }

    @PreDestroy
    public void preDestroying() {
        System.out.println("pre destroying");
    }



    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(javaVer);
        System.out.println("properties are set");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

        System.out.println("adding into app context");
    }
}
