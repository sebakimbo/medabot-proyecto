
package Modelo;

import java.util.ArrayList;
import Controlador.*;
import java.lang.Math.*;


public class Batalla {
   private Medaboot jugador1;
   private Medaboot jugador2;
   private ArrayList<Medaboot> personajes;
   private String ganador;
   private String perdedor;
   private ArrayList<Medaparte> partes;
   private ArrayList<String> mensajes;
  
    
    public Batalla (Medaboot jugador1,Medaboot jugador2){
        this.partes=new ArrayList<Medaparte>();
        this.mensajes=new ArrayList<String>();
        
        this.jugador1= jugador1;
        this.jugador2=jugador2;
        this.personajes=new ArrayList();
        personajes.add(this.jugador1);
        personajes.add(this.jugador2);
        
    }
    

    public Medaboot getJugador1() {
        return jugador1;
    }

    public Medaboot getJugador2() {
        return jugador2;
        
    }

    public ArrayList<Medaparte> getPartes() {
        return partes;
    }

    public ArrayList<String> getMensajes() {
        return mensajes;
    }

    public String getGanador() {
        return ganador;
    }

    public String getPerdedor() {
        return perdedor;
    }

    public void setPerdedor(String perdedor) {
        this.perdedor = perdedor;
    }

    public void setGanador(String ganador) {
        this.ganador = ganador;
    }
    

    public void setPartes() {
        this.partes.clear();
    }

    public void setMensajes() {
        this.mensajes.clear();
    }
    //Se encarga de asignar una medaparte al azar al ganador
    public void asignarMedaparte(Medaboot personajeG,Medaboot personajeP){
        int valorEntero = (int) Math.floor(Math.random()*(5-1+1)+1);// Valor entre M y N, ambos incluidos.
        Medaparte parte=personajeP.getArmadura().get(valorEntero);
        
    }
     public int getPorcent(Medaboot personaje){
        int porcent=(personaje.getSalud()*100)/personaje.getSaludMax();
        return porcent;
    
    }
     public void restablecerAtaque(Medaboot personaje){
               personaje.getBrazoDer().setAtaque(-10);
               personaje.getBrazoIzq().setAtaque(-10);
               personaje.getPiernaDer().setAtaque(-10);
               personaje.getPiernaIzq().setAtaque(-10);
               personaje.getCabeza().setAtaque(-10);
     }
     public void restablecerEsquive(Medaboot personaje){
         int EsquiveA=personaje.getEsquive();
          personaje.setEsquive((EsquiveA+-100));
     }
     public void restablecerPh(Medaboot personaje){
         personaje.setPh(10);
     }
     public void restablecerVida(Medaboot personaje){
         personaje.setSaludF();
         personaje.getBrazoDer().setSalud();
               personaje.getBrazoIzq().setSalud();
               personaje.getPiernaDer().setSalud();
               personaje.getPiernaIzq().setSalud();
               personaje.getCabeza().setSalud();
         
         
     }
     
     
    

  
    public ArrayList definirPrimero(ArrayList personajes){
        
        return personajes;
    }
    public ArrayList getPersonajes(){
        return this.personajes;
    }
    //Metodo que se encarga de verificar la  medafuerza de los persoanjes
    // De ser el caso, este se encarga de activarla
    public void activarMedafuerza(Medaboot personaje, Medaboot personaje2, int turno){
        System.out.println("MEDALLA"+personaje.getMedalla().getCarga());
        System.out.println("MEDALLA"+personaje.getMedalla().getPotenciador());
        if(personaje.getMedalla().getCarga().equals("Venganza")){
           if(personaje.getMedalla().getMedaFuerza().equals("Velocidad")){
                if(getPorcent(personaje)<=75 &&getPorcent(personaje)>50 && personaje.getLlamadoMeda() <=1 ){
                    int EsquiveA=personaje.getEsquive();
                    personaje.setEsquive((EsquiveA+100));
                    personaje.setLlamadoMeda();
                }
                else if(getPorcent(personaje)<=50 &&getPorcent(personaje)>25 && personaje.getLlamadoMeda() <=2){
                    int EsquiveA=personaje.getEsquive();
                    personaje.setEsquive((EsquiveA+100));
                    personaje.setLlamadoMeda(); 
                }
                else if(getPorcent(personaje)<=25 &&getPorcent(personaje)>0 && personaje.getLlamadoMeda() <=3){
                    int EsquiveA=personaje.getEsquive();
                    personaje.setEsquive((EsquiveA+100));
                    personaje.setLlamadoMeda(); 
                }
            }
           else{
                if(getPorcent(personaje)<=75 &&getPorcent(personaje)>50 && personaje.getLlamadoMeda() <=1 ){
                    personaje.setPh(20);
                    personaje.setLlamadoMeda();
                }
                else if(getPorcent(personaje)<=50 &&getPorcent(personaje)>25 && personaje.getLlamadoMeda() <=2){
                    personaje.setPh(20);
                    personaje.setLlamadoMeda(); 
                }
                else if(getPorcent(personaje)<=25 &&getPorcent(personaje)>0 && personaje.getLlamadoMeda() <=3){
                    personaje.setPh(20);
                    personaje.setLlamadoMeda(); 
                }
           }
            
            
            
        }
        else if(personaje.getMedalla().getCarga().equals("Racha")){
            if(getPorcent(personaje2)<=75 &&getPorcent(personaje2)>50 && personaje2.getLlamadoMeda() <=1 ){
               personaje.getBrazoDer().setAtaque(10);
               personaje.getBrazoIzq().setAtaque(10);
               personaje.getPiernaDer().setAtaque(10);
               personaje.getPiernaIzq().setAtaque(10);
               personaje.getCabeza().setAtaque(10);
               personaje2.setLlamadoMeda();
            }
            else if(getPorcent(personaje2)<=50 &&getPorcent(personaje2)>25 && personaje2.getLlamadoMeda() <=2){
               personaje.getBrazoDer().setAtaque(10);
               personaje.getBrazoIzq().setAtaque(10);
               personaje.getPiernaDer().setAtaque(10);
               personaje.getPiernaIzq().setAtaque(10);
               personaje.getCabeza().setAtaque(10);
                personaje2.setLlamadoMeda(); 
            }
            else if(getPorcent(personaje2)<=25 &&getPorcent(personaje2)>0 && personaje2.getLlamadoMeda() <=3){
               personaje.getBrazoDer().setAtaque(10);
               personaje.getBrazoIzq().setAtaque(10);
               personaje.getPiernaDer().setAtaque(10);
               personaje.getPiernaIzq().setAtaque(10);
               personaje.getCabeza().setAtaque(10);
               personaje.setLlamadoMeda(); 
            }
        }
        
        else if(personaje.getMedalla().getCarga().equals("Concentracion")){
            if(turno==15){
                personaje.masSalud((personaje.getSaludMax()*100)/25);
                personaje.getBrazoDer().masSalud((personaje.getBrazoDer().getSaludMax()*100)/25);
                personaje.getBrazoIzq().masSalud((personaje.getBrazoIzq().getSaludMax()*100)/25);
                personaje.getPiernaIzq().masSalud((personaje.getPiernaIzq().getSaludMax()*100)/25);
                personaje.getPiernaDer().masSalud((personaje.getPiernaDer().getSaludMax()*100)/25);
                personaje.getCabeza().masSalud((personaje.getCabeza().getSaludMax()*100)/25);
                
            }
        }
        
    }
    
        
    
