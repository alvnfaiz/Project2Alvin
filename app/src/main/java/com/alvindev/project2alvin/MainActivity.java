package com.alvindev.project2alvin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioGroup rglang;
    RadioButton java, ruby, python, javascript;
    Button submit;
    CheckBox basic, intermediate, advance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rglang = findViewById(R.id.rglang);
        java = findViewById(R.id.Java);
        ruby = findViewById(R.id.Ruby);
        python = findViewById(R.id.Python);
        javascript = findViewById(R.id.Javascript);

        basic = findViewById(R.id.chkBasic);
        intermediate = findViewById(R.id.chkIntermediate);
        advance = findViewById(R.id.chkAdvance);
        submit = findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String programming_language = "";
                String programming_skill = "";
                Double gaji =0.0;

                if(java.isChecked()){
                    programming_language = java.getText().toString();
                }else if(ruby.isChecked()){
                    programming_language = ruby.getText().toString();
                }else if(python.isChecked()){
                    programming_language = python.getText().toString();
                }else if(javascript.isChecked()){
                    programming_language = javascript.getText().toString();
                }

                if(basic.isChecked()){
                    gaji += 5000000.0;
                    programming_skill += "\n" + basic.getText().toString();
                }
                if(intermediate.isChecked()){
                    gaji += 10000000.0;
                    programming_skill += "\n" + intermediate.getText().toString();
                }
                if(advance.isChecked()){
                    gaji += 20000000.0;
                    programming_skill += "\n" + advance.getText().toString();
                }

                Toast.makeText(MainActivity.this,
                        "Your Programming Language : " + programming_language +
                                "\nYour Programming Skill :" + programming_skill +
                                "\nTotal Gaji : " + gaji
                        , Toast.LENGTH_LONG).show();
            }
        });

    }
}