package dev.nano.skaffoldspringboot.datastore;

import dev.nano.skaffoldspringboot.domain.Person;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
public class FakeDataStore {

    private static final List<Person> KABOUR_FAMILY = new ArrayList<>();

    static {
        KABOUR_FAMILY.add(
                new Person(UUID.randomUUID(),
                        "Bennani smirass",
                        "Kabour",
                        "father"
                )
        );

        KABOUR_FAMILY.add(
                new Person(UUID.randomUUID(),
                        "bent fatma",
                        "ch3ibaya",
                        "mother"
                )
        );

        KABOUR_FAMILY.add(
                new Person(UUID.randomUUID(),
                        "wald kabour",
                        "oussama",
                        "son"
                )
        );
    }

    public List<Person> getListOfFamilyMembers() {
        return KABOUR_FAMILY;
    }
}
