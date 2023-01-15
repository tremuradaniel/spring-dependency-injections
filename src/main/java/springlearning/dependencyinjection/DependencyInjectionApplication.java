package springlearning.dependencyinjection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import springlearning.dependencyinjection.controllers.*;

@SpringBootApplication
public class DependencyInjectionApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DependencyInjectionApplication.class, args);

		I18nController i18nController = (I18nController) ctx.getBean("i18nController");

		System.out.println(i18nController.sayHello());

		MyController controller = (MyController) ctx.getBean("myController");

		System.out.println(controller.sayHello());

		System.out.println("------- PROPERTY");

		PropertyInjectedController pController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");

		System.out.println(pController.getGreeting());

		System.out.println("------- SETTER");

		SetterInjectedController sController = (SetterInjectedController) ctx.getBean("setterInjectedController");

		System.out.println(sController.getGreeting());

		System.out.println("------- CONSTRUCTOR");

		ConstructorInjectedController cController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");

		System.out.println(cController.getGreeting());
	}

}
