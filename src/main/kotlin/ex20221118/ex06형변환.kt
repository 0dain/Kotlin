package ex20221118

fun main() {

    //Kotlin에서는 서로 다른 자료형의 변수를 비교하거나 연산할 수 없음
    //비교하거나 연산하고 싶다면 자료형이 서로 다른 변수를 같은 자료형으로 만들어줘야 함

    //형변환(Cast)
    //1. 자료형을 확인하는 방법
    //1-1) println(변수명::class.java.simpleName) => 변수에 대한 자료형 출력
    //1-2) is => 자료형을 체크할 수 있는 연산자
        //instanceof랑 같은 역할: 객체타입을 확인하는 역할

    //2. 자료형 변환하는 방법
    //2-1) .toString, .toFloat, ... : 기본타입 형변환

    val num=256
    println(num::class.java.simpleName)//int 출력

    val str=num.toString()//문자열로 형변환해서 str에 저장!
    println(str::class.java.simpleName)//String 출력

}