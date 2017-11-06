package hello.web.controller;

import hello.config.crawl.CrawlConfigEnhance;
import hello.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@RestController
@Controller
public class HelloController {
    private static final Logger LOGGER = LoggerFactory.getLogger(HelloController.class);
    @Autowired
    private UserService userService;

    @Autowired
    private CrawlConfigEnhance myConfig;

    @GetMapping("/hello")
    public Object sayHello() {
        return userService.findOne(5);
    }

    @GetMapping("/hellopage")
    public String hello(HttpServletRequest request, HttpServletResponse response) {
        request.setAttribute("name1","tab from 巴中");
        return "hello";
    }
}
