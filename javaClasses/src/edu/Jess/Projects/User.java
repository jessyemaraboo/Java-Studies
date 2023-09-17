package edu.Jess.Projects;

public class User {
  public static void main(String[] args) throws Exception {
       SmartTv smartTv = new SmartTv();

  System.out.println("\nIs TV turned on? " + smartTv.enabled);
  System.out.println("Current channel: " + smartTv.channel);
  System.out.println("Current volume: " + smartTv.volume +"\n\n");

  smartTv.turnOn();
  System.out.print("New status: Tv on? " + smartTv.enabled+"\n\n");
    smartTv.turnOff();
    System.out.print("New status: Tv on? " + smartTv.enabled+"\n\n");

    smartTv.volumeUp();
    System.out.print("New status: VolumeUp: " + smartTv.volume+"\n\n");

    smartTv.changeChannel(25);
    System.out.print("New status: Current Channel: " + smartTv.channel + "\n\n");

  }
    
 


}
