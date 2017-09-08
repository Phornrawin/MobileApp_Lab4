package com.example.a708.mobileapp_lab4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ActivityB extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
        initialize();
    }

    public void initialize(){
        final EditText editText = (EditText) findViewById(R.id.editText_b);
        Button btn_ok = (Button) findViewById(R.id.btn_okB);

        btn_ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = editText.getText().toString();
                onCilkOK(s);
            }
        });
    }

    public void onCilkOK(String str){
        Intent i = new Intent(this, MainActivity.class);
        i.putExtra("string", str);
        setResult(RESULT_OK, i);
        finish();
    }
}
