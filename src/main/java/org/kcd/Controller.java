package org.kcd;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class Controller {

    @GetMapping("/")
    public ResponseEntity<String> home(){
        log.info("Home Page responding");
        return new ResponseEntity<String>("Home Page of Spring Boot Crater Bugo", HttpStatus.OK);
    }
}
