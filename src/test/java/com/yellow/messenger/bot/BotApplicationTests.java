package com.yellow.messenger.bot;

import com.yellow.messenger.bot.util.DetectIntentTexts;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;

@SpringBootTest
class BotApplicationTests {

	@Test
	void contextLoads() {
		ArrayList<String> strings = new ArrayList<>();

		strings.add("Hi");
		strings.add("How are you doing");
		try {
			DetectIntentTexts.detectIntentTexts("yellowmessenger-iubnee",strings,"sahvdhjavdhjashg","en");
		} catch (Exception e) {e.printStackTrace();

		}

	}

}
