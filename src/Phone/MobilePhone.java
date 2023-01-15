package Phone;

import java.util.ArrayList;

public class MobilePhone {


      private String myNumber;
      private ArrayList<Contacts> myContacts;


      public MobilePhone(String myNumber){
          this.myNumber= myNumber;
          this.myContacts=new ArrayList<Contacts>();

      }

      public boolean addNewContact(Contacts contacts){
          if(findContact(contacts.getName())>=0){
              System.out.println("Contact is alrady on file");
              return false;
          }

          myContacts.add(contacts);
          return true;
      }

      private  int FindContact(Contacts contacts){

          return this.myContacts.indexOf(contacts);
      }

    private  int findContact(String contactsName){
        for (int i = 0; i < this.myContacts.size(); i++) {
            Contacts contact =this.myContacts.get(i);
            if(contact.getName().equals(contactsName)){
                return i;
            }
        }

        return -1;
    }


}
