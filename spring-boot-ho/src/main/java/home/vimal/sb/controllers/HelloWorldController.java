package home.vimal.sb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@RestController
public class HelloWorldController {

    @RequestMapping("/hello")
    @ResponseBody
    public String sayHello(){
       return "Hello Spring Boot HO !";
    }

    @GetMapping("/printNumbers")
    @ResponseBody
    public Collection<String> printNumbers(@RequestParam("input") int input) {
        return IntStream.range(0, input).mapToObj(i -> "Printing : " + i).collect(Collectors.toList());
    }

}
