public class parkinglot{
    public parkingspot[] spots; 

    public parkinglot(){
        this.spots = new parkingspot[10];
        for (int i = 0; i < 10; i++){ //for i in range(10)
            if (i <= 1){
                this.spots[i] = new parkingspot(true);
            }
            else{
                this.spots[i] = new parkingspot(false);
            }
        }
    }

    public toString(){

        return "";
        
    }
}