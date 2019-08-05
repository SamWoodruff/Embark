package io.qdivision.embark.service;
import io.qdivision.embark.repository.NewHireRepository;
import io.qdivision.embark.model.*;
import io.qdivision.embark.conversions.NewHireConversion;

public class NewHireService {
    private final NewHireRepository newHireRepository;
    public NewHireService(NewHireRepository newHireRepository){
        this.newHireRepository = newHireRepository;
    }

    public NewHire createNewHire(NewHire newHire){
        newHireRepository.saveAndFlush(toNewHireEntity(newHire));
        return newHire;
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
