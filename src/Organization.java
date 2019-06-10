import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Organization {

    User admin;
    HashMap<Integer, User> users;

    public Organization(User admin) {
        this.admin = admin;
        this.users = new HashMap<>();
        users.put(this.admin.getID(), this.admin);
    }

    public User getUser(int ID) {
        return users.get(ID);
    }
}
