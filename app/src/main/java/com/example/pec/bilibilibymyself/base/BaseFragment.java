package com.example.pec.bilibilibymyself.base;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.pec.bilibilibymyself.bean.Animal;

import java.util.ArrayList;
import java.util.List;

public abstract class BaseFragment extends Fragment {
    private View view;

    public abstract int setIdResource();                //一定要加pubilc
    protected List <Animal> animals = new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(setIdResource(),container,false);
        this.view = view;
        loadData();
        initView();
        return view;

    }

    public abstract void loadData();                    //一定要加public

    public View getView(){
        return view;
    }

    public abstract void initView();
}

