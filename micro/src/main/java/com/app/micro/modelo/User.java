package com.app.micro.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "ACC_TMP_TIPUVT_DOWN_TBL")

public class User {
	

	@Column(name = "YEAR_UVT" )
	@Id
    private int yearUvt;
	
	@Column(name = "VAL_UVT")
    private float valUvt;
    
	@Column(name = "FECHA" )
	private String fecha;
    
	@Column(name = "SOLICITUD")
	private String solicitud;
    
	@Column(name = "USR_RADIC")
	private String usrRadic;
    
	@Column(name = "USR_GESTOR")
	private String usrGestor;
    
	@Column(name = "ACC_ESTADOS_TBL_TIP_ESTADO")
	private int accEstados;

	public int getYearUvt() {
		return yearUvt;
	}

	public void setYearUvt(int yearUvt) {
		this.yearUvt = yearUvt;
	}

	public float getValUvt() {
		return valUvt;
	}

	public void setValUvt(float valUvt) {
		this.valUvt = valUvt;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getSolicitud() {
		return solicitud;
	}

	public void setSolicitud(String solicitud) {
		this.solicitud = solicitud;
	}

	public String getUsrRadic() {
		return usrRadic;
	}

	public void setUsrRadic(String usrRadic) {
		this.usrRadic = usrRadic;
	}

	public String getUsrGestor() {
		return usrGestor;
	}

	public void setUsrGestor(String usrGestor) {
		this.usrGestor = usrGestor;
	}

	public int getAccEstados() {
		return accEstados;
	}

	public void setAccEstados(int accEstados) {
		this.accEstados = accEstados;
	}
	
	
    
}