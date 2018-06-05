package com.example.admin.ch8_3_4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void getDate(int year, int monthOfYear, int dayOfMonth){
        TextView txv_Date = (TextView)findViewById((R.id.txv_date));
        txv_Date.setText(Integer.toString(year)+"/"+Integer.toString(monthOfYear)+"/"+Integer.toString(dayOfMonth));
    }
}