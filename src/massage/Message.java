package massage;

import core.player.Player;

public class Message {
	public static void say(String content) {
		System.out.println(content);
	}
	
	public static void success() {
		say("Success!");
	}
	
	public static void alert() {
		say("Error!");
	}
	
	public static void healthUp() {
		say("Health up, now is " + Player.getHealth() + ".");
	}
	
	public static void healthDown() {
		say("Health down, now is " + Player.getHealth() + ".");
	}
}
