package Model.bean;

public class reserva {
    
    private int ID_reserva;
    private cliente ID_cliente;
    private vagas ID_vagas;
    private String status_reserva;
    private int numero_reserva;
    private String data_login_reserva;
    private String data_logout_reserva;
    private ec ID_ec;

    public reserva() {
    }

    public reserva(cliente ID_cliente, vagas ID_vagas, String status_reserva, int numero_reserva, String data_login_reserva, String data_logout_reserva, ec ID_ec) {
        this.ID_cliente = ID_cliente;
        this.ID_vagas = ID_vagas;
        this.status_reserva = status_reserva;
        this.numero_reserva = numero_reserva;
        this.data_login_reserva = data_login_reserva;
        this.data_logout_reserva = data_logout_reserva;
        this.ID_ec = ID_ec;
    }
   
    public int getID_reserva() {
        return ID_reserva;
    }

    public void setID_reserva(int ID_reserva) {
        this.ID_reserva = ID_reserva;
    }

    public cliente getID_cliente() {
        return ID_cliente;
    }

    public void setID_cliente(cliente ID_cliente) {
        this.ID_cliente = ID_cliente;
    }

    public vagas getID_vagas() {
        return ID_vagas;
    }

    public void setID_vagas(vagas ID_vagas) {
        this.ID_vagas = ID_vagas;
    }

    public String getStatus_reserva() {
        return status_reserva;
    }

    public void setStatus_reserva(String status_reserva) {
        this.status_reserva = status_reserva;
    }

    public int getNumero_reserva() {
        return numero_reserva;
    }

    public void setNumero_reserva(int numero_reserva) {
        this.numero_reserva = numero_reserva;
    }

    public String getData_login_reserva() {
        return data_login_reserva;
    }

    public void setData_login_reserva(String data_login_reserva) {
        this.data_login_reserva = data_login_reserva;
    }

    public String getData_logout_reserva() {
        return data_logout_reserva;
    }

    public void setData_logout_reserva(String data_logout_reserva) {
        this.data_logout_reserva = data_logout_reserva;
    }

    public ec getID_ec() {
        return ID_ec;
    }

    public void setID_ec(ec ID_ec) {
        this.ID_ec = ID_ec;
    }
    
    
    
    
}
