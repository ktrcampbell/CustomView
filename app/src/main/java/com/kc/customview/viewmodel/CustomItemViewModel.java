package com.kc.customview.viewmodel;


import android.graphics.Color;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.kc.customview.R;
import com.kc.customview.model.MyItems;

import java.util.ArrayList;
import java.util.List;

public class CustomItemViewModel extends ViewModel {

    MutableLiveData<List<MyItems>> itemsLiveData;
    List<MyItems> myItemsList;

    public CustomItemViewModel(){
        itemsLiveData = new MutableLiveData<>();
        init();
    }

    public MutableLiveData<List<MyItems>> getItemsLiveData() {
        return itemsLiveData;
    }

    private void init() {
        loadItems();
        itemsLiveData.setValue(myItemsList);
    }

    private void loadItems(){
        MyItems myItems1 = new MyItems();
        myItems1 = (R.id.item_imageview), "This is  Test", true, Color.GREEN;
        MyItems myItems2 = new MyItems();
        myItems2 = (R.drawable.ic_launcher_background), "This is some other text", false, Color.MAGENTA;

        myItemsList = new ArrayList<>();
        myItemsList.add(myItems1);
        myItemsList.add(myItems2);

    }
}
