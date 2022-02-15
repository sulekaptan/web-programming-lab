var fs = require("fs");
var dosya = fs.readFileSync("soru2.txt", "utf-8");
let dizi = [, ];
var i;
var j;
index = 0;

for (i = 0; i < dosya.split("\n").length; i++) {
    var satır = dosya.split("\n")[i];
    for (j = 0; j < satır.split(" ").length; j++) {
        var sayi = satır.split(" ")[j];
        dizi[index] = sayi;
        index++;
    }
}
let newDizi = [];
for (i = 0; i < dizi.length - 1; i += 2) {
    newDizi.push(parseInt(dizi[i]) + parseInt(dizi[i + 1]));
}
console.log(newDizi)

fs.writeFile('soru3.txt', newDizi.toString(), function(err, data) {

    if (err) throw err;

    console.log('Veri başarıyla yazıldı.');

});