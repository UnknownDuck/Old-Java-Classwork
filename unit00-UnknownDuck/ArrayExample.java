public class ArrayExample {

    int[] numbers = new int[5];
numbers[0] = 2;
numbers[1] = 3;
numbers[2] = 5;
numbers[3] = 7;
numbers[4] = 11;
for(int i=0; i<numbers.length; i++) {
  System.out.println(numbers[i]);
    
}

//2D Array


int[][] table = new int[5][4];
// row 1
int[] entireRow = table[1];
// the value at row 3 column 2
int individualValue = table[3][2];
for(int row=0; row<table.length; row++) {
  for(int col=0; col < table[row].length; col++) {
    System.out.println(table[row][col]);
  }
}
//In a 2D array a single index is used to get an entire row, 
//and two indexes are needed to retrieve an individual value 
//from a row.

