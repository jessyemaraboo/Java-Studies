package edu.Collections.Set.OperacoesBasicas;
import java.util.Objects;

public class Guest {
  //Atributes
  private String name;
  private int InvitationCode;

  public Guest(String name, int InvitationCode) {
    this.name = name;
    this.InvitationCode = InvitationCode;
  }

  public String getName() {
    return name;
  }

  public int getInvitationCode() {
    return InvitationCode;
  }

  @Override
  public String toString() {
    return "Guest[Name: " + name + "| Invitation Code: " + InvitationCode + "]\n";
  }
  
  @Override
public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Guest)) return false; // Adicione o retorno falso aqui para verificar o tipo.

    Guest guest = (Guest) o;
    return getInvitationCode() == guest.getInvitationCode(); // Mova o retorno aqui para comparar os códigos de convite.
}

  @Override
  public int hashCode() {
    return Objects.hash(getInvitationCode());
  }
}
