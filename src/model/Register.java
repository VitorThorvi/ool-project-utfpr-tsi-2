package model;

import java.util.ArrayList;

public class Register {
    private Client client;
    private ArrayList<Address> addressList = new ArrayList<>();

    public Client getClient() {
        return client;
    }

    public ArrayList<Address> getAddresses() {
        return  addressList;
    }

    private Address address;

    public void setNewAddress (Address address) {
        this.addressList.add(address);
    }

    public Register(Client client, Address address) {
        this.client = client;
        this.address = address;
        addressList.add(address);
    }
}
