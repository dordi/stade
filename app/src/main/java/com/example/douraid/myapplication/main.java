package com.example.douraid.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

/**
 * Created by douraid on 22/02/15.
 */
public class main extends Activity implements View.OnClickListener{

    Button getmap;
    RadioGroup a;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        getmap = (Button)findViewById(R.id.getmap1);
        a = (RadioGroup)findViewById(R.id.radio);
        getmap.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        int id = a.getCheckedRadioButtonId();
        Intent i = new Intent(this,MapsActivity.class);
        if (id == -1){
            Toast.makeText(this,"check your favorite stadium",Toast.LENGTH_SHORT).show();
        }
        else{
            switch (id){
                case 1: {i.putExtra("coordone",34.42278);i.putExtra("coordone1",8.77166);} break;
                case 2:{i.putExtra("coordone",36.76679);i.putExtra("coordone1",10.28393);}break;
                case 3:{i.putExtra("coordone",37.027865);i.putExtra("coordone1",9.86586);}break;
                case 4:{i.putExtra("coordone",34.73363);i.putExtra("coordone1",10.74628);}break;
                case 5:{i.putExtra("coordone",35.73952);i.putExtra("coordone1",10.58852);}break;
            }
            startActivity(i);
        }
    }
}
