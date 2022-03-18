package be.intecbrussel.application;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.Eatable;
import be.intecbrussel.eatables.IceRocket;
import be.intecbrussel.eatables.Magnum;
import be.intecbrussel.sellers.IceCreamSalon;
import be.intecbrussel.sellers.PriceList;

public class IceCreamApp {

    public static void main(String[] args){
        PriceList priceList = new PriceList(2,2,3);

        IceCreamSalon iceCreamSalon = new IceCreamSalon(priceList);

        Magnum magnum = iceCreamSalon.orderMagnum(Magnum.MagnumType.BLACKCHOCOLATE);
        IceRocket iceRocket = iceCreamSalon.orderIceRocket();
        Cone cone = iceCreamSalon.orderCone(new Cone.Flavor[]{Cone.Flavor.BANANA});


        Eatable [] instances = {magnum,iceRocket,cone};

        for (int i = 0; i < instances.length; i++)
        {
            instances[i].eat();
        }
        String str = new String(String.valueOf(iceCreamSalon.getProfit()));
        System.out.println("total profit : " + str.substring(0,4));
    }
}
