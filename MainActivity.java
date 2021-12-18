package com.example.project_layout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onclick1(View V)
    {
        EditText time, work, ans1;
        int time2, work2, ans2;
        time = findViewById(R.id.ed_time);
        work = findViewById(R.id.ed_work);
        ans1 = findViewById(R.id.ed_ans);
        time2 = Integer.parseInt(time.getText().toString());
        work2 = Integer.parseInt(work.getText().toString());
        ans2 = work2 / time2;
        ans1.setText(String.valueOf(ans2));
    }

}