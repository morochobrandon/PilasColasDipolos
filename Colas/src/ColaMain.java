
public class ColaMain {
	
	public static void main(String args[]) {
		Cola cola = new Cola();
		for(int i = 1; i <= 5; i++){
			cola.encolar(i);
		}
		while(cola.esVacia() != true) {
			System.out.println(cola.primero());
			cola.desencolar();
		}
	}
}
