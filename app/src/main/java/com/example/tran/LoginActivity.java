package com.example.tran;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {
    private EditText AET;
    private EditText PET;
    private boolean fA=false;

    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        AET=findViewById(R.id.accoutfield);
        button=findViewById(R.id.btn_preview);
        AET.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            @Override
            public void afterTextChanged(Editable s) {
                button.setEnabled(AET.getText().length() == 11);
            }
        });
    }
    public void go(View v){
        Intent intent = new Intent(this, MainActivity.class);
        //跳转
        startActivity(intent);
    }

}