package com.example.admin.buoi6;

import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.LevelListDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private ImageView imageView;
    private Button btnClick;
    private LevelListDrawable levelList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        btnClick = (Button) findViewById(R.id.btnClick);
        imageView= (ImageView) findViewById(R.id.imImage);
        btnClick.setOnClickListener(this);
//        AnimationDrawable ani= (AnimationDrawable) imageView.getDrawable();
//        ani.start();
        levelList= (LevelListDrawable) imageView.getDrawable();
    }


    @Override
    public void onClick(View v) {
        int level=levelList.getLevel();
        level++;
        if (level>2) {
            level=0;
        }
        levelList.setLevel(level);
    }
}
