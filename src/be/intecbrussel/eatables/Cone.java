package be.intecbrussel.eatables;

import be.intecbrussel.sellers.PriceList;

import java.util.ArrayList;
import java.util.List;


public class Cone implements Eatable{


    private Flavor[] balls;

    public Cone() {

    }

    public Cone(Flavor[] balls) {
        this.balls=balls;
    }


    public void eat(){

        System.out.print("Eating cone with ");
        for(Flavor ball : balls){
            System.out.println(ball);
        }

    }

    public enum Flavor {
        STRAMBERRIES,
        BANANA,
        CHOCOLATE,
        VANILLA,
        LEMON,
        MOKKA,
        STRACIATELLA,
        PISTACHE;

    }



}
