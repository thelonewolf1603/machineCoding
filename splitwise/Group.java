package splitwise;

import java.util.ArrayList;
import java.util.List;

public class Group {
    
    public String groupName;
    private String groupId;
    private List<User> users;

    public Group(String name)
    {
        this.groupName = name;
        this.groupId = groupName + System.currentTimeMillis();
        this.users = new ArrayList<>();
    }

    public void addUser(User user)
    {
        boolean exists = users.contains(user);
        if(exists) return;
        users.add(user);
    }

}
