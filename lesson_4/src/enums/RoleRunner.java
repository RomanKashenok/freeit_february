package enums;

public class RoleRunner {
    public static void main(String[] args) {

        Role user = Role.USER;
        Role admin = Role.ADMIN;
        Role owner = Role.OWNER;

        Role currentROle = Role.fromString("SUPERPUPERADMIN");

        System.out.println(currentROle);

    }
}
