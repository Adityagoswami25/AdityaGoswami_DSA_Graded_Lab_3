package com.glearning.client;

import com.glearning.service.Service;

public class Client {
	public static void main(String[] args) {
		
		Service service = new Service();
        String input = "([[]])";
        
        if (service.isBalanced(input)) {
            System.out.println("The entered String has Balanced Brackets");
        } else {
            System.out.println("The entered Strings do not contain Balanced Brackets");
        }
    }

}
