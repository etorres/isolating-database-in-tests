package es.eriktorr.example.petclinic.test;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public abstract class ConcurrentSuiteInitializer implements ApplicationContextAware, InitializingBean {

    protected boolean beanInitialized = false;

    @Override
    public void afterPropertiesSet() {
        this.beanInitialized = true;
    }

    protected ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

}
