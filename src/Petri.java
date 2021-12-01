
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

public class Petri {

    private ArrayList<Integer> listPlaces;
    private ArrayList<Transition> listTransitions;

    private static <T> ArrayList<T> removeDuplicates(ArrayList<T> list) {
        Set<T> set = new LinkedHashSet<>();
        set.addAll(list);
        list.clear();
        list.addAll(set);
        return list;
    }

    public Petri(ArrayList<Integer> lp, ArrayList<Transition> lt){
        listPlaces = lp;
        Collections.sort(listPlaces);
        listPlaces = removeDuplicates(listPlaces);
        listTransitions = lt;
    }


    @Override
    public String toString() {
        StringBuilder retour = new StringBuilder("Reseau : \n");
        retour.append("Liste Places : ");
        for (Integer i: listPlaces) {
            retour.append(i).append(", ");
        }
        retour.append("\nListe transition : \n");
        for (Transition t: listTransitions) {
            retour.append(" ").append(t.toString()).append(", \n");
        }

        return retour.toString();
    }
}
