package springlearning.dependencyinjection.services;

public class PrimaryGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello World - PRIMARY bean";
    }
}
