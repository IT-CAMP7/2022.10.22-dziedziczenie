package pl.camp.it.dziedziczenie.typywyliczeniowe;

public enum Console {
    XBOXONE("Intel", "AMD", 512, 16, "Microsoft", "One"),
    PS5("Intel", "NVidia", 1024, 32, "Sony", "PlayStation 5"),
    PS4("Intel", "NVidia", 512, 16, "Sony", "PlayStation 4"),
    SWITCH("Intel", "AMD", 512, 16, "Nintendo", "Switch");

    private String cpu;
    private String gpu;
    private int storage;
    private int memory;
    private String brand;
    private String model;

    Console(String cpu, String gpu, int storage, int memory, String brand, String model) {
        this.cpu = cpu;
        this.gpu = gpu;
        this.storage = storage;
        this.memory = memory;
        this.brand = brand;
        this.model = model;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
