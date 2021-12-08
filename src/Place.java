public class Place {
    private int num;
    private int nbJetons;

    public Place(int n, int nJ){
        num = n;
        nbJetons = nJ;
    }

    public int getNum() {
        return num;
    }

    public int getNbJetons() {
        return nbJetons;
    }

    public void setNbJetons(int nbJetons) {
        this.nbJetons = nbJetons;
    }

    @Override
    public String toString() {
        return "Place{" +
                "num=" + num +
                ", nbJetons=" + nbJetons +
                '}';
    }
}
