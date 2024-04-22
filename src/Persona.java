
public class Persona {

	public Persona() {		
	}
	
	public Persona(String name) {		
		this.setName(name);
	}
	
	String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int sumar(int numero) {
		return numero + 1;
	}
	
	public static int restar(int numero) {
		return numero -1;
	}

	@Override 
	public boolean equals(Object obj) {
		boolean r=false;
		try {
			if (obj instanceof Persona) {
				Persona pParam = (Persona) obj;
				if (pParam.getName().equalsIgnoreCase(this.getName()))
						r=true;
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return r;
	}
	
	
}
