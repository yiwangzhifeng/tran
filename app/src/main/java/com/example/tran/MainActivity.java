package com.example.tran;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        EditText editText=(EditText) findViewById(R.id.accout);
//        editText.setOnEditorActionListener(new TextView.OnEditorActionListener(){
//            @Override
//            public boolean onEditorAction(TextView v, int actionId, KeyEvent event){
//                if(actionId== EditorInfo.IME_ACTION_NEXT)return true;
//                return false;
//            }
//        });
    }
}