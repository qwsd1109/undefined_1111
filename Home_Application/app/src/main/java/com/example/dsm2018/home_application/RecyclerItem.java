package com.example.dsm2018.home_application;

public class RecyclerItem{
        int image;
        String userid;
        String main_title;
        String sub_title;
        public RecyclerItem(){

        }
        public RecyclerItem(int image, String main_title, String sub_title,String userid){
            this.image=image;
            this.main_title=main_title;
            this.sub_title=sub_title;
            this.userid=userid;
        }

        public int getImage() {
            return image;
        }

        public void setImage(int image) {
            this.image = image;
        }

        public String getUserid() {
            return userid;
        }

        public void setUserid(String userid) {
            this.userid = userid;
        }

        public String getMain_title() {
            return main_title;
        }

    public void setMain_title(String main_title) {
        this.main_title = main_title;
    }

        public String getSub_title() {
            return sub_title;
        }

        public void setSub_title(String sub_title) {
            this.sub_title = sub_title;
        }
}

