package springlearning.dependencyinjection.controllers;

import org.springframework.stereotype.Controller;
import springlearning.dependencyinjection.services.GreetingService;

@Controller
public class MyController {
    private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        System.out.println("----- MyController");
        return this.greetingService.sayGreeting();
    }
}
