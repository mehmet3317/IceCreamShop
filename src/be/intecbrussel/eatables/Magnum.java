package be.intecbrussel.eatables;

public class Magnum implements Eatable {

    private MagnumType type;

    public Magnum() {
    }
    public Magnum(MagnumType magnumType){
        this.type=magnumType;
    }

    public MagnumType getType(){
        return this.type;
    }

    public enum MagnumType{
        MILKCHOCOLADE,WHITECHOCOLATE,BLACKCHOCOLATE,ALPINENUTS,ROMANTICSSTRAMBERRIES
    }

    public void eat(){
        System.out.println("Eating a Magnum with type " + getType());
    }
}
