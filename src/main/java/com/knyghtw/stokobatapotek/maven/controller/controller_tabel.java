/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.knyghtw.stokobatapotek.maven.controller;

/**
 *
 * @author davinky
 */
import com.knyghtw.stokobatapotek.maven.view.tabel;
import java.sql.SQLException;

public interface controller_tabel {
    public void hapus (tabel tb) throws SQLException;
    public void refTb (tabel tb) throws SQLException;
}
