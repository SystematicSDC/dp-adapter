package adapterpattern;

import adapterpattern.model.UserUS;
import adapterpattern.model.UserUSImpl;
import adapterpattern.service.Database;

public class Main {
    public static void main(String[] args) {
        UserUS usUser = new UserUSImpl("19304039339284",
                "Andrei",
                "Popescu",
                165,
                6);

        //use adapter pattern here
        Database.save(usUser);
    }
}


