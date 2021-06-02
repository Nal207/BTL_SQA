/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.giaNuocDT;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;

/**
 *
 * @author Nal
 */
public class giaNuocDTDAOTest {
    
    public giaNuocDTDAOTest() {
    }
    
     @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
        RollBack rb = new RollBack();
        rb.RollBackGiaNuocDT();
    }
    @Test
    public void testGetAllgiaNuocDT() {    
        giaNuocDTDAO instance = new giaNuocDTDAO();
        int expResult = 12;
        List<giaNuocDT> result = instance.getAllgiaNuocDT();
        assertEquals(expResult, result.size());
    }

    @Test
    public void testGetGiaNuocById1() {
        String id = "1";
        giaNuocDTDAO instance = new giaNuocDTDAO();
        giaNuocDT expResult = new giaNuocDT(1,"Co quan hanh chinh",10900,2019);
        giaNuocDT result = instance.getGiaNuocById(id);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetGiaNuocById2() {
        String id = "";
        giaNuocDTDAO instance = new giaNuocDTDAO();
        giaNuocDT result = instance.getGiaNuocById(id);
        giaNuocDT u = new giaNuocDT();
        assertEquals(u, result);
    }
    
    @Test
    public void testGetGiaNuocById3() {
        String id = "1000";
        giaNuocDTDAO instance = new giaNuocDTDAO();
        giaNuocDT result = instance.getGiaNuocById(id);
        giaNuocDT u = new giaNuocDT();
        assertEquals(u, result);
    }

    @Test
    public void testGetGiaNuocIDMax() {
        giaNuocDTDAO instance = new giaNuocDTDAO();
        giaNuocDT u = new giaNuocDT(12,"Don vi kinh doanh - dich vu",21300,2022);
        giaNuocDT u1 = instance.getGiaNuocIDMax();
        assertEquals(u, u1);      
    }

    @Test
    public void testAddGiaNuocCN1() {
        
        String doiTuong = "ho ngheo";
        String donGia = "5600";
        String namApdung = "2020";
        giaNuocDTDAO instance = new giaNuocDTDAO();
        String expResult = "Thêm thành công";
        String result = instance.addGiaNuocDT(doiTuong, donGia, namApdung);
        giaNuocDT u = instance.getGiaNuocIDMax();
        assertEquals(expResult, result);    
    }
    @Test
    public void testAddGiaNuocCN2() {
        
        String doiTuong = "ho ngheo";
        String donGia = "5600";
        String namApdung = "2020";
        giaNuocDTDAO instance = new giaNuocDTDAO();
        instance.addGiaNuocDT(doiTuong, donGia, namApdung);
        giaNuocDT u = instance.getGiaNuocIDMax();
        giaNuocDT u1 = new giaNuocDT(u.getId(), doiTuong, 5600, 2020);
        assertEquals(u, u1);    
    }
    
    @Test
    public void testAddGiaNuocCN3() {
        
        String doiTuong = "ho ngheo";
        String donGia = "5600";
        String namApdung = "khong phai so";
        giaNuocDTDAO instance = new giaNuocDTDAO();
        String expResult = "Thêm không thành công";
        String result = instance.addGiaNuocDT(doiTuong, donGia, namApdung);
        assertEquals(expResult, result);    
    }
    @Test
    public void testDeleteGiaNuocCN1() {
        String id="5";
        giaNuocDTDAO instance = new giaNuocDTDAO();  
        String expResult = "Xóa thành công";
        String result = instance.deleteGiaNuocDT(id);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testDeleteGiaNuocCN2() {
        String id="5";
        giaNuocDTDAO instance = new giaNuocDTDAO();
        
        instance.deleteGiaNuocDT(id);
        giaNuocDT u2 = instance.getGiaNuocById(id);
        giaNuocDT u1 = new giaNuocDT();
        assertEquals(u1, u2);
    }
    
    @Test
    public void testDeleteGiaNuocCN3() {
        giaNuocDTDAO instance = new giaNuocDTDAO();
        String expResult = "Xóa không thành công";
        String result = instance.deleteGiaNuocDT("1000");
        assertEquals(expResult, result);
    }


    @Test
    public void testEditGiaNuocCN1() {
        String doiTuong = "ho ngheo";
        String donGia = "5600";
        String namApdung = "2020";
        String id = "5";
        giaNuocDTDAO instance = new giaNuocDTDAO();   
        String expResult = "Cập nhật thành công";
        String result = instance.editGiaNuocDT(doiTuong, donGia, namApdung,id);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testEditGiaNuocCN2() {
        String doiTuong = "ho ngheo";
        String donGia = "5600";
        String namApdung = "2020";
        String id = "5";
        giaNuocDTDAO instance = new giaNuocDTDAO();       
        instance.editGiaNuocDT(doiTuong, donGia, namApdung,id);
        
        giaNuocDT u1 = instance.getGiaNuocById(id);
        giaNuocDT u2 = new giaNuocDT(5, doiTuong, 5600, 2020);
        
        assertEquals(u1, u2);
    }
    
    @Test
    public void testEditGiaNuocCN3() {
        String doiTuong = "ho ngheo";
        String donGia = "5600";
        String namApdung = "khong phai so";
        String id ="5";
        giaNuocDTDAO instance = new giaNuocDTDAO();
        String expResult = "Cập nhật không thành công";
        String result = instance.editGiaNuocDT(doiTuong, donGia, namApdung,id);
        assertEquals(expResult, result);
    }
}
