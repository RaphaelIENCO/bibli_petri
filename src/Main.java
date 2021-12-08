import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Place p1 = new Place(1,0);
        Place p2 = new Place(2,0);
        Place p3 = new Place(3,0);
        Place p4 = new Place(4,0);


        ArrayList<Place> listPlaces = new ArrayList(){{
           add(p1); add(p2); add(p3); add(p4);
        }};

        Transition t1 = new Transition(1, new ArrayList(){{add(1);}}, new ArrayList(){{add(2);add(3);}});
        Transition t2 = new Transition(2, new ArrayList(){{add(2);}}, new ArrayList(){{add(4);}});
        Transition t3 = new Transition(3, new ArrayList(){{add(3);add(4);}}, new ArrayList(){{add(1);}});

        ArrayList<Transition> listTransitions = new ArrayList(){{
            add(t1); add(t2); add(t3);
        }};

        Petri petri = new Petri(listPlaces,listTransitions);

        System.out.println(petri.toString());

    }
}
