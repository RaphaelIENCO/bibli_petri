import java.util.ArrayList;

public class Transition {
    private int name;
    private ArrayList<Integer> from;
    private ArrayList<Integer> to;

    public Transition(int n, ArrayList<Integer> f, ArrayList<Integer> w){
        name = n;
        from = f;
        to = w;
    }

    public int getName() {
        return name;
    }

    public ArrayList<Integer> getFrom() {
        return from;
    }

    public ArrayList<Integer> getTo() {
        return to;
    }

    public String toString(){
        StringBuilder retour = new StringBuilder("t").append(name).append(" (from : ");
        for (Integer i :
                from) {
            retour.append(i).append(", ");
        }
        retour.append(" | to : ");
        for (Integer i :
                to) {
            retour.append(i).append(", ");
        }
        retour.append(")");

        return retour.toString();
    }
}
