function looping1(jumlah) {
    let hasil = '';
    for (let i = 0; i < jumlah; i++) {
        for (let j = 0; j <= i; j++) {
            hasil += '* ';
        }
        hasil += '\n';
    }
    return hasil;
}
console.log(looping1(6));

function looping2(jumlah) {
    let hasil = '';
    for (let i = jumlah; i > 0; i--) {
        for (let j = 1; j <= jumlah; j++) {
            if (j >= i) {
                hasil += '* ';
            } else {
                hasil += ' '
            }
        }
        hasil += '\n';
    }
    return hasil;
}
console.log(looping2(6));