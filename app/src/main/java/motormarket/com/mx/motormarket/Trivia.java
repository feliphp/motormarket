package motormarket.com.mx.motormarket;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import motormarket.com.mx.motormarket.R;

public class Trivia extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trivia);
    }

    public void regresar(View v){
        Intent secundario= new Intent(this, MainActivity.class);
        startActivity(secundario);
    }

    public void incorrecta(View v){
        Intent secundario= new Intent(this, Incorrecta.class);
        startActivity(secundario);
    }
    public void correcta(View v){
        Intent secundario= new Intent(this, Correcta.class);
        startActivity(secundario);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.trivia, menu);
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
