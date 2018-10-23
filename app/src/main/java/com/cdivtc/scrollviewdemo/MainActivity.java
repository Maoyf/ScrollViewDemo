package com.cdivtc.scrollviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    //第一步：定义全局变量（控件变量和数组）
    private LinearLayout linearLayout;
    private int[] image={R.drawable.watermelon_pic,R.drawable.strawberry_pic,
            R.drawable.pineapple_pic,R.drawable.pear_pic,R.drawable.orange_pic,
            R.drawable.mango_pic,R.drawable.grape_pic,R.drawable.banana_pic,
            R.drawable.apple_pic,R.drawable.cherry_pic};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
    }

    private void findViews() {
        linearLayout = findViewById(R.id.linearLayout);
        for (Integer id: image) {
            linearLayout.addView(addImage(id));
        }
    }

    private View addImage(Integer id) {
        //1.动态创建LinearLayout控件
        LinearLayout layout = new LinearLayout(getApplicationContext());//获取当前应用的上下文
        layout.setLayoutParams(new LinearLayout.LayoutParams(200,200));//设置LinearLayout的宽和高
        layout.setGravity(Gravity.CENTER);//设置对齐方式为居中
        //2.动态创建ImageView控件
        ImageView imageView = new ImageView(getApplicationContext());
        imageView.setLayoutParams(new LinearLayout.LayoutParams(100,100));//设置ImageView的宽和高
        imageView.setImageResource(id);//将id作为ImageView控件图片来源
        //3.将ImageView控件加入到LinearLayout控件布局中
        layout.addView(imageView);
        return layout;
    }
}
