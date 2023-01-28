package springlearning.dependencyinjection.services;

public class I18nSpanishGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello, world - ES!";
    }
}
