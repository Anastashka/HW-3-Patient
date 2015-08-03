package Patient;

/**
 * Created by Anastasia on 24.07.2015.
 */
public class Storage  {
    private Patient[] patients;

    public Storage(Patient[] arrayPatients){
        this.patients = arrayPatients;
    }

    public void thisDiagnosis(String diagnosis){
        for(Patient patient:patients){
           if( diagnosis.equals(patient.getDiagnosis())){
               System.out.println(patient.toString());
           }
        }
    }
    public void numberMedicalCard(int number1, int number2){
        for(Patient patient:patients){
            if(patient.getNumberMedicalCard()>=number1 && patient.getNumberMedicalCard() <= number2){
                System.out.println(patient.toString());
            }
        }
    }
    public void showArray(){
        for(Patient patient:patients){
            System.out.println(patient.toString());
        }

    }
}
