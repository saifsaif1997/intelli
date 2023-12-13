public class Entraineur {
    private String nom;
    private String dateContrat;
    private int nombreAnneeContrat;
    private double primeAnuelle;

    public Entraineur(String nom, String dateContrat, int nombreAnneeContrat, double primeAnuelle) throws Exception {
        this.nom = nom;
        this.dateContrat = dateContrat;
        this.nombreAnneeContrat = nombreAnneeContrat;
        if (primeAnuelle <= 300000 && primeAnuelle>= 200000){
            this.primeAnuelle = primeAnuelle;
        }
        else throw new Exception("Prime doit etre entre 2000000et 300 000");
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDateContrat() {
        return dateContrat;
    }

    public void setDateContrat(String dateContrat) {
        this.dateContrat = dateContrat;
    }

    public int getNombreAnneeContrat() {
        return nombreAnneeContrat;
    }

    public void setNombreAnneeContrat(int nombreAnneeContrat) {
        this.nombreAnneeContrat = nombreAnneeContrat;
    }

    public double getPrimeAnuelle() {
        return primeAnuelle;
    }

    public void setPrimeAnuelle(double primeAnuelle) {
        this.primeAnuelle = primeAnuelle;
    }

    public String estimerFinContrat(){
        String annee = dateContrat.substring(6,10);
        return dateContrat = dateContrat.replace(annee,annee+getNombreAnneeContrat());
    }
}
 