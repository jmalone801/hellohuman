package com.codingdojo.hellohuman;

import org.apache.logging.log4j.util.Strings;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HumanController {

    @RequestMapping("/")
    public String index(@RequestParam(value="name", required=false) String searchQuery) {
    	if(searchQuery == null) {
    		return "Hello Human";
    	}
    	else {
    		return "Hello " + searchQuery;
    	}
    }
    
    @RequestMapping("/test")
    public String index2(@RequestParam(value="name") String searchQuery, @RequestParam(value="last_name") String last_name) {
    		return "Hello " + searchQuery + " " + last_name;
    }
    
    @RequestMapping("/times")
    public String times(@RequestParam(value="name") String searchQuery, @RequestParam(value="times") int number) {
        String finalResult = Strings.repeat(" Hello " + searchQuery, number);
        return (finalResult);
    }
}    
