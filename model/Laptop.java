package model;


public class Laptop {
    int id;
    String modelName;
    int modelRAM;
    int modelHDDSize;
    String modelOSName;
    String modelColor;

    public Laptop() {
    }

    public Laptop(int id, String modelName, int modelRAM, int modelHDDSize, String modelOSName, String modelColor) {
        this.id = id;
        this.modelName = modelName;
        this.modelRAM = modelRAM;
        this.modelHDDSize = modelHDDSize;
        this.modelOSName = modelOSName;
        this.modelColor = modelColor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getModelRAM() {
        return modelRAM;
    }

    public void setModelRAM(int modelRAM) {
        this.modelRAM = modelRAM;
    }

    public int getModelHDDSize() {
        return modelHDDSize;
    }

    public void setModelHDDSize(int modelHDDSize) {
        this.modelHDDSize = modelHDDSize;
    }

    public String getModelOSName() {
        return modelOSName;
    }

    public void setModelOSName(String modelOSName) {
        this.modelOSName = modelOSName;
    }

    public String getModelColor() {
        return modelColor;
    }

    public void setModelColor(String modelColor) {
        this.modelColor = modelColor;
    }
}
