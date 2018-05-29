/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainclass;

import controller.c_form_login;
import java.sql.SQLException;
import model.m_login;
import view.view_form_login;

/**
 *
 * @author Bagas
 */
public class Mainclass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        view.view_form_login view = new view_form_login();
        model.m_login model = new m_login();
        controller.c_form_login control = new c_form_login(view, model);
//        view.setVisible(true);
    }
    
}
