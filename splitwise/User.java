package machineCoding.splitwise;

public class User {

    private final String userId;
    public String name;

    public User(String name)
    {
        this.name = name;
        userId = name + System.currentTimeMillis();
    }

    public String getUserId() {
        return userId;
    }
}
