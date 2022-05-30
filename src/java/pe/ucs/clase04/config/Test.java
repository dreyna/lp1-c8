/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pe.ucs.clase04.config;

import com.google.gson.Gson;
import pe.ucs.clase04.dao.PostDao;
import pe.ucs.clase04.daoImpl.PostDaoImpl;
import pe.ucs.clase04.entity.Post;

/**
 *
 * @author admin
 */
public class Test {
  static PostDao udao = new PostDaoImpl();
  static Gson gson = new Gson();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        if(Conexion.getConexion()!=null){
            System.out.println("SI hay conexión");
        }else{
            System.out.println("NO hay conexión");
        }
        listar();
    }
    static void listar(){
        System.out.println(gson.toJson(udao.readAll()));
    }
    static void save(){
        System.out.println(udao.create(new Post(0, "HTML", "Es un lenguaje de etiquetas")));
    }
    static void editar(){
        System.out.println(udao.update(new Post(7, "HTML5", "Es un lenguaje de etiquetas que soporta diferentes dispositivos")));    
    }
    static void delete(){
        System.out.println(udao.delete(7));    
    }
    static void read(){
        System.out.println(gson.toJson(udao.read(1)));
    }
}
