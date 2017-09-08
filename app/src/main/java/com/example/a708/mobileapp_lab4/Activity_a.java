package com.example.a708.mobileapp_lab4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Activity_a extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);
        initialize();
    }

    public void initialize(){
        final EditText editText = (EditText) findViewById(R.id.editText_a);
        Button btn_ok = (Button) findViewById(R.id.btn_okA);

        btn_ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String t = editText.getText().toString();
                onClickOK(t);
            }
        });

    }

    public void onClickOK(String num_str){
        Intent i = new Intent(this, MainActivity.class);
        i.putExtra("number", Integer.parseInt(num_str));
        setResult(RESULT_OK, i);
        finish();
    }


}
