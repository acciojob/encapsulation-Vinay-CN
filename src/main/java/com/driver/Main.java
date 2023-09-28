package com.driver;

public class Main {
  public static void main(String[] args){
    RWOnly obj  = new RWOnly();
    obj.setName("vinay");
    System.out.println(obj.getName());
    //System.out.println(rw.name); //The field RWOnly.name is not visible
  }
}
