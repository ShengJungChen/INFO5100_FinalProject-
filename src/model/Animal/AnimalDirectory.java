/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Animal;

import java.util.ArrayList;
import model.Enterprise.AnimalShelterEnterprise;
import model.Enterprise.Enterprise;
import model.UserAccount.UserAccount;

/**
 *
 * @author anitachen
 */
public class AnimalDirectory {
    
    private ArrayList<Animal> animalList;
    private Enterprise enterprise;

    public AnimalDirectory(Enterprise enterprise) {
        this.animalList = new ArrayList<Animal>();
        this.enterprise = enterprise;
    }

    public ArrayList<Animal> getAnimalList() {
        return animalList;
    }

    public Enterprise getEnterprise() {
        return enterprise;
    }
    
    public Animal createAnimal(String name){
        Animal animal = new Animal(name);
        animal.setEnterprise((AnimalShelterEnterprise) enterprise);
        animal.setId(animalList.size()+1);
        animalList.add(animal); 
        return animal;
    }
    
    public boolean nameIsUnique(String name){
        for(Animal animal : animalList){
            if(name.equalsIgnoreCase(animal.getName())){
                return false;
            }
        }
        return true;
    }
    
    public Animal getAnimalByName(String name){
        for (Animal a : animalList){
            if (name.equalsIgnoreCase(a.getName())) return a;
        }
        return null;
    }
    
    public Animal getAnimalByManager(UserAccount manager){
        for (Animal a : animalList) {
            if (a.getManager() == manager && a.getAdoptor() == null) return a;
        }
        return null;
    }
    
    public Animal getAnimalByAdoptionRequested(Boolean b){
        for(Animal a:animalList){
            if(b==true) return a;
        }
        return null;
    }
}
