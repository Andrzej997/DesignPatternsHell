package com.mateusz.singleton;

/**
 * Created by Mateusz on 04.05.2017.
 */
public class ThreadSafeSingleton implements ISingleton {

    private static ThreadSafeSingleton threadSafeSingleton;

    protected ThreadSafeSingleton(){

    }

    @Override
    public synchronized ISingleton getInstance(){
        if (threadSafeSingleton != null){
            return threadSafeSingleton;
        } else {
            if(threadSafeSingleton == null){
                threadSafeSingleton = new ThreadSafeSingleton();
            }
        }
        return threadSafeSingleton;
    }
}
