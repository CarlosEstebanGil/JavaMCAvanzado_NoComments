import java.util.ArrayList;
import java.util.List;

public class B {
	public B() {
	}

	public static void main(String[] args) {
		
		try {
			ClaseQueFuncionaConGenericos<String,Integer,Double,Object> objGen=
					new ClaseQueFuncionaConGenericos<>("hola",new Integer(208),new Double(300),new Object());
		
			objGen.mostrarTipo();
			
			ClaseQueFuncionaConGenericos<Object,String,Double,Integer> objGen2=
					new ClaseQueFuncionaConGenericos<>(new Object(),"hola",new Double(300),new Integer(208));
			objGen2.mostrarTipo();
			
			
			List<ClaseQueFuncionaConGenericos<String,Integer,Double,Object>> 
			genericListOfGenerics = new ArrayList<>(); 
			
			genericListOfGenerics.add(objGen);
			
			ClaseQueFuncionaConGenericos<String,Integer,Double,Object> objGen3=
					new ClaseQueFuncionaConGenericos<>("hola",new Integer(308),new Double(400),new Object());
			
			genericListOfGenerics.add(objGen3);
			
			System.out.println("____________________________________________________________");
			System.out.println("____________________________________________________________");
			
			for (int i = 0; i < genericListOfGenerics.size(); i++) {
				genericListOfGenerics.get(i).mostrarTipo();
			}
			
		} catch (Exception e) {
		}
	}

	
}
