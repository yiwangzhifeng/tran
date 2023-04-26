package com.example.tran;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.TextWatcher;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {
    private EditText AET;
    private EditText PET;
    private boolean fA=false;
    private TextView textView_sign_in;
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
        textView_sign_in=findViewById(R.id.sign_in_text);

        String text = (String) textView_sign_in.getText();

        SpannableString spannableString = new SpannableString(text);

        spannableString.setSpan(new ClickableSpan() {
            @Override
            public void updateDrawState(TextPaint ds) {

                ds.setUnderlineText(false);//不要下划线（默认有下划线）
            }
            @Override
            public void onClick(View widget) {
                //Intent 启动一个Activity
                Intent intent = new Intent(LoginActivity.this, SignInActivity.class);
                //跳转
                startActivity(intent);
            }
        }, 0, text.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

        textView_sign_in.setText(spannableString);

        textView_sign_in.setMovementMethod(LinkMovementMethod.getInstance());// 可以点击

    }
    public void go(View v){
        Intent intent = new Intent(this, MainActivity.class);
        //跳转
        startActivity(intent);
    }

}