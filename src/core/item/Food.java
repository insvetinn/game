package core.item;

import core.player.Player;
import massage.Message;

public class Food extends Item {
	public static void takeIn() {
		Player.setHealth(Player.getHealth());
		Message.healthUp();
	}
}
