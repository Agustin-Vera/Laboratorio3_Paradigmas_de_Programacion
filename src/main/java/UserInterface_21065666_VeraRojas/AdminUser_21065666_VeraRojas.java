package UserInterface_21065666_VeraRojas;

public class AdminUser_21065666_VeraRojas implements UserInterface_21065666_VeraRojas{

    private String name;
    private boolean adminUser;

    public AdminUser_21065666_VeraRojas(String name) {
        this.name = name;
        this.adminUser = true;
    }

    public String getName() {
        return name;
    }

    public boolean isAdminUser() {
        return adminUser;
    }

    @Override
    public String toString() {
        return "AdminUser_21065666_VeraRojas{" +
                "name='" + name + '\'' +
                ", adminUser=" + adminUser +
                '}';
    }
}
