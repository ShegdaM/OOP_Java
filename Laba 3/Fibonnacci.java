package com.tasks3.fibonacci;

public class Fibonacci
{
	public long getNumber(int position){
		//PUT YOUR CODE HERE
        if(position <= 0) {
			return -1;
		}
        else if(position == 1 || position == 2){
            return 1;
        }
		
		long number1 = 0, number2 = 1, number = 0;
		int i = 1;
		
		while(i != position) {
			number = number1 + number2;
			number1 = number2;
			number2 = number;
			i++;
		}
		
		return number;
		//PUT YOUR CODE HERE
	}
}