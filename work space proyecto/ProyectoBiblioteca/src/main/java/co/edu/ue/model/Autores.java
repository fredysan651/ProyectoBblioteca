package co.edu.ue.model;

import java.io.Serializable;
import jakarta.persistence.*;


/**
 * The persistent class for the autores database table.
 * 
 */
@Entity
@NamedQuery(name="Autores.findAll", query="SELECT a FROM Autores a")
public class Autores implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_autores")
	private int idAutores;

	private String apellido;

	private String nacionalidad;

	private String nombre;

	//bi-directional many-to-one association to Libro
	@ManyToOne
	@JoinColumn(name="id_libro")
	private Libro libro;

	public Autores() {
	}

	public int getIdAutores() {
		return this.idAutores;
	}

	public void setIdAutores(int idAutores) {
		this.idAutores = idAutores;
	}

	public String getApellido() {
		return this.apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNacionalidad() {
		return this.nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Libro getLibro() {
		return this.libro;
	}

	public void setLibro(Libro libro) {
		this.libro = libro;
	}

}