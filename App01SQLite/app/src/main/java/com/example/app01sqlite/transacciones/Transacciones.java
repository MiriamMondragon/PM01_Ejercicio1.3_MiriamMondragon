package com.example.app01sqlite.transacciones;

public class Transacciones {
    /* Tablas */
    public static final String tablaPersonas = "personas";
    /* Campos */
    public static final String id = "id";
    public static final String nombres = "nombres";
    public static final String apellidos = "apellidos";
    public static final String edad = "edad";
    public static final String correo = "correo";
    public static final String direccion = "direccion";

    /* CRUD */
    public static final String CreateTablePersonas =
            "CREATE TABLE personas(id INTEGER PRIMARY KEY AUTOINCREMENT, nombres TEXT, apellidos TEXT, edad INTEGER, correo TEXT, direccion TEXT)";
    public static final String DropeTablePersonas =
            "DROPE TABLE IF EXISTS personas";

    /* Base de Datos */
    public static final String NameDataBase = "DBCurso";
}
