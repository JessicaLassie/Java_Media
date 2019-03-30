package fr.jl.entities;

import java.sql.Connection;

/**
 *
 * @author Jessica
 */
public class Globale {

    private static Connection cnx;
    
    public static Connection getCnx() {
        return cnx;
    }
    
    public static void setCnx(Connection cnx) {
        Globale.cnx = cnx;
    }
    
}
