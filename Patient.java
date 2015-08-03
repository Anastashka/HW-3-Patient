package Patient;

public class Patient {
    private int id;
    private String name;
    private String surname;
    private String patronymic;
    private int numberMedicalCard;
    private String diagnosis;

    public Patient(int id, String name, String surname, String patronymic, int numberMedicalCard, String diagnosis){
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.numberMedicalCard = numberMedicalCard;
        this.diagnosis = diagnosis;
    }

    public void setId( int id){
        this.id = id;
    }
    public void setName( String name ){
        this.name = name;
    }
    public void setSurname (String surname){
        this.surname = name;
    }

    public void setPatronymic (String patronymic){
        this.patronymic = patronymic;
    }
    public void setNumberMedicalCard (int numberMedicalCard){
        this.numberMedicalCard = numberMedicalCard;
    }

    public void setDiagnosis (String diagnosis){
        this.diagnosis = diagnosis;

    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getSurname(){
        return surname;
    }
    public String getPatronymic(){
        return patronymic;
    }
    public String getDiagnosis(){
        return diagnosis;
    }
    public int getNumberMedicalCard(){
        return numberMedicalCard;
    }
    public String toString(){
        return getName()+" "+ getPatronymic() + " " + getSurname() +"\n id: " +
                getId()+" \n number medical card: "+ getNumberMedicalCard()+" \n diagnosis: " + getDiagnosis() + "\n";
    }
}
