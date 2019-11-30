package com.example.myradiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private RadioGroup group;
    private RadioButton male,female;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        group=findViewById(R.id.group);
        male=findViewById(R.id.male);
        female=findViewById(R.id.female);

        group.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch(i){
                    case R.id.male:
                        Toast.makeText(MainActivity.this, "male....", Toast.LENGTH_SHORT).show();
                        break;

                    case R.id.female:
                        Toast.makeText(MainActivity.this, "female....", Toast.LENGTH_SHORT).show();

                }
            }
        });

    }
}
