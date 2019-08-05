package io.qdivision.embark.controller;
import org.springframework.web.bind.annotation.*;
import io.qdivision.embark.model.*;
import io.qdivision.embark.service.NewHireService;
import io.qdivision.embark.repository.NewHireRepository;

import java.util.List;

@RestController
@RequestMapping("newHires")
public class NewHireController {
    private NewHireService newHireService;
    public NewHireController(NewHireRepository newHireRepository){
        this.newHireService = new NewHireService(newHireRepository);
    }

    @GetMapping
    public List<NewHire> getAllNewHires(){
        return newHireService.getAllNewHires();
    }

    @GetMapping("/{id}")
    public NewHire getNewHireById(@PathVariable("id")Long id){
        return newHireService.getNewHireById(id);
    }

    @PostMapping
    public NewHire createNewHire(@RequestBody NewHire newHire){
        return newHireService.createNewHire(newHire);
    }

    @DeleteMapping("/{id}")
    public NewHire deleteNewHire(@PathVariable("id")Long id){
        return newHireService.deleteNewHire(id);
    }

    @PutMapping
    public NewHire updateNewHire(@RequestBody NewHire newHire){
        return newHireService.updateNewHire(newHire);
    }
}
