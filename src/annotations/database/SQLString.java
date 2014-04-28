package annotations.database;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface SQLString {
	public int value() default 0;

	public String name() default "";

	Constraints constraints() default @Constraints;
}
