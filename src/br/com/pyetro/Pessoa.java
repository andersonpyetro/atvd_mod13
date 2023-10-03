package br.com.pyetro;

public abstract class Pessoa {

    private String nome;

    private String sobrenome;

    private Long cpf;

    public abstract Double financeiro();

    public void imprimirNome(){
        System.out.println("Nome é: "+ this.nome);
    }

    public void imprimirValor() {
        Double valor = financeiro();
        System.out.println("Entrada de dinheiro: " + valor);

    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getSobrenome(){
        return sobrenome;
    }

    public void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }

    public Long getCpf(){
        return cpf;
    }

    public void setCpf(Long cpf){
        this.cpf = cpf;
    }


}
