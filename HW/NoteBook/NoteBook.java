package HW.NoteBook;

import java.util.Objects;

class NoteBook {
    private String model; //Модель
    private String color; //Цвет
    private int ram; //ОЗУ
    private String processor; //Процессор
    private String videocard; //Видеокарта
    private String oc; //Операционная система

    public NoteBook(String model) {
        this.model = model;
        color = "Unknown";
        ram = -1;
        videocard = "Unknown";
        processor = "Unknown";
        oc = "Unknown";
    }

    public NoteBook(String model, String color, int ram, String processor, String videocard, String oc) {
        this.model = model;
        this.color = color;
        this.ram = ram;
        this.videocard = videocard;
        this.processor = processor;
        this.oc = oc;
    }

    public void setModel(String value){
        this.model = value;
    }

    public String getModel(){
        return this.model;
    }

    public void setColor(String value){
        this.color = value;
    }

    public String getColor(){
        return this.color;
    }

    public void setRam(int value){
        this.ram = value;
    }

    public int getRam(){
        return this.ram;
    }

    public void setProcessor(String value){
        this.processor = value;
    }

    public String getProcessor(){
        return this.processor;
    }

    public void setVideocard(String value){
        this.videocard = value;
    }

    public String getVideocard(){
        return this.videocard;
    }

    public void setOc(String value){
        this.oc = value;
    }

    public String getOc(){
        return this.oc;
    }

    @Override
    public String toString() {
        String s = "";
        s = "Модель: "+model+"\n";
        s = s + "Цвет: "+color+"\n";
        s = s + "ОЗУ: "+Integer.toString(ram)+"\n";
        s = s + "Процессор: "+processor+"\n";
        s = s + "Видеокарта: "+videocard+"\n";
        s = s + "Операционная система: "+oc+"\n";

        return s;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NoteBook noteBook = (NoteBook) obj;
        return model.equals(noteBook.model) && color.equals(noteBook.color) && ram == noteBook.ram && processor.equals(noteBook.processor) && videocard.equals(noteBook.videocard) && oc.equals(noteBook.oc);
    }

    @Override
    public int hashCode(){
        return Objects.hash(model, color, ram, processor, videocard, oc);
    }
}