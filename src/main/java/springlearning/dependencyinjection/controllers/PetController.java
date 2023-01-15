package springlearning.dependencyinjection.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import springlearning.dependencyinjection.services.PetService;

@Controller
public class PetController {
    private final PetService petService;

    public PetController(@Qualifier("pet") PetService petService) {
        this.petService = petService;
    }

    public String whichPetIsTheBest(){
        return this.petService.getPetType();
    }
}
