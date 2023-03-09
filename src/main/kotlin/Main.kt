import java.awt.Color

fun main() {
    val car=Car("subaru","legacy","white",50)
    car.carry(14,20)
    car.identity()
    var a=car.calculateParkingFees(10)
    println(a)
    var bus=Bus("Modern coach","lexi","white",70)
    var b=bus.maxTripFare(50.0)
    println(b)
    var c=bus.calculateParkingFees(20)
    println(c)




}
 open class Car(var make:String,var model:String,var color:String,var capacity:Int){
    fun carry(people:Int,x:Int){
        if (people==x)
            println("carrying $people passengers")
        else
            println("over capacity by $x people")
    }
    fun identity(){
        println("I am a $color $make $model")
    }
    open fun calculateParkingFees(hours:Int):Int{
        var parkingfees= hours * 20
        return parkingfees
    }

}
class Bus(make: String, model: String, color: String, capacity: Int):Car(make,model,color,capacity){


    fun maxTripFare(fare:Double):Double{
        var maximumfare=(fare*2)*capacity
        return maximumfare
    }

    override fun calculateParkingFees(hours: Int): Int {
        var product=hours * capacity
        return product
    }



}
