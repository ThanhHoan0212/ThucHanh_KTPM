package org.example;

public class XmlToJsonAdapter implements JsonService {

    private XmlService xmlService;

    public XmlToJsonAdapter(XmlService xmlService) {
        this.xmlService = xmlService;
    }

    @Override
    public String processJson(String jsonData) {
        String xml = jsonToXml(jsonData);

        String xmlResult = xmlService.processXml(xml);

        return xmlToJson(xmlResult);
    }

    private String jsonToXml(String json) {
        return "<data>" + json + "</data>";
    }

    private String xmlToJson(String xml) {
        return "{ \"result\": \"" + xml + "\" }";
    }
}

