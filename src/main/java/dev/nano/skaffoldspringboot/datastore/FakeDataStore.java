package dev.nano.skaffoldspringboot.datastore;

import dev.nano.skaffoldspringboot.domain.Person;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class FakeDataStore {

    private static final List<Person> KABOUR_FAMILY = new ArrayList<>();

    static {
        KABOUR_FAMILY.add(
                new Person(1L,
                        "Bennani smirass",
                        "Kabour",
                        "father"
                )
        );
        KABOUR_FAMILY.add(
                new Person(2L,
                        "bent fatma",
                        "ch3ibaya",
                        "mother"
                )
        );
        KABOUR_FAMILY.add(
                new Person(3L,
                        "wald kabour",
                        "oussamaa",
                        "son"
                )
        );
    }

    public List<Person> getListOfFamilyMembers() {
        return KABOUR_FAMILY;
    }
}
