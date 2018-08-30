/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author Marcos
 */
public interface IModelo {
    public void agregar (double numero);
    public void agregarsimbolo (String simbolo);
    public void borrar();
    public double operacion();
    public double realizaroperacion();
}
