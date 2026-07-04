<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Penyewaan</title>

<style>

body{
font-family:Segoe UI;
background:#f5f7fa;
}

.card{
width:700px;
margin:30px auto;
background:white;
padding:20px;
border-radius:15px;
box-shadow:0 4px 15px rgba(0,0,0,.1);
}

input{
width:100%;
padding:10px;
margin:8px 0;
}

button{
background:#6c63ff;
color:white;
border:none;
padding:10px 20px;
border-radius:8px;
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

<div class="card">

<h2>Transaksi Penyewaan</h2>

<form action="sewa" method="post">

<input type="text"
name="nosewa"
placeholder="No Sewa">

<input type="date"
name="tanggal">

<input type="text"
name="customer"
placeholder="ID Customer">

<input type="text"
name="mobil"
placeholder="Kode Mobil">

<input type="number"
name="lama"
placeholder="Lama Sewa">

<input type="number"
name="total"
placeholder="Total Bayar">

<button type="submit">
Simpan
</button>

</form>

</div>

</body>
</html>