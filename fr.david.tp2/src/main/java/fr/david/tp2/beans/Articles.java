package fr.david.tp2.beans;

public class Articles {
    private Integer Id;
    private String Titre;
    private String Description;
    private String Contenu;
    private String Auteur;

    public Integer getId() {
        return Id;
    }
    public void setId(Integer id) {
        Id = id;
    }

    public String getTitre() {
        return Titre;
    }
    public void setTitre(String titre) {
        Titre = titre;
    }
    public String getDescription() {
        return Description;
    }
    public void setDescription(String description) {
        Description = description;
    }
    public String getContenu() {
        return Contenu;
    }
    public void setContenu(String contenu) {
        Contenu = contenu;
    }
    public String getAuteur() {
        return Auteur;
    }
    public void setAuteur(String auteur) {
        Auteur = auteur;
    }
}