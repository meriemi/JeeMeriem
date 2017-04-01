package friends.domain;

import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;

/**
 * Created by Mes documents on 01/04/2017.
 */
public class Activite {

    @NotNull
    @NotEmpty
    private String unTitre;
    private String unDescriptif;

    public Activite(){}

    public Activite(String unTitre, String unDescriptif) {
        this.unTitre = unTitre;
        this.unDescriptif = unDescriptif;

    }


}
