package com.timo.timorecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;

import com.jcodecraeer.xrecyclerview.XRecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private XRecyclerView   test;
    private ArrayList<Test> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        test = findViewById(R.id.test);
        data = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            data.add(new Test("测试" + i));
        }
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        test.setLayoutManager(layoutManager);
        test.setLoadingMoreEnabled(false);
        test.setPullRefreshEnabled(false);
        test.setAdapter(new TestAdapter(this, R.layout.adapter_item_test, data));
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (test != null) {
            test.destroy();
            test = null;
        }
    }
}
