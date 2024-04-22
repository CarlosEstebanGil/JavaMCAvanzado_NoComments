

public class ClaseQueFuncionaConGenericos<T,K,V,E> {

	private T obj;
	
	private K obj2;
	private V obj3;
	private E obj4;
	
	public ClaseQueFuncionaConGenericos(T objParam) {
		 this.obj = objParam;
		}

	public ClaseQueFuncionaConGenericos(T objParam,K objParam2,V objParam3,E objParam4) {
	 this.obj = objParam;
	 this.obj2 = objParam2;
	 this.obj3 = objParam3;
	 this.obj4 = objParam4;
	}

	public void mostrarTipo() {
		System.out.println(obj.getClass());
		System.out.println(obj2.getClass());
		System.out.println(obj3.getClass());
		System.out.println(obj4.getClass());
		System.out.println("----------------------------------------------------");
	}
}
