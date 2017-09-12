package com.tricon.fcmpushnotify;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Sample {
	
	
	public static void main(String[] args) {
		final String SERVER_KEY = "AIzaSyBamWGUTsIKNt6ytxMwZej13LEO03Yzd8U";
		
		FCMPush.setKey(SERVER_KEY);
		
		
		// create Notification object 
		Notification raven = new Notification();
		List<String> asd =new ArrayList<String>();
		asd.add("dUvtQ4GJVC8:APA91bGtcLkdNDSx2Am9uMJ7gIoQ5MYkkrNsV6XBreSZjn-No2Vk1nPXTIf83tc5Q3U4Ro5dc0hRMtPmgD1eVBx-t6c2w3fGVZFttIB0si2zWWuo8GANsYL9IqF41PYgIlNMFFhqwUpn");
		
		HashMap<String, Object> data = new HashMap<String, Object>();
		data.put("Hello", "World!");
		data.put("Marco", "Polo");
		data.put("Foo", "Bar");
		
		// build raven message using the builder pattern
		raven
		//to("dUvtQ4GJVC8:APA91bGtcLkdNDSx2Am9uMJ7gIoQ5MYkkrNsV6XBreSZjn-No2Vk1nPXTIf83tc5Q3U4Ro5dc0hRMtPmgD1eVBx-t6c2w3fGVZFttIB0si2zWWuo8GANsYL9IqF41PYgIlNMFFhqwUpn")
			
			
			.delay_while_idle(true)
			.time_to_live(100)
			.restricted_package_name("com.blp.mobileapp.orion")
			.dry_run(false)
			.data(data)
			.registration_ids(asd)
			.title("Testing")
			.body("Hello World!")
			.color("#00FF00");
		
		
		

		// push the raven message
		FcmResponse response = FCMPush.push(raven);
		
		// alternatively set static notification first.
		/*Pushraven.setNotification(raven);
		response = Pushraven.push();*/
		
		// prints response code and message
		System.out.println(response);
	}
}
