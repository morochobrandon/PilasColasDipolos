
public class ColaMain {
	
	public static void main(String args[]) {
		
		Cola cola1 = new Cola();
		for(int i = 1; i <= 5; i++){
			cola1.encolar(i);
		}
        // donde sucede la magia 
		
        /*
        ejercio buscar un numero en una cola y que quede exactamente igual 
        sin usar extructuras auxiliares
        */
		
        // fin de donde sucede la magia 
        
		System.out.println("el tamaño de la cola es "+cola1.tamanoCola());
		while(cola1.esVacia() != true) {
			System.out.println(cola1.primero());
			cola1.desencolar();
		}
		for(int i = 1; i <= 5; i++){
			cola1.encolar(i);
		}
		cola1.voltearCola();
        System.out.println("el tamaño de la cola es "+cola1.tamanoCola());
        while(cola1.esVacia() != true) {
			System.out.println(cola1.primero());
			cola1.desencolar();
		}
	}
}

