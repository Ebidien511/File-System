package service;

import dto.Folder;

public class FileSystemManagementService {
    StringBuilder currentPath;
    Folder rootFolder;

    public FileSystemManagementService() {
        currentPath = new StringBuilder();
        rootFolder = new Folder("root",null);
    }
}
