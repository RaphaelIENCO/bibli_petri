
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

public class Petri {

    private ArrayList<Place> listPlaces;
    private ArrayList<Integer> jetons;
    private ArrayList<Transition> listTransitions;


    private static <T> ArrayList<T> removeDuplicates(ArrayList<T> list) {
        Set<T> set = new LinkedHashSet<>();
        set.addAll(list);
        list.clear();
        list.addAll(set);
        return list;
    }

    public Petri(ArrayList<Place> lp, ArrayList<Transition> lt){
        listPlaces = lp;
        listTransitions = lt;
    }

    public ArrayList<Transition> pPoint(int place){
        ArrayList<Transition> retour = new ArrayList<>();
        for (Transition t : listTransitions) {
            if(t.getFrom().contains(place)){
                retour.add(t);
            }
        }

        return retour;
    }

    public ArrayList<Transition> pointP(int place){
        ArrayList<Transition> retour = new ArrayList<>();
        for (Transition t : listTransitions) {
            if(t.getTo().contains(place)){
                retour.add(t);
            }
        }

        return retour;
    }

    public ArrayList<Integer> tPoint(int transi){
        for (Transition t : listTransitions) {
            if(t.getName()==transi){
                return t.getTo();
            }
        }
        return null;
    }

    public ArrayList<Integer> pointT(int transi){
        for (Transition t : listTransitions) {
            if(t.getName()==transi){
                return t.getFrom();
            }
        }
        return null;
    }




    @Override
    public String toString() {
        StringBuilder retour = new StringBuilder("Reseau : \n");
        retour.append("Liste Places : ");
        for (Place i: listPlaces) {
            retour.append(i.toString()+", ");
        }
        retour.append("\nListe transition : \n");
        for (Transition t: listTransitions) {
            retour.append(" ").append(t.toString()).append(", \n");
        }
        return retour.toString();
    }

    public ArrayList<Place> getListPlaces() {
        return listPlaces;
    }

    public ArrayList<Transition> getListTransitions() {
        return listTransitions;
    }
}
