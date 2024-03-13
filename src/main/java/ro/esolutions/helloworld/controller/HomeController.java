package ro.esolutions.helloworld.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import ro.esolutions.helloworld.repository.HomeRepository;

@RestController
public class HomeController {

    @Autowired
    HomeRepository homeRepository;

    @GetMapping("/")
    public String helloWorld() {
        // test com
        return "iship";
        // return homeRepository.getReferenceById(1L).getMessage();
    }
}
