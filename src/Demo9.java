import java.util.Arrays;

void main(){
    print(10);      // Method Invocation Expression Statement
    System.out.println("Hello");
    print(20);
    print(30);
    System.out.println("====================");
    printArgs("ijse", 10,10,20,30,40);
}

void print(int num){
    System.out.println(num);
}

void printArgs(String str, int y, int ... nums){
    System.out.println(str);
    System.out.println(y);
    System.out.println(nums.length);
    System.out.println(nums);
    System.out.println(Arrays.toString(nums));
}