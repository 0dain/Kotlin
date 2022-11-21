package ex20221121


import java.util.Scanner
import kotlin.random.Random
import kotlin.random.nextInt

fun main() {

    //랜덤한 두 수를 더한 값과 사용자가 입력한 답이 일치하면 "정답입니다"를 출력하고,
    //일치하지 않으면 "오답입니다" 출력

    val rd= Random//랜덤 객체 생성
    val num1=rd.nextInt(10)+1//1~10까지
    val num2=rd.nextInt(10)+1//1~10까지

    println("$num1 + $num2 = ?")
    //코틀린에서는 같은 자료형이랑만 연산 가능!

    val sc=Scanner(System.`in`)
    //sc.nextInt()
    print("Enter the Answer: ")
//    var answer= readLine()?.toInt()

    //readLine을 사용하게 되면 사용자는 아무 문자/숫자가 입력 가능한 상태
    //toInt => "1234" 사용자가 무조건 숫자를 입력해야 형변환이 가능

    try{
        var answer= readLine()?.toInt()
        val result=if(num1+num2==answer) "정답입니다" else "오답입니다"

        println("결과: $result")
    }catch (e: NumberFormatException){
        println("숫자만 입력가능합니다")
    }

    //Exception 잡는 방법
    //try catch => 예외상황

}