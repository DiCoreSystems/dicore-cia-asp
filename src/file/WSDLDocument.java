package file;

import wsdlhelper.*;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by CSZ on 07.11.2017.
 */
public class WSDLDocument {
    private File path;
    private HashMap<String, String> namespaces = new HashMap<>();
    private ArrayList<MessageTuple> messages = new ArrayList<>();
    private ArrayList<TypeTriple> types = new ArrayList<>();
    private ArrayList<OperationTuple> operations = new ArrayList<>();
    private ArrayList<WSDLInterface> interfaces = new ArrayList<>();
    private ArrayList<String> bindings = new ArrayList<>();
    private Service service;

    public WSDLDocument(String path){
        this.path = new File(path);
    }

    //----------------------------------

    public File getPath() {
        return path;
    }

    //----------------------------------

    public ArrayList<MessageTuple> getMessages() {
        return messages;
    }

    public void setMessages(ArrayList<MessageTuple> messages) {
        this.messages = messages;
    }

    public void addMessage(MessageTuple message){
        messages.add(message);
    }

    //----------------------------------

    public ArrayList<TypeTriple> getTypes() {
        return types;
    }

    public void setTypes(ArrayList<TypeTriple> types) {
        this.types = types;
    }

    public void addType(TypeTriple type){
        types.add(type);
    }

    //----------------------------------

    public ArrayList<OperationTuple> getOperations() {
        return operations;
    }

    public void setOperations(ArrayList<OperationTuple> operations) {
        this.operations = operations;
    }

    public void addOperation(OperationTuple operation){
        operations.add(operation);
    }

    //----------------------------------

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    //----------------------------------

    public ArrayList<String> getBindings() {
        return bindings;
    }

    public void setBindings(ArrayList<String> bindings) {
        this.bindings = bindings;
    }

    public void addBinding(String binding) {
        bindings.add(binding);
    }

    //----------------------------------

    public HashMap<String, String> getNamespaceMap() {
        return namespaces;
    }

    //----------------------------------

    public ArrayList<WSDLInterface> getInterfaces() {
        return interfaces;
    }


}
