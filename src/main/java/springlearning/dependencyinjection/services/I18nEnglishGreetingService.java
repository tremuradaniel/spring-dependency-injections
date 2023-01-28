package springlearning.dependencyinjection.services;

public class I18nEnglishGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello, world - EN!";
    }
}
