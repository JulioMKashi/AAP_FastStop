package Model.bean;

public class cliente {
   
    private String nome;
    private String telefone;
    private String email;
    private String datanascimento;
    private String cnh;
    private String cpf;
    private String rg;

    public cliente() {
    }

    public cliente(String nome, String telefone, String email, String datanascimento, String cnh, String cpf, String rg) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.datanascimento = datanascimento;
        this.cnh = cnh;
        this.cpf = cpf;
        this.rg = rg;
    }
   

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDatanascimento() {
        return datanascimento;
    }

    public void setDatanascimento(String datanascimento) {
        this.datanascimento = datanascimento;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
    
    
}
