function validation(){
    var validasiHuruf = /^[a-zA-Z !*]+$/;
    var input1 = "hallo jesika24 selamat datang!";
    if (input1.value.match(validasiHuruf)) {
       alert("Sistem memeriksa data anda valid dengan ketentuan kami dengan inputan " + input1.value);
    } else {
       alert("Sistem kami menolak untuk inputan berisi angka");
    }
  }