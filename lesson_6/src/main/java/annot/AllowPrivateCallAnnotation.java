package annot;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface AllowPrivateCallAnnotation {

    boolean isActive() default false;
    String version();

}
