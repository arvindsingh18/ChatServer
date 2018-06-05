package com.example.alucard.chatserver;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

public class Home extends AppCompatActivity {
    EditText et1;
    Button bt1;
    LinearLayout ll1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        et1=(EditText)findViewById(R.id.et1);
        bt1=(Button)findViewById(R.id.bt1);
        ll1=(LinearLayout)findViewById(R.id.ll1);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}
