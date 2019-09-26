package main.castle;

import java.util.HashMap;

public class Room {
    public String description;
    private HashMap<String,Room> exits = new HashMap<String,Room>();
    public void setExit(String dir,Room room){
        exits.put(dir, room);
    }
    public Room(String description)
    {
        this.description = description;
    }

    /*public void setExits(Room north, Room east, Room south, Room west)
    {
        if(north != null)
            northExit = north;
        if(east != null)
            eastExit = east;
        if(south != null)
            southExit = south;
        if(west != null)
            westExit = west;
    }*/

    @Override
    public String toString()
    {
        return description;
    }
    public String getExitDesc(){
        StringBuffer sb = new StringBuffer();
        for (String dir :exits.keySet()) {
            sb.append(dir);
            sb.append(" ");
        }
        return sb.toString();
    }
    public Room getExit(String direction){
        return exits.get(direction);
    }
}
