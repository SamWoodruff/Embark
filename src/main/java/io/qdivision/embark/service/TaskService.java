package io.qdivision.embark.service;

import io.qdivision.embark.model.Task;
import io.qdivision.embark.model.TaskEntity;

public class TaskService {

    public static Task toTask(TaskEntity taskEntity){
        return Task.builder()
                .id(taskEntity.getId())
                .content(taskEntity.getContent())
                .deadline(taskEntity.getDeadline())
                .hireId(taskEntity.getHireId())
                .build();
    }
    public static TaskEntity toTaskEntity(Task task){
        return TaskEntity.builder()
                .id(task.getId())
                .content(task.getContent())
                .deadline(task.getDeadline())
                .hireId(task.getHireId())
                .build();
    }
}
