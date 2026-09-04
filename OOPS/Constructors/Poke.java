
class Pokemon{
        int power;
        String name;
        Pokemon(int power, String name){   //setter
            this.power = power;
            this.name = name;
        }
        void display(){     //getter
            System.out.println(("Name:" + name +"Power:" + power));
        }
    }
public class Poke {
    public static void main(String[] args) {
    Pokemon pika = new Pokemon(100, "Pikachu");
    Pokemon charmander = new Pokemon(80, "Charmander");
    pika.display();
    charmander.display();
    
}

}

