package com.example.myacctivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

public class firstActivity extends Activity {

    @Override
    protected  void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.first_layout);
        Button button1 = (Button) findViewById(R.id.button_1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(firstActivity.this, "hi! you see me! ",
                        Toast.LENGTH_SHORT).show();
                //Intent intent = new Intent(firstActivity.this, secondActivity.class);
                Intent intent = new Intent("com.example.activitytest.ACTION_START");
                startActivity(intent);
                //finish();

            }
        });

    }
/*
    public boolean onCreateOptionsMenu (Menu menu){
        getMenuInflater().inflate(R.menu.newmenu, menu);
        return true;
    }

    public boolean onOptionsItemSeleted(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.add_item:
                Toast.makeText(this,"you clicked add", Toast.LENGTH_SHORT).show();
                break;
            case R.id.remove_item:
                Toast.makeText(this,"you clicked remove", Toast.LENGTH_SHORT).show();
                break;
            default:
        }
        return true;
    }
*/
}
