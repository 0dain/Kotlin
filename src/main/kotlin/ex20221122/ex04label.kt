package ex20221122

fun main() {

    //label: while문에 이름(라벨)을 부여해서 break할 때 어떤 while문을 종료시킬 건지 정할 수 있음
    //continue도 동일하게 어떤 while문을 동작시킬 건지 정할 수 있음
    
    outer@while (true){
        println("바깥 while문 작동중")
        inner@while (true){
            println("안쪽 while문 작동중")
            //어떤 조건을 만족할 경우 바깥 while문까지 종료시키고 싶음
            //기존 Java는 2가지의 종료조건이 필요했었음
            //Kotlin에서는 한 번에 종료할 수 있음
//            break //근접한 while문 한 개만 빠져나감
            break@outer //outer라는 이름을 가진 바깥 while문까지 종료됨
//            break@inner //inner라는 이름을 가진 안쪽 while문만 종료됨
        }
    }
    
}