package tema13;

public class ListaArray {
	
	private Object[] o;
	private int contador;
	
	public ListaArray() {
		contador = 0;
		this.o = new Alumno[contador];
	}
	public ListaArray(int c) {
		contador = c;
		this.o = new Alumno[contador];
	}	
	public void agregar(Object a){
		contador++;
		Object[] o2 = new Object[contador];
		for(int i = 0;i < contador;i++){
			if(i == contador-1){
				o2[i] = a;
			}else{
				o2[i] = this.o[i];
			}
		}
		this.o = o2;
	}
	public int numObjetos(){
		return this.o.length;
	}
	public int buscar(Object bqd){
		for(int i = 0;i < contador;i++){
			if(o[i].equals(bqd)){
				return i;
			}
		}
		return -1;
	}
	public Object ver(int i){
		if(i == -1){
			return null;
		}
		return o[i];
	}
	@Override
	public String toString() {
		String a = "";
		for(int i = 0;i < contador;i++){
			a = a + o[i] + "\n";
		}
		return a;
	}	
	
}
