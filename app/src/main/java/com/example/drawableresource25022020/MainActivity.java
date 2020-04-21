package com.example.drawableresource25022020;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

//    CheckBox mCbAndroid;
    RadioGroup radioGroup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        mCbAndroid = findViewById(R.id.checkbox);
//        mCbAndroid.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
//                if (b){
//                    Toast.makeText(MainActivity.this, "Đã check", Toast.LENGTH_SHORT).show();
//                }else{
//                    Toast.makeText(MainActivity.this, "Bỏ check", Toast.LENGTH_SHORT).show();
//                }
//            }
//        });
        radioGroup = findViewById(R.id.radioGroup);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.radioAndroid :
                        Toast.makeText(MainActivity.this, "Android", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.radioJavascript :
                        Toast.makeText(MainActivity.this, "javascript", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.radioReacttnatie :
                        Toast.makeText(MainActivity.this, "react native", Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });
    }
}
