package ex20221122

fun main() {

    sum(5,6)
    println(sum(5, 6))//결과값을 받아오기만 하고 출력하는 기능은 없음

    sumPrint(5,6)
    //void ----> Unit
    //void, Unit 같은 경우에는 '기능' 자체를 가지고 있는 함수

}//main 밖

fun sumPrint(num1: Int, num2:Int):Unit {
    println(num1+num2)
}

fun sum(num1: Int, num2:Int): Int {
    return num1+num2
}



