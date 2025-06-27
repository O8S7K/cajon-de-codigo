public class Tarea {

    private int id;
    private String content;
    private boolean isChecked;

    //Representa una tarea con ID, contenido y estado de completado.

   public Tarea(int id, String content, boolean isChecked) {
    this.id = id;
    this.content = content;
    this.isChecked = isChecked;
}

    public int getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public boolean isChecked() {
        return isChecked;
    }

    public void setChecked(boolean isChecked) {
        this.isChecked = isChecked;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setId(int id) {
        this.id = id;
    }


    
}