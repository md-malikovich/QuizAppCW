package com.e.quizapphw.main;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class MainViewModel extends ViewModel {

    public MutableLiveData<String> message = new MutableLiveData<>();
    public MutableLiveData<Integer> counter = new MutableLiveData<>();
    private int mCount = 0;

    public MainViewModel() {
        Log.d("ololo", "View model created");
        message.setValue("First");
        message.setValue("First1");
        message.setValue("First2");
        message.setValue("First3");
    }

    public void counterAdd(){
        mCount++;
        counter.setValue(mCount);
    }

    public void counterSub(){
        mCount--;
        counter.setValue(mCount);
    }

    public void onLoginClick(){
        //
    }
}
