public class ParkingLot{
    public ParkingSpot[] spots; 

    public ParkingLot(){
        this.spots = new ParkingSpot[10];
        for (int i = 0; i < 10; i++){ //for i in range(10)
            if (i <= 1){
                this.spots[i] = new ParkingSpot(true);
            }
            else{
                this.spots[i] = new ParkingSpot(false);
            }
        }
    }
    public int carspot(car car){
        int index = -1; // -1 cuz there wont actually be -1 and its bad 
        for (int i = 0;i < 10; i++){
            if (this.spots[i].parkedCar == null){ //thats inside of that inside of that inside another thing -- right inside left 
                if ((this.spots[i].handicap == true)&&(car.handicap == true)){
                    this.spots[i].parkedCar = car; // car or null sooooooo
                    index = i; // i gets deleted after for loop -- variable to store it 
                    break;
                }
                else if ((this.spots[i].handicap == false)&&(car.handicap == false)){
                    this.spots[i].parkedCar = car;
                    index = i;
                    break; // done with loop - ends loop early 
                }
            } 
        } return index;
    }
   public car removecar(int numberlot){ //given spot
        car carreturn = null; //match the types 
        if (this.spots[numberlot].parkedCar != null){ // != only used in if statements
            carreturn = this.spots[numberlot].parkedCar;
            this.spots[numberlot].parkedCar = null;
        }
        return carreturn;
   }
    public String toString(){ //count number of handicap spots and not handicap spots that are open 
        int handicapspots = 0;
        int openspots = 0;
        for (int i = 0;i < 10; i++){
            if ((this.spots[i].handicap == true)&&(this.spots[i].parkedCar == null)){//open spots
                handicapspots +=1;
            } 
            else if (this.spots[i].handicap == false)&&(this.spots[i].parkedCar == null){
                openspots +=1;
            }
        }
        return handicapspots+ " " +openspots;
    }
}