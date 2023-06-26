
public class DipoloMain {
	
	public static void main(String args[]) {
		Dipolo dipolo = new Dipolo();
		for(int i = 1; i <= 5; i++) {
			dipolo.preAgregar(i);
			dipolo.postAgregar(i*2);
		}
		
		agregar(lista1)
		agregar(lista2)
		
		dipolo.postAgregar(19);
		dipolo.imprimir();
		System.out.println("\n\nHay un total de "+dipolo.tamano()+" elementos en el dipolo");
		System.out.println("\n\nEl ultimo elemento del dipolo es: "+dipolo.ultimo());
	}
	
}
