package friends.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Mes documents on 01/04/2017.
 */
@Controller
public class IndexController {

    @RequestMapping("/")
    public String index(){
    return "index";
    }
}
