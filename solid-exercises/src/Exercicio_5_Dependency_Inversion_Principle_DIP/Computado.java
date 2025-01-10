package Exercicio_5_Dependency_Inversion_Principle_DIP;

public class Computado {
     DispositivoEntrada dispositivoEntrada;

    public Computado(DispositivoEntrada dispositivoEntrada) {
        this.dispositivoEntrada = dispositivoEntrada;
    }

    public void usarDispositivo() {
        dispositivoEntrada.usar();
    }
}
