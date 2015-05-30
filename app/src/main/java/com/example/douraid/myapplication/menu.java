package com.example.douraid.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by douraid on 22/02/15.
 */
public class menu extends Activity implements View.OnClickListener {

    Button a;
    Button b;
    Button c;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);
        a = (Button)findViewById(R.id.btn1);
        b = (Button)findViewById(R.id.bnt2);
        c = (Button)findViewById(R.id.btn3);
        a.setOnClickListener(this);
        b.setOnClickListener(this);
        c.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;
        switch (v.getId()){
            case R.id.btn1:
                Toast.makeText(this,"TODO",Toast.LENGTH_SHORT).show();break;
            case R.id.bnt2:
                i = new Intent(this,main.class);
                startActivity(i);
                break;
            case R.id.btn3:
                Toast.makeText(this,"TODO",Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
