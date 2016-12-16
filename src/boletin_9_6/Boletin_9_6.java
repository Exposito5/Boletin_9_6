package boletin_9_6;

import javax.swing.JOptionPane;

public class Boletin_9_6 {

    public static void main(String[] args) {
        int soldo;
        int i = 0;
        do {
            do {
                soldo = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el sueldo de los trabajadores"));
                if (soldo > 0&&soldo<=1750&&soldo>=1000) {
                    i++;
                }
            } while (soldo > 0);
        } while(soldo<0);
        System.out.println("Número de trabajadores que cobran entre 1000 y 1750 es "+i);
    }

}
