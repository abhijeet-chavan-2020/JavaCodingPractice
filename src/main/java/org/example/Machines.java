package org.example;

public class Machines {
    public Machines() {
        System.out.println("Inside Machine's Super Constructor");
    }

    int machineID;
    String machineName;

    public int getMachineID() {
        return machineID;
    }

    public void setMachineID(int machineID) {
        this.machineID = machineID;
    }

    public String getMachineName() {
        return machineName;
    }

    public void setMachineName(String machineName) {
        this.machineName = machineName;
    }
}
