package org.lesson2.spring.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

//    //http://localhost:8189/app/hello?name=Olya
//    @RequestMapping(value = "/hello", method = RequestMethod.GET)
//    @ResponseBody
//    public String sayHello(@RequestParam(required = false) String name){
//        if(name == null){
//            return "Hello stranger!!";
//        }
//        return String.format("Hello %s!!", name);
//    }

//    //http://localhost:8189/app/add?n1=4&n2=5
//    @RequestMapping(value = "/add", method = RequestMethod.GET)
//    public String addTwoNumbers(@RequestParam(name = "n1") Integer value1,
//                        @RequestParam(name = "n2") Integer value2){
//        return value1 + value2 +"";
//    }

    //http://localhost:8189/app/users/info/2/confirm
    //                                 {id = 2}
//    @GetMapping(value = "/users/info/{id}/confirm")
//    @ResponseBody
//    public String getUserInfo(@PathVariable(value = "id") Integer number){
//        return "User Info #"+number;
//    }

    @GetMapping(value = "/home")
    public String showHomePage(){
        return "index";
    }

//    @GetMapping(value = "/check/java/data")
//                                    //?name=Bob
//    public String checkJavaData(@RequestParam String name, Model model){
//        model.addAttribute("name", name);
//        return "check_data";
//    }

}
