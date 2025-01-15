package bonus;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Cliente {

    private static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private String nome;
    private String cpf;
    private String rg;
    private LocalDate dataContaCriada;

    public Cliente(String nome, String cpf, String rg, String dataContaCriada) {
        verificacao(nome, cpf, rg, LocalDate.parse(dataContaCriada));
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.dataContaCriada = LocalDate.parse(dataContaCriada, DATE_TIME_FORMATTER);
    }


    private void verificacao(String nome, String cpf, String rg, LocalDate dataContaCriada){
        if (nome == null || nome.isEmpty()){
            throw new IllegalArgumentException("O nome não pode ser nulo ou vazio!");
        }
        if (cpf == null || cpf.isEmpty()){
            throw new IllegalArgumentException("O CPF não pode ser nulo ou vazio!");
        }
        if (rg == null || rg.isEmpty()){
            throw new IllegalArgumentException("O RG não pode ser nulo ou vazio!");
        }
        if (dataContaCriada == null){
            throw new IllegalArgumentException("A Data da Criação não pode ser nula!");
        }

    }
}
