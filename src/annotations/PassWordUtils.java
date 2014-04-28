package annotations;
import java.util.*;
public class PassWordUtils {
	@UseCase(id = 47, description = "Password must contain at least one numeric")
	public boolean validatePassword(String password) {
		return (password.matches("\\w*"));
	};
	@UseCase(id = 48)
	public String encryptPassword(String password){
		return new StringBuilder(password).reverse().toString();
	}
	@UseCase(id = 49,description = "new password cant equal prviously used ones")
	public boolean checkPassword(List<String> prePassword,String password){
		return !prePassword.contains(password);
	}
}
