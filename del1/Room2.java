package del1;

public class Room2 {

        private String name;
        private String roomDescription;
        private Room north, south, west, east;


        Room2(String name, String roomDescription) {
            setName(name);
            setRoomDescription(roomDescription);
        }


        public void setRooms(Room north, Room south, Room west, Room east) {
            this.north = north;
            this.south = south;
            this.west = west;
            this.east = east;
        }

        public Room getRooms(char direction) {
            switch (direction){
                case 'N':
                    return north;
                case 'S':
                    return south;
                case 'W':
                    return west;
                case 'E':
                    return east;
                default:
                    return null;
            }
        }

        public void setName(String name) {
            this.name = name;
        }
        public String getName(){
            return name;
        }


        public void setRoomDescription(String roomDescription) {
            this.roomDescription = roomDescription;
        }
        public String getRoomDescription() {
            return roomDescription;
        }

    }