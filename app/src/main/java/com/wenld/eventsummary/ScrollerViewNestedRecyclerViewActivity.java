package com.wenld.eventsummary;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;

import com.wenld.eventsummary.nested.MyRecyclerView;
import com.wenld.multitypeadapter.CommonAdapter;
import com.wenld.multitypeadapter.base.ViewHolder;

import java.util.ArrayList;
import java.util.List;

public class ScrollerViewNestedRecyclerViewActivity extends AppCompatActivity {
    MyRecyclerView rlv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroller_view_nested_recycler_view);
        rlv = (MyRecyclerView) findViewById(R.id.rlv);
        rlv.setLayoutManager(new LinearLayoutManager(this));
        CommonAdapter adapter = new CommonAdapter<String>(this, String.class, R.layout.list_items) {
            @Override
            protected void convert(ViewHolder holder, final String item, int position) {
                holder.setText(R.id.btn, item);
            }
        };
        rlv.setAdapter(adapter);
        List list = new ArrayList<Object>();
        for (int i = 0; i < 10; i++) {
            list.add("item_" + i);
        }
        adapter.setItems(list);
    }
}