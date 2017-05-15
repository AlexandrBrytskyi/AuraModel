package model.user;


public class UserCredentials {

    /**
     * owner of credentials
     */
    private User user;

    /**
     * PK
     */
    private String login;
    private String pass;

    /**
     * by role user will be given different access
     */
    private UserRole role;
}
