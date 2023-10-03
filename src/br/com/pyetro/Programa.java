package br.com.pyetro;

public class Programa {

    public static void main(String args[]) {

        PessoaFisica pessoa = new PessoaFisica();
        pessoa.setApelido("Apyetro");
        pessoa.setSalario(4500d);
        pessoa.setNome("Anderson Pyetro");
        pessoa.setCpf(1l);
        pessoa.setSobrenome("Oliveira Nobrega");
        imprimir(pessoa);

        PessoaJuridica pessoaJuridica = new PessoaJuridica();
        pessoaJuridica.setFaturamento(50000d);
        pessoaJuridica.setCnpj(2l);
        pessoaJuridica.setNomeFantasia("Endless Midia");
        pessoaJuridica.setNome("Aristoteles");
        pessoaJuridica.setCpf(1l);
        pessoaJuridica.setSobrenome("Seneca");
        imprimir(pessoaJuridica);
        
    }

    public static void imprimir(Pessoa pessoa){
        if (pessoa instanceof PessoaJuridica){
            PessoaJuridica cnpj = (PessoaJuridica) pessoa;
            System.out.println("O nome do responsável por este cnpj é:" + cnpj.getNome());
        }

        pessoa.imprimirNome();
        pessoa.imprimirValor();
        System.out.println(pessoa.getNome() + " Recebe: " + pessoa.financeiro());
    }
}
