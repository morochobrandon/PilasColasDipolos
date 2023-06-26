public class Pila {
	
	
	private class Nodo{
		int dato;
		Nodo prx;
	}
	
	private Nodo tope;
	
	public int tope() {
		return tope.dato;
	}
	
	public boolean esVacia() {
		if(tope == null)
			return true;
		else
			return false;
	}
	
	public void apilar(int n) {
		Nodo nuevo = new Nodo();
		nuevo.dato = n;
		nuevo.prx = tope;
		tope = nuevo;
	}
	
	public void desapilar() {
		tope = tope.prx;
	}
	
	public void imprimir() {
		if(this.esVacia() != true) {
			System.out.println(this.tope());
			int tope = this.tope();
			this.desapilar();
			imprimir();
			this.apilar(tope);
			
		}
		
	}
	
	public void apilarAlFinal(int n) {
		if(this.esVacia() == true) {
			this.apilar(n);
		}
		else {
			int temp = (int) this.tope();
			this.desapilar();
			apilarAlFinal(n);
			this.apilar(temp);
		}
	}
	
	public void reverse() {
		if(this.esVacia() != true) {
			int tope = this.tope();
			this.desapilar();
			reverse();
			this.apilarAlFinal(tope);
		}
	}
	
	public boolean buscarSiExisteEnLaPila(int n) {
		boolean flag = false;
		if(this.esVacia() != true) {
			if(this.tope() == n) {
				return true;
			}
			else {
				int temp = (int) this.tope();
				this.desapilar();
				flag = buscarSiExisteEnLaPila(n);
				this.apilar(temp);
			}
		}
		return flag;
	}
	
	public void interseccionSimetrica(Pila pila1, Pila pila2) {
		int temp;
			if(pila2.esVacia() != true) {
				temp = (int) pila2.tope();
				if(pila1.buscarSiExisteEnLaPila(temp) == true) {
					pila2.desapilar();
					interseccionSimetrica(pila1,pila2);
				}
				else {
					this.apilar(temp);
					pila2.desapilar();
					interseccionSimetrica(pila1,pila2);
				}
				pila2.apilar(temp);
		}
	}
    
}