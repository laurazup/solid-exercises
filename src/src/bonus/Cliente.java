package bonus;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Cliente {

    private String nome;
    private String cpf;
    private String rg;
    private LocalDate dataContaCriada;

    public Cliente(String nome, String cpf, String rg, LocalDate dataContaCriada) {
        verificacao(nome, cpf, rg);
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.dataContaCriada = dataContaCriada;
    }


    private void verificacao(String nome, String cpf, String rg){
        if (nome == null || nome.isEmpty()){
            throw new IllegalArgumentException("O nome não pode ser nulo ou vazio!");
        }
        if (cpf == null || cpf.isEmpty()){
            throw new IllegalArgumentException("O CPF não pode ser nulo ou vazio!");
        }
        if (rg == null || rg.isEmpty()){
            throw new IllegalArgumentException("O RG não pode ser nulo ou vazio!");
        }

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public LocalDate getDataContaCriada() {
        return dataContaCriada;
    }

    public void setDataContaCriada(LocalDate dataContaCriada) {
        this.dataContaCriada = dataContaCriada;
    }


}
