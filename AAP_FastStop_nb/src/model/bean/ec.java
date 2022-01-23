package Model.bean;

public class ec {

    private int ID_ec;
    private endereco ID_endereco;
    private String cnpj;
    private String quntdevagas;
    private String status;
    private String nome_fantasia;
    private String razao_social;

    public ec() {
    }

    public ec(endereco ID_endereco, String cnpj, String quntdevagas, String status, String nome_fantasia, String razao_social) {
        this.ID_endereco = ID_endereco;
        this.cnpj = cnpj;
        this.quntdevagas = quntdevagas;
        this.status = status;
        this.nome_fantasia = nome_fantasia;
        this.razao_social = razao_social;
    }

    public int getID_ec() {
        return ID_ec;
    }

    public void setID_ec(int ID_ec) {
        this.ID_ec = ID_ec;
    }

    public endereco getID_endereco() {
        return ID_endereco;
    }

    public void setID_endereco(endereco ID_endereco) {
        this.ID_endereco = ID_endereco;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getQuntdevagas() {
        return quntdevagas;
    }

    public void setQuntdevagas(String quntdevagas) {
        this.quntdevagas = quntdevagas;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNome_fantasia() {
        return nome_fantasia;
    }

    public void setNome_fantasia(String nome_fantasia) {
        this.nome_fantasia = nome_fantasia;
    }

    public String getRazao_social() {
        return razao_social;
    }

    public void setRazao_social(String razao_social) {
        this.razao_social = razao_social;
    }
    
    
}
