package io.lab.imHarish03.bean;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class BeanRegistrar implements ApplicationContextAware {

	private ConfigurableApplicationContext context;

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) {
		this.context = (ConfigurableApplicationContext) applicationContext;
	}

	public void registerGreetingService() {
		DefaultListableBeanFactory beanFactory = (DefaultListableBeanFactory) context.getBeanFactory();
		GreetingService greetingService = new DynamicGreetingService();
		beanFactory.registerSingleton("dynamicGreetingService", greetingService);
	}

}
