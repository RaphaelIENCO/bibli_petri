import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import java.util.ArrayList;

public class TestPetri {

    Petri p;

    Place p1 = new Place(1,0);
    Place p2 = new Place(1,0);
    Place p3 = new Place(1,0);
    Place p4 = new Place(1,0);


    @Before
    public void before(){

        ArrayList<Place> listPlaces = new ArrayList(){{
            add(p1); add(p2); add(p3);  add(p4);
        }};

        Transition t1 = new Transition(1, new ArrayList(){{add(1);}}, new ArrayList(){{add(2);add(3);}});
        Transition t2 = new Transition(2, new ArrayList(){{add(2);}}, new ArrayList(){{add(4);}});
        Transition t3 = new Transition(3, new ArrayList(){{add(3);add(4);}}, new ArrayList(){{add(1);}});

        ArrayList<Transition> listTransitions = new ArrayList(){{
            add(t1); add(t2); add(t3);
        }};

        p = new Petri(listPlaces,listTransitions);

        System.out.println(p.toString());
    }

    @Test
    public void testRemoveDuplicatesAndSort(){
        System.out.println(p.toString());
        ArrayList<Place> listPlaces = new ArrayList(){{
            add(p1);  add(p2);add(p3);  add(p4);
        }};
        ArrayList<Place> lp = p.getListPlaces();
        Assert.assertEquals(lp.size(),listPlaces.size());
        for (int i = 0; i < lp.size(); i++) {
            Assert.assertEquals(lp.get(i).getNum(),listPlaces.get(i).getNum());
            Assert.assertEquals(lp.get(i).getNbJetons(),listPlaces.get(i).getNbJetons());
        }
    }
}
