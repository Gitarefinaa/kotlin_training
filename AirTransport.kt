package com.example.myapplication.coba

class AirTransport(
    override var capacity: String,
    override var weight: Float,
    override var speed: Float,
    var aircraft_type : String,
    var airline_name:String
) : Transport{
    override fun ship() {
    println("In land transport, shipping is done via Truck")
    }

    override fun toString(): String {
        return "AirTransport \n capacity='$capacity', weight=$weight, speed=$speed, aircraft_type='$aircraft_type', airline_name='$airline_name')"
    }

}