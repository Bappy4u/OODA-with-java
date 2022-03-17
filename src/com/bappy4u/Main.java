package com.bappy4u;

public class Main {

    public static void main(String[] args) {
        DataValidation dataValidation = new DataValidation();

        boolean isPasswordValid = dataValidation.isPasswordValid("Password", "password");

        if (isPasswordValid){
            System.out.println("The password is matched");
        }
        else{
            System.out.println("Password doesn't match.");
        }


        Airplane biplane = new Airplane();

        biplane.setSpeed(212);
        System.out.println(biplane.getSpeed());
    }
}
