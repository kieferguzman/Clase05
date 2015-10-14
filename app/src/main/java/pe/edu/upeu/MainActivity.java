package pe.edu.upeu;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends Activity {
    EditText n1, n2, r; Button button;
    int suma=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        n1= (EditText)findViewById(R.id.edtn1);
        n2=(EditText)findViewById(R.id.edtn2);
        r=(EditText)findViewById(R.id.edtr);
        button=(Button)findViewById(R.id.btncalcular);

    }
    public void sumar(View view){
        suma = Integer.parseInt(n1.getText().toString()) + Integer.parseInt(n2.getText().toString());
        r.setText(""+suma);
    }
}
