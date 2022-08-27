package com.bridgelabz;

import java.util.Scanner;
import java.util.Set;

public class UserInterface {
    public void getDetails(Bird bird) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Bird Name ");
        bird.name = sc.next();
        System.out.println("Enter Birde Id");
        bird.id = sc.next();
        System.out.println("Enter Bird Price");
        bird.price = sc.nextInt();
    }
    public void displayBirds(Set<Bird> set){
      set.stream().forEach(System.out::println);
      }
    }
