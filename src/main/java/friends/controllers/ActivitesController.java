package friends.controllers;

import friends.Bootstrap;
import friends.domain.Activite;
import friends.domain.Utilisateur;
import friends.service.InitialisationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

/**
 * Created by Mes documents on 01/04/2017.
 */
@Controller
public class ActivitesController {

    @Autowired
    Bootstrap bootstrap;


    @RequestMapping("/activities")
    public String list(Model model){
        ArrayList<Activite> activites;
        activites = bootstrap.getInitialisationService().getActivites();
        model.addAttribute("activities",activites);
        return "activities";
    }
}
