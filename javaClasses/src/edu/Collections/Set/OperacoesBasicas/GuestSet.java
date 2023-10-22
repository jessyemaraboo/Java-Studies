package edu.Collections.Set.OperacoesBasicas;
import java.util.HashSet;
import java.util.Set;

public class GuestSet {
  private Set<Guest> guestSet;

  public GuestSet(){
    this.guestSet = new HashSet<>();
  }

  public void addNewGuest(String name, int invitationCode){
    guestSet.add(new Guest(name, invitationCode));	
  }

  public void removeGuestByInvitationCode(int invitationCode){
    Guest guestsToRemove = null;
    for(Guest g : guestSet){
      if(g.getInvitationCode() == (invitationCode)){
        guestsToRemove = g;
        break;
      } else{
        System.err.println("There`s no guest with the invitation code!\n" + invitationCode);
      }
    }
    guestSet.remove(guestsToRemove);
  }

  public int countGuests(){
    return guestSet.size();
  }

  public void showGuestList(){
    System.out.println(guestSet);
  }

  public static void main(String[] args) {
    
    GuestSet guestSet = new GuestSet();

    
    guestSet.addNewGuest("Julia P.", 4520);
    guestSet.addNewGuest("Lucas", 4523);
    guestSet.addNewGuest("Paulina", 4522);
    guestSet.addNewGuest("Julia P.", 4523);
    System.out.println(guestSet.countGuests());
    guestSet.showGuestList();








  }

}
