/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.creacionales.factory;

import patrones.creacionales.factory.impl.EmptyConnection;
import patrones.creacionales.factory.impl.MySQLConnection;
import patrones.creacionales.factory.impl.OracleConnection;
import patrones.creacionales.factory.impl.PostgreSQLConnection;
import patrones.creacionales.factory.impl.SQLServerConnection;
import patrones.creacionales.factory.inter.IConnection;

/**
 *
 * @author jeffersonecheverry
 */
public class ConnectionFactory {
    
    
    public IConnection getConnection(String engine) {
        
        if(null == engine){
            return new EmptyConnection();
        } else switch (engine) {
            case "MYSQL":
                return new MySQLConnection();
            case "ORACLE":
                return new OracleConnection();
            case "POSTGRE":
                return new PostgreSQLConnection();
            case "SQL":
                return new SQLServerConnection();
            default:
                break;
        }
        return new EmptyConnection();
    }
    
    
}
