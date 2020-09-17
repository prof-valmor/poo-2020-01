/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.oprofvalmor.cliente2.modelo;

import com.google.gson.JsonSyntaxException;

/**
 *
 */
public interface ComunicadorListener {
    
    void onMenssagemChegandoDoServidor(String message) throws JsonSyntaxException;
    
}
