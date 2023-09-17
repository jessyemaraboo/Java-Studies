package edu.Jess.Projects;

public class SmartTv {
  boolean enabled = false;
  int channel = 1;
  int volume = 5;

  public void changeChannel(int newChannel) {
    channel = newChannel;
  }

  /*public void changeChannel(){
    channel++;
    System.out.println("\n\n");
  }*/
  
  public void volumeUp(){
    volume++;
    System.out.println("\n\n");
  }

  public void volumeLow(){
    volume--;
    System.out.println("\n\n");
  }

  public void turnOn(){
    enabled = true;
  }
  public void turnOff(){
    enabled = false;
  }
}
