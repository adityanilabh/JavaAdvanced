
enum UserRole {
    ADMIN("Administrator", "Full access to all features"),
    MANAGER("Manager", "Manage teams and projects"),
    EMPLOYEE("Employee", "Regular employee with limited access"),
    GUEST("Guest", "Limited access as a guest user");

    private final String roleName;
    private final String description;

    UserRole(String roleName, String description) {
        this.roleName = roleName;
        this.description = description;
    }

    public String getRoleName() {
        return roleName;
    }

    public String getDescription() {
        return description;
    }
}

// User class with a role field
class User {
    private String username;
    private UserRole role;

    public User(String username, UserRole role) {
        this.username = username;
        this.role = role;
    }

    public void performAction() {
        switch (role) {
            case ADMIN:
                System.out.println("Admin action: Perform administrative tasks");
                break;
            case MANAGER:
                System.out.println("Manager action: Manage teams and projects");
                break;
            case EMPLOYEE:
                System.out.println("Employee action: Perform regular tasks");
                break;
            case GUEST:
                System.out.println("Guest action: Limited access");
                break;
        }
    }

    public String getUsername() {
        return username;
    }

    public UserRole getRole() {
        return role;
    }
}

public class UserRoleExample {
    public static void main(String[] args) {
        // Creating users with different roles
        User adminUser = new User("admin123", UserRole.ADMIN);
        User managerUser = new User("manager456", UserRole.MANAGER);
        User employeeUser = new User("employee789", UserRole.EMPLOYEE);
        User guestUser = new User("guest001", UserRole.GUEST);

        // Performing actions based on roles
        adminUser.performAction();
        managerUser.performAction();
        employeeUser.performAction();
        guestUser.performAction();
    }
}
