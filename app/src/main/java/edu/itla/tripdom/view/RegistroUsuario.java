package edu.itla.tripdom.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


import edu.itla.tripdom.Entity.TipoUsuario;
import edu.itla.tripdom.Entity.Usuarios;
import edu.itla.tripdom.R;

public class RegistroUsuario extends AppCompatActivity {

    private static final String LOG_T = "RegistroUsuario";
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_usuario);
        final EditText txtNombre = findViewById(R.id.txtNombre);
        final EditText txtEmail = findViewById(R.id.txtEmail);
        final EditText txtTelefono = findViewById(R.id.txtTelefono);
        Button btnGuardar = findViewById(R.id.btnGuardar);

        btnGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Usuarios usuario = new Usuarios();

                usuario.setNombreUsuario(txtNombre.getText().toString());
                usuario.setEmail(txtEmail.getText().toString());
                usuario.setTelefono(txtTelefono.getText().toString());
                usuario.setTipoUsuario(TipoUsuario.PUBLICADOR);
                Log.i(LOG_T, usuario.toString());
            }
        });


    }
}
