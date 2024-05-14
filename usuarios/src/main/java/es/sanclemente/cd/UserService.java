package es.sanclemente.cd;

public class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public boolean createUser(String username, String email) {
        if (username == null || email == null) {
            return false;
        }
        User user = new User(username, email);
        return userRepository.saveUser(user);
    }

    public boolean deleteUser(String username) {
        if (username == null) {
            return false;
        }
        return userRepository.deleteUserByUsername(username);
    }
}