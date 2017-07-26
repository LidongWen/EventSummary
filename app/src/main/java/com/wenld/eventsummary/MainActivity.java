package com.wenld.eventsummary;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button event_text;
    private Button nested;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        event_text = (Button) findViewById(R.id.event_text);
        nested = (Button) findViewById(R.id.nested);

        event_text.setOnClickListener(this);
        nested.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.event_text:
                startActivity(new Intent(this,EventTestActivity.class));
                break;
            case R.id.nested:
                startActivity(new Intent(this,ScrollerViewNestedRecyclerViewActivity.class));
                break;
        }
    }
}
