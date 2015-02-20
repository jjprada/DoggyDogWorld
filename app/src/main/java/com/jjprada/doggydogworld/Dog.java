package com.jjprada.doggydogworld;

import android.util.Log;

/**
 * Created by Dr4ckO on 19/02/2015.
 */
public class Dog {
    String name;
    int age;
    int numberOfLegs = 4;
    String breed;

    void bark(){
        String bark = name + " barked";
        Log.d("Dog", bark);
    }

    void barkAt(String victim){
        String bark = name + " barked " + victim;
        Log.d("Dog", bark);
    }
}
