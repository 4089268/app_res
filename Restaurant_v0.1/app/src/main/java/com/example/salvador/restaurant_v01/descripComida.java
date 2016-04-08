package com.example.salvador.restaurant_v01;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;

import org.w3c.dom.Text;


public class descripComida extends ActionBarActivity {
    TextView titulo;
    TextView subtit;
    TextView descp;
    TextView prc;

    ImageView imagen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_descrip_comida);

        Bundle bundle = getIntent().getExtras();

        titulo= (TextView) findViewById(R.id.ttl);
        subtit = (TextView) findViewById(R.id.subtitulo);
        descp = (TextView) findViewById(R.id.desc);
        prc  = (TextView) findViewById(R.id.precio);
        imagen =(ImageView) findViewById(R.id.img);

        titulo.setText(""+bundle.getString("titulo"));
        subtit.setText(""+bundle.getString("titulo"));

        descp.setText("Descripcion: "+bundle.getString("descripcion"));
        prc.setText("Precio:    $"+bundle.getString("precio"));



        switch(bundle.getString("titulo")){
            case "Hamburguesa":
                imagen.setImageResource(R.mipmap.c_hambur);
                break;

            case "HotDog":
                imagen.setImageResource(R.mipmap.c_dogo);
                break;

            case "Boneless":
                imagen.setImageResource(R.mipmap.c_boneless);
                break;

            case "Alitas":
                imagen.setImageResource(R.mipmap.c_alitas);
                break;

            case "Camaron Empanizado":
                imagen.setImageResource(R.mipmap.m_cama);
                break;

            case "Coctel de Camaron":
                imagen.setImageResource(R.mipmap.m_coctel);
                break;

            case "Filete de Pescado":
                imagen.setImageResource(R.mipmap.m_filete);
                break;

            case "Sopa de Mariscos":
                imagen.setImageResource(R.mipmap.m_sopa);
                break;

            case "Cerveza":
                imagen.setImageResource(R.mipmap.b_cervesa);
                break;

            case "Aguas de Sabor":
                imagen.setImageResource(R.mipmap.b_agua);
                break;

            case "Refrescos":
                imagen.setImageResource(R.mipmap.b_coca);
                break;

            case "Cafe":
                imagen.setImageResource(R.mipmap.b_cafe);
                break;

            case "Gelatina":
                imagen.setImageResource(R.mipmap.p_gelatina);
                break;

            case "Pays":
                imagen.setImageResource(R.mipmap.p_pay);
                break;

            case "Helados":
                imagen.setImageResource(R.mipmap.p_helado);
                break;

            case "Pastel":
                imagen.setImageResource(R.mipmap.p_pastel);
                break;

        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_descrip_comida, menu);
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
