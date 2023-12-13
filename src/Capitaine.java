public class Capitaine extends Joueur{
    private int matchsjoues;


    public Capitaine(String nom, String dateDeNaissance, Position position, boolean reserve, int matchsjoues) throws Exception {
        super(nom, dateDeNaissance, position, reserve);
        if (matchsjoues>100){
            this.matchsjoues = matchsjoues;
        }
        else throw new Exception("impossible qu'il soit un capitaine");
    }

    public int getMatchsjoues() {
        return matchsjoues;
    }

    public void setMatchsjoues(int matchsjoues) {
        this.matchsjoues = matchsjoues;
    }

    public double calculerPrime(int matchsgagnes){
        if (getReserve() == false)
            return ((double) matchsjoues /matchsgagnes)*10000 +(50*matchsjoues);
        else
            return ((double) matchsjoues /matchsgagnes)*5000 + (50*matchsjoues);
    }
}
