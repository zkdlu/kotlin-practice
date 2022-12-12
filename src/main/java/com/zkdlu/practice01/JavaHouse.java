package com.zkdlu.practice01;

public class JavaHouse {
    private String address;
    private LivingRoom livingRoom;

    public JavaHouse(final String address, final LivingRoom livingRoom) {
        this.address = address;
        this.livingRoom = livingRoom;
    }

    public LivingRoom getLivingRoom() {
        return livingRoom;
    }

    public class LivingRoom {
        private double area;

        public LivingRoom(final double area) {
            this.area = area;
        }

        public String getAddress() {
            return JavaHouse.this.address;
        }
    }
}
