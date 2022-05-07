package com.example.vuemanage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@RestController //组合了@ResponseBody + @Controller
@SpringBootApplication
public class VuemanageApplication {



    public static void main(String[] args) {
        SpringApplication.run(VuemanageApplication.class, args);
    }


}
