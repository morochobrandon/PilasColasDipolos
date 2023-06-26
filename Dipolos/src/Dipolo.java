
public class Dipolo {

	private class Nodo{
		int dato;
		Nodo prx;
	}
	
	private Nodo tNodo;
	
	public boolean esVacia() {
		if(tNodo == null)
			return true;
		else
			return false;
	}
	
	public void preAgregar(int n) {
		Nodo nuevo = new Nodo();
		nuevo.dato = n;
		nuevo.prx = tNodo;
		tNodo = nuevo;
	}
	
	public void postAgregar(int n) {
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
	
	public void preEliminar() {
		if(esVacia() != true)
			tNodo = tNodo.prx;
	}
	
	public void postEliminar() {
		if(esVacia() != true) {
		
			Nodo aux = tNodo;
			if(aux.prx == null) {
				aux = aux.prx;
			}
			else {
				while(aux.prx.prx != null) {
					aux = aux.prx;
				}
				
				aux.prx = aux.prx.prx;
			}
	}
}
	public int primero() {
		return tNodo.dato;
	}
	
	public int ultimo() {
		int res = 0;
		if(this.esVacia() != true) {
			int temp = (int) this.primero();
			this.preEliminar();
			if(this.esVacia() == true)
				res = temp;
			else
				res = ultimo();
			this.preAgregar(temp);
			
		}
		return res;
	}
	
	public int tamano() {
		Nodo aux = tNodo;
		int cont  = 0;
		if(esVacia() == true)
			return cont;
		else {
			while(aux != null) {
				cont++;
				aux = aux.prx;
			}
			return cont;
		}
	}
	
	public void imprimir() {
		if(esVacia() != true) {
			int temp = (int) this.primero();
			System.out.print("["+temp+"] ");
			this.preEliminar();
			imprimir();
			this.preAgregar(temp);
		}
	}
	
}
