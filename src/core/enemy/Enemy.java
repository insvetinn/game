package core.enemy;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public abstract class Enemy {
	private static int health;
	private static int attack;
	private static int defence;
	private static int speed;
	private static int distance;
	private static String description;
	
	private static int fieldToInt(Properties properties, String field) {
		return Integer.parseInt(properties.get(field).toString());
	}
	
	private static String fieldToString(Properties properties, String field) {
		return properties.get(field).toString();
	}
	
	protected static void loadProperties(String propertyName) {
		InputStream inputStream = ClassLoader.getSystemResourceAsStream(propertyName);
		Properties properties = new Properties();
		try {
			properties.load(inputStream);
		} catch (IOException e) {
			e.printStackTrace();
		}
		health = fieldToInt(properties, "health");
		attack = fieldToInt(properties, "attack");
		defence = fieldToInt(properties, "defence");
		speed = fieldToInt(properties, "speed");
		distance = fieldToInt(properties, "distance");
		description = fieldToString(properties, "description");
	}
	
	public int getHealth() {
		return health;
	}
	
	public void setHealth(int health) {
		this.health = health;
	}
	
	public int getAttack() {
		return attack;
	}
	
	public void setAttack(int attack) {
		this.attack = attack;
	}
	
	public int getDefence() {
		return defence;
	}
	
	public void setDefence(int defence) {
		this.defence = defence;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public int getDistance() {
		return distance;
	}
	
	public void setDistance(int distance) {
		this.distance = distance;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
}
