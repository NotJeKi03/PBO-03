/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum3;

/**
 *
 * @author hadoop
 */
public class Main {
   /** public static void main(String[] args) {
        Hewan kucing = new Hewan("mimi", 3);
        kucing.suara();
        kucing.info();
        
        Hewan anjing = new Hewan("momo0", 5);
        anjing.berlari();
        anjing.info();
    }**/
    
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil("VW", "Combi", 1998, "putih");
        mobil1.displayInfo();
        mobil1.startEngine();
        
        Mobil mobil2 = new Mobil("Honda", "Civic", 2020, "hitam");
        mobil2.displayInfo();
        mobil1.startEngine();
    }
}

