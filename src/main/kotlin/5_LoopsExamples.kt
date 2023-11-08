fun main() {
    println("Loops examples")
    var count = 1
//    while(count<=10){
//        //body statement
//        println("suraj ${count}")
//        count++
//    }
//    do{
//        println("surajM ${count}")
//        count++
//    }while (count<=10)
//for(i in 1..10){
//    println("suraj Maurya $i")
//}
//    for(i in 10 downTo 1){
//        println("suraj Maurya $i")
//    }
    val favActivities: Array<String> = arrayOf("cricket", "chess", "music", "programming", "coding")
    for (activity in favActivities) {
        println(activity)
    }
}
