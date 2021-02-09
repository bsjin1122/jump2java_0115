package jump2java_0115;

class Add{
int num1, num2;

Add(int n1, int n2){
	num1 = n1;
	num2 = n2;
}
void add() {
	System.out.println("°ª : " + (num1 + num2));
}

}



public class HelloWorld {
public static void main(String[] args) {
Add adder = new Add(3,5);
adder.add();



}


}
