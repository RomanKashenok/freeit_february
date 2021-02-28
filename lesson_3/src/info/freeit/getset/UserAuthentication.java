package info.freeit.getset;

import java.util.Base64;

public class UserAuthentication {

    private String privName;

    private String privPassword;

    public UserAuthentication(String privName, String privPassword) {
        setPrivName(privName);
        setPrivPassword(privPassword);
    }

    public String getPrivName() {
        byte[] bytes = this.privName.getBytes();
        for (int i = 0; i < bytes.length; i++) {
            bytes[i] -= 4;
        }
        return new String(bytes);
    }

    public void setPrivName(String privName) {
        byte[] chars = privName.getBytes();

        for (int i = 0; i < chars.length; i++) {
            chars[i] += 4;
        }

        this.privName = new String(chars);
    }

    public String getPrivPassword() {
        return privPassword;
    }

    public void setPrivPassword(String privPassword) {
        this.privPassword = Base64.getEncoder().encodeToString(privPassword.getBytes());
    }

    @Override
    public String toString() {
        return "UserAuthentication{" +
                ", privName='" + getPrivName() + '\'' +
                ", privPassword='" + privPassword + '\'' +
                '}';
    }
}
