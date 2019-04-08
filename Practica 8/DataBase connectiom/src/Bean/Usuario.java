package Bean;

public class Usuario {

	private int idConexion;
	private String idUsername;
	private String idContraseña;
	private int idDiaNaci;
	private String idMesNaci;
	private int idAñoNaci;
	private String idCorreo;
	private String idTipoUser;
	
	public Usuario(int idConexion, String idUsername, String idContraseña, int idDiaNaci, String idMesNaci,
			int idAñoNaci, String idCorreo, String idTipoUser) {
		
		this.idConexion = idConexion;
		this.idUsername = idUsername;
		this.idContraseña = idContraseña;
		this.idDiaNaci = idDiaNaci;
		this.idMesNaci = idMesNaci;
		this.idAñoNaci = idAñoNaci;
		this.idCorreo = idCorreo;
		this.idTipoUser = idTipoUser;
	}

	public Usuario() {
	}

	public int getIdConexion() {
		return idConexion;
	}
	public void setIdConexion(int idConexion) {
		this.idConexion = idConexion;
	}

	public String getIdUsername() {
		return idUsername;
	}
	public void setIdUsername(String idUsername) {
		this.idUsername = idUsername;
	}

	public String getIdContraseña() {
		return idContraseña;
	}
	public void setIdContraseña(String idContraseña) {
		this.idContraseña = idContraseña;
	}

	public int getIdDiaNaci() {
		return idDiaNaci;
	}
	public void setIdDiaNaci(int idDiaNaci) {
		this.idDiaNaci = idDiaNaci;
	}

	public String getIdMesNaci() {
		return idMesNaci;
	}
	public void setIdMesNaci(String idMesNaci) {
		this.idMesNaci = idMesNaci;
	}

	public int getIdAñoNaci() {
		return idAñoNaci;
	}
	public void setIdAñoNaci(int idAñoNaci) {
		this.idAñoNaci = idAñoNaci;
	}

	public String getIdCorreo() {
		return idCorreo;
	}
	public void setIdCorreo(String idCorreo) {
		this.idCorreo = idCorreo;
	}

	public String getIdTipoUser() {
		return idTipoUser;
	}
	public void setIdTipoUser(String idTipoUser) {
		this.idTipoUser = idTipoUser;
	}
	
	
}
