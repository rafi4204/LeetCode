
val  printList = { arg : ArrayList<String> ->
    arg.forEach {  println(it)}

}

fun invoke(lamda : (ArrayList<String>) -> Unit){
    val list = arrayListOf<String>("a","v","v","x")
    lamda(list)

}

fun main(){
    invoke (printList)

}