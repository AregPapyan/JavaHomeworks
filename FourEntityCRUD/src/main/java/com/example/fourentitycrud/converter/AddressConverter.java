package com.example.fourentitycrud.converter;

import com.example.fourentitycrud.controller.model.AddressModel;
import com.example.fourentitycrud.persistence.model.Address;

public class AddressConverter {
    public static AddressModel addressIntoAddressModel(Address address){
        AddressModel addressModel = new AddressModel();
        addressModel.setCountry(address.getCountry());
        addressModel.setCity(address.getCity());
        addressModel.setStreet(address.getStreet());
        addressModel.setHouseNumber(address.getHouseNumber());
        return addressModel;
    }
    public static Address addressModelIntoAddress(AddressModel addressModel){
        Address address = new Address();
        address.setCountry(addressModel.getCountry());
        address.setCity(addressModel.getCity());
        address.setStreet(addressModel.getStreet());
        address.setHouseNumber(addressModel.getHouseNumber());
        return address;
    }
}
