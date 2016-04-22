/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifunpas.junitTest;

import com.ifunpas.model.Mahasiswa;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author sb604-12
 */
public class JUnitTest {
    Mahasiswa mhs = new Mahasiswa();
    @Before
    public void before(){
        mhs.setNama("heru");
        mhs.setNrp("133040038");
        mhs.setIpk(3.7);
    }
    @Test
    public void test1(){
        mhs.setNama(null);
        Assert.assertNotNull("seharusnya ",mhs.getNama());
    }
    @Test
    public void test2(){
        mhs.setNrp("133040038");
        Assert.assertNull("seharusnya tidak null",mhs.getNrp());
    }
    @Test
    public void test3(){
        Assert.assertNotSame("seharusnya sama", 'B', mhs.hitungIpk());
    }
    
}
