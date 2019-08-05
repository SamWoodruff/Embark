package io.qdivision.embark.service;
import io.qdivision.embark.repository.NewHireRepository;
import io.qdivision.embark.model.*;

import java.util.List;
import java.util.stream.Collectors;

public class NewHireService {
    private final NewHireRepository newHireRepository;
    public NewHireService(NewHireRepository newHireRepository){
        this.newHireRepository = newHireRepository;
    }

    public NewHire createNewHire(NewHire newHire){
        NewHireEntity newHireEntity = toNewHireEntity(newHire);
        newHireRepository.saveAndFlush(newHireEntity);
        return toNewHire(newHireEntity);
    }

    public NewHire getNewHireById(Long id){
        return toNewHire(newHireRepository.findById(id).orElseThrow(() -> new RuntimeException("New hire not found")));
    }

    public List<NewHire> getAllNewHires() {
        return newHireRepository.findAll()
                .stream()
                .map(newHireEntity -> toNewHire(newHireEntity))
                .collect(Collectors.toList());
    }

    public NewHire deleteNewHire(Long id) {
        NewHire newHire = getNewHireById(id);
        newHireRepository.deleteById(id);
        return newHire;
    }

    public NewHire updateNewHire(NewHire newHire){
        return toNewHire(newHireRepository.saveAndFlush(toNewHireEntity(newHire)));
    }

    public static NewHire toNewHire(NewHireEntity newHireEntity){
        return NewHire.builder()
                .id(newHireEntity.getId())
                .firstName(newHireEntity.getFirstName())
                .lastName(newHireEntity.getLastName())
                .build();
    }

    public static NewHireEntity toNewHireEntity(NewHire newHire){
        return NewHireEntity.builder()
                .id(newHire.getId())
                .firstName(newHire.getFirstName())
                .lastName(newHire.getLastName())
                .build();
    }

}
