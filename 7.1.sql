/*1. Đưa ra thông tin đơn hàng (gồm orderDate, requiredDate, Status) và tổng giá trị của mỗi đơn hàng các ngày trong tháng 3/2003.*/
select o.orderDate,o.requiredDate,o.`status`,od.priceEach from product_orders.orders o join product_orders.orderdetails od 
on o.orderNumber=od.orderNumber
where o.orderDate between '2003-03-01' and '2003-03-31';
/*2. Đưa ra tên sản phẩm của các đơn hàng bị huỷ đơn.  */  
select p.productName from product_orders.orderdetails od join product_orders.products p
on od.productCode= p.productCode join product_orders.orders o
on od.orderNumber=o.orderNumber
where o.status='Cancelled'