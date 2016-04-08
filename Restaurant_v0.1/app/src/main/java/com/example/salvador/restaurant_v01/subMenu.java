package com.example.salvador.restaurant_v01;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


public class subMenu extends ActionBarActivity {

    private TextView comida_1,comida_2,comida_3,comida_4;
    private TextView titulo;
    private ImageView comida_a,comida_b,comida_c,comida_d;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_menu);

        Bundle bundle = getIntent().getExtras();

        titulo = (TextView)findViewById(R.id.titulo);

        switch (bundle.getString("param")){
            case "carne":
                cargarCarne();
                break;
            case "mariscos":
                cargarMariscos();
                break;

            case "bebidas":
                cargarBebidas();
                break;

            case "postre":
                cargarPostres();
                break;

        }


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_sub_menu, menu);
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

    private void cargarCarne(){

        titulo.setText("CARNE");

        comida_1 = (TextView) findViewById(R.id.comida1);
        comida_2 = (TextView) findViewById(R.id.comida2);
        comida_3 = (TextView) findViewById(R.id.comida3);
        comida_4 = (TextView) findViewById(R.id.comida4);

        comida_a = (ImageView) findViewById(R.id.comidaa);
        comida_b = (ImageView) findViewById(R.id.comidab);
        comida_c = (ImageView) findViewById(R.id.comidac);
        comida_d = (ImageView) findViewById(R.id.comidad);

        comida_1.setText("Hamburguesa");
        comida_2.setText("HotDog");
        comida_3.setText("Boneless");
        comida_4.setText("Alitas");

        comida_a.setImageResource(R.mipmap.c_hambur_p);
        comida_b.setImageResource(R.mipmap.c_dogo_p);
        comida_c.setImageResource(R.mipmap.c_boneless_p);
        comida_d.setImageResource(R.mipmap.c_alitas_p);

        comida_a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(subMenu.this, descripComida.class);
                Bundle bundle = new Bundle();
                bundle.putString("titulo","Hamburguesa");

                bundle.putString("descripcion","Rica, voluminosa hamburguesa");
                bundle.putString("precio","45.00");
                intent.putExtras(bundle);
                startActivity(intent);

            }
        });

        comida_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(subMenu.this, descripComida.class);
                Bundle bundle = new Bundle();
                bundle.putString("titulo","HotDog");
                bundle.putString("descripcion","Ricos y calientes HotDog");
                bundle.putString("precio","20.00");
                intent.putExtras(bundle);
                startActivity(intent);

            }
        });

        comida_c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(subMenu.this, descripComida.class);
                Bundle bundle = new Bundle();

                bundle.putString("titulo","Boneless");
                bundle.putString("descripcion","Ricos Boneless con variedad de salsas");
                bundle.putString("precio","45.00");
                intent.putExtras(bundle);
                startActivity(intent);

            }
        });

        comida_d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(subMenu.this, descripComida.class);
                Bundle bundle = new Bundle();
                bundle.putString("titulo","Alitas");

                bundle.putString("descripcion","Deliciosas alitas asadas");
                bundle.putString("precio","60.00");
                intent.putExtras(bundle);
                startActivity(intent);

            }
        });





    }

    private void cargarMariscos(){
        titulo.setText("MARISCOS");

        comida_1 = (TextView) findViewById(R.id.comida1);
        comida_2 = (TextView) findViewById(R.id.comida2);
        comida_3 = (TextView) findViewById(R.id.comida3);
        comida_4 = (TextView) findViewById(R.id.comida4);

        comida_a = (ImageView) findViewById(R.id.comidaa);
        comida_b = (ImageView) findViewById(R.id.comidab);
        comida_c = (ImageView) findViewById(R.id.comidac);
        comida_d = (ImageView) findViewById(R.id.comidad);

        comida_1.setText("Camarones Empanizados");
        comida_2.setText("Coctel");
        comida_3.setText("Filete de Pescado");
        comida_4.setText("Sopa de Mariscos");

        comida_a.setImageResource(R.mipmap.m_cama_p);
        comida_b.setImageResource(R.mipmap.m_coctel_p);
        comida_c.setImageResource(R.mipmap.m_filete_p);
        comida_d.setImageResource(R.mipmap.m_sopa_p);

        comida_a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(subMenu.this, descripComida.class);
                Bundle bundle = new Bundle();
                bundle.putString("titulo", "Camaron Empanizado");
                bundle.putString("descripcion","Crujiente y sabrosos camarones empanizados");
                bundle.putString("precio","20.00");

                intent.putExtras(bundle);
                startActivity(intent);

            }
        });

        comida_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(subMenu.this, descripComida.class);
                Bundle bundle = new Bundle();
                bundle.putString("titulo", "Coctel de Camaron");

                bundle.putString("descripcion","Delicioso coctel de camaron con salsa de tomate");
                bundle.putString("precio","50.00");
                intent.putExtras(bundle);
                startActivity(intent);

            }
        });

        comida_c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(subMenu.this, descripComida.class);
                Bundle bundle = new Bundle();
                bundle.putString("titulo", "Filete de Pescado");
                bundle.putString("descripcion","Delicioso y crujiente");
                bundle.putString("precio","40.00");
                intent.putExtras(bundle);
                startActivity(intent);

            }
        });

        comida_d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(subMenu.this, descripComida.class);
                Bundle bundle = new Bundle();
                bundle.putString("titulo", "Sopa de Mariscos");
                bundle.putString("descripcion","Deliciosa sopa de mariscos con calamar, pescado, camaron, etc");
                bundle.putString("precio","50.00");
                intent.putExtras(bundle);
                startActivity(intent);

            }
        });
    }

    private void cargarBebidas(){
        titulo.setText("BEBIDAS");

        comida_1 = (TextView) findViewById(R.id.comida1);
        comida_2 = (TextView) findViewById(R.id.comida2);
        comida_3 = (TextView) findViewById(R.id.comida3);
        comida_4 = (TextView) findViewById(R.id.comida4);

        comida_a = (ImageView) findViewById(R.id.comidaa);
        comida_b = (ImageView) findViewById(R.id.comidab);
        comida_c = (ImageView) findViewById(R.id.comidac);
        comida_d = (ImageView) findViewById(R.id.comidad);

        comida_1.setText("Cerveza");
        comida_2.setText("Aguas de Sabores");
        comida_3.setText("Refrescos");
        comida_4.setText("Cafe");

        comida_a.setImageResource(R.mipmap.b_cervesa_p);
        comida_b.setImageResource(R.mipmap.b_agua_p);
        comida_c.setImageResource(R.mipmap.b_coca_p);
        comida_d.setImageResource(R.mipmap.b_cafe_p);


        comida_a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(subMenu.this, descripComida.class);
                Bundle bundle = new Bundle();
                bundle.putString("titulo","Cerveza");
                bundle.putString("descripcion","Bebida alcoholica refrescantemente fria");
                bundle.putString("precio","25.00");

                intent.putExtras(bundle);
                startActivity(intent);

            }
        });

        comida_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(subMenu.this, descripComida.class);
                Bundle bundle = new Bundle();
                bundle.putString("titulo","Aguas de Sabor");

                bundle.putString("descripcion","Refrescantes aguas de diferenes sabores");
                bundle.putString("precio","15.00");
                intent.putExtras(bundle);
                startActivity(intent);

            }
        });

        comida_c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(subMenu.this, descripComida.class);
                Bundle bundle = new Bundle();
                bundle.putString("titulo","Refrescos");
                bundle.putString("descripcion","Refrescos de varios sabores");
                bundle.putString("precio","15.00");
                intent.putExtras(bundle);
                startActivity(intent);

            }
        });

        comida_d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(subMenu.this, descripComida.class);
                Bundle bundle = new Bundle();
                bundle.putString("titulo","Cafe");
                bundle.putString("descripcion","Exquisito cafe 100% mexicano");
                bundle.putString("precio","40.00");
                intent.putExtras(bundle);
                startActivity(intent);

            }
        });
    }

    private void cargarPostres(){
        titulo.setText("POSTRES");

        comida_1 = (TextView) findViewById(R.id.comida1);
        comida_2 = (TextView) findViewById(R.id.comida2);
        comida_3 = (TextView) findViewById(R.id.comida3);
        comida_4 = (TextView) findViewById(R.id.comida4);

        comida_a = (ImageView) findViewById(R.id.comidaa);
        comida_b = (ImageView) findViewById(R.id.comidab);
        comida_c = (ImageView) findViewById(R.id.comidac);
        comida_d = (ImageView) findViewById(R.id.comidad);

        comida_1.setText("Gelatina");
        comida_2.setText("Pays");
        comida_3.setText("Helados");
        comida_4.setText("Pastel");

        comida_a.setImageResource(R.mipmap.p_gelatina_p);
        comida_b.setImageResource(R.mipmap.p_pay_p);
        comida_c.setImageResource(R.mipmap.p_helado_p);
        comida_d.setImageResource(R.mipmap.p_pastel_p);

        comida_a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(subMenu.this, descripComida.class);
                Bundle bundle = new Bundle();
                bundle.putString("titulo","Gelatina");
                bundle.putString("descripcion","Deliciosa gelatina de variedad de sabores");
                bundle.putString("precio","15.00");
                intent.putExtras(bundle);
                startActivity(intent);

            }
        });

        comida_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(subMenu.this, descripComida.class);
                Bundle bundle = new Bundle();
                bundle.putString("titulo","Pays");
                bundle.putString("descripcion","Exquisitos pays de diferentes texturas y sabores");
                bundle.putString("precio","20.00");
                intent.putExtras(bundle);
                startActivity(intent);

            }
        });

        comida_c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(subMenu.this, descripComida.class);
                Bundle bundle = new Bundle();
                bundle.putString("titulo","Helados");
                bundle.putString("descripcion","Delicioso helado de distintos sabores ");
                bundle.putString("precio","30.00");
                intent.putExtras(bundle);
                startActivity(intent);

            }
        });

        comida_d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(subMenu.this, descripComida.class);
                Bundle bundle = new Bundle();
                bundle.putString("titulo","Pastel") ;
                bundle.putString("descripcion","Rico pastel de chocolate");
                bundle.putString("precio","20.00");
                bundle.putString("descripcion","Pastel");
                bundle.putString("precio","20.00");
                intent.putExtras(bundle);
                startActivity(intent);

            }
        });

    }


}
