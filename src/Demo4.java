import java.io.Serializable;

// Non-return type method
void main(){

}

// return type method
public int value(){
    return 10;
}

void myMethod(){
    // return 10; // You can't return an expression in non-return type methods
    // You can omit the return statement if you want in non-return type methods
}

int getValue(){
    // return; // You have to return an expression in return type methods
    // return true; // The expression should be type compatible with the return type as well
    return 5 + 2;   // It is mandatory to have the return statement in return type methods
}

public <T, K, M> M doSomething(){
    return (M) new Object();
}

public <T, K extends Object & Serializable, M> K doSomething1(){
    return (K) new Object();
}