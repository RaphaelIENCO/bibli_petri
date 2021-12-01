import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> listPlaces = new ArrayList(){{
           add(1); add(2); add(3); add(4);
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
