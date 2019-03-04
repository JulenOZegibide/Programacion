/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UML;

import java.sql.Connection;

/**
 *
 * @author MARTA
 */
public class EventoDAO {
        private Connection con;

    public EventoDAO(Connection con) {
        this.con = con;
    }
}
