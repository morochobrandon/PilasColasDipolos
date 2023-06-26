
public class pilaMain {
	
	
	public static void main(String args[]) {
		Pila pila1 = new Pila();
		Pila pila2 = new Pila();
		for(int i = 1; i <= 5; i++) {
			pila1.apilar(i);
			pila2.apilar(i*2);
		}
		
		Pila pila3 = new Pila();
		pila3.interseccionSimetrica(pila1, pila2);
		pila3.interseccionSimetrica(pila2, pila1);
		pila3.imprimir();
		
		
		
	}
}
