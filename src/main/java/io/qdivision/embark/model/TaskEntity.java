package io.qdivision.embark.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "task")

@Data
@Builder(toBuilder = true)
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@AllArgsConstructor
@NoArgsConstructor
public class TaskEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;
    private String content;
    private String deadline;
    private Long hire_id;
}
