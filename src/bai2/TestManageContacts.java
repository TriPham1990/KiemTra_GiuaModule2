package bai2;

public class TestManageContacts {
    public static void main(String[] args) {
        ManageContacts manageContacts = new ManageContacts();

        manageContacts.addPhoneNumber("Phạm", "Trí", "0123456789");
        manageContacts.addPhoneNumber("Jonny", "Zombie", "0999888777");
        manageContacts.addPhoneNumber("Jimmi","Teo","0555555555");
        manageContacts.addPhoneNumber("Jonny", "Jun","5627673512");

//        manageContacts.displayContacts();

        manageContacts.editContacs("Jonny", "Zombie", "0999999999");
//        manageContacts.editContacs("xxx","yyy","6666");

//        manageContacts.removeContact("0999999999");
        manageContacts.displayContacts();

//        manageContacts.searchContactByFirtName("Jonny");

//        manageContacts.searchContactByLastName("Teo");

//        manageContacts.searchContactByPhoneNumber("0123456789");
    }
}
