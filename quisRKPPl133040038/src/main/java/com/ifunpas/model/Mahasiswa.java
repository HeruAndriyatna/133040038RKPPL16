/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifunpas.model;

/**
 *
 * @author sb604-12
 */
public class Mahasiswa {
    private String nama;
    private String nrp;
    private double ipk;

    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * @return the nrp
     */
    public String getNrp() {
        return nrp;
    }

    /**
     * @param nrp the nrp to set
     */
    public void setNrp(String nrp) {
        this.nrp = nrp;
    }

    /**
     * @return the ipk
     */
    public double getIpk() {
        return ipk;
    }

    /**
     * @param ipk the ipk to set
     */
    public void setIpk(double ipk) {
        this.ipk = ipk;
    }
    
    public char hitungIpk(){
        if (ipk==4) {
            return 'A';
        } else if (ipk>3){
            return 'B';
        } else if(ipk>2){
            return 'C';
        }else if(ipk>1){
            return 'D';
        }
        return 'E';
    }
    
    
}
