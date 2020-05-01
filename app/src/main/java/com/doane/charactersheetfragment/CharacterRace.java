package com.doane.charactersheetfragment;

public class CharacterRace {
    private String name;
    private int imageResourceId;

    private CharacterRace(String name, int imageResourceId){
        this.name = name;
        this.imageResourceId = imageResourceId;
    }

    public static final CharacterRace[] races = {
            new CharacterRace("Aasimar", R.drawable.aasimar),
            new CharacterRace("Dragonborn", R.drawable.dragonborn),
            new CharacterRace("Dwarf", R.drawable.dwarf),
            new CharacterRace("Elf", R.drawable.elf),
            new CharacterRace("Firbolg,", R.drawable.firbolg),
            new CharacterRace("Gnome", R.drawable.gnome),
            new CharacterRace("Goliath", R.drawable.goliath),
            new CharacterRace("Half-Elf", R.drawable.halfelf),
            new CharacterRace("Halfling", R.drawable.halfling),
            new CharacterRace("Half-Orc", R.drawable.halforc),
            new CharacterRace("Kenku", R.drawable.kenku),
            new CharacterRace("Lizardfolk", R.drawable.lizardfolk),
            new CharacterRace("Tabaxi", R.drawable.tabaxi),
            new CharacterRace("Tiefling", R.drawable.tiefling),
            new CharacterRace("Triton", R.drawable.triton)

    };

    public String getName(){
        return name;
    }

    public int getImageResourceId(){
        return imageResourceId;
    }
}
