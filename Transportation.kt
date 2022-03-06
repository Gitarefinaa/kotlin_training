package com.example.myapplication.coba

 class Transportation<T:Transport>( val t:T?) {
     override fun toString(): String {
         return "$t"
     }
//     override fun toString(): String {
//         return "Kapasitas Mobil =${t?.capacity} \n  " +
//                 "Kecepatan Mobil = ${t?.speed} \n"+
//                 "Berat Mobil = ${t?.weight}"
//     }

 }