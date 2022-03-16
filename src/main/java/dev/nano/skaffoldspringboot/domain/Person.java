package dev.nano.skaffoldspringboot.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Optional;
import java.util.UUID;

@AllArgsConstructor
@Getter
@Setter
public class Person {

    private final UUID userId;
    private final String lastName;
    private final String firstName;
    private final String position;
}
