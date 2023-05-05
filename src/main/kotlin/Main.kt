fun main() {

    myname("Linah")
    myname("James")
    noOfStrings("leopard")
}

//1. Write a function that takes in 3 parameters, name, age, and country,
// and returns a String with this structure “Hi, my name is x, I am y years old
// and I am from z.” Where x, y, and z are the provided name, age, and country respectively. (3 points)
fun nameLinah(name:String, age:Int):String {
    var statement = "Hi,My name is $name and i am $age years old"
    return statement
}




//2. Write a function that takes in a String and returns its length (2 points)
fun noOfStrings(x:String){
    x.length
    println(x.length)
}

//3. Write a function that takes in a name and prints out “That’s me!” when your
// name is passed to it, otherwise, it prints out “I don’t know who that is” (3 points)
fun myname(name: String){
    if (name=="Linah")
        println("That`s me!")
    else
        println("I dont know who that is")
}

//4. Write a Kotlin function that takes in a string will all the vowels
// replaces by the character ‘*’. Use string interpolation to generate the output. (2 points)

fun vowels(string: String){

}