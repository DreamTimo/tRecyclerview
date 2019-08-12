package com.timo.timorecyclerview;

import android.content.Context;

import com.timo.trecyclerview.BaseAdapter;
import com.timo.trecyclerview.base.ViewHolder;

import java.util.List;

/**
 * Created by 蔡永汪 on 2019/8/12.
 */

public class TestAdapter extends BaseAdapter<Test> {
    public TestAdapter(Context context, int layoutId, List<Test> datas) {
        super(context, layoutId, datas);
    }

    @Override
    protected void convert(ViewHolder holder, Test test, int position) {
        holder.setText(R.id.test,test.getName());
    }
}
