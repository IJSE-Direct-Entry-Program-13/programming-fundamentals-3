import java.util.Arrays;

void main(){
    int[] nums = {10,20,30,40};
    System.out.println(STR."main: \{nums}");
    //myMethod(nums);
    myMethod(10,20,30,40,50);
    System.out.println(Arrays.toString(nums));
}

//void myMethod(int[] numbers){
//    System.out.println(STR."myMethod: \{numbers}");
//    System.out.println(Arrays.toString(numbers));
//    numbers[1] = 15;
//}

void myMethod(int... numbers){
    System.out.println(STR."myMethod: \{numbers}");
    System.out.println(Arrays.toString(numbers));
    numbers[1] = 15;
}

void myCrazyMethod(int[][][]... args){

}

<T, K> void myGenericMethod(int x, T y, K newVariable, T... args){

}