package dev.nano.skaffoldspringboot.service;

import dev.nano.skaffoldspringboot.domain.Person;
import dev.nano.skaffoldspringboot.repository.MainRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MainService {

    private final MainRepository mainRepository;

    public List<Person> getKabourFamilyMembers() {
        return mainRepository.getFamilyMembers();
    }
}
