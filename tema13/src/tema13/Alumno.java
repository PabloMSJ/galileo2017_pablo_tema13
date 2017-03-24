package tema13;

public class Alumno {
	private int nMatricula;
	private String nombre;
	private String curso;
	


	public Alumno(int nMatricula, String nombre, String curso) {
		super();
		this.nMatricula = nMatricula;
		this.nombre = nombre;
		this.curso = curso;
	}

	public int getnMatricula() {
		return nMatricula;
	}

	public String getNombre() {
		return nombre;
	}

	public String getCurso() {
		return curso;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + nMatricula;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alumno other = (Alumno) obj;
		if (nMatricula != other.nMatricula)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Alumno [nMatricula=" + nMatricula + ", nombre=" + nombre + ", curso=" + curso + "]\n";
	}

}
