/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinput;
import java.io.*;
import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class UserInput {


    public static void main(String[] args) throws IOException{
      System.out.println("Please write your name");
      Scanner sc = new Scanner(System.in);
      String name = sc.next();
      System.out.println("Please write your age");
      int age = sc.nextInt();
      System.out.println("Please write your username");
      String userName = sc.next();
      
      
      File file = new File("userInfo.txt");
      PrintWriter writer;
      writer = new PrintWriter(file);
      writer.println(name);
      writer.println(age);
      writer.write(userName);
      writer.close();
      
    }
    
}
