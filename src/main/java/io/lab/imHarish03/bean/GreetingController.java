package io.lab.imHarish03.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bean")
public class GreetingController {

	@Autowired
	private BeanRegistrar beanRegistrar;

	@Autowired
	private ApplicationContext context;

	@GetMapping("/register")
	public String registerAndUseBean() {
		beanRegistrar.registerGreetingService();
		GreetingService gs = (GreetingService) context.getBean("dynamicGreetingService");
		return gs.greet("Harish");
	}
}
