package edu.itla.tripdom.dao;

import java.util.ArrayList;
import java.util.List;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import edu.itla.tripdom.Entity.TipoUsuario;
import edu.itla.tripdom.Entity.Usuarios;

/**
 * Created by fabio on 11/26/2017.
 */

public class UsuarioDbo {
    private DbConnection connection;

    public UsuarioDbo(Context context) {
        connection = new DbConnection(context);
    }

    public void guardar(Usuarios usuario)
    {
        SQLiteDatabase db = connection.getWritableDatabase();

        ContentValues cv = new ContentValues();
        cv.put("nombre", usuario.getNombreUsuario());
        cv.put("email", usuario.getEmail());
        cv.put("telefono", usuario.getTelefono());
        cv.put("tipo_usuario", usuario.getTipoUsuario().toString());

        if(usuario.getUsuarioId() <= 0){
            Long id = db.insert("usuario", null, cv);
            usuario.setUsuarioId(id.intValue());
        }
        else{
            db.update("usuario", cv, "id = "+ usuario.getUsuarioId(), null);
        }


        db.close();

    }

    public void editar(Usuarios usuario)
    {
        SQLiteDatabase db = connection.getWritableDatabase();

        ContentValues cv = new ContentValues();

        cv.put("nombre", usuario.getNombreUsuario());
        cv.put("email", usuario.getEmail());
        cv.put("telefono", usuario.getTelefono());
        cv.put("tipo_usuario", usuario.getTipoUsuario().toString());

        db.update("usuario", cv, "id = " + usuario.getUsuarioId(), null);

        db.close();

    }

    public void Eliminar(Usuarios usuarios)
    {
        SQLiteDatabase db = connection.getWritableDatabase();

        db.delete("usuario", "id =" + usuarios.getUsuarioId(), null);

        db.close();
    }

    public List<Usuarios> buscar() {
        List<Usuarios> lista = new ArrayList<>();

        String columnas[]= new String[]{"id", "nombre", "email", "telefono", "tipo_usuario"};

        SQLiteDatabase db = connection.getReadableDatabase();

        Cursor cursor = db.query("usuario", columnas, null, null, null, null, null);

        cursor.moveToFirst();

        while(!cursor.isAfterLast())
        {
            Usuarios u = new Usuarios();

            u.setUsuarioId(cursor.getInt(cursor.getColumnIndex("id")));
            u.setNombreUsuario(cursor.getString(cursor.getColumnIndex("nombre")));
            u.setEmail(cursor.getString(cursor.getColumnIndex("email")));
            u.setTelefono(cursor.getString(cursor.getColumnIndex("telefono")));
            u.setTipoUsuario(TipoUsuario.valueOf(cursor.getString(cursor.getColumnIndex("tipo_usuario"  ))));

            lista.add(u);

            cursor.moveToNext();
        }

        cursor.close();
        db.close();

        return lista;
    }


}
