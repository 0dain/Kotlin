package ex20221121

fun main() {

    //when문: Java에서 switch문과 동일
    //when(변수){
//      값1 -> 실행코드 1
//      값2 -> 실행코드 2
//      ........
//      else -> 실행코드 n
//      }

    val a=2
    when(a){
        //여러가지 값의 실행코드가 같을 경우
        //a가 1 또는 2일 경우 -> 실행코드를 실행
        1,2 -> println("a는 1,2입니다")
//        2 -> println("a는 2입니다")
        else -> println("a는 1, 2가 아닙니다")
    }

    //식 => true/false가 될 수 있는 식이어야 함
    when(a%2){
        0 -> println("a는 짝수입니다")
        1 -> println("a는 홀수입니다")
        else -> println("")
    }

    //in .. (범위 설정)
    when(a){
        in 0..10 -> println("0~10")
        in 11..20 -> println("11~20")
        else -> println(a)
    }

    //객체/변수의 데이터 타입을 확인할 때 가장 많이 사용!
        //Any, is, when
        //is: 데이터 타입 확인할 때 사용
        //Any: Java Object(최상위 클래스)와 비슷함
        //when: 조건식의 일종
    //반복문
    //**함수
        //람다식

}