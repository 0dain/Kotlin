package ex20221122

import java.util.Scanner

fun main() {

    //while(조건식){
//          조건식이 true일 동안, 실행시킬 코드
//      }
    // 단, 조건식은 무조건 결과값으로 true/false를 돌려줘야 함
        //비교연산자, 논리연산자, Boolean(true)

    //팩토리얼 계산하는 프로그램을 만들어보자

    print("숫자를 입력하세요: ")
    val sc=Scanner(System.`in`)
//    var answer=sc.nextInt()
    var answer= readLine()?.toInt()

    //곱하기 결과를 누적시키는 변수
    var num=1

    //스캐너 사용
//    while (true){
//       num*=answer
//        answer--
//        if(answer<=0) break
//    }

    //readLine()사용

    while (true){
        if(answer!=null) {
            num *= answer
            answer--
            if (answer <= 0) break
        }
    }

    println("결과값: $num")


}
