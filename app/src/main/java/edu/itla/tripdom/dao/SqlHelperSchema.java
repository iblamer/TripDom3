package edu.itla.tripdom.dao;

/**
 * Created by fabio on 11/26/2017.
 */

public class SqlHelperSchema {
    public static final String USUARIO_TABLE = "CREATE TABLE IF NOT EXISTS `usuario` (" +
            "`id`INTEGER PRIMARY KEY AUTOINCREMENT," +
            "`nombre`TEXT NOT NULL," +
            "`email`TEXT NOT NULL," +
            "`telefono`TEXT NOT NULL," +
            "`tipo_usuario`TEXT NOT NULL" +
            ");";
    //Crear las otras tablas
}
