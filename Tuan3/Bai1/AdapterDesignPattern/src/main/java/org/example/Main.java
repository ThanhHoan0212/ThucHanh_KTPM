package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        XmlService xmlService = new XmlService();

        JsonService adapter = new XmlToJsonAdapter(xmlService);

        String jsonRequest = "{ \"name\": \"ChatGPT\", \"type\": \"AI\" }";

        String response = adapter.processJson(jsonRequest);

        System.out.println("Response trả về cho Client (JSON): " + response);
    }
}
