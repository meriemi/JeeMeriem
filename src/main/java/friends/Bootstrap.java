package friends;

import friends.service.InitialisationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * Created by Mes documents on 01/04/2017.
 */
@Component
public class Bootstrap {

    @Autowired
    InitialisationService initialisationService;

    @PostConstruct
    public void init(){
        initialisationService.initDonnees();
    }

    public InitialisationService getInitialisationService() {
        return initialisationService;
    }
}
