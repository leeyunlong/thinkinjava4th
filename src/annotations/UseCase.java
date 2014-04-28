package annotations;

import java.lang.annotation.*;
//定义一个用例注解
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface UseCase {
	public int id();
	public String description() default "no description";
}