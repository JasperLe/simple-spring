package rdemo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

// return "Greetings from Spring Boot!"; verandert in NULL
@RestController
public class HelloController {
    
    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot! And greetings from Jasper!";
    }
    
}
