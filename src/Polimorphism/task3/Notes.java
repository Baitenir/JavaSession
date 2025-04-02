package Polimorphism.task3;

public class Notes {
    private String titleOfNotes;
    private String notes;

    public Notes() {
    }

    public Notes(String titleOfNotes, String notes) {
        this.titleOfNotes = titleOfNotes;
        this.notes = notes;
    }

    public String getTitleOfNotes() {
        return titleOfNotes;
    }

    public void setTitleOfNotes(String titleOfNotes) {
        this.titleOfNotes = titleOfNotes;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    // todo methods:

    public void createTitleOfNote(String title){
        titleOfNotes = title;
    }

    public void createNote(String updateNotes){
        this.notes = updateNotes;
        System.out.println("Successful saved!");
    }

    public void addNote (String note){
        setNotes(this.notes + ". " + note);
    }

    public void deleteNotes (){
        this.titleOfNotes = null;
        this.notes = null;
        System.out.println("Successful deleted");
    }

    public void showTitleAndNote (){
        System.out.println("Title: " + titleOfNotes);
        System.out.println("notes: " + notes);
    }

    public String getUpdatedNotes (){
        return null;
    }
}