    // Metodo que ejecuta las acciones de cada personaje, tales como atacar , con cada medaparte 
    // y modificar sus puntos de vida, dependiendo de la defensa
    public void ejecutarAcciones(ArrayList<ArrayList> ataques,ArrayList<ArrayList> contraAtaques,Medaboot personajeO,Medaboot personajeA,String Adef,String Aesquive){
        int dañoTotal=0;
        int defTotal=0;
        for(ArrayList<Medaparte> accion:ataques){
            int daño= accion.get(0).getAtaque();
            int def=accion.get(1).getDefensa();
           
            if(daño>def){
                //Misiles rastreadores
                if(accion.get(0).getHabilidad().equals("Misiles rastreadores")){
                     accion.get(1).setSalud(daño, def);
                     for(Medaparte parte:personajeO.getArmadura()){
                         if(!parte.equals(accion.get(1))){
                             parte.setSalud((daño*30)/100, parte.getDefensa());
                         }
                     }
                     dañoTotal+=daño;
                } 
                //Regeneracion
                else if(accion.get(0).getHabilidad().equals("Regeneracion")){
                    accion.get(1).setSalud(daño, def);
                    personajeA.masSalud((5*personajeA.getSaludMax())/100);
                    for(Medaparte parte: personajeA.getArmadura()){
                        parte.masSalud((5*parte.getSaludMax())/100);
                    }
                    dañoTotal+=daño;
                }
                //Anti aeros que cancelan el ataque de misiles rastreadores y develven su daño
                else if(accion.get(0).getHabilidad().equals("Anti aereos")){
                    for(ArrayList<Medaparte> contraAtaque:contraAtaques){
                        if(contraAtaque.get(0).getHabilidad().equals("Misiles Rastreadores")){
                            accion.get(1).setSalud(contraAtaque.get(0).getAtaque(), def);
                            contraAtaque.remove(0);
                            contraAtaque.remove(1);
                            dañoTotal+=contraAtaque.get(0).getAtaque();
                        }
                    }
                }
                //Cuerpo a cuerpo o Disparo
                else{
                    accion.get(1).setSalud(daño,def);
                    this.partes.add(accion.get(1));
                    this.mensajes.add(personajeA.getNombre()+" causa "+Integer.toString(daño-def)+" de daño con "+accion.get(1).getNombre()+" a "+accion.get(0).getNombre());
                     dañoTotal+=daño;
                }
            }
            else{
                this.partes.add(accion.get(1));
                this.mensajes.add("NO RECIBE DAÑO");
            }
           
           
        }
           if(Adef.equals("si")){
               int dafTotal=personajeO.getDefensa();
                if(defTotal>dañoTotal){
                    String mensaje2="No recibe daño";
                  
                }
                else{
                  dañoTotal-=defTotal;
                  
                }
            }
        personajeO.setSalud(dañoTotal);
        
        
        
    }
        
        
}
