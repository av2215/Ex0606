package com.example.ex0606;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int shaked1;
    Button btn;
    Random ron;
    ImageView iv;
    String st;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn.findViewById(R.id.btn);
        iv.findViewById(R.id.iv);
        ron=new Random();
    }

    public void go(View view)
    {
        btn.setTextSize(50);
        shaked1=ron.nextInt(3)+1;
        btn.setText(shaked1);
        st=shaked1+ "";
        if(shaked1==1)
        {
            iv.setImageResource(R.drawable.one);
        }
        else if(shaked1==2)
        {
            iv.setImageResource(R.drawable.two);
        }
        else
        {
            iv.setImageResource(R.drawable.three);

        }


    }
}
