package service;

import dto.Folder;

public class FileSystemManagementService {
    StringBuilder currentPath;
    Folder rootFolder;

    public FileSystemManagementService() {
        currentPath = new StringBuilder();
        rootFolder = new Folder("root",null);
    }

    public void createFolder(String folderName, Folder destinationFolder) {
        Folder newFolder = new Folder(folderName,destinationFolder);
        destinationFolder.addItem(newFolder);
        System.out.println(newFolder.getName() + " has been created in " + destinationFolder.getName());
    }
    public void createFile(String fileName, Folder destinationFolder) {}

    public void deleteFolder(String fileName) {}
    public void deleteFile(String fileName) {}

    public void findEntry(){}

    public void copyEntry(){}

    public void moveEntry(){}
}
