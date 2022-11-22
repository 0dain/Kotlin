package ex20221122

fun main() {

    //Java for문
    //for(int i=0;i<3;i++){
//          println(i)
//      }

    //Kotlin for문
        //step 1 기본값 => 생략되어 있음
    //for(i in 0..2){
//          println(i)
//      }

    // 1~10까지 출력
    for(i in 1..10){
        println(i)
    }

    //1,3,5,7,9를 출력
    for(i in 1..9 step 2) println(i)
    //실행코드가 한 줄이면 중괄호{} 생략 가능


    // 10~1까지 출력
    // 숫자가 작아져야 한다면?! in downTo
    //step 1 기본값 => 생략되어 있음
    for (i in 10 downTo 1){
        println(i)
    }

    //10,8,6,4,2를 출력
    for(i in 10 downTo 2 step 2) println(i)



}