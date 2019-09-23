package com.example.hanghangtwo;

public class ImageUploadInfo {
    public String imageName;

    public String imageURL;

    public int imageId;

    public ImageUploadInfo() {

    }

    public ImageUploadInfo(String name, String url, int id) {

        this.imageName = name;
        this.imageURL = url;
        this.imageId = id;
    }

    public String getImageName() {
        return imageName;
    }

    public String getImageURL() {
        return imageURL;
    }

    public int getImageId() {
        return imageId;
    }
}
