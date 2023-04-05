package adapterpattern.model;

public class UserUSImpl implements UserUS {
    String socialNumber;
    String firstName;
    String lastName;
    Integer weight; //pounds
    Integer height; //feet

    public UserUSImpl(String socialNumber, String firstName, String lastName, Integer weight, Integer height) {
        this.socialNumber = socialNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.weight = weight;
        this.height = height;
    }

    @Override
    public String getSocialNumber() {
        return socialNumber;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public Integer getWeight() {
        return weight;
    }

    @Override
    public Integer getHeight() {
        return height;
    }
}