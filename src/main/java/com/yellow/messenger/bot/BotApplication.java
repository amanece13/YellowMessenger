package com.yellow.messenger.bot;

import com.yellow.messenger.bot.util.DetectIntentTexts;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class BotApplication {

	public static void main(String[] args) {
		SpringApplication.run(BotApplication.class, args);

		String userInput;

		Scanner sn = new Scanner(System.in);


		System.out.println("*. Lets Chat");
		System.out.println("*. Type exit to exit");
		while(true){
			// Prompt the use to make a choice
			System.out.println("User:");

			//Capture the user input in scanner object and store it in a pre decalred variable
			userInput = sn.nextLine();

			//Check the user input
			switch(userInput){
				case "exit":
					//exit from the program
					System.out.println("Exiting...");
					System.exit(0);
				default:
					//inform user in case of invalid choice.
					List<String> test =new ArrayList<String>();
					test.add(userInput);
					try {
						DetectIntentTexts.detectIntentTexts("yellowmessenger-iubnee",test,"sahvdhjavdhjashg","en");
					} catch (Exception e) {
						System.exit(0);
					}
			}
		}


	}

}
