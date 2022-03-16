package dev.nano.skaffoldspringboot.controller;

import dev.nano.skaffoldspringboot.domain.Person;
import dev.nano.skaffoldspringboot.service.MainService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/kabour")
@RequiredArgsConstructor
public class MainController {

    private final MainService mainService;

    @GetMapping
    public List<Person> getKabourFamilyList() {
        return mainService.getKabourFamilyMembers();
    }
}
