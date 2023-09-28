package com.driver;

public class Main {
  public static void main(String[] args){
    RWOnly rw  = new RWOnly();
    rw.setName("vinay");
    System.out.println(rw.getName());
    //System.out.println(rw.name); //The field RWOnly.name is not visible
  }
}