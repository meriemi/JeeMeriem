package friends.controllers;

import friends.Bootstrap;
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
public class UtilisateurController {

    @Autowired
    Bootstrap bootstrap;


    @RequestMapping("/utilisateurs")
    public String list(Model model){
        ArrayList<Utilisateur> utilisateurs;
         utilisateurs = bootstrap.getInitialisationService().getUtilisateurs();
        model.addAttribute("utilisateurs",utilisateurs);
        return "utilisateurs";
    }
}
