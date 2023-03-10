package com.vigfoot.vigbucket.vo;

import lombok.Builder;
import lombok.Data;

public class Bucket {

    @Data
    @Builder
    public static class File {
        private String name;
        private boolean isDirectory;
        private boolean isEmpty;
    }
}
