package friends.domain;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.Date;

/**
 * Created by Mes documents on 01/04/2017.
 */
public class Utilisateur {

    @NotNull
    @NotEmpty
    private String nom;

    @NotEmpty
    @NotNull
    private String prenom;
    @Email
    @NotNull
    private String mail;
    @NotNull
    @NotEmpty
    @Pattern(regexp ="M|F")
    private String sexe;
    private  Date date;


    public Utilisateur(String nom, String prenom, String mail, String sexe){
        this.nom = nom;
        this.prenom = prenom;
        this.mail = mail;
        this.sexe = sexe;

    }

    public Utilisateur(String nom, String prenom, String mail, String sexe, Date date) {
        this.nom = nom;
        this.prenom = prenom;
        this.mail = mail;
        this.sexe = sexe;
        this.date = date;
    }

    public Utilisateur(){}

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
