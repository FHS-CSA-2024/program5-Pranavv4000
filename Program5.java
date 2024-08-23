
//Your code here
public class Program5 {
    public static void main(String[] args) {
        //Assign the variables
        int royalMiles = 286;
        double royalGallons = 9.0;
        double royalAvg= 0.0;
        int KoopaKingMiles= 412;
        double KoopaKingGallons = 40.0;
        double koopaKingAvg = 0.0;
        int PipeFrameMiles = 361;
        double PipeFrameGallons = 18.0;
        double pipeFrameAvg = 0.0;        
        int BadawagonMiles = 161;
        double BadawagonGallons = 11.0;
        double badawagonAvg = 0.0;
        
        
        //Casting
        royalAvg= (double) (royalMiles/royalGallons)*100;
        royalAvg = (int)(royalAvg+5)/10;
        royalAvg = (double)(royalAvg)/10;
        koopaKingAvg = (double)(KoopaKingMiles/KoopaKingGallons);
        pipeFrameAvg = (double) (PipeFrameMiles/PipeFrameGallons)*100;
        pipeFrameAvg = (int)(pipeFrameAvg+5)/10;
        pipeFrameAvg = (double)(pipeFrameAvg)/10;
        badawagonAvg = (double)(BadawagonMiles/BadawagonGallons)*100;
        badawagonAvg = (int)(badawagonAvg+5)/10;
        badawagonAvg = (double)(badawagonAvg)/10;
        
    
        System.out.println("Mushroom Cup Prix Racer Average Miles/Per Gallon:");
        System.out.println("Royale averaged "+royalAvg +" m/g");
        System.out.println("Koopa King averaged "+ koopaKingAvg + " m/g");
        System.out.println("Pipe Frame averaged " + pipeFrameAvg + " m/g");
        System.out.println("Badwagon averaged " + badawagonAvg + " m/g");
        
        
        
        
        
    }
}
//Paste console output below:
/*
Mushroom Cup Prix Racer Average Miles/Per Gallon:
Royale averaged 31.8 m/g
Koopa King averaged 10.3 m/g
Pipe Frame averaged 20.1 m/g
Badwagon averaged 14.6 m/g

*/
