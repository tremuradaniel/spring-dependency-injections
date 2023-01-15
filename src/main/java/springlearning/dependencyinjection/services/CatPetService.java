package springlearning.dependencyinjection.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"cat", "default"})
@Service("pet")
public class CatPetService implements PetService {
    @Override
    public String getPetType() {
        return "Cats Are the Best!";
    }
}
