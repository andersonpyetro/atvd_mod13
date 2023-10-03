package br.com.pyetro;

public class PessoaFisica extends Pessoa{

    private String apelido;

    private Double salario;


    @Override
    public Double financeiro() {
        return (double) 4500d;
    }

    public void imprimirValor(){

    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
}
