package enums;

import java.util.Arrays;

public enum Role {
    USER,
    MANAGER,
    ADMIN,
    OWNER,
    DEFAULT;

    public static Role fromString(String role) {
        Role[] values = Role.values();
        return Arrays.asList(values).stream()
                .distinct()
                .filter(it -> it.name().equalsIgnoreCase(role))
                .findFirst()
                .orElse(Role.DEFAULT);
    }
}
