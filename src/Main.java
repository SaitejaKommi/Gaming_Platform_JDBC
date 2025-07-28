
public class Main {
    public static void main(String[] args) {
        User user = new User(0, "gamer123", "gamer@example.com", "hash_pass");
        UserDAO dao = new UserDAO();
        dao.addUser(user);
    }
}
