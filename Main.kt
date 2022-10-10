fun main(args: Array<String>) {
    //zd 1
    val age1 = 42
    val age2 = 21

    //zd 2
    val avg1 = (age1 + age2) / 2
    //Результат должен быть типа Double, а не Int.

    //zd 3
    val avg1 = (age1.toDouble() + age2.toDouble()) / 2
    //После того, как добавили toDouble, мы получили нужный тип

    //zd 4
    val firstName = "Анастасия"
    val lastName = "Глебова"

    //zd 5
    val fullName = firstName + " " + lastName

    //zd 6
    val myDetails = "Привет, меня зовут $fullName"

    // zd 7
    val date: Triple <Int, Int, Int> = Triple(first:10, second: 7, third: 2002)

    //zd 8
    val month = date.first
    val day = date.second
    val year = date.third

    //zd 9
    var (month, _, year) = date

    //zd 10


}