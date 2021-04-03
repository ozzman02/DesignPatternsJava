package com.patterns.additional.ioc;

public class Container {

    private ImageService imageService;

    public void init() {
        imageService = new ImageService();
        imageService.setFileSystem(new UnixFileSystem());
    }

    public ImageService getImageService() {
        return imageService;
    }

}
