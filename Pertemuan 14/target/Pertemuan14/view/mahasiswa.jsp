<html><head>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">
<title>Mahasiswa</title></head>
<body>
<div class="header"><h1>Input Mahasiswa</h1></div>
<div class="content">
<form action="../MahasiswaController" method="post">
<input name="nim" placeholder="NIM"><br><br>
<input name="nama" placeholder="Nama"><br><br>
<input name="jurusan" placeholder="Jurusan"><br><br>
<input name="semester" placeholder="Semester"><br><br>
<button type="submit">Simpan</button>
</form>
</div>
</body></html>