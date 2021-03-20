package annot;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class AllowPrivateCallAnnotationProcessor {

    public void process(Class<?> clazz) throws Exception {

        boolean annotPresent = clazz.isAnnotationPresent(AllowPrivateCallAnnotation.class);
        if(annotPresent) {
            AllowPrivateCallAnnotation annotation = clazz.getAnnotation(AllowPrivateCallAnnotation.class);
            System.out.println("annotation version: " + annotation.version());
            System.out.println("annotation isActive: " + annotation.isActive());

            Constructor<?> constructor = clazz.getConstructor();
            MyService myService = (MyService) constructor.newInstance();

            if(!annotation.isActive()) {
                myService.publicMethod();
            } else {
                Method[] declaredMethods = clazz.getDeclaredMethods();
                for (Method method : declaredMethods) {
                    method.setAccessible(true);
                    method.invoke(myService, null);
                }
            }
        }

    }
}
