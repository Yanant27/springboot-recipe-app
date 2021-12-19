package hyk.springframework.springbootrecipeapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Htoo Yanant Khin
 */
public class IndexController {
    @RequestMapping({"", "/", "/index"})
    public String index() {
        return "index";
    }
}
