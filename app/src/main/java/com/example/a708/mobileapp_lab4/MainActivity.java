package com.example.a708.mobileapp_lab4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.menu.ActionMenuItemView;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity);
        initialize();
    }

    public void initialize(){
        Button btn_num = (Button) findViewById(R.id.btn_num);
        Button btn_string = (Button) findViewById(R.id.btn_string);

        btn_num.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onClickNumber();
            }
        });

        btn_string.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onClickString();
            }
        });
    }

    public void onClickNumber(){
        Intent i = new Intent(this, Activity_a.class);
        startActivityForResult(i, 0);
    }

    public void onClickString(){
        Intent i = new Intent(this, ActivityB.class);
        startActivityForResult(i, 1);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(resultCode == RESULT_OK){
            if(requestCode == 0){
                String num = String.valueOf(data.getIntExtra("number", 0) + 1);
                Toast.makeText(this, num, Toast.LENGTH_SHORT).show();
            }else if(requestCode == 1){
                String str = data.getStringExtra("string").toUpperCase();
                Toast.makeText(this, str, Toast.LENGTH_SHORT).show();
            }
        }
    }


}
