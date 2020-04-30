package com.doane.charactersheetfragment;

public class CharacterClass {
    private String name;
    private int imageResourceId;

    private CharacterClass(String name, int imageResourceId){
        this.name = name;
        this.imageResourceId = imageResourceId;
    }

    public static final CharacterClass[] classes = {
      new CharacterClass("Bard", R.drawable.bard),
      new CharacterClass("Cleric", R.drawable.cleric),
      new CharacterClass("Druid", R.drawable.druid),
      new CharacterClass("Fighter", R.drawable.fighter),
      new CharacterClass("Monk", R.drawable.monk),
      new CharacterClass("Paladin", R.drawable.paladin),
      new CharacterClass("Ranger", R.drawable.ranger),
      new CharacterClass("Rogue", R.drawable.rogue),
      new CharacterClass("Sorcerer", R.drawable.sorcerer),
      new CharacterClass("Warlock", R.drawable.warlock),
      new CharacterClass("Wizard", R.drawable.wiizard)
    };

    public String getName(){
        return name;
    }

    public int getImageResourceId(){
        return imageResourceId;
    }
}
