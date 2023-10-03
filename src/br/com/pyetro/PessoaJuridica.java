package br.com.pyetro;

public class PessoaJuridica extends Pessoa {

    private Long cnpj;

    private Double faturamento;

    private String nomeFantasia;

    @Override
    public Double financeiro() {
        return (double) 50000d;
    }

    public void imprimirValor(){

    }

    public Long getCnpj() {
        return cnpj;
    }

    public void setCnpj(Long cpnj) {
        this.cnpj = cnpj;
    }

    public Double getFaturamento() {
        return faturamento;
    }

    public void setFaturamento(Double faturamento) {
        this.faturamento = faturamento;
    }

    public String getNomeFantasia(){
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia){
        this.nomeFantasia = nomeFantasia;
    }
}
