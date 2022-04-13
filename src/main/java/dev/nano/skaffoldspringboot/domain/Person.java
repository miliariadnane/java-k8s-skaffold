package dev.nano.skaffoldspringboot.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Optional;
import java.util.UUID;

@AllArgsConstructor
@Getter
public class Person {

    private final Long userId;
    private final String lastName;
    private final String firstName;
    private final String position;
}
