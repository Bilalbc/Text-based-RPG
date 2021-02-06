/**
 * Room
 */
public class Room {

    private int travelTable[];
    private int N, E, S, W;
    private String description;
    private String type;


    public Room(String type, int row, int collumn, int size){
        if(row == 0){
            N = -1;
            S = 1;
        }
        else if(row == 1){
            N = 1;
            S = 1;
        }
        else if(row == 2){
            N = 1;
            S = -1;
        }
        if(collumn == 0){
            E = 1;
            W = -1;
        }
        else if(collumn == 1){
            E = 1;
            W = 1;
        }
        else if(collumn == 2){
            E = -1;
            W = 1;
        }

        this.travelTable = new int [] {N, E, S, W};

        switch (type){
            case "Combat":
                break;
            case "Treasure":
                break;
            case "Ascend":
                break;
        }

        

    }

}

