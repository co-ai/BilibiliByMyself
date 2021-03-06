package com.example.pec.bilibilibymyself.fragment;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.pec.bilibilibymyself.R;
import com.example.pec.bilibilibymyself.adapter.AnimalAdapter;
import com.example.pec.bilibilibymyself.base.BaseFragment;
import com.example.pec.bilibilibymyself.bean.Animal;

public class AnimalFragment extends BaseFragment {
    private RecyclerView recyclerView;
    private AnimalAdapter adapter;

    @Override
    public int setIdResource() {
        return R.layout.animal_fragment;
    }

    @Override
    public void loadData() {
        for (int i = 0; i < 10; i++) {
            Animal animal = new Animal(R.drawable.ic_rabbit,"我是一只兔子");
            animals.add(animal);
        }

    }

    @Override
    public void initView() {
        recyclerView = getView().findViewById(R.id.animal_recycler_view);
        adapter = new AnimalAdapter(animals,getContext());
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(adapter);
    }
}
