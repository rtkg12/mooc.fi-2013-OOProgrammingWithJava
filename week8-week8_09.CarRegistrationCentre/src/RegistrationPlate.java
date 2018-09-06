
public class RegistrationPlate {
    // don't change the code which is already given to you

    // ATTENTION: the object variable types are final, meaning that their value cannot be changed!
    private final String regCode;
    private final String country;

    public RegistrationPlate(String country, String regCode) {
        this.regCode = regCode;
        this.country = country;
    }
    
    public String regCode(){
        return this.regCode;
    }
    
    public String country(){
        return this.country;
    }

    @Override
    public String toString() {
        return country + " " + regCode;
    }
    
    @Override 
    public boolean equals(Object object){
        if(object==null){
            return false;
        }
        
        if(object.getClass()!=this.getClass()){
            return false;
        }
        
        RegistrationPlate plate = (RegistrationPlate) object;
        
        if(plate.regCode==null || !plate.regCode.equals(this.regCode) ){
            return false;
        }
        
        
        if(plate.country==null || !plate.country.equals(this.country) ){
            return false;
        }
        return true;
    }
    
    @Override
    public int hashCode(){
        String plate = this.country + this.regCode;
        
        return plate.hashCode();
    }

}
