<%-- 
    Document   : Table
    Created on : Apr 21, 2021, 9:12:25 AM
    Author     : Nal
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <title>Bootstrap CRUD Data Table for Database with Modal Form</title>
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto|Varela+Round">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
        <script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
        <link rel="stylesheet" href="style.css">
        <style>
            a{
                cursor: pointer;
            }
            body {
                color: #566787;
                background: #f5f5f5;
                font-family: 'Varela Round', sans-serif;
                font-size: 13px;
            }
            .table-responsive {
                margin: 30px 0;
            }
            .table-wrapper {
                background: #fff;
                padding: 20px 25px;
                border-radius: 3px;
                min-width: 1000px;
                box-shadow: 0 1px 1px rgba(0,0,0,.05);
            }
            .table-title {        
                padding-bottom: 15px;
                background: #435d7d;
                color: #fff;
                padding: 16px 30px;
                min-width: 100%;
                margin: -20px -25px 10px;
                border-radius: 3px 3px 0 0;
            }
            .table-title h2 {
                margin: 5px 0 0;
                font-size: 24px;
            }
            .table-title .btn-group {
                float: right;
            }
            .table-title .btn {
                color: #fff;
                float: right;
                font-size: 13px;
                border: none;
                min-width: 50px;
                border-radius: 2px;
                border: none;
                outline: none !important;
                margin-left: 10px;
            }
            .table-title .btn i {
                float: left;
                font-size: 21px;
                margin-right: 5px;
            }
            .table-title .btn span {
                float: left;
                margin-top: 2px;
            }
            table.table tr th, table.table tr td {
                border-color: #e9e9e9;
                padding: 12px 15px;
                vertical-align: middle;
            }
            table.table tr th:first-child {
                width: 60px;
            }
            table.table tr th:last-child {
                width: 100px;
            }
            table.table-striped tbody tr:nth-of-type(odd) {
                background-color: #fcfcfc;
            }
            table.table-striped.table-hover tbody tr:hover {
                background: #f5f5f5;
            }
            table.table th i {
                font-size: 13px;
                margin: 0 5px;
                cursor: pointer;
            }	
            table.table td:last-child i {
                opacity: 0.9;
                font-size: 22px;
                margin: 0 5px;
            }
            table.table td a {
                font-weight: bold;
                color: #566787;
                display: inline-block;
                text-decoration: none;
                outline: none !important;
            }
            table.table td a:hover {
                color: #2196F3;
            }
            table.table td a.edit {
                color: #FFC107;
            }
            table.table td a.delete {
                color: #F44336;
            }
            table.table td i {
                font-size: 19px;
            }
            table.table .avatar {
                border-radius: 50%;
                vertical-align: middle;
                margin-right: 10px;
            }
            .pagination {
                float: right;
                margin: 0 0 5px;
            }
            .pagination li a {
                border: none;
                font-size: 13px;
                min-width: 30px;
                min-height: 30px;
                color: #999;
                margin: 0 2px;
                line-height: 30px;
                border-radius: 2px !important;
                text-align: center;
                padding: 0 6px;
            }
            .pagination li a:hover {
                color: #666;
            }	
            .pagination li.active a, .pagination li.active a.page-link {
                background: #03A9F4;
            }
            .pagination li.active a:hover {        
                background: #0397d6;
            }
            .pagination li.disabled i {
                color: #ccc;
            }
            .pagination li i {
                font-size: 16px;
                padding-top: 6px
            }
            .hint-text {
                float: left;
                margin-top: 10px;
                font-size: 13px;
            }    
            /* Custom checkbox */
            .custom-checkbox {
                position: relative;
            }
            .custom-checkbox input[type="checkbox"] {    
                opacity: 0;
                position: absolute;
                margin: 5px 0 0 3px;
                z-index: 9;
            }
            .custom-checkbox label:before{
                width: 18px;
                height: 18px;
            }
            .custom-checkbox label:before {
                content: '';
                margin-right: 10px;
                display: inline-block;
                vertical-align: text-top;
                background: white;
                border: 1px solid #bbb;
                border-radius: 2px;
                box-sizing: border-box;
                z-index: 2;
            }
            .custom-checkbox input[type="checkbox"]:checked + label:after {
                content: '';
                position: absolute;
                left: 6px;
                top: 3px;
                width: 6px;
                height: 11px;
                border: solid #000;
                border-width: 0 3px 3px 0;
                transform: inherit;
                z-index: 3;
                transform: rotateZ(45deg);
            }
            .custom-checkbox input[type="checkbox"]:checked + label:before {
                border-color: #03A9F4;
                background: #03A9F4;
            }
            .custom-checkbox input[type="checkbox"]:checked + label:after {
                border-color: #fff;
            }
            .custom-checkbox input[type="checkbox"]:disabled + label:before {
                color: #b8b8b8;
                cursor: auto;
                box-shadow: none;
                background: #ddd;
            }
            /* Modal styles */
            .modal .modal-dialog {
                max-width: 400px;
            }
            .modal .modal-header, .modal .modal-body, .modal .modal-footer {
                padding: 20px 30px;
            }
            .modal .modal-content {
                border-radius: 3px;
                font-size: 14px;
            }
            .modal .modal-footer {
                background: #ecf0f1;
                border-radius: 0 0 3px 3px;
            }
            .modal .modal-title {
                display: inline-block;
            }
            .modal .form-control {
                border-radius: 2px;
                box-shadow: none;
                border-color: #dddddd;
            }
            .modal textarea.form-control {
                resize: vertical;
            }
            .modal .btn {
                border-radius: 2px;
                min-width: 100px;
            }	
            .modal form label {
                font-weight: normal;
            }	
        </style>
        <script>
            $(document).ready(function () {
                // Activate tooltip
                $('[data-toggle="tooltip"]').tooltip();

                // Select/Deselect checkboxes
                var checkbox = $('table tbody input[type="checkbox"]');
                $("#selectAll").click(function () {
                    if (this.checked) {
                        checkbox.each(function () {
                            this.checked = true;
                        });
                    } else {
                        checkbox.each(function () {
                            this.checked = false;
                        });
                    }
                });
                checkbox.click(function () {
                    if (!this.checked) {
                        $("#selectAll").prop("checked", false);
                    }
                });
            });
        </script>
    </head>
    <body>
        <div class="container">
            <header>
                <a href="#"><img src="img/logo.png" alt=""></a>
            </header>

            <nav>
                <div class="menu">
                    <ul>
                        <li><a href="index.html">TRANG CHỦ</a></li>
                        <li><a href="gioithieu.html">GIỚI THIỆU</a></li>
                        <li><a href="banggia.html">GIÁ NƯỚC</a></li>
                        <li><a href="home">QUẢN LÝ</a></li>
                    </ul>
                </div>
            </nav>

            <div id="slide">
                <a href=""><img src="img/slide.jpg" alt=""></a>
            </div>
        </div>
        <div class="container-xl">
            <div class="table-responsive">
                <div class="table-wrapper">
                    <div class="table-title">
                        <div class="row">
                            <div class="col-sm-6">
                                <h2>Giá nước <b> Cá nhân</b></h2>
                            </div>
                            <div class="col-sm-6">
                                <a href="#addEmployeeModal1" class="btn btn-success" data-toggle="modal"><i class="material-icons">&#xE147;</i> <span>Add New </span></a>
                                <a href="#deleteEmployeeModal" class="btn btn-danger" data-toggle="modal"><i class="material-icons">&#xE15C;</i> <span>Delete</span></a>
                                <form method="post" action="giaNuoc">
                                                        <button type="submit" type="button" class="btn btn-success"><i class="fa fa-download" title="Xuất Excel"></i>Xuất Excel</button>
                                </form>
                            </div>
                        </div>
                    </div>
                    <table class="table table-striped table-hover">
                        <thead>
                            <tr>
                                <th>
                                    <span class="custom-checkbox">
                                        <input type="checkbox" id="selectAll">
                                        <label for="selectAll"></label>
                                    </span>
                                </th>
                                <th>ID</th>
                                <th>Lượng nước</th>
                                <th>Đơn giá(đồng/m3)</th>
                                <th>Năm áp dụng</th>
                               
                                <th>Actions</th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach items="${listCN}" var="o" >
                                <tr>
                                    <td>
                                        <span class="custom-checkbox">
                                            <input type="checkbox" id="checkbox5" name="options[]" value="1">
                                            <label for="checkbox5"></label>
                                        </span>
                                    </td>
                                    <td>${o.getId()}</td>
                                    <td>${o.getLuongNuoc()}</td>
                                    <td>${o.getDonGia()}</td>
                                    <td>${o.getNamApdung()}</td>
                                    
                                    <td>
                                        <a onclick="openEdit1('${o.getId()}','${o.getLuongNuoc()}','${o.getDonGia()}','${o.getNamApdung()}')"  class="edit" data-toggle="modal"><i class="material-icons" data-toggle="tooltip" title="Edit">&#xE254;</i></a>
                                        <a onclick="openDelete1(${o.getId()})"  class="delete" data-toggle="modal"><i class="material-icons" data-toggle="tooltip" title="Delete">&#xE872;</i></a>
                                        
                                    </td>
                                </tr> 
                            </c:forEach>   
                        </tbody>
                    </table>
                <div class="table-title">
                        <div class="row">
                            <div class="col-sm-6">
                                <h2>Giá nước <b> Đoàn thể</b></h2>
                            </div>
                            <div class="col-sm-6">
                                <a href="#addEmployeeModal2" class="btn btn-success" data-toggle="modal"><i class="material-icons">&#xE147;</i> <span>Add New</span></a>
                                <a href="#deleteEmployeeModal" class="btn btn-danger" data-toggle="modal"><i class="material-icons">&#xE15C;</i> <span>Delete</span></a>
                                <form method="post" action="giaNuoc">
                                                        <button type="submit" type="button" class="btn btn-success"><i class="fa fa-download" title="Xuất Excel"></i>Xuất Excel</button>
                                </form>
                            </div>
                        </div>
                    </div>
                    <table class="table table-striped table-hover">
                        <thead>
                            <tr>
                                <th>
                                    <span class="custom-checkbox">
                                        <input type="checkbox" id="selectAll">
                                        <label for="selectAll"></label>
                                    </span>
                                </th>
                                <th>ID</th>
                                <th>Đối tượng</th>
                                <th>Đơn giá(đồng/m3)</th>
                                <th>Năm áp dụng</th>
                                
                                <th>Actions</th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach items="${listDT}" var="o" >
                                <tr>
                                    <td>
                                        <span class="custom-checkbox">
                                            <input type="checkbox" id="checkbox5" name="options[]" value="1">
                                            <label for="checkbox5"></label>
                                        </span>
                                    </td>
                                    <td>${o.getId()}</td>
                                    <td>${o.getDoiTuong()}</td>
                                    <td>${o.getDonGia()}</td>
                                    <td>${o.getNamApdung()}</td>
                                    
                                    
                                    <td>
                                        <a onclick="openEdit2('${o.getId()}','${o.getDoiTuong()}','${o.getDonGia()}','${o.getNamApdung()}')"  class="edit" data-toggle="modal"><i class="material-icons" data-toggle="tooltip" title="Edit">&#xE254;</i></a>
                                        <a onclick="openDelete2(${o.getId()})"  class="delete" data-toggle="modal"><i class="material-icons" data-toggle="tooltip" title="Delete">&#xE872;</i></a>
                                         
                                    </td>
                                </tr> 
                            </c:forEach>   
                        </tbody>
                    </table>
                                    
                    <div class="clearfix">
                        <!--				<div class="hint-text">Showing <b>5</b> out of <b>25</b> entries</div>-->
                        <ul class="pagination">
                            <li class="page-item disabled"><a href="#">Previous</a></li>
                            <li class="page-item active"><a href="#" class="page-link">1</a></li>
                            <li class="page-item"><a href="#" class="page-link">2</a></li>
                            <li class="page-item "><a href="#" class="page-link">3</a></li>
                            <li class="page-item"><a href="#" class="page-link">4</a></li>
                            <li class="page-item"><a href="#" class="page-link">5</a></li>
                            <li class="page-item"><a href="#" class="page-link">Next</a></li>
                        </ul>
                    </div>
                </div>
            </div>        
        </div>
        <!-- Add Modal HTML 1 -->
        <div id="addEmployeeModal1" class="modal fade">
            <div class="modal-dialog">
                <div class="modal-content">
                    <form action ="AddGiaNuocCN" method="post">  
                        <div class="modal-header">						
                            <h4 class="modal-title">Add </h4>
                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                        </div>
                        <div class="modal-body">					
                            <div class="form-group">
                                <label>Lượng nước</label>
                                <input name ="luongNuoc" type="text" class="form-control" required>
                            </div>
                            <div class="form-group">
                                <label>Đơn giá</label>
                                <input name ="donGia1" type="number" class="form-control" required>
                            </div>	
                            <div class="form-group">
                                <label>Năm Áp dụng</label>
                                <input name ="namApdung1" type="number" class="form-control" required>
                            </div>	
                        </div>
                        <div class="modal-footer">
                            <input type="button" class="btn btn-default" data-dismiss="modal" value="Cancel">
                            <input type="submit" class="btn btn-success" value="Add">
                        </div>
                    </form>
                </div>
            </div>
        </div>
        <!-- Add Modal HTML 2 -->
        <div id="addEmployeeModal2" class="modal fade">
            <div class="modal-dialog">
                <div class="modal-content">
                    <form action ="AddGiaNuocDT" method="post">  
                        <div class="modal-header">						
                            <h4 class="modal-title">Add </h4>
                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                        </div>
                        <div class="modal-body">					
                            <div class="form-group">
                                <label>Đối tượng</label>
                                <input name ="doiTuong" type="text" class="form-control" required>
                            </div>
                            <div class="form-group">
                                <label>Đơn giá</label>
                                <input name ="donGia2" type="number" class="form-control" required>
                            </div>	
                            <div class="form-group">
                                <label>Năm Áp dụng</label>
                                <input name ="namApdung2" type="number" class="form-control" required>
                            </div>	
                        </div>
                        <div class="modal-footer">
                            <input type="button" class="btn btn-default" data-dismiss="modal" value="Cancel">
                            <input type="submit" class="btn btn-success" value="Add">
                        </div>
                    </form>
                </div>
            </div>
        </div>
        <!-- Edit Modal HTML -->
        <div id="editEmployeeModal" class="modal modeldelete" role="dialog" style="height: auto;width: 90%;overflow: auto">
            <div class="modal-dialog">
                <div class="modal-content">
                    <form action="EditGiaNuocCN" method="post">
                        <div class="modal-header">						
                            <h4 class="modal-title">Edit Giá nước</h4>
                            <button type="button" class="close" onclick="closeEdit1()"  aria-hidden="true">&times;</button>
                        </div>
                        <div class="modal-body">
                            <input hidden id="IdEdit1" name="IdEdit1"/>

                            <div class="form-group">
                                <label>Lượng nước</label>
                                <input name="luongNuoc_edit" id="luongNuoc_edit" value="${EditCN.getLuongNuoc()}"type="text" class="form-control" required>
                            </div>
                            <div class="form-group">
                                <label>Đơn giá</label>
                                <input id="dongia_edit" name="dongia_edit"value="${EditCN.getDonGia()}" type="number" class="form-control" required>
                            </div>	
                            <div class="form-group">
                                <label>Năm Áp dụng</label>
                                <input id="namAD_edit" name="namAD_edit"value="${EditCN.getNamApDung()}" type="number" class="form-control" required>
                            </div>
                        </div>
                        <div class="modal-footer">
                            <input type="button" class="btn btn-default" onclick="closeEdit1()" value="Cancel">
                            <input type="submit" class="btn btn-info" value="Save">
                        </div>
                    </form>
                </div>
            </div>
        </div>
                            <!-- Edit Modal HTML -->
        <div id="editEmployeeModal2" class="modal modeldelete" role="dialog" style="height: auto;width: 90%;overflow: auto">
            <div class="modal-dialog">
                <div class="modal-content">
                    <form action="EditGiaNuocDT" method="post">
                        <div class="modal-header">						
                            <h4 class="modal-title">Edit Giá nước</h4>
                            <button type="button" class="close" onclick="closeEdit2()"  aria-hidden="true">&times;</button>
                        </div>
                        <div class="modal-body">
                            <input hidden id="IdEdit2" name="IdEdit2"/>

                            <div class="form-group">
                                <label>Đối tượng</label>
                                <input name="doiTuong_edit" id="doiTuong_edit" type="text" class="form-control" required>
                            </div>
                            <div class="form-group">
                                <label>Đơn giá</label>
                                <input id="dongia2_edit" name="dongia2_edit"value="${EditDT.getDonGia()}" type="number" class="form-control" required>
                            </div>	
                            <div class="form-group">
                                <label>Năm Áp dụng</label>
                                <input id="namAD2_edit" name="namAD2_edit"value="${EditDT.getNamApDung()}" type="number" class="form-control" required>
                            </div>
                        </div>
                        <div class="modal-footer">
                            <input type="button" class="btn btn-default" onclick="closeEdit2()" value="Cancel">
                            <input type="submit" class="btn btn-info" value="Save">
                        </div>
                    </form>
                </div>
            </div>
        </div>
        <!--modal modeldelete1-->
        <div class="modal modeldelete" id="modeldelete1" role="dialog" style="height: 90%;width: 90%;">
            <div class="modal-dialog">
                <div class="modal-content">
                    <form action="DeleteGiaNuocCN" method="post">
                        <div class="modal-header">
                            <h4 class="modal-title">Delete Giá Nước</h4>
                            <button type="button" class="close" onclick="closepopup1()" aria-hidden="true">&times;</button> 
                        </div>
                        <div class="modal-body">
                            <div class="form-group">
                                <input type="hidden" name="IdXoaCN" id="IdXoaCN" value="" />
                                <p>Are you sure you want to delete these Records?</p>
                            <p class="text-warning"><small>This action cannot be undone.</small></p>  
                            </div>
                        </div>
                        <div class="modal-footer" style="text-align:center">
                            <input type="button" class="btn btn-default" onclick="closepopup1()" value="Cancel">
                            <input type="submit" id="btnXoa"class="btn btn-danger" value="Delete">
                        </div>
                    </form>
                </div>
            </div>
        </div>
        
        <!--modal modeldelete2 -->
        <div class="modal modeldelete" id="modeldelete2" role="dialog" style="height: 90%;width: 90%;">
            <div class="modal-dialog">
                <div class="modal-content">
                    <form action="DeleteGiaNuocDT" method="post">
                        <div class="modal-header">
                            <h4 class="modal-title">Delete Giá Nước</h4>
                            <button type="button" class="close" onclick="closepopup2()" aria-hidden="true">&times;</button> 
                        </div>
                        <div class="modal-body">
                            <div class="form-group">
                                <input type="hidden" name="IdXoaDT" id="IdXoaDT" value="" />
                                <p>Are you sure you want to delete these Records?</p>
                            <p class="text-warning"><small>This action cannot be undone.</small></p>  
                            </div>
                        </div>
                        <div class="modal-footer" style="text-align:center">
                            <input type="button" class="btn btn-default" onclick="closepopup2()" value="Cancel">
                            <input type="submit" id="btnXoa"class="btn btn-danger" value="Delete">
                        </div>
                    </form>
                </div>
            </div>
        </div>

        <!-- Delete Modal HTML -->
        <div id="deleteEmployeeModal" class="modal fade" >
            <div class="modal-dialog">
                <div class="modal-content">
                    <form action="" method="post">
                        <div class="modal-header">						
                            <h4 class="modal-title">Delete Employee</h4>
                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                        </div>
                        <div class="modal-body">					
                            <p>Are you sure you want to delete these Records?</p>
                            <p class="text-warning"><small>This action cannot be undone.</small></p>
                        </div>
                        <div class="modal-footer">
                            <input type="button" class="btn btn-default" data-dismiss="modal" value="Cancel">
                            <input type="submit" id="btnXoa"class="btn btn-danger" value="Delete">
                        </div>
                    </form>
                </div>
            </div>
        </div>

    </body>
</html>
<script>
    function openDelete1(id) {
        $('#IdXoaCN').val(id);
        $('#modeldelete1').show();
    }
    function closepopup1() {
        $('#modeldelete1').hide();
    }
    
</script> 
<script>
    function openDelete2(id) {
        $('#IdXoaDT').val(id);
        $('#modeldelete2').show();
    }
    function closepopup2() {
        $('#modeldelete2').hide();
    }
    
</script> 
<script>
    function openEdit1(id,luongNuoc,donGia,NamApdung) {
        debugger;
        $('#IdEdit1').val(id);
        $('#luongNuoc_edit').val(luongNuoc);
        $('#dongia_edit').val(donGia);
        $('#namAD_edit').val(NamApdung);
        
        $('#editEmployeeModal').show();
    }
    function closeEdit1() {
        $('#editEmployeeModal').hide();
    }
</script>
<script>
    function openEdit2(id,doiTuong,donGia,namApdung) {
        $('#IdEdit2').val(id);
        $('#doiTuong_edit').val(doiTuong);
        $('#dongia2_edit').val(donGia);
        $('#namAD2_edit').val(namApdung);
        $('#editEmployeeModal2').show();
    }
    function closeEdit2() {
        $('#editEmployeeModal2').hide();
    }
</script>
