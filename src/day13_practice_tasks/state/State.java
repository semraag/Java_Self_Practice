package day13_practice_tasks.state;

public class State {
    private String name, abbreviation,politicalParty,governor,senator;
    private int population;

    public State(String name, String abbreviation, String politicalParty, String governor, String senator, int population) {
        setName(name);
        setAbbreviation(abbreviation);
        setPoliticalParty(politicalParty);
        setGovernor(governor);
        setSenator(senator);
        setPopulation(population);
    }

    public String getName() {return name;}
    public String getAbbreviation() {return abbreviation;}
    public String getPoliticalParty() {return politicalParty;}
    public String getGovernor() {return governor;}
    public String getSenator() {return senator;}
    public int getPopulation() {return population;}

    public void setName(String name) {
        if (name == null || name.isEmpty() || name.isBlank()) {
            System.err.println("Invalid input/data for the brand: " + name);
            System.exit(1);
        }
        this.name = name;}
    public void setAbbreviation(String abbreviation) {
        if (abbreviation == null || abbreviation.isEmpty() || abbreviation.isBlank()) {
            System.err.println("Invalid input/data for the abbreviation: " + abbreviation);
            System.exit(1);
        }
        this.abbreviation = abbreviation;}

    public void setPoliticalParty(String politicalParty) {
        if (politicalParty == null || politicalParty.isEmpty() || politicalParty.isBlank()) {
            System.err.println("Invalid input/data for the politicalParty: " + politicalParty);
            System.exit(1);
        }
        this.politicalParty = politicalParty;}

    public void setGovernor(String governor) {
        if (governor == null || governor.isEmpty() || governor.isBlank()) {
            System.err.println("Invalid input/data for the governor: " + governor);
            System.exit(1);
        }
        this.governor = governor;}
    public void setSenator(String senator) {
        if (senator == null || senator.isEmpty() || senator.isBlank()) {
            System.err.println("Invalid input/data for the senator: " + senator);
            System.exit(1);
        }
        this.senator = senator;}

    public void setPopulation(int population) {
        if (population <= 0) {
            System.err.println("Unit price can not be negative: " + population);
            System.exit(1);
        }
        this.population = population;}

    @Override
    public String toString() {
        return getClass().getSimpleName()+ "{" +
                "name='" + name + '\'' +
                ", abbreviation='" + abbreviation + '\'' +
                ", politicalParty='" + politicalParty + '\'' +
                ", governor='" + governor + '\'' +
                ", senator='" + senator + '\'' +
                ", population=" + population +
                '}';
    }
}
