package mx.biits.crm.builder.utils;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class SpringUtils implements ApplicationContextAware {
	
	private static ApplicationContext CONTEXT;

	public void setApplicationContext(ApplicationContext context) throws BeansException {
		CONTEXT = context;
	}
	
	public static <T> T getBean(Class<T> clazz) {
		return CONTEXT.getBean(clazz);
	}
	
	public static <T> T getBean(String beanName,Class<T> clazz) {
		return CONTEXT.getBean(beanName, clazz);
	}
	
	public static Object getBean(String beanName) {
		return CONTEXT.getBean(beanName);
	}

}
