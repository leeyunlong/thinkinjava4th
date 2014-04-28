package annotations;
public class Testable {
	public void excute(){
		System.out.print("Excuting...");
	}
	@Test void testExecute(){excute();}
}
