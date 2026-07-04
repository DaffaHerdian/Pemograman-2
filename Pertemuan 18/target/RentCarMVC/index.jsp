<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Rent Car Dashboard</title>

<style>

body{
    font-family:Segoe UI;
    background:#f5f7fa;
    margin:0;
}

.header{
    background:#6c63ff;
    color:white;
    padding:20px;
    text-align:center;
}

.container{
    width:90%;
    margin:30px auto;
}

.card{
    display:inline-block;
    width:220px;
    margin:15px;
    background:white;
    border-radius:15px;
    padding:25px;
    text-align:center;
    box-shadow:0 4px 10px rgba(0,0,0,.1);
}

.card a{
    text-decoration:none;
    color:#333;
    font-weight:bold;
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

<div class="header">
    <h1>Rent Car Management</h1>
</div>

<div class="container">

    <div class="card">
        <a href="mobil.jsp">🚗 Data Mobil</a>
    </div>

    <div class="card">
        <a href="customer.jsp">👤 Customer</a>
    </div>

    <div class="card">
        <a href="sewa.jsp">📋 Penyewaan</a>
    </div>

    <div class="card">
        <a href="pengembalian.jsp">🔄 Pengembalian</a>
    </div>

    <div class="card">
        <a href="laporan.jsp">📊 Laporan</a>
    </div>

    <div class="card">
    <h2>5</h2>
    <p>Total Mobil</p>
</div>

<div class="card">
    <h2>5</h2>
    <p>Total Customer</p>
</div>

<div class="card">
    <h2>2</h2>
    <p>Total Sewa</p>
</div>

</div>

</body>
</html>