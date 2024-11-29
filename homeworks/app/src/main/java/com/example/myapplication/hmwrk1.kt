package com.example.myapplication


fun main() {
    val range = 48..57
    var temp1:String
    var temp2:String
    var X:Int
    var Y:Int
    var result:Int


    while (true) {
        println("შეიყვანეთ პირველი ტექსტური შეტყობინება: ")
        val string1 = readln()
        println("შეიყვანეთ მეორე ტექსტური შეტყობინება: ")
        val string2 = readln()

        temp1 = ""
        temp2 = ""


        //getting new string of numbers from first input
        for (i in string1) {
            if (i.code in range) temp1 += i
        }



        //getting new string of numbers from second input
        for (i in string2) {
            if (i.code in range) temp2 += i
        }



        if (temp1 != "" && temp2 != "") {
            X = temp1.toInt()
            Y = temp2.toInt()
            result = X / Y
            println("$X და $Y განაყოფი არის: $result")
        } else if (temp1 == "" && temp2 != "") {
            X = 0
            Y = temp2.toInt()
            println("$X და $Y განაყოფი არის: 0")
        }

        if (temp2 == "") {
            println("გამყოფი არ შეიძლება იყოს ნულის ტოლი, გაყოფა ვერ შესრულდა.")

        }

        while (true) {
            println("გსურთ პროგრამის ხელახლა დაწყება <Y/N>?")
            val answer: String = readln()
            if (answer == "y" || answer == "Y" || answer == "დიახ") break;
            if (answer == "n" || answer == "N" || answer == "არა") {
                println("პროგრამა დასრულებულია.")
                return;
            }
        }
    }
}
