import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){
    System.out.print("Holiwi");


        String primerNumero= JOptionPane.showInputDialog("Ingrese el primer numero");
        String segundoNumero= JOptionPane.showInputDialog("Ingrese el segundo numero");

        //Convierte las entradas String
        int numero1= Integer.parseInt(primerNumero);
        int numero2= Integer.parseInt(segundoNumero);
        int suma = numero1 + numero2;
        JOptionPane.showMessageDialog(null, "El resultado de la suma es: " + suma, "suma de dos enteros", JOptionPane.INFORMATION_MESSAGE);
        //suma, resta, multiplicaci+on, división
    }
}