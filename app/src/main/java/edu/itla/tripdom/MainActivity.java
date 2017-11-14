package edu.itla.tripdom;

import android.content.Intent;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText txtName = findViewById(R.id.txtName);
        Button btnSave = findViewById(R.id.btnSave);

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*Toast message  = Toast.makeText(MainActivity.this, "Hola " + txtName.getText(), Toast.LENGTH_LONG);
                message.show();*/
                Intent intentar = new Intent(MainActivity.this, Visualize.class);
                intentar.putExtra("Nombre", txtName.getText().toString());
                startActivity(intentar);


            }
        });
    }

}