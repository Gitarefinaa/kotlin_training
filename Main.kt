package com.example.myapplication.coba

fun main(args: Array<String>) {
    val landTransport = LandTransport("10 Kg", 2.0f, 2.3F, "Getek", "Perahu")
    val airTransport = AirTransport("1 Kg", 2.0f, 2.3F, "Pesawat Boeing", "Garuda")
    landTransport.ship()
    airTransport.ship()
    println(Transportation(landTransport))
    println(Transportation(airTransport))
//    var transport_land = Transportation(landTransport)
//    var transport_air = Transportation(airTransport)
//    println(transport_land.toString())
//    println(transport_air.toString())
}
