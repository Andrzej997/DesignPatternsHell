package com.mateusz.singleton;

/**
 * Created by Mateusz on 04.05.2017.
 */
public class NonThreadSafeSingleton implements ISingleton{

    private static NonThreadSafeSingleton nonThreadSafeSingleton;

    protected NonThreadSafeSingleton(){

    }

    @Override
    public ISingleton getInstance(){
        if(nonThreadSafeSingleton == null){
            nonThreadSafeSingleton = new NonThreadSafeSingleton();
        }
        return nonThreadSafeSingleton;
    }
}
