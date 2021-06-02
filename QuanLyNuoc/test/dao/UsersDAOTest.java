/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Users;
import java.util.List;
import javax.transaction.Transactional;
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

@Transactional
public class UsersDAOTest {
    
    public UsersDAOTest() {
    }
    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
        RollBack rb = new RollBack();
        rb.RollBackUser();
    }

    public void testGetAllUser() {
        UsersDAO instance = new UsersDAO();
        int expResult = 3;
        List<Users> result = instance.getAllUser();
        assertEquals(expResult, result.size());    
    }

    @Test
    public void testGetUserById1() {
        
        String id = "3";
        UsersDAO instance = new UsersDAO();
        Users expResult = new Users("3","lan","lan@gmail.com","xom1","0123456",10,50000);
        Users result = instance.getUserById(id);
        assertEquals(expResult, result);
        
    }
    @Test
    public void testGetUserById2() {
        
        String id = "";
        UsersDAO instance = new UsersDAO();
        Users expResult = new Users();
        Users result = instance.getUserById(id);
        assertEquals(expResult, result);
        
    }
    @Test
    public void testGetUserById3() {
        
        String id = "1000";
        UsersDAO instance = new UsersDAO();
        Users expResult = new Users();
        Users result = instance.getUserById(id);
        assertEquals(expResult, result);
        
    }

    @Test
    public void testGetUserIDMax() {
       
        UsersDAO instance = new UsersDAO();
        Users expResult = new Users("3","lan","lan@gmail.com","xom1","0123456",10,50000);
        Users result = instance.getUserIDMax();
        assertEquals(expResult, result);
        
    }

    
    @Test
    public void testAddUser1() {
        
        String name = "nal";
        String email = "nal@gmail.com";
        String address = "xom2";
        String phone = "0123456";
        String numberWater = "20";
        String totalMoney = "100000";
        UsersDAO instance = new UsersDAO();
        String expResult = "Thêm thành công";
        String result = instance.addUser(name, email, address, phone, numberWater, totalMoney);
        assertEquals(expResult, result);   
         
    }
    
    @Test
    public void testAddUser2() {
        
        String name = "nal";
        String email = "nal@gmail.com";
        String address = "xom2";
        String phone = "0123456";
        String numberWater = "20";
        String totalMoney = "100000";
        UsersDAO instance = new UsersDAO();
        
        instance.addUser(name, email, address, phone, numberWater, totalMoney);
        Users u = instance.getUserIDMax();
        Users u1 = new Users(u.getId(),"nal","nal@gmail.com","xom2","0123456",20,100000);
           
        assertEquals(u, u1); 
    }
    
    @Test
    public void testAddUser3() {
        
        String name = "thanh";
        String email = "thanh@gmail.com";
        String address = "xom2";
        String phone = "123456";
        String numberWater = "ko phai so";
        String totalMoney = "ko phai so";
        UsersDAO instance = new UsersDAO();
        String expResult = "Thêm không thành công";
        String result = instance.addUser(name, email, address, phone, numberWater, totalMoney);
        assertEquals(expResult, result);   
    }
    @Test
    public void testEditUser1() {
        
        String name = "nal";
        String email = "nal@gmail.com";
        String address = "xom2";
        String phone = "0123456";
        String numberWater = "20";
        String totalMoney = "100000";
        String id = "3";
        UsersDAO instance = new UsersDAO();
        String expResult = "Cập nhật thành công";
        String result = instance.editUser(name, email, address, phone, numberWater, totalMoney, id);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testEditUser2() {
        
        String name = "nal";
        String email = "nal@gmail.com";
        String address = "xom2";
        String phone = "0123456";
        String numberWater = "20";
        String totalMoney = "100000";
        String id = "3";
        UsersDAO instance = new UsersDAO();

        instance.editUser(name, email, address, phone, numberWater, totalMoney, id);
        
        Users u1  = instance.getUserById(id);
        Users u2 = new Users("3","nal","nal@gmail.com","xom2","0123456",20,100000);
        assertEquals(u1, u2);
        
    }
    
    @Test
    public void testEditUser3() {
        
        String name = "nal";
        String email = "nal@gmail.com";
        String address = "xom2";
        String phone = "0123456";
        String numberWater = "khong phai so";
        String totalMoney = "khong phai so";
        String id ="3";
        UsersDAO instance = new UsersDAO();
        String expResult = "Cập nhật không thành công";
        String result = instance.editUser(name, email, address, phone, numberWater, totalMoney,id);;
        assertEquals(expResult, result);
        
    }

    @Test
    public void testDeleteUser1() {
        String id = "3";
        UsersDAO instance = new UsersDAO();
        String expResult = "Xóa thành công";
        String result = instance.deleteUser(id);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testDeleteUser2() {
        String id = "3";
        UsersDAO instance = new UsersDAO();
        instance.deleteUser(id);
        Users u1 = instance.getUserById(id);
        Users u2 = new Users();
        assertEquals(u1, u2);
        
    }
    
    @Test
    public void testDeleteUser3() {
        
        UsersDAO instance = new UsersDAO();
        String expResult = "Xóa không thành công";
        String result = instance.deleteUser("1000");
        assertEquals(expResult, result);
        
    }

   
    
}
