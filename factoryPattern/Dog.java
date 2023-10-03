package factoryPattern;

public class Dog implements Pet {
    private String breed;

    

    
    
    @Override
    public String makeSound() {
        return "Aw, aw!";
    }

    @Override
    public String play() {
        return "Catching objects that you throw!";
    }

    @Override
    public void setBreed(String breed) {
        this.breed = breed;
    }
    
    public String getBreed() {
        return breed;
    }
	@Override
	public void setNoOfLives(Integer noOfLives) {
		// TODO Auto-generated method stub
		
	}
	
}
