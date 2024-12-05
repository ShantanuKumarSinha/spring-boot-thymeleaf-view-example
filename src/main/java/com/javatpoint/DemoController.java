package com.javatpoint;  
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.List;

@Controller  
public class DemoController 
{  
@RequestMapping("/")  
public String index()
{  
//returns to index.html
return"index";  
}  
@RequestMapping(value="/save", method=RequestMethod.POST)  
public ModelAndView save(@ModelAttribute User user)
{  
ModelAndView modelAndView = new ModelAndView();  
modelAndView.setViewName("user-data");      
modelAndView.addObject("user", user);    
return modelAndView;  
}

@PostMapping("/test")
public ResponseEntity<User> createUser(@RequestBody User user){
    return new ResponseEntity<>(user, HttpStatus.OK);
}

@GetMapping("/test/{name}")
public ResponseEntity<List<User>> getUser(@PathVariable String name){
        User user = new User("test@mail.com", "test");
    List<User> userList = new ArrayList<User>();
        if(user.getName().equals(name))
            userList.add(user);
        return ResponseEntity.ok(userList);
    }

}  