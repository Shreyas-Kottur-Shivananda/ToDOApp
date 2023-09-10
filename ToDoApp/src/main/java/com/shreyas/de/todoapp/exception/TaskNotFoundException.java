package com.shreyas.de.todoapp.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class TaskNotFoundException extends RuntimeException {
    private final String message;
}
