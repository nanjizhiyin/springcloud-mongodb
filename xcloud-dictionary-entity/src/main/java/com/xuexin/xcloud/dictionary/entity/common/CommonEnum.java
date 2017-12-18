package com.xuexin.xcloud.dictionary.entity.common;

public class CommonEnum {

    public enum ObjectiveStem {
        OBJECTIVESTEM_OBJ("客观题",0), OBJECTIVESTEM_SBJ("主观题",1);

        private String statusStr;
        private int value;

        private ObjectiveStem(String str, int value) {
            this.statusStr = str;
            this.value = value;
        }

        public int value() {
            return this.value;
        }

        public String str() {
            return this.statusStr;
        }


        public static String fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            switch (value) {
                case 0:
                    return OBJECTIVESTEM_OBJ.str();
                case 1:
                    return OBJECTIVESTEM_SBJ.str();
                default:
                    return null;
            }
        }
    }


}
