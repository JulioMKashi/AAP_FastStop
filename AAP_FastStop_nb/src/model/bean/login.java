package Model.bean;

public class login {
    
    private int ID_login;
    private cliente ID_cliente;
    private String senha;
    private String data_login;
    private String data_logout;

    public login() {
    }

    public login(cliente ID_cliente, String senha, String data_login, String data_logout) {
        this.ID_cliente = ID_cliente;
        this.senha = senha;
        this.data_login = data_login;
        this.data_logout = data_logout;
    }
   
    public int getID_login() {
        return ID_login;
    }

    public void setID_login(int ID_login) {
        this.ID_login = ID_login;
    }

    public cliente getID_cliente() {
        return ID_cliente;
    }

    public void setID_cliente(cliente ID_cliente) {
        this.ID_cliente = ID_cliente;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getData_login() {
        return data_login;
    }

    public void setData_login(String data_login) {
        this.data_login = data_login;
    }

    public String getData_logout() {
        return data_logout;
    }

    public void setData_logout(String data_logout) {
        this.data_logout = data_logout;
    }

}    