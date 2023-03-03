package com.example.reactive.mongodb.entity.normalized.ssib;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ActivityTask {

    private String taskName;
    private String description;
    private String taskStatus;
    private String taskStatusName;

    public ActivityTask() {
    }

    public ActivityTask(String taskName, String description, String taskStatus, String taskStatusName) {
        this.taskName = taskName;
        this.description = description;
        this.taskStatus = taskStatus;
        this.taskStatusName = taskStatusName;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }

    public String getTaskStatusName() {
        return taskStatusName;
    }

    public void setTaskStatusName(String taskStatusName) {
        this.taskStatusName = taskStatusName;
    }
}
