package com.example.recorder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    public void  RecordNow(View view){
        Toast.makeText(this, "Recording Started", Toast.LENGTH_SHORT).show();
    }
    public void  DeleteNow(View view){
        Toast.makeText(this, "Deleted Successfully", Toast.LENGTH_SHORT).show();
    }
    public void  NeNow(View view){
        Toast.makeText(this, "New optimised", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
