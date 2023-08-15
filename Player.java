
    public class Player {  //this is the class

        //constructor for the object
        public static void walk(){               //method walk
            System.out.println("Player berjalan");
        }

        public static void run(){                //method run
            System.out.println("RUUUUN!");
        }

        public static void shoot(){              //method shoot
            System.out.println("pew pew pew");
        }



        //main
    public static void main(String[] args) {

        Player p = new Player();          //creating a new object

        p.walk();                         //player berjalan
        p.shoot();                        //player shoots
        p.run();                          //player runs
    }
}