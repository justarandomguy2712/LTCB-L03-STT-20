/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa;

/**
 *
 * @author abcxy
 */
import java.util.LinkedList;
import java.util.Scanner;
public class MyLink {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        LinkedList<String> LK= new LinkedList<>();
        LK.add("HUST");
        LK.add("UET");
        LK.add("PTIT");
        LK.add("KMA");
        LK.add("HUS");
        System.out.println("Cac truong dai hoc day CNTT la: " + LK);
        LK.addFirst("HCMUS");
        LK.addLast("HCMUT");
        System.out.println("Cac truong dai hoc day CNTT la (Part 2): " + LK);
        LK.remove(4);
        LK.remove(3);
        System.out.println("Cac truong dai hoc day CNTT la (Part 3): " + LK);
        System.out.println("-------Vui long nhap ten truong-------");
        System.out.println("Your university name is: ");
        String name = sc.nextLine();
        int index=-1;
        for(int i=0;i<LK.size();i++){
            if(LK.get(i).equals(name)){
                index=i;
                break;
            }
        }
        if(index != -1){
            System.out.println("FOUND");
        } else {
            System.out.println("NOT FOUND");
        }
    }
}
