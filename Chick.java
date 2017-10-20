class Chick implements Animal {     
     private String myType;     
     private String mySound;      
     public Chick(String type, String sound)     {         
         myType = type;         
         mySound = sound;     
     }     
     public Chick(String type, String sound, String secondSound)     {         
         myType = type;  
         if(Math.random()<.50)
         {
         	mySound = sound;
         } else 
         {
         	mySound = secondSound;
         }
     }      
     public String getSound(){return mySound;}     
     public String getType(){return myType;} 
}