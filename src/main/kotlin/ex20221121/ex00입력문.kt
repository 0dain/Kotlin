package ex20221121

import java.util.Scanner

fun main() {

    //입력하는 도구를 가져오는 방법
        //자바: Scanner sc = new Scanner(System.in)
    //코틀린
    val sc=Scanner(System.`in`)
    //java: .in 콘솔창으로 입력될 무언가가 있다
    // .`in` -> run창에 입력될 무언가가 있다

    //readLine() 사용해서 런창에 입력할 수 있다
    println("readLine()을 사용한 입력 >> ")
//    var num1=readLine()//리턴타입 String?
    //readLine은 무조건 String? 타입을 리턴함
    //숫자로 사용하고 싶다면?! .toInt()로 형변환 해야 함
    var num1=readLine()?.toInt()
//    var num1=readLine()!!.toInt() => 단정기호를 쓰고 싶다면
//    println("readLine()을 반드시 입력해야 합니다 >> ") 로 써줘야 함!

    //1. null이 발생할 수 있는 상황에 대해서 조건식 부여
    if (num1 != null) {
        print(num1+2)
    }

    //2. Elvis 연산자
//    print(num1?.plus(2) ?: 실행코드, 데이터 값)
    
    //3. 단정기호 사용하기
//    print(num1!! +2)

    //? 는 사용 불가능

}