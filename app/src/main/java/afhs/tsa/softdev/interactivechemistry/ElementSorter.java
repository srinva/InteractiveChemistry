package afhs.tsa.softdev.interactivechemistry;

/**
 * Created by Jason on 1/23/2017.
 */

public class ElementSorter {
    public ElementSorter(){
    }

    public String protonSorter(int protonCount){
        switch(protonCount){
            case 1:
                return "Hydrogen";
            case 2:
                return "Helium";
            case 3:
                return "Lithium";
            case 4:
                return "Beryllium";
            case 5:
                return "Boron";
            case 6:
                return "Carbon";
            case 7:
                return "Nitrogen";
            case 8:
                return "Oxygen";
            case 9:
                return "Fluorine";
            case 10:
                return "Neon";
            case 11:
                return "Sodium";
            default:
                return "Unknown";
        }
    }
}
