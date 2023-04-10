package OnpeModel;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Partido {
	
	@Id
	private int idPartido;
	private String RazonSocial;
	private String CandidatoPresidencial;
	private String Imagen;
	
	public int getIdPartido() {
		return idPartido;
	}
	public void setIdPartido(int idPartido) {
		this.idPartido = idPartido;
	}
	public String getRazonSocial() {
		return RazonSocial;
	}
	public void setRazonSocial(String razonSocial) {
		RazonSocial = razonSocial;
	}
	public String getCandidatoPresidencial() {
		return CandidatoPresidencial;
	}
	public void setCandidatoPresidencial(String candidatoPresidencial) {
		CandidatoPresidencial = candidatoPresidencial;
	}
	public String getImagen() {
		return Imagen;
	}
	public void setImagen(String imagen) {
		Imagen = imagen;
	}

}
