package com.kc.customview.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.kc.customview.R;
import com.kc.customview.adapter.ItemsAdapter;
import com.kc.customview.model.MyItems;
import com.kc.customview.viewmodel.CustomItemViewModel;

import java.util.List;

public class HomeActivity extends AppCompatActivity {

    private CustomItemViewModel viewmodel;
    private RecyclerView recyclerView;
    private ItemsAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        viewmodel = ViewModelProviders.of(this).get(CustomItemViewModel.class);
        viewmodel.getItemsLiveData().observe(this, itemListObserver);
    }

    Observer<List<MyItems>> itemListObserver = new Observer<List<MyItems>>() {
        @Override
        public void onChanged(List<MyItems> myItemsList) {
            adapter = new ItemsAdapter(myItemsList);
            recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
            recyclerView.setAdapter(adapter);
        }
    };
}
