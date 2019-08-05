package io.qdivision.embark.controller;
import org.springframework.web.bind.annotation.*;
import io.qdivision.embark.model.*;
import io.qdivision.embark.service.NewHireService;
import io.qdivision.embark.repository.NewHireRepository;

@RestController
@RequestMapping("newhires")
public class NewHireController {
    private NewHireService newHireService;
    public NewHireController(NewHireRepository newHireRepository){
        this.newHireService = new NewHireService(newHireRepository);
    }

    @PostMapping
    public NewHire getNewHire(@RequestBody NewHire newHire){
        return newHireService.createNewHire(newHire);
    }
}
