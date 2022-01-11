

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tinh toan chu vi, dien tich</title>
    </head>
    <body>
        <h1>Tinh chu vi va dien tich tam giac</h1>
        <hr/>
        <form action="TamGiacSevlet" method="post">
            a: <input type="text" name="a" placeholder="Canh a? " > <br /><br />
            b: <input type="text" name="b" placeholder="Canh b? " > <br /><br />
            c: <input type="text" name="c" placeholder="Canh c? " > <br /><br />
            
            <input type="submit" formaction="chuvi" value="Tinh Chu Vi" />
            <input type="submit" formaction="dientich" value="Tinh Dien Tich" />
        </form>
        <hr />
        <%--use h2 để hiển thị thông tin đã dc sử lý dùng kỹ thuật expression
        để hiển thị nội dung của thuộc tính message đã được tạo treong jsp
        --%>
        <h2>${ message }</h2>
    </body>
</html>
