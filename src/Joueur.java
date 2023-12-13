public class Joueur {
    //variables
    private String nom;
    private String dateDeNaissance;
    private Position position;
    private boolean reserve;

    //Constructeurs
    public Joueur(){}

    public Joueur(String nom, String dateDeNaissance, Position position, boolean reserve) {
        this.nom = nom;
        this.dateDeNaissance = dateDeNaissance;
        this.position = position;
        this.reserve = reserve;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDateDeNaissance() {
        return dateDeNaissance;
    }

    public void setDateDeNaissance(String dateDeNaissance) {
        this.dateDeNaissance = dateDeNaissance;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public boolean getReserve(){
        return reserve;
    }

    public void setReserve(boolean reserve) {
        this.reserve = reserve;
    }

    public double calculerPrime(int matchsjoues, int matchsgagnes){
       if (reserve = false)
        return ((double) matchsjoues /matchsgagnes)*10000;
       else
           return ((double) matchsjoues /matchsgagnes)*5000;
    }
}
