package com.edsn.cachdollars;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    SharedPreferences sharedPreferences;
    int maxRecord;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sharedPreferences = this.getSharedPreferences("com.edsn.cachdollars", Context.MODE_PRIVATE);
        maxRecord = sharedPreferences.getInt("maxRecord",0);





    }

    public void play(View view){
        Intent intent = new Intent(MainActivity.this,PlayingActivity.class);
        intent.putExtra("maxRecord",maxRecord)
        startActivity(intent);

    }

}