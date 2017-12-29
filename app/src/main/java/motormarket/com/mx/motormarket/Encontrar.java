package motormarket.com.mx.motormarket;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import motormarket.com.mx.motormarket.R;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class Encontrar extends ActionBarActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_encontrar);
    }

    public void regresar(View v){
        Intent secundario= new Intent(this, MainActivity.class);
        startActivity(secundario);
    }

    //Botones
    public void btnmap1(View v){
        Intent secundario= new Intent(this, MapsGas.class);
        startActivity(secundario);
    }
    public void btnmap2(View v){
        Intent secundario= new Intent(this, MapsTaller.class);
        startActivity(secundario);
    }
    public void btnmap3(View v){
        Intent secundario= new Intent(this, MapsRefaccion.class);
        startActivity(secundario);
    }
    public void btnmap4(View v){
        Intent secundario= new Intent(this, Maps_Autoboutique.class);
        startActivity(secundario);
    }
    public void btnmap5(View v){
        Intent secundario= new Intent(this, MapsLlanteras.class);
        startActivity(secundario);
    }
    public void btnmap6(View v){
        Intent secundario= new Intent(this, MapsVulcanizadoras.class);
        startActivity(secundario);
    }
    public void btnmap7(View v){
        Intent secundario= new Intent(this, MapsAutolavado.class);
        startActivity(secundario);
    }
    public void btnmap8(View v){
        Intent secundario= new Intent(this, MapsEstacionamientos.class);
        startActivity(secundario);
    }
    public void btnmap9(View v){
        Intent secundario= new Intent(this, MapsAgencias.class);
        startActivity(secundario);
    }
    public void btnmap10(View v){
        Intent secundario= new Intent(this, MapsSitiostaxi.class);
        startActivity(secundario);
    }
    //Fin Botones


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.encontrar, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
