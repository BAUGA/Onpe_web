package OnpeModel;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Distrito {
	
	@Id
	private int idDistrito;
	private int idProvincia;
	private String Detalle;
	
	public int getIdDistrito() {
		return idDistrito;
	}
	public void setIdDistrito(int idDistrito) {
		this.idDistrito = idDistrito;
	}
	public int getIdProvincia() {
		return idProvincia;
	}
	public void setIdProvincia(int idProvincia) {
		this.idProvincia = idProvincia;
	}
	public String getDetalle() {
		return Detalle;
	}
	public void setDetalle(String detalle) {
		Detalle = detalle;
	}
}
