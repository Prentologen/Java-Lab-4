public class Customer {
    private int id;
    private String прізвище;
    private String імя;
    private String поБатькові;
    private String адреса;
    private String НомерКредитноїКартки;
    private String НомерБанківськогоРахунку;

    public Customer(int id, String прізвище, String імя, String поБатькові, String адреса, String НомерКредитноїКартки, String НомерБанківськогоРахунку) {
        this.id = id;
        this.прізвище = прізвище;
        this.імя = імя;
        this.поБатькові = поБатькові;
        this.адреса = адреса;
        this.НомерКредитноїКартки = НомерКредитноїКартки;
        this.НомерБанківськогоРахунку = НомерБанківськогоРахунку;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getПрізвище() {
        return прізвище;
    }

    public void setПрізвище(String прізвище) {
        this.прізвище = прізвище;
    }

    public String getІмя() {
        return імя;
    }

    public void setІмя(String імя) {
        this.імя = імя;
    }

    public String getПоБатькові() {
        return поБатькові;
    }

    public void setПоБатькові(String поБатькові) {
        this.поБатькові = поБатькові;
    }

    public String getАдреса() {
        return адреса;
    }

    public void setАдреса(String адреса) {
        this.адреса = адреса;
    }

    public String getНомерКредитноїКартки() {
        return НомерКредитноїКартки;
    }

    public void setНомерКредитноїКартки(String номерКредитноїКартки) {
        this.НомерКредитноїКартки = номерКредитноїКартки;
    }

    public String getНомерБанківськогоРахунку() {
        return НомерБанківськогоРахунку;
    }

    public void setНомерБанківськогоРахунку(String номерБанківськогоРахунку) {
        this.НомерБанківськогоРахунку = номерБанківськогоРахунку;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", прізвище='" + прізвище + '\'' +
                ", імя='" + імя + '\'' +
                ", поБатькові='" + поБатькові + '\'' +
                ", адреса='" + адреса + '\'' +
                ", НомерКредитноїКартки='" + НомерКредитноїКартки + '\'' +
                ", НомерБанківськогоРахунку='" + НомерБанківськогоРахунку + '\'' +
                '}';
    }
}