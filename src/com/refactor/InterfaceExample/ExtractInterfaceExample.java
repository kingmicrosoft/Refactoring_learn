package com.refactor.InterfaceExample;

/**
 * Created by wenchai on 2015/8/27.
 */
public class ExtractInterfaceExample {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getHabbits() {
        return habbits;
    }

    public void setHabbits(String habbits) {
        this.habbits = habbits;
    }

    private String name;
    private String address;
    private String habbits;

    public String toXML() {
        return "<Customer><name>" + name + "</name></Customer>";
    }

    public ExtractInterfaceExample(String name, String address, String habbits) {
        this.name = name;
        this.address = address;
        this.habbits = habbits;
    }

    public static void main(String[] args) {
        ExtractInterfaceExample example = new ExtractInterfaceExample("cain", "hangzhou", "swiming");

        System.out.println(example.toXML());
    }
}
