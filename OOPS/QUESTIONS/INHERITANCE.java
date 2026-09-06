class Pokemon{
    int power;
    String type;
    Pokemon(int power,String type){
        this.power=power;
        this.type=type;


    }
    Pokemon(){
    }
    void display(){
        System.out.println("Power: "+power);
        System.out.println("Type: "+type);
    }
}
    class Legendary extends Pokemon{
        String name;
    }
    class GodPokemon extends Legendary{
        String ability;
    }



public class INHERITANCE {
    public static void main(String[] args) {
        Pokemon p1=new Pokemon(100,"Fire");
        p1.display();
        Legendary l1=new Legendary();
        l1.power=200;
        l1.name="Pikachu";
        l1.display();
        GodPokemon g1=new GodPokemon();
        g1.ability="Thunder";
        g1.power=300;
        g1.name="Raichu";   
        g1.display();
    }
    
}
