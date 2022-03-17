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

        Jet boeing = new Jet();
        boeing.setSpeed(422);
        System.out.println(boeing.getSpeed());


        int i = 0;

        while (i<4){
            boeing.accelerate();
            System.out.println(boeing.getSpeed());
            if(boeing.getSpeed()>5000){
               biplane.setSpeed(biplane.getSpeed() * 2);
            }
            else{
                boeing.accelerate();
            }
            i++;
        }
        System.out.println(biplane.getSpeed());
    }
}
