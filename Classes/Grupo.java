package Classes;

public class Grupo {
	private String nombre;
	private String[] integrantes;

	public Grupo(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nom) {
		this.nombre = nom;
	}

	public int getCantidadIntegrantes() {
		int aux = 0;
		for (int i = 0; i < this.integrantes.length; i++) {
			aux++;
		}
		return aux;
	}

	public void agregarIntergrante(String nombreIntegrante) {
		int idx = 0;
		do {
			idx++;
		} while (this.integrantes[idx] != nombreIntegrante || idx < this.integrantes.length);
		// mi maquina no reconoce los .add y .remove creo, o estoy haciendo algo mal
		this.integrantes.add(nombreIntegrante);
	}

	private int obtenerPosicionIntegrante(String nombreIntegrante) {
		int aux = 0;
		for (int idx = 0; idx < this.integrantes.length; idx++) {
			if (this.integrantes[idx] == nombreIntegrante) {
				aux = idx;
			} else {
				aux = -1;
			}
		}
		return aux;
	}

	public String obtenerIntegrante(int posicion) {
		int pos = posicion - 1;
		if (this.integrantes[pos] != null) {
			return this.integrantes[pos];
		} else {
			return null;
		}
	}

	public String buscarIntegrante(String nombreIntegrante) {
		String aux = null;
		int i = 0;
		while (aux == null || i < this.integrantes.length) {
			if (this.integrantes[i] == nombreIntegrante) {
				aux = this.integrantes[i];
			}
			i++;
		}
		return aux;
	}

	public String removerIntegrante(String nombreIntegrante) {
		int idx = 0;
		String aux = null;
		while (this.integrantes.length > idx || aux == null) {
			if (this.integrantes[idx] == nombreIntegrante) {
				// mi maquina no reconoce los .add y .remove creo, o estoy haciendo algo mal
				this.integrantes.remove(nombreIntegrante);
				aux = this.integrantes[idx];
			}
		}
		return aux;
	}

	public void mostrarIntegrantes() {
		int cantTotal = this.integrantes.length;
		for (int i = 0; i < this.integrantes.length; i++) {
			System.out.println("Participante " + i + ": " + this.integrantes[i]);
		}
		System.out.println("totalidad de participantes: " + cantTotal);
	}

	public void mostrar() {
		String nomGrupo = this.getNombre();
		int cantTotal = this.integrantes.length;
		System.out.println("Grupo: " + nomGrupo);
		System.out.println("Integrantes totales: " + cantTotal);
		for (int i = 0; i < this.integrantes.length; i++) {
			System.out.println("Participante: " + this.integrantes[i]);
		}
	}

	public void vaciar() {
		// tampoco me toma el clear().
		this.integrantes.clear();
	}

	// Cambio de prueba para probar git

}
