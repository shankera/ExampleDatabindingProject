package com.example.app.viewmodels;

import android.databinding.ObservableArrayList;

import com.example.app.BR;
import com.example.app.R;

import java.util.ArrayList;

import me.tatarka.bindingcollectionadapter.ItemView;

/**
 * Created by Arjun on 8/13/2015.
 */
public class ComponentViewModel extends ViewModel {
    public ItemView dataView = ItemView.of(BR.dataItem, R.layout.data);
    public final ObservableArrayList<DataViewModel> dataViewModels = new ObservableArrayList<>();
    public ComponentViewModel setData(ArrayList<String> data){
        for (String datum : data) {
            this.dataViewModels.add(
                    new DataViewModel()
                        .setDatum(datum));
        }
        return this;
    }
}
