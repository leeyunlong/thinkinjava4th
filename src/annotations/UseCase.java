package annotations;

import java.lang.annotation.*;
//����һ������ע��
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface UseCase {
	public int id();
	public String description() default "no description";
}