package ro.codr.helloworld.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import ro.codr.helloworld.repository.HomeRepository;

@RestController
public class HomeController {

    @Autowired
    HomeRepository homeRepository;

    @GetMapping("/")
    public String helloWorld() {
        return homeRepository.getReferenceById(1L).getMessage();
    }
}
