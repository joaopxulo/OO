package com.mycompany.aeroporto;

import Classes.Aeroport;
import Classes.Passageiro;
import Classes.Voo;
import java.util.Arrays;
import java.util.List;

public class Aeroporto {

    public static void main(String[] args) {
        Aeroport aeroporto = new Aeroport("Aeroporto Internacional de Brasília", "Brasília");
        Voo voo1 = new Voo("BR123", "Nova York", 100, "Agendado");
        Voo voo2 = new Voo("BR951", "Frankfurt", 4, "Agendado");
        Voo voo3 = new Voo("BR034", "Toronto", 50, "Agendado");
        
        voo1.adicionarEscalas("Miami");
        voo1.adicionarEscalas("Orlando");
        voo2.adicionarEscalas("Lisboa");
        voo2.adicionarEscalas("Paris");
        voo3.adicionarEscalas("Montreal");

        Passageiro passageiro1 = new Passageiro("João Silva", "12345678900");
        Passageiro passageiro2 = new Passageiro("Carlos Mendes", "32165498700");
        Passageiro passageiro3 = new Passageiro("Fernanda Costa", "98745612399");
        Passageiro passageiro4 = new Passageiro("João", "3948394898324");
        Passageiro passageiro5 = new Passageiro("Silva", "12665548966");
        Passageiro passageiro6 = new Passageiro("Daniel", "234234654");
        Passageiro passageiro7 = new Passageiro("Igor", "12365678900");
        Passageiro passageiro8 = new Passageiro("Ze", "122453665600");

        aeroporto.adicionarVoo(voo1);
        aeroporto.adicionarVoo(voo2);
        aeroporto.adicionarVoo(voo3);
 
        voo1.adicionarPassageiros(passageiro1);
        voo1.adicionarPassageiros (passageiro2);
        voo1.adicionarPassageiros (passageiro3);
        voo1.adicionarPassageiros (passageiro4);
        voo1.adicionarPassageiros (passageiro5);
        voo1.adicionarPassageiros(passageiro6);
        voo2.adicionarPassageiros(passageiro7);
        voo2.adicionarPassageiros (passageiro8);

        aeroporto.iniciarVoo("BR123");
        voo1.alterarEstadoDeVoo("Concluído");
        for (Passageiro p : voo1.getLista_passageiros()) {
            p.getSistemaFidelidade().adicionarPontos(500);
        }

        aeroporto.iniciarVoo("BR951");
        voo2.alterarEstadoDeVoo("Concluído");
        for (Passageiro p : voo2.getLista_passageiros()) {
            p.getSistemaFidelidade().adicionarPontos(300);
        }

        aeroporto.iniciarVoo("BR034");
        voo3.alterarEstadoDeVoo("Concluído");
        for (Passageiro p : voo3.getLista_passageiros()) {
            p.getSistemaFidelidade().adicionarPontos(800);
        }

        System.out.println("Voos com prejuízo:");
        List<Voo> voosPrejuizo = aeroporto.calcularVoosComPrejuizo();
        for (Voo v : voosPrejuizo) {
            System.out.println("Voo " + v.getNumDoVoo() + " com apenas " + v.getLista_passageiros().size() + " passageiros.");
        }

        System.out.println("Pontos dos passageiros:");
        List<Passageiro> lista_passageiros = Arrays.asList(passageiro1, passageiro2, passageiro3, passageiro4, passageiro5, passageiro6, passageiro7, passageiro8 );
        for (Passageiro p : lista_passageiros) {
            System.out.println(p.getNome() + ": " + p.getSistemaFidelidade().retornaPontos() + " pontos");
        }
    }
}
