package project.edu;

import java.util.HashMap;
import java.util.Map;

public class Login {
	private Map<String, UserCredentials> users = new HashMap<>();
    private UserCredentials loggedInUser;

    public Login() {
        users.put("john", new UserCredentials("john", "123"));
        users.put("jane", new UserCredentials("jane", "pswd"));
    }

    public boolean login(String username, String password) {
    	UserCredentials user = users.get(username);
        if (user != null && user.getPassword().equals(password)) {
            loggedInUser = user;
            return true;
        }
        return false;
    }

    public void logout() {
        loggedInUser = null;
    }

    public UserCredentials getLoggedInUser() {
        return loggedInUser;
    }
}
