/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

/**
 *
 * @author Mayra
 */
public class DatosUsuario {
    private String Nombre;
    private String User;
    private String Password;
    private String FirmaD;
    private String RFC;
    private String CURP;
    private String Acceso;
    private String idUsuario;
    
    public DatosUsuario() {
    }

    public DatosUsuario(String Nombre, String User, String Password, String FirmaD, String RFC, String CURP, String Acceso, String idUsuario) {
        this.Nombre = Nombre;
        this.User = User;
        this.Password = Password;
        this.FirmaD = FirmaD;
        this.RFC = RFC;
        this.CURP = CURP;
        this.Acceso = Acceso;
        this.idUsuario = idUsuario;
    }

    public String getIdUsuario() {
        return idUsuario;
    }
    

    public String getNombre() {
        return Nombre;
    }

    public String getUser() {
        return User;
    }

    public String getPassword() {
        return Password;
    }

    public String getFirmaD() {
        return FirmaD;
    }

    public String getRFC() {
        return RFC;
    }

    public String getCURP() {
        return CURP;
    }

    public String getAcceso() {
        return Acceso;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setUser(String User) {
        this.User = User;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public void setFirmaD(String FirmaD) {
        this.FirmaD = FirmaD;
    }

    public void setRFC(String RFC) {
        this.RFC = RFC;
    }

    public void setCURP(String CURP) {
        this.CURP = CURP;
    }

    public void setAcceso(String Acceso) {
        this.Acceso = Acceso;
    }
    
    
}
