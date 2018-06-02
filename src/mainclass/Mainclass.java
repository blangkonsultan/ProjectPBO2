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
import view.view_home;

/**
 *
 * @author Bagas
 */
public class Mainclass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        view.view_home view = new view_home();
        model.m_login model = new m_login();
        new c_form_login(view, model);

    }

}
