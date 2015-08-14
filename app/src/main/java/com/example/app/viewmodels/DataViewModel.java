package com.example.app.viewmodels;

import android.databinding.Bindable;

import com.example.app.BR;

/**
 * Created by Arjun on 8/13/2015.
 */
public class DataViewModel extends ViewModel {
    private String datum;
    @Bindable
    public String getDatum(){return datum;}
    public DataViewModel setDatum(String datum){
        this.datum = datum;
        notifyPropertyChanged(BR.datum);
        return this;
    }
}
