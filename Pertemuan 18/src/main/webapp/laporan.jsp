<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Laporan Rent Car</title>

<style>

body{
font-family:Segoe UI;
background:#f5f7fa;
padding:20px;
}

table{
width:100%;
background:white;
border-collapse:collapse;
}

th{
background:#6c63ff;
color:white;
padding:10px;
}

td{
padding:10px;
border:1px solid #ddd;
}


.menu{
    background:#6c63ff;
    padding:15px;
}

.menu a{
    color:white;
    text-decoration:none;
    margin-right:20px;
}
</style>

</head>

<body>

    <div class="menu">
    <a href="index.jsp">Dashboard</a>
    <a href="mobil.jsp">Mobil</a>
    <a href="customer.jsp">Customer</a>
    <a href="sewa.jsp">Sewa</a>
    <a href="pengembalian.jsp">Pengembalian</a>
    <a href="laporan.jsp">Laporan</a>
</div>

<h2>Laporan Transaksi Rent Car</h2>

<table>

<tr>
<th>No Sewa</th>
<th>Tanggal</th>
<th>Customer</th>
<th>Mobil</th>
<th>Lama</th>
<th>Total</th>
</tr>

<tr>
<td>S001</td>
<td>2026-06-10</td>
<td>C001</td>
<td>M001</td>
<td>3 Hari</td>
<td>975000</td>
</tr>

</table>

</body>
</html>