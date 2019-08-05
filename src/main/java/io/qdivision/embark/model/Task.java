package io.qdivision.embark.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class Task {
    private Long id;
    private String content;
    private String deadline;
    private Long hire_id;
}
