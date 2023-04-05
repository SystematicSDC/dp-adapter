package adapterpattern.service;

import adapterpattern.model.UserRO;

public class Database {
    public static void save(UserRO user) {
        System.out.println(
                String.format("Saved user:\n- name: %s\n- cnp: %s\n- weight: %d kg\n- height: %d cm", user.getName(), user
                        .getCnp(), user.getWeight(), user.getHeight())
        );
    }
}


