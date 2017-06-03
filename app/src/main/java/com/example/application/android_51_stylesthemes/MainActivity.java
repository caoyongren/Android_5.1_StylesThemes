package com.example.application.android_51_stylesthemes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_styled);
    }
}
/*
 * style.xml属性parent:
 *   就是继承： 对父类进行扩展；
 *
 *   <style name="BaseStyle" />
 *   <style name="NewStyle" parent="BaseStyle" />
 *   NewStyle就是BaseStyle的扩展。
 * */