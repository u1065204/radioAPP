package com.example.radiobuttonapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnOK(View view) {
        TextView txvLike = findViewById(R.id.textView2);
        RadioGroup radioGroup = findViewById(R.id.radioGroup);
        int id =radioGroup.getCheckedRadioButtonId();
        RadioButton selected =findViewById(id);
        txvLike.setText("答案是:"+selected.getText());
    }
}
