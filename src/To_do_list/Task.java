package To_do_list;

public class Task {
    private int id;
    private String title;
    private String description;
    private String status;

    public Task(String title, String description) {
        this.title = title;
        this.description = description;
        this.status = "NEW";
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
}
