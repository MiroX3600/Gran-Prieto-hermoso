package Bean;

public class Usuario {

	private int idConexion;
	private String idUsername;
	private String idContrase�a;
	private int idDiaNaci;
	private String idMesNaci;
	private int idA�oNaci;
	private String idCorreo;
	private String idTipoUser;
	
	public Usuario(int idConexion, String idUsername, String idContrase�a, int idDiaNaci, String idMesNaci,
			int idA�oNaci, String idCorreo, String idTipoUser) {
		
		this.idConexion = idConexion;
		this.idUsername = idUsername;
		this.idContrase�a = idContrase�a;
		this.idDiaNaci = idDiaNaci;
		this.idMesNaci = idMesNaci;
		this.idA�oNaci = idA�oNaci;
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

	public String getIdContrase�a() {
		return idContrase�a;
	}
	public void setIdContrase�a(String idContrase�a) {
		this.idContrase�a = idContrase�a;
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

	public int getIdA�oNaci() {
		return idA�oNaci;
	}
	public void setIdA�oNaci(int idA�oNaci) {
		this.idA�oNaci = idA�oNaci;
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
