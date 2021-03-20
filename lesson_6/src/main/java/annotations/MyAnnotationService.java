package annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented //Помечается если нужно что бы класс, помеченный нашей аннотацией попал в JavaDoc
@Inherited //Данная аннотация будет наследоваться потомками класса, помеченной нашей аннотацией
@Target(ElementType.TYPE) //Указывает область применения нашей аннотации
@Retention(RetentionPolicy.RUNTIME) //Указывает область действия нашей аннотации
public @interface MyAnnotationService {
	
	String name();
	
	boolean lazyLoad() default false;

}
