  public class Bird {                    //superclass
    public static void fly(){            //method for bird fly
        System.out.println("Terbang");
    }

    public static void eat(){            //method for bird to eat
        System.out.println("Makan");
    }
}
class Chicken extends Bird{              //subclass from Bird (chicken inherits from Bird)

    public static void bertelur(){       //method chicken bertelur
        System.out.println("O");
    }
}

