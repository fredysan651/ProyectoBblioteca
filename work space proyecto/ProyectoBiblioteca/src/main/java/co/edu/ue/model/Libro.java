package co.edu.ue.model;

import java.io.Serializable;
import jakarta.persistence.*;
import java.util.List;


/**
 * The persistent class for the libros database table.
 * 
 */
@Entity
@Table(name="libros")
@NamedQuery(name="Libro.findAll", query="SELECT l FROM Libro l")
public class Libro implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_libro")
	private int idLibro;

	private int año;

	private String edicion;

	private String editorial;

	private int isbn;

	@Column(name="nombre_libro")
	private String nombreLibro;

	//bi-directional many-to-one association to Autores
	@OneToMany(mappedBy="libro")
	private List<Autores> autores;

	//bi-directional many-to-one association to Persona
	@ManyToOne
	@JoinColumn(name="id_persona")
	private Persona persona;

	public Libro() {
	}

	public int getIdLibro() {
		return this.idLibro;
	}

	public void setIdLibro(int idLibro) {
		this.idLibro = idLibro;
	}

	public int getAño() {
		return this.año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	public String getEdicion() {
		return this.edicion;
	}

	public void setEdicion(String edicion) {
		this.edicion = edicion;
	}

	public String getEditorial() {
		return this.editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public int getIsbn() {
		return this.isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public String getNombreLibro() {
		return this.nombreLibro;
	}

	public void setNombreLibro(String nombreLibro) {
		this.nombreLibro = nombreLibro;
	}

	public List<Autores> getAutores() {
		return this.autores;
	}

	public void setAutores(List<Autores> autores) {
		this.autores = autores;
	}

	public Autores addAutore(Autores autore) {
		getAutores().add(autore);
		autore.setLibro(this);

		return autore;
	}

	public Autores removeAutore(Autores autore) {
		getAutores().remove(autore);
		autore.setLibro(null);

		return autore;
	}

	public Persona getPersona() {
		return this.persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

}