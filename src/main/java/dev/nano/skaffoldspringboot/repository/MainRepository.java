package dev.nano.skaffoldspringboot.repository;

import dev.nano.skaffoldspringboot.datastore.FakeDataStore;
import dev.nano.skaffoldspringboot.domain.Person;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class MainRepository {

    private final FakeDataStore fakeDataStore;

    public List<Person> getFamilyMembers() {
        return fakeDataStore.getListOfFamilyMembers();
    }
}
