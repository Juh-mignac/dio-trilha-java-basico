public class Usuario {
    
    public static void main(String[] args) throws Exception {
        

        SmartTv smartTv = new SmartTv();

        smartTv.dinimuirVolume();
        smartTv.dinimuirVolume();
        smartTv.dinimuirVolume();
        smartTv.aumentarVolume();
                        
        System.out.println("Canal Atual:" + smartTv.canal);
        
        smartTv.mudarCanal (13);
        System.out.println("canal Atual:" + smartTv.canal);

        System.out.println("TV ligada ?" + smartTv.ligada);
        System.out.println("Canal atual:" + smartTv.canal);
        System.out.println("Volume atual :" + smartTv.volume);


        smartTv.ligar (); 

        System.out.println("Novo status -> TV ligada? " + smartTv.ligada);

        smartTv.desligar ();   

        System.out.println("Novo status -> TV ligada? " + smartTv.ligada);



    } 

}
