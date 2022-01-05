class CarFeatures{


		
			static void Carspeed(){
				System.out.println("195kmph");
				
				}
				static void Carspeed(int speed){
					System.out.println(speed);
				}
				
				static void Carspeed(String topspeed ){
					System.out.println(topspeed);
				}
			    static void Carspeed(int num, String avgspeed){
					System.out.println(num+" "+avgspeed);
				}
				static void Carspeed(String rspeed, double number){
					System.out.println(rspeed+" "+number);
				}
				
				
			  static void  Carmusic(){
				System.out.println("play song");
			    }

			static void Carmusic(int noofmusic){
					System.out.println(noofmusic);
			}	
				
				static void Carmusic(String name){ 
					System.out.println(name);
					
				}
				
				static void Carmusic (int numsongs, String songname ){
					System.out.println(numsongs+" "+songname);
				}
				
				static void Carmusic(String song , int nos){
					System.out.println(song+" "+nos);
				}
				
				static void Carstunt(){
					System.out.println("car stunt");
				}
				
				static void Carstunt(long typeofstunt){
					System.out.println(typeofstunt);
				}
				
				static void Carstunt(String location){
					System.out.println(location);
				}
				
				static void Carstunt(String name, double time){
					System.out.println(name+""+time);
				}
				
				static void Carstunt(int noofstunts, String stuntname){
					System.out.println(noofstunts+" "+stuntname);
				}
				
				static void Cartechnologies(){
					System.out.println("Car newTechnologies");
				}
				
				static void Cartechnologies(int nob){
					System.out.println("nob");
					
				}
				
				static void Cartechnologies(String breaking){
					System.out.println("breaking");
				}
				
				static void Cartechnologies(String car, int noseats){
					System.out.println(car+" "+ noseats);
				}
				
				static void Cartechnologies(int nobreks, String nametech){
					System.out.println(nobreks+""+nametech);
				}
				
				
				
				
				public static void main(String [] ad){
					Carspeed();
					Carspeed(45);
					Carspeed("Topspeed");
					Carspeed(145,"kmph");
					Carspeed("rpm",6.61);
					Carmusic();
					Carmusic(1000);
					Carmusic("music1");
					Carmusic(100,"music100");
					Carmusic("music" , 4);
					Carstunt();
					Carstunt(10);
					Carstunt("karwar");
					Carstunt("jumping",10.30);
					Carstunt(4,"sliding");
					Cartechnologies();
					Cartechnologies(4);
					Cartechnologies("automaticbreaking");
					Cartechnologies("maruti800",4);
					Cartechnologies(4,"automaticbreaking");
				}
		
}


