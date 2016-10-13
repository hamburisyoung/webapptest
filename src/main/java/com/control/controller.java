package com.control;

/**
 * Created by hambur on 2016/10/13.
 */

        import org.springframework.stereotype.Controller;
        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by dzkan on 2016/3/8.
 */
@Controller
//@RequestMapping("/")
public class controller {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {return "index";}

    @RequestMapping(value = "/submit", method = RequestMethod.GET)
    public String submit() {System.out.println("submit in");return "result";}
}