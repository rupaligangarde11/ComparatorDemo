public class User implements Comparable<User> {
    private final String username;
    private final String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    @Override
    public int compareTo(User user) {
        return this.username.compareTo(user.getUsername());
    }
}
