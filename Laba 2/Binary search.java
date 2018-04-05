public class BinarySearch {

  public static void main(String[] args) {

    int data[] = { 3, 6, 7, 10, 34, 56, 60 };
    int numberToFind = 10;

    // PUT YOUR CODE HERE
int length = data.length;
    
    for(int i=0;i<length;i++) {
      if(data[i]==numberToFind) {
        System.out.println(i);
        return;}
    }
    System.out.println(-1);

    // PUT YOUR CODE HERE
  }
}