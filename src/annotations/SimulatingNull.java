package annotations;

import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface SimulatingNull {
	/*定义空注解，和负数注解*/
	public int id() default -1;
	public String description() default "";
}
