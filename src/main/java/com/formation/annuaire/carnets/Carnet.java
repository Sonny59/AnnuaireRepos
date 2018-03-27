package com.formation.annuaire.carnets;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.RestController;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;



@RestController
public class Carnet {

    private Integer id;
    private Civilite civilite;

    @NotBlank(message = "{com.formation.annuaire.constraints.input.message}")
    @Pattern(regexp = "(?i)[a-z]{2,50}",message = "{com.formation.annuaire.constraints.Names.message}")
    private String nom;

    @NotBlank(message = "{com.formation.annuaire.constraints.input.message}")
    @Pattern(regexp = "(?i)[a-z\\- ]{2,50}",message = "{com.formation.annuaire.constraints.Names.message}")
    private String prenom;

    @NotBlank(message = "{com.formation.annuaire.constraints.input.message}")
    @DateTimeFormat
    private String dateDeNaissance;

    @NotBlank(message = "{com.formation.annuaire.constraints.input.message}")
    @Pattern(regexp = "^\\+[0-9]{1,3}\\.[0-9]{4,14}(?:x.+)?$", message = "{com.formation.annuaire.constraints.Tel.message}")
    private String tel;

    @NotBlank(message = "{com.formation.annuaire.constraints.input.message}")
    @Pattern(regexp = "(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])", message = "{com.formation.annuaire.constraints.Email.message}")
    private String email;

    @NotBlank(message = "{com.formation.annuaire.constraints.input.message}")
    @Pattern(regexp = "[0-9]{5}", message = "{com.formation.annuaire.constraints.Cp.message}")
    private String cp;

    @Pattern(regexp = "(?i)[a-z\\- ]{2,100}", message = "{com.formation.annuaire.constraints.Cp.message}")
    @NotBlank(message = "{com.formation.annuaire.constraints.input.message}")
    private String ville;

    public Carnet() {
    }

    public Carnet(Integer id, Civilite civilite, String nom, String prenom, String dateDeNaissance, String tel, String email, String cp, String ville) {
        this.id = id;
        this.civilite = civilite;
        this.nom = nom;
        this.prenom = prenom;
        this.dateDeNaissance = dateDeNaissance;
        this.tel = tel;
        this.email = email;
        this.cp = cp;
        this.ville = ville;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Civilite getCivilite() {
        return civilite;
    }

    public void setCivilite(Civilite civilite) {
        this.civilite = civilite;
    }

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

    public String getDateDeNaissance() {
        return dateDeNaissance;
    }

    public void setDateDeNaissance(String dateDeNaissance) {
        this.dateDeNaissance = dateDeNaissance;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }


}
