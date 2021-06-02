/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.giaNuocCN;
import java.util.List;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author Nal
 */
public class giaNuocCNDAOTest {
    
    public giaNuocCNDAOTest() {
    }
    
    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
        RollBack rb = new RollBack();
        rb.RollBackGiaNuocCN();
    }
    
    @Test
    public void testGetAllgiaNuocCN() {
        giaNuocCNDAO instance = new giaNuocCNDAO();
        int expResult = 12;
        List<giaNuocCN> result = instance.getAllgiaNuocCN();
        assertEquals(expResult, result.size());
    }

    @Test
    public void testGetGiaNuocById1() {
        String id = "1";
        giaNuocCNDAO instance = new giaNuocCNDAO();
        giaNuocCN expResult = new giaNuocCN(1,"4/nguoi/thang",5600,2019);
        giaNuocCN result = instance.getGiaNuocById(id);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetGiaNuocById2() {
        String id = "";
        giaNuocCNDAO instance = new giaNuocCNDAO();
        giaNuocCN result = instance.getGiaNuocById(id);
        giaNuocCN u = new giaNuocCN();
        assertEquals(u, result);
    }
    
    @Test
    public void testGetGiaNuocById3() {
        String id = "1000";
        giaNuocCNDAO instance = new giaNuocCNDAO();
        giaNuocCN result = instance.getGiaNuocById(id);
        giaNuocCN u = new giaNuocCN();
        assertEquals(u, result);
    }

    @Test
    public void testGetGiaNuocIDMax() {
        giaNuocCNDAO instance = new giaNuocCNDAO();
        giaNuocCN u = new giaNuocCN(12,"tren 6/nguoi/thang",14400,2022);
        giaNuocCN u1 = instance.getGiaNuocIDMax();
        assertEquals(u, u1);      
    }

    @Test
    public void testAddGiaNuocCN1() {
        
        String luongNuoc = "tren 10/nguoi/thang";
        String donGia = "5600";
        String namApdung = "2020";
        giaNuocCNDAO instance = new giaNuocCNDAO();
        String expResult = "Thêm thành công";
        String result = instance.addGiaNuocCN(luongNuoc, donGia, namApdung);
        assertEquals(expResult, result);    
    }
    @Test
    public void testAddGiaNuocCN2() {
        
        String luongNuoc = "tren 10/nguoi/thang";
        String donGia = "5600";
        String namApdung = "2020";
        giaNuocCNDAO instance = new giaNuocCNDAO();
        instance.addGiaNuocCN(luongNuoc, donGia, namApdung);
        giaNuocCN u = instance.getGiaNuocIDMax();
        giaNuocCN u1 = new giaNuocCN(u.getId(),"tren 10/nguoi/thang",5600,2020);
        assertEquals(u, u1);    
    }
    
    @Test
    public void testAddGiaNuocCN3() {
        
        String luongNuoc = "tren 10/nguoi/thang";
        String donGia = "5600";
        String namApdung = "khong phai so";
        giaNuocCNDAO instance = new giaNuocCNDAO();
        String expResult = "Thêm không thành công";
        String result = instance.addGiaNuocCN(luongNuoc, donGia, namApdung);
        assertEquals(expResult, result);    
    }
    @Test
    public void testDeleteGiaNuocCN1() {
        String id = "5";
        giaNuocCNDAO instance = new giaNuocCNDAO();
        String expResult = "Xóa thành công";
        String result = instance.deleteGiaNuocCN(id);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testDeleteGiaNuocCN2() {
        String id ="5";
        giaNuocCNDAO instance = new giaNuocCNDAO();
        instance.deleteGiaNuocCN(id);
        giaNuocCN u2 = instance.getGiaNuocById(id);
        giaNuocCN u1 = new giaNuocCN();
        assertEquals(u1, u2);
    }
    
    @Test
    public void testDeleteGiaNuocCN3() {
        giaNuocCNDAO instance = new giaNuocCNDAO();
        String expResult = "Xóa không thành công";
        String result = instance.deleteGiaNuocCN("1000");
        assertEquals(expResult, result);
    }


    @Test
    public void testEditGiaNuocCN1() {
        String luongNuoc = "tren 10/nguoi/thang";
        String donGia = "5600";
        String namApdung = "2020";
        String id = "5";
        giaNuocCNDAO instance = new giaNuocCNDAO();
        String expResult = "Cập nhật thành công";
        String result = instance.editGiaNuocCN(luongNuoc, donGia, namApdung,id);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testEditGiaNuocCN2() {
        String luongNuoc = "tren 10/nguoi/thang";
        String donGia = "5600";
        String namApdung = "2020";
        String id = "5";
        giaNuocCNDAO instance = new giaNuocCNDAO();       
        instance.editGiaNuocCN(luongNuoc, donGia, namApdung,id);
        
        giaNuocCN u1 = instance.getGiaNuocById(id);
        giaNuocCN u2 = new giaNuocCN(5, luongNuoc, 5600, 2020);
        
        assertEquals(u1, u2);
    }
    
    @Test
    public void testEditGiaNuocCN3() {
        String luongNuoc = "tren 10/nguoi/thang";
        String donGia = "5600";
        String namApdung = "khong phai so";
        String id="5";
        giaNuocCNDAO instance = new giaNuocCNDAO();
        String expResult = "Cập nhật không thành công";
        String result = instance.editGiaNuocCN(luongNuoc, donGia, namApdung,id);
        assertEquals(expResult, result);
    }
}
