import java.util.ArrayList;
import java.util.List;

public class A {

	public A() {
	}

	public static void main(String[] args) {
		try {
			
		
		Alumno a= new Alumno();
		Persona p = new Persona();
		
		System.out.println(a.sumar(1));
		System.out.println(p.sumar(1));
		
		System.out.println(Persona.restar(2));
		System.out.println(Alumno.restar(2)); 
		
		
		String texto= new String("texto");
		if (texto instanceof String) {
			System.out.println("texto es un obj de tipo string");
		}
		
		if (a instanceof Persona) {
			System.out.println("a es una persona"); 
													
		}
		
		if (! (p instanceof Alumno) ) { 
			System.out.println("Una persona no es un alumnno");
		}
		
		List<Persona> listaPersonas = new ArrayList<Persona>(); 
															
		
		Persona p2=p; 
		
		System.out.println("----------------------------------");
		
		System.out.println(listaPersonas.size());
		
		if(p2 instanceof Persona) 
			listaPersonas.add(p2); 
		
		System.out.println(listaPersonas.size());
		
		
		listaPersonas.remove(p2); 
								 
		
		List<String> listaDeStrings = new ArrayList<String>();
		String s="hola";
		listaDeStrings.add(s);
		listaDeStrings.remove(s);
		listaDeStrings.add(s);
		listaDeStrings.remove("hola"); 
		
		Persona pers1 = new Persona("juan");
		Persona pers2 = new Persona("juan");
		Persona pers3 = new Persona("flora");

		String pers2name= pers2.getName();
		
		if(pers1.equals(pers2)) {
			System.out.println("pers 1 EQUALS pers 2 es true segun mi impl de equals!");
		}
		
		List<Persona> listaPersonas2tmp = new ArrayList<Persona>();
		
		
		Persona p3=new Persona("car");Persona p4=new Persona("noe");Persona p5=new Persona("nat");
		
		
		listaPersonas2tmp.add(p3);listaPersonas2tmp.add(p4);listaPersonas2tmp.add(p5);
		System.out.println("----------------------------------");
		System.out.println(listaPersonas2tmp.size());
		ImprimirLista(listaPersonas2tmp);

		System.out.println("----------------------------------");
		listaPersonas2tmp.removeAll(listaPersonas2tmp);
		System.out.println(listaPersonas2tmp.size());
		ImprimirLista(listaPersonas2tmp);
		

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public static void ImprimirLista(List<Persona> listaPersonas) {
		for (int i = 0; i < listaPersonas.size(); i++) { 
			System.out.println(listaPersonas.get(i).getName());
		}
	}
}
