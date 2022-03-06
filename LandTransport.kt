package com.example.myapplication.coba

class LandTransport(
    override var capacity: String,
    override var weight: Float,
    override var speed: Float,
    var transportation_mode:String,
    var vehicle_type:String
) : Transport{
    override fun ship() {
    println("In air transport, shipping is done via air cargo")
    }
    override fun toString(): String {
    return "LandTransport \n capacity='$capacity', weight=$weight, speed=$speed," +
            " transportation_mode='$transportation_mode', vehicle_type='$vehicle_type')"
    }


}