package core.item;

import core.player.Player;
import massage.Message;

public class Apple extends Food {
	public static void takeIn() {
		Player.setHealth(Player.getHealth() + 20);
		Message.healthUp();
	}
}
