package annotations;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UseCaseTracker {
	public static void trackerUseCases(List<Integer> useCases,Class<?> cl){
		for(Method m:cl.getDeclaredMethods()){
			UseCase uc = m.getAnnotation(UseCase.class);
			if(uc!=null){
				System.out.println("Found UseCase"+uc.id()+" "+uc.description());
				useCases.remove(new Integer(uc.id()));
			}
			for(int i:useCases){
				System.out.println("Warning:Missing usecase-"+i);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> useCases = new ArrayList<Integer>();
		Collections.addAll(useCases,47,48,49,50);
		trackerUseCases(useCases, PassWordUtils.class);
	}

}
