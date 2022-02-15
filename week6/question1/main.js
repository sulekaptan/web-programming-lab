//import mysql from "mysql2";
const mysql = require('mysql')


var baglanti = mysql.createConnection({
    host: 'localhost',
    user: 'root',
    password: 'Sulekaptan55',
    database: 'webdata'
})


//1. şık
baglanti.connect(function(err) {
    if (err) throw err;
    console.log("baglantı basarili");
    var tabloYarat = "CREATE TABLE employee (EmployeeId INT AUTO_INCREMENT PRIMARY KEY, FirstName VARCHAR(255),LastName VARCHAR(255), DepartmentName VARCHAR(255))";

    baglanti.query(tabloYarat, function(err, result) {
        if (err) throw err;
        console.log(result);
    })
})


//1.a şıkkı
// baglanti.connect(function(err) {
//     if (err) throw err;


//     var veriEkle = "INSERT INTO `employee`(FirstName, LastName, DepartmentName) VALUES ? ";
//     var veriler = [
//         ['Ken', 'Sanchez', 'Executive'],
//         ['Terri', 'Duffy', 'Engineering'],
//         ['Roberto', 'Tamburello', 'Engineering'],
//         ['Rob', 'Walters', 'Engineering'],
//         ['Gail', 'Erickson', 'Engineering'],
//         ['Jossef', 'Goldberg', 'Engineering'],
//         ['Dylan', 'Miller', 'Support'],
//         ['Diane', 'Margheim', 'Support'],
//         ['Gigi', 'Matthew', 'Support'],
//         ['Michael', 'Raheem', 'Support'],
//     ];

//     baglanti.query(veriEkle, [veriler], function(err, result) {
//         if (err) throw err;
//         console.log(result);
//     })
// })

//1.b şıkkı
// baglanti.connect(function(err) {
//     if (err) throw err;
//     let veriCekme = `SELECT * FROM employee WHERE DepartmentName = 'Engineering'`;

//     baglanti.query(veriCekme, function(err, result) {
//         if (err) throw err;
//         console.log(result);
//     })
// })



//1.c şıkkı
// baglanti.connect(function(err) {
//     if (err) throw err;
//     let veriGuncelle = `UPDATE employee SET DepartmentName = 'Executive' WHERE FirstName = 'Terri'`;

//     baglanti.query(veriGuncelle, function(err, result) {
//         if (err) throw err;
//         console.log(result);
//     })
// })