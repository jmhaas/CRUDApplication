package io.zipcoder.crudapp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by justinhaas on 6/15/17.
 */
@org.springframework.web.bind.annotation.RestController
public class RestController {

    public final AtomicInteger id = new AtomicInteger();
    public static final String template = "Name, %s";


    @RequestMapping("/person")
    public Person person(@RequestParam(value = "name", defaultValue = "Blank")String name){
        return new Person(id.incrementAndGet(),
                String.format(template, name));
    }
}
