package com.mycompany.exercicio01;

import classes.Eletronics;
import classes.Furniture;
import classes.Perishable;

public class Exercicio01 {

    public static void main(String[] args) {
        Eletronics eletronic = new Eletronics();
        Furniture furniture = new Furniture();
        Perishable perishable = new Perishable();

        eletronic.fill();
        eletronic.print();

        furniture.fill();
        furniture.print();

        perishable.fill();
        perishable.print();
    }
}
