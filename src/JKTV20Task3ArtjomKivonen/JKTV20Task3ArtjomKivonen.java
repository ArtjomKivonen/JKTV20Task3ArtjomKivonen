/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JKTV20Task3ArtjomKivonen;

import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class JKTV20Task3ArtjomKivonen {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя:");
        String fname=scanner.next();
        System.out.println("Введите фамилию:");
        String lname=scanner.next();
        System.out.println("Введите год рождения:");
        int year=scanner.nextInt();
        System.out.println("Введите месяц рождения:");
        int month=scanner.nextInt();
        System.out.println("Введите день рождения:");
        int day=scanner.nextInt();
        System.out.println(fname + " " + lname + " родился " + " " + day + " " + month + " " + year);
        
        
        
    }

    
}
