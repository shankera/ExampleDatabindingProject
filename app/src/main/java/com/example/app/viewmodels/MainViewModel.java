package com.example.app.viewmodels;

import android.databinding.Bindable;

import com.example.app.BR;

import java.util.ArrayList;


/**
 * Created by Arjun on 8/13/2015.
 */
public class MainViewModel extends ViewModel{
    public MainViewModel(){
        super();
    }
    public MainViewModel setData(ArrayList<String> data){
        return this;
    }

    private ComponentViewModel componentViewModel;
    @Bindable
    public ComponentViewModel getComponentViewModel(){return this.componentViewModel;}
    public MainViewModel setComponentViewModel(ComponentViewModel componentViewModel){
        this.componentViewModel = componentViewModel;
        notifyPropertyChanged(BR.componentViewModel);
        return this;
    }
}
