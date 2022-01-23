package Model.bean;

public class endereco {
    
    private int ID_endereco;
    private cliente ID_cliente;
    private String cidade;
    private String bairro;
    private String logradouro;
    private String numero;
    private String cep;

    public endereco() {
    }

    public endereco(cliente ID_cliente, String cidade, String bairro, String logradouro, String numero, String cep) {
        this.ID_cliente = ID_cliente;
        this.cidade = cidade;
        this.bairro = bairro;
        this.logradouro = logradouro;
        this.numero = numero;
        this.cep = cep;
    }

    public int getID_endereco() {
        return ID_endereco;
    }

    public void setID_endereco(int ID_endereco) {
        this.ID_endereco = ID_endereco;
    }

    public cliente getID_cliente() {
        return ID_cliente;
    }

    public void setID_cliente(cliente ID_cliente) {
        this.ID_cliente = ID_cliente;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
    
    
}
