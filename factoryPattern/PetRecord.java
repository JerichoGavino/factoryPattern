package factoryPattern;

public class PetRecord {
    private String petId;
    private String petName;
    private Pet pet;
    private String breed;
    private int NoofLives;

    public String getPetId() {
        return petId;
    }

    public void setPetId(String petId) {
        this.petId = petId;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }
    
		
	

	public void setBreed(String breed) {
		// TODO Auto-generated method stub
		this.breed = breed;
		
	}

	public void setNoofLives(int noofLives) {
		NoofLives = noofLives;
		
	}

	public String getBreed() {
		// TODO Auto-generated method stub
		return breed;
	}

	public int getNoofLives() {
		// TODO Auto-generated method stub
		return NoofLives;
	}
    
   
}
