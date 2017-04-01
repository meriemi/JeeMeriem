package friends.service;

import friends.domain.Activite;
import friends.domain.Utilisateur;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Mes documents on 01/04/2017.
 */
@Service
public class InitialisationService {


    private ArrayList<Activite> activites;
    private ArrayList<Utilisateur> utilisateurs;

    Utilisateur adam = new Utilisateur("adam","kadiri","ad@kd","M",new Date());
    Utilisateur sara = new Utilisateur("sara","kadiri","sr@kd","F",new Date());
    Utilisateur youness = new Utilisateur("youn","farouj","yn@fr","M",new Date());
    Activite activite = new Activite("titre","descr");

    public void initDonnees(){
        activites = new ArrayList<Activite>();
        utilisateurs = new ArrayList<Utilisateur>();

        utilisateurs.add(adam);
        utilisateurs.add(sara);
        utilisateurs.add(youness);
        activites.add(activite);

    }

    public ArrayList<Activite> getActivites() {
        return activites;
    }

    public ArrayList<Utilisateur> getUtilisateurs() {
        return utilisateurs;
    }
}
