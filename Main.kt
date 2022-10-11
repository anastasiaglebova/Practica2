fun main(args: Array<String>) {
    //zd 1
    val age1 = 42
    val age2 = 21

    //zd 2
    val avg1 = (age1.toDouble() + age2.toDouble()) / 2
    println(avg1)
    //Результат должен быть типа Double, а не Int.

    //zd 3
    //После того, как добавили toDouble, мы получили нужный тип

    //zd 4
    val firstName = "Анастасия"
    val lastName = "Глебова"

    //zd 5
    val fullName = firstName + " " + lastName
    println(fullName)

    //zd 6
    val myDetails = "Привет, меня зовут $fullName"
    println(myDetails)

    // zd 7
    val date = Triple(10, 7, 2002)
    println(date)

    //zd 8
    //var (month, day, year) = date

    //zd 9
    var (month1, _ , year1) = date

    //zd 10
    month1 = 5
    val dateUpdate = Pair(month1, year1)
    println(dateUpdate)
}
