/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import context.ConnectDB;
import entity.Users;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Nal
 */
public class RollBack {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public void RollBackUser() {
        String query = "Truncate Table [TienNuoc].[dbo].[Users]\n"
                + "INSERT [dbo].[Users] ( [FullName], [Email], [Adress], [Phone], [NumberWater], [TotalMoney]) VALUES ( N'Sang', N'sang@gmail.com', N'Ha Noi', N'0762021466', 10, 100)\n"
                + "INSERT [dbo].[Users] ( [FullName], [Email], [Adress], [Phone], [NumberWater], [TotalMoney]) VALUES ( N'thanh', N'thanh@gmail.com', N'me linh', N'012345678', 10, 10000)\n"
                + "INSERT [dbo].[Users] ( [FullName], [Email], [Adress], [Phone], [NumberWater], [TotalMoney]) VALUES ( N'lan', N'lan@gmail.com', N'xom1', N'0123456', 10, 50000)";
        try {
            conn = new ConnectDB().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
        } catch (Exception e) {
        }
    }

    public void RollBackGiaNuocCN() {
        String query = "Truncate Table [TienNuoc].[dbo].[GiaNuocCaNhan]\n"
                + "  INSERT [dbo].[GiaNuocCaNhan] ( [luongNuoc], [donGia], [namApDung]) VALUES ( N'4/nguoi/thang', 5600, 2019)\n"
                + "INSERT [dbo].[GiaNuocCaNhan] ( [luongNuoc], [donGia], [namApDung]) VALUES ( N'4/nguoi/thang', 6000, 2020)\n"
                + "INSERT [dbo].[GiaNuocCaNhan] ( [luongNuoc], [donGia], [namApDung]) VALUES ( N'4/nguoi/thang', 6300, 2021)\n"
                + "INSERT [dbo].[GiaNuocCaNhan] ( [luongNuoc], [donGia], [namApDung]) VALUES ( N'4/nguoi/thang', 6700, 2022)\n"
                + "INSERT [dbo].[GiaNuocCaNhan] ( [luongNuoc], [donGia], [namApDung]) VALUES ( N'4-6/nguoi/thang', 10800, 2019)\n"
                + "INSERT [dbo].[GiaNuocCaNhan] ( [luongNuoc], [donGia], [namApDung]) VALUES ( N'4-6/nguoi/thang', 11500, 2020)\n"
                + "INSERT [dbo].[GiaNuocCaNhan] ( [luongNuoc], [donGia], [namApDung]) VALUES ( N'4-6/nguoi/thang', 12100, 2021)\n"
                + "INSERT [dbo].[GiaNuocCaNhan] ( [luongNuoc], [donGia], [namApDung]) VALUES ( N'4-6/nguoi/thang', 12900, 2022)\n"
                + "INSERT [dbo].[GiaNuocCaNhan] ( [luongNuoc], [donGia], [namApDung]) VALUES ( N'tren 6/nguoi/thang', 12100, 2019)\n"
                + "INSERT [dbo].[GiaNuocCaNhan] ( [luongNuoc], [donGia], [namApDung]) VALUES ( N'tren 6/nguoi/thang', 12800, 2020)\n"
                + "INSERT [dbo].[GiaNuocCaNhan] ( [luongNuoc], [donGia], [namApDung]) VALUES ( N'tren 6/nguoi/thang', 13600, 2021)\n"
                + "INSERT [dbo].[GiaNuocCaNhan] ( [luongNuoc], [donGia], [namApDung]) VALUES ( N'tren 6/nguoi/thang', 14400, 2022)";
        try {
            conn = new ConnectDB().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
        } catch (Exception e) {
        }
    }

    public void RollBackGiaNuocDT() {
        String query = "Truncate Table [TienNuoc].[dbo].[GiaNuocDoanThe]\n"
                + "  INSERT [dbo].[GiaNuocDoanThe] ( [doiTuong], [donGia], [namApDung]) VALUES ( N'Co quan hanh chinh', 10900, 2019)\n"
                + "INSERT [dbo].[GiaNuocDoanThe] ( [doiTuong], [donGia], [namApDung]) VALUES ( N'Co quan hanh chinh', 11600, 2020)\n"
                + "INSERT [dbo].[GiaNuocDoanThe] ( [doiTuong], [donGia], [namApDung]) VALUES ( N'Co quan hanh chinh', 12300, 2021)\n"
                + "INSERT [dbo].[GiaNuocDoanThe] ( [doiTuong], [donGia], [namApDung]) VALUES ( N'Co quan hanh chinh', 13000, 2022)\n"
                + "INSERT [dbo].[GiaNuocDoanThe] ( [doiTuong], [donGia], [namApDung]) VALUES ( N'Don vi san xuat', 10200, 2019)\n"
                + "INSERT [dbo].[GiaNuocDoanThe] ( [doiTuong], [donGia], [namApDung]) VALUES ( N'Don vi san xuat', 10800, 2020)\n"
                + "INSERT [dbo].[GiaNuocDoanThe] ( [doiTuong], [donGia], [namApDung]) VALUES ( N'Don vi san xuat', 11400, 2021)\n"
                + "INSERT [dbo].[GiaNuocDoanThe] ( [doiTuong], [donGia], [namApDung]) VALUES ( N'Don vi san xuat', 12100, 2022)\n"
                + "INSERT [dbo].[GiaNuocDoanThe] ( [doiTuong], [donGia], [namApDung]) VALUES ( N'Don vi kinh doanh - dich vu', 17900, 2019)\n"
                + "INSERT [dbo].[GiaNuocDoanThe] ( [doiTuong], [donGia], [namApDung]) VALUES ( N'Don vi kinh doanh - dich vu', 19000, 2020)\n"
                + "INSERT [dbo].[GiaNuocDoanThe] ( [doiTuong], [donGia], [namApDung]) VALUES ( N'Don vi kinh doanh - dich vu', 20100, 2021)\n"
                + "INSERT [dbo].[GiaNuocDoanThe] ( [doiTuong], [donGia], [namApDung]) VALUES ( N'Don vi kinh doanh - dich vu', 21300, 2022)";
        try {
            conn = new ConnectDB().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
        } catch (Exception e) {
        }
    }
}
