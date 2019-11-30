package com.example.myradiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class CheckBoxActivity extends AppCompatActivity {
    CheckBox amir,rashid,khalid;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box);

        amir=findViewById(R.id.amir);
        rashid=findViewById(R.id.rashid);
        khalid=findViewById(R.id.khalid);
        btn=findViewById(R.id.click);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s="";
                if (amir.isChecked()){
                s=s+"amir";
                }
                if (khalid.isChecked()){
                    s=s+"khalid";
                }
                if (rashid.isChecked()){
                    s=s+"Rashid";
                }
                Toast.makeText(CheckBoxActivity.this, ""+s, Toast.LENGTH_SHORT).show();

            }
        });
    }
}
