fun main() {
    greetJosephine("Jane")
    numbers(10)

    hasVisitedCapital("Tanzanian")
    hasVisitedCapital("Kenyan")

    hasVisitedCapital2("Tanzanian")

    login("gumato")
    login("frifdddkdkdkdkdkkd")
    login("rty")

//for loops(print all characters)
    var languages = arrayOf("Kiswahili","Luganda","Gabra")
    for (language in languages){
        println(language)
        for (char in language){
            println(char)
        }

    }
   // for range
    for (num in 1..10)
        println(num)
    multiple()

}
 //function that prints out the squares of all the odd numbers between 1 and 20
 fun oddNum() {
   for (number in 1..20)
   if (number%2!=0) {
       println( number* number)

   }


}
fun greetJosephine(name:String){
    if(name == "Josephine"){
        println("Hello Josephine")
    }
    else{
        println("Who are you?")
    }
}
// function that prints out "odd" or "even"
//depending on the number passed to it
fun numbers(number:Int){
    if(number%2 == 0){
        println("Even")
    }
    else{
        println("Odd")
    }

}
fun hasVisitedCapital(nationality: String){
    if(nationality.equals("Kenyan")){
        println("Have you ever been to Nairobi?")
    }
    else if(nationality.equals("Tanzanian")){
        println("Have you ever been to Dodoma")
    }
    else if(nationality.equals("Ugandan")){
        println("Have you ever been to Kampala?")
        }
    else{
        println("Have you ever been to East Africa")
    }
    }
fun hasVisitedCapital2(nationality: String){
    when(nationality){
        "Kenyan" -> println("Have you ever been to Nairobi?")
        "Ugandan" -> println("Have you ever been to Kampala?")
        "Tanzanian" -> println("Have you ever been to Dodoma?")
        else-> println("Have you ever been to East Africa?")
    }



}
fun admitPerson(age: Int){
    when(age){
        1,2,3,4 -> println("Kidergarten")
        5,6,7,8,9,10-> println("Elementary")

    }
}
/*function that takes in a password as a parameter.For a password to be valid it must meet
the following instructions :
1 must be atleast 8 characters long
2 must be at most 16 characters long
3 must not be password
use if/else statements to determine whether the password  provided is vlid or not.
the function returns true/false
 */
fun login(password: String): Boolean {
    return (password.length in 8..16 && password != "password")
}

//function that prints out multiples of 6 and 8 between 1 and 1000.for multiples of both 6 and 8
//it should print out "bingo!"
fun multiple(){
    for (numbers in 1..1000)
        if (numbers%6==0 && numbers%8==0){
            println("Bingo!")
        }
    else if (numbers%6==0 ||  numbers%8==0)
        println(numbers)
}



