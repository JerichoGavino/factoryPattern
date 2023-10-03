package factoryPattern;

public class Cat implements Pet {
    private Integer noOfLives;
 
    @Override
    public void setNoOfLives(Integer noOfLives) {
        this.noOfLives = noOfLives;
    }
    
    public Integer getNoOfLives() {
        return noOfLives;
    }

   

    @Override
    public String makeSound() {
        return "Meow, meow!";
    }

    @Override
    public String play() {
        return "Catching/pursuing moving objects!";
    
	
	}

	@Override
	public void setBreed(String breed) {
		// TODO Auto-generated method stub
		
	}
}
