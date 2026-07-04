<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Data Mobil</title>

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

input,select{
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

table{
    width:100%;
    border-collapse:collapse;
}

th,td{
    border:1px solid #ddd;
    padding:10px;
}

th{
    background:#6c63ff;
    color:white;
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

<h2>Data Mobil</h2>

<form action="mobil" method="post">

<input type="text"
name="kode"
placeholder="Kode Mobil">

<input type="text"
name="merk"
placeholder="Merk Mobil">

<input type="text"
name="tipe"
placeholder="Tipe Mobil">

<input type="number"
name="tahun"
placeholder="Tahun">

<input type="text"
name="plat"
placeholder="Plat Nomor">

<input type="number"
name="harga"
placeholder="Harga Sewa">

<select name="status">
<option>Tersedia</option>
<option>Disewa</option>
</select>

<button type="submit">
Simpan
</button>

</form>

<h3>Daftar Mobil</h3>

<table>
<tr>
    <th>Kode</th>
    <th>Merk</th>
    <th>Tipe</th>
    <th>Status</th>
</tr>

<tr>
    <td>M001</td>
    <td>Toyota</td>
    <td>Avanza</td>
    <td>Tersedia</td>

    <td>
    <button>Edit</button>
    <button>Hapus</button>
</td>
</tr>

</table>

</div>

</body>
</html>