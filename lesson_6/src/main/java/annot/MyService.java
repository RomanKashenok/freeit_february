package annot;

import lombok.Data;

@Data
@AllowPrivateCallAnnotation(isActive = true, version = "kit-kat")
public class MyService {

    private int a = 10;

    private void privateMethod() {
        System.out.println("FROM PRIVATE: a value is: " + a);
    }

    public void publicMethod() {
        System.out.println("FROM PUBLIC: a value is: " + a);
    }

}
