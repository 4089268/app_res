package com.example.salvador.restaurant_v01;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TimePicker;

import org.ksoap2.SoapEnvelope;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.HttpTransportSE;
import org.xmlpull.v1.XmlPullParserException;

import java.io.IOException;


public class recervacion extends ActionBarActivity {
    private static DatePicker date;
    private static EditText hora;
    private static EditText min;
    private static EditText nombre;
    private static EditText apell;

    private static  String url = "http://192.168.173.1/RestRes/Service.asmx?WSDL";
    private static  String namespace = "www.tec.com";
    private static  String metodo = "nuevaReservacion";
    private static  String accionSoap = "www.tec.com/nuevaReservacion";

    private ProgressDialog dialogo;

    static String mensajefn = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recervacion);

        date = (DatePicker) findViewById(R.id.datePicker);
        hora = (EditText) findViewById(R.id.editTextHora);
        min = (EditText) findViewById(R.id.editTextMinuto);

        nombre = (EditText) findViewById(R.id.edtxt_nombre);
        apell = (EditText) findViewById(R.id.edtxt_apellido);

        findViewById(R.id.buttonRes).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new asyRes().execute();
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_recervacion, menu);
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

    public static boolean consumirServicioWeb(){
        boolean x = true;

        int hr = Integer.parseInt(hora.getText().toString());
        int mn = Integer.parseInt(min.getText().toString());
        String nm = nombre.getText().toString();
        String ap = apell.getText().toString();


        if(hr >0 && nm != "" && ap != "" && nm != " "  && ap != " "){
            try {

                SoapObject request  = new SoapObject(namespace,metodo);
                SoapSerializationEnvelope sobre = new SoapSerializationEnvelope(SoapEnvelope.VER11);
                sobre.dotNet = true;
                sobre.setOutputSoapObject(request);
                request.addProperty("dia",date.getDayOfMonth());
                request.addProperty("mes", date.getMonth());
                request.addProperty("ano", date.getYear());
                request.addProperty("hora", hr);
                request.addProperty("min", mn);
                request.addProperty("nombre", nm);
                request.addProperty("apellido",ap);

                HttpTransportSE transporte = new HttpTransportSE(url);
                transporte.call(accionSoap, sobre);

            } catch (IOException e) {
                e.printStackTrace();
                x=false;
                mensajefn = "Error al conectarse con el servidor...";
            } catch (XmlPullParserException e) {
                e.printStackTrace();
                x=false;
                mensajefn = "Error al conectarse con el servidor...";
            }

        }else{
            mensajefn = "Datos de entrada Incorrectos";
            x=false;
        }

        return x;
    }

    private void mostrarMensaje(String mns){
        AlertDialog alertDialog;
        alertDialog = new AlertDialog.Builder(this).create();
        alertDialog.setTitle("Restaurante");
        alertDialog.setMessage(""+mns);
        alertDialog.show();

    }

    class asyRes extends AsyncTask <String,String,String>{
        @Override
        protected void onPreExecute() {
            //super.onPreExecute();
            dialogo = new ProgressDialog(recervacion.this);
            dialogo.setMessage("Haciendo la reservacion...");
            dialogo.setIndeterminate(false);
            dialogo.setCancelable(false);
            dialogo.show();
        }

        @Override
        protected String doInBackground(String... params) {
            if(consumirServicioWeb()){
                return "ok";
            }else{
                return "err";
            }
        }

        @Override
        protected void onPostExecute(String s) {
            //super.onPostExecute(s);
            dialogo.dismiss();
            if(s.equals("ok")){
                mostrarMensaje("Reservacionn exitosa");
            }else{
                mostrarMensaje(mensajefn);
            }
        }
    }

}
