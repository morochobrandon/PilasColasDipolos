public class Cola {

	private class Nodo{
		int dato;
		Nodo prx;
	}
	
	private Nodo tNodo;
	
	public boolean esVacia() {
		if(tNodo == null) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public int primero() {
		return tNodo.dato;
	}
	
	public void encolar(int n) {
		Nodo nuevo = new Nodo();
		nuevo.dato = n;
		if(esVacia() == true) {
			nuevo.prx = tNodo;
			tNodo = nuevo;
		}
		else {
			Nodo aux = tNodo;
			while(aux.prx != null) {
				aux = aux.prx;
			}
			nuevo.prx = aux.prx;
			aux.prx = nuevo;
		}
	}
	
	public void desencolar() {
		if(esVacia() != true)
			tNodo = tNodo.prx;
	}

	// nuevos metodos 

	public void voltearCola() {
		if (esVacia()==false) {
			int temp = primero();
			desencolar();
			voltearCola();
			encolar(temp);
		}
	}

	public int tamanoCola() {
    int tamano = 1;
    tamano = tamanoColaRecursivo(tamano);
    voltearCola();
    return tamano;
    }

    private int tamanoColaRecursivo(int tamano) {
    if (tNodo.prx != null) {
        int temp = primero();
        desencolar();
        tamano = tamanoColaRecursivo(tamano + 1);
        encolar(temp);
    }
    return tamano;
    }
}
