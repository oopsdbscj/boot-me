package hello.web;

import hello.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    private  UserService userService;

    @GetMapping("/hello")
    public Object sayHello(){
        return userService.findOne(2);
    }
}
