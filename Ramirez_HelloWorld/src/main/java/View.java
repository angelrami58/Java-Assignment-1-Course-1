/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author angelramirez-rivera
 */
public class View {
    Scanner scanner = new Scanner(System.in);
    private double rent;
    private double gro;
    private double gas;
    private double in;
    private double wants;

 public double income(){
    System.out.println("Enter your monthly income: ");
 return scanner.nextDouble();
 }
     public void addExpense() {
        System.out.print("Enter the cost of rent: ");
        rent = scanner.nextDouble();
        System.out.print("Enter costfor grocerys: ");
        gro = scanner.nextDouble();
        System.out.print("Enter cost of gas : ");
        gas = scanner.nextDouble();
         System.out.print("Enter cost of insurance: ");
        in = scanner.nextDouble();
         System.out.print("Enter cost of wants: ");
        wants = scanner.nextDouble();
    }

}
