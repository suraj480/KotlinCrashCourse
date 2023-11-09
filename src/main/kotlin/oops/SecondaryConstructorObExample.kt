package oops

class Cars {
    var carColor = String;
    var carModel = String;
    var price = Double

    constructor(carModel: String, carColor: String) : this(carModel, carColor, 0.0) {
        println("first constructor")
    }

    //{
//      var  carModels = carModel
//      var  carColors = carColor
//       var price = 0.0
//        println("Creating car object with $carModels and of $carColors color")
    // }
    constructor(color: String, model: String, price: Double) {
        println("second constructor")
        println("Creating car object with $model and of $color color and price $price")
    }
}

fun main() {
    var car1 = Cars("fortuner", "red")
    var car2 = Cars("scorpio", "black", 15.50)
}

