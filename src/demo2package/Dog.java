package demo2package;

public class Dog extends Animal
{ //inheritance
        public void features1()
        {
                System.out.println(" I am from child class ");
        }
        public int add(int x, int y){
                int z= x+y;
                System.out.println("Overloading: adding interger numbers" + z );
                return x+y;
        }
        public float add(float x, float y){
                float z= x+y;
                System.out.println("Overloading : adding float numbers" + z);
                return z;
        }
}
