package annotations;

import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface SimulatingNull {
	/*�����ע�⣬�͸���ע��*/
	public int id() default -1;
	public String description() default "";
}
