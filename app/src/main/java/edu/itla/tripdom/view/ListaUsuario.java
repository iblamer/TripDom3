package edu.itla.tripdom.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import edu.itla.tripdom.Entity.Usuarios;
import edu.itla.tripdom.R;
import edu.itla.tripdom.dao.UsuarioDbo;
import edu.itla.tripdom.view.listadapter.UsuarioListAdapter;

public class ListaUsuario extends AppCompatActivity {
    public static final String LOT_T = "ListaUsuario";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista__usuario);
        Button btnAgregar = findViewById(R.id.btnAgregarUsuario);
        ListView listviewUsuario = findViewById(R.id.listviewUsuario);

        UsuarioDbo usuarioDbo = new UsuarioDbo(this);
        final List<Usuarios> usuarios = usuarioDbo.buscar();

        Log.i(LOT_T, " Cantidad de usuarios = " + usuarios.size());

        ListView listview = findViewById(R.id.listviewUsuario);

        listview.setAdapter(new UsuarioListAdapter(usuarios, this));


       btnAgregar.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent intentar = new Intent(ListaUsuario.this, RegistroUsuario.class);


                startActivity(intentar);



            }
        });

       listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               Usuarios u =(Usuarios) parent.getItemAtPosition(position);

               Intent intentar = new Intent(ListaUsuario.this, RegistroUsuario.class);
               intentar.putExtra("usuario", u);

               startActivity(intentar);


           }
       });
    }
}
