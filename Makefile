all: Item Inventory Character Knight Wizard Thief Team Armor Weapon Potion HealthPotion ManaPotion
	@javac test.java

Item:
	@javac Item.java

Inventory:
	@javac Inventory.java

Character:
	@javac Character.java

Knight:
	@javac Knight.java

Wizard:
	@javac Wizard.java

Thief:
	@javac Thief.java

Team:
	@javac Team.java

Armor:
	@javac Armor.java

Weapon:
	@javac Weapon.java

Potion:
	@javac Potion.java

HealthPotion:
	@javac HealthPotion.java

ManaPotion:
	@javac ManaPotion.java

clean:
	@@find -name "*~" | xargs rm -rf rm *.class Items/*.class

run:
	@java test
