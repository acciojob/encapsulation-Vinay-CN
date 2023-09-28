package com.driver;

public class Main {
  public static void main(String[] args){
    RWOnly rw  = new RWOnly();
    rw.setter("vinay");
    System.out.println(rw.getter());
    //System.out.println(rw.name); //The field RWOnly.name is not visible
  }
}