package annotations.database;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface SQLInteger {
	public String name() default "";

	Constraints constraints() default @Constraints;
}
