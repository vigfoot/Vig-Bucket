package com.vigfoot.vigbucket.vo;

import lombok.Builder;

public class Bucket {

    @Builder
    public static class File {
        private String directory;
    }
}
