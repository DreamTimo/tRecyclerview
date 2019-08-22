package com.timo.timorecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;

import com.jcodecraeer.xrecyclerview.XRecyclerView;
import com.timo.trecyclerview.BaseAdapterTools;

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
        test.setLoadingMoreEnabled(false);
        test.setPullRefreshEnabled(false);
        BaseAdapterTools.setRecyclerView(this, test, new TestAdapter(this, R.layout.adapter_item_test, data));
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
