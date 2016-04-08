package com.example.salvador.restaurant_v01;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.view.View;

public class menu extends ActionBarActivity {
    private ImageView imageButton1,imageButton2,imageButton3,imageButton4,imageButton5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        imageButton1 = (ImageView) findViewById(R.id.comida_AButtton);
        imageButton2 = (ImageView) findViewById(R.id.comida_BButtton);
        imageButton3 = (ImageView) findViewById(R.id.bebida_AButtton);
        imageButton5 = (ImageView) findViewById(R.id.postreButtton);

        imageButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(menu.this,subMenu.class);
                Bundle bundle = new Bundle();
                bundle.putString("param", "carne");
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(menu.this,subMenu.class);
                Bundle bundle = new Bundle();
                bundle.putString("param", "mariscos");
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

        imageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(menu.this,subMenu.class);
                Bundle bundle = new Bundle();
                bundle.putString("param", "bebidas");
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

        imageButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(menu.this,subMenu.class);
                Bundle bundle = new Bundle();
                bundle.putString("param", "postre");
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
