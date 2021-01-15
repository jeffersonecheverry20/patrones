/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.creacionales.factory.impl;

import patrones.creacionales.factory.inter.IConnection;

/**
 *
 * @author jeffersonecheverry
 */
public class PostgreSQLConnection implements IConnection {

    @Override
    public String connect() {
        return "Connect Postgres";
    }

    @Override
    public String disconnect() {
        return "Disconnect Postgres";
    }
    
}
