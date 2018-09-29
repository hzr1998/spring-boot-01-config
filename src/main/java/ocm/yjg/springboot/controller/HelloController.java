package ocm.yjg.springboot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hzr
 * @create 2018-09-29 11:00
 */

@RestController
public class HelloController {

    @Value("${person.last-name}")
    private String name;

    @RequestMapping("/sayHello")
    public String sayHello(){
        System.out.println("Hello -> " + name);
        return "Hello -> " + name;
    }
}
