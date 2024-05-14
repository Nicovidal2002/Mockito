package es.sanclemente.cd;

public interface UserRepository {
    boolean saveUser(User user);
    boolean deleteUserByUsername(String username);
}