package com.oops1;

public class HotelRoomBooking {

	private int roomNumber;
	private String guestName;
	private String roomType;
	private double roomPrice;
	private boolean isBooked;

	// ---------- SETTERS WITH VALIDATION ----------

	public boolean setGuestName(String name) {
		if (name != null && !name.trim().isEmpty()) {
			this.guestName = name;
			return true;
		}
		System.out.println("❌ Invalid Guest Name. Program Terminated.");
		return false;
	}

	public boolean setRoomNumber(int num) {
		if (num > 0) {
			this.roomNumber = num;
			return true;
		}
		System.out.println("❌ Invalid Room Number. Program Terminated.");
		return false;
	}

	public boolean setRoomType(String type) {
		if (type != null && (type.equalsIgnoreCase("normal") || type.equalsIgnoreCase("deluxe"))) {
			this.roomType = type;
			return true;
		}
		System.out.println("❌ Invalid Room Type. Program Terminated.");
		return false;
	}

	// ---------- BUSINESS LOGIC ----------

	public void calculateRoomPrice() {
		if (roomType.equalsIgnoreCase("normal"))
			roomPrice = 2000;
		else
			roomPrice = 3500;
	}

	public void bookRoom() {
		if (!isBooked) {
			calculateRoomPrice();
			isBooked = true;
		}
	}

	// ---------- DISPLAY ----------

	public void displayBookingStatus() {
		System.out.println("********************************************");
		if (isBooked) {
			System.out.println("✅ Room Successfully Booked");
			System.out.println("Guest Name : " + guestName);
			System.out.println("Room Number: " + roomNumber);
			System.out.println("Room Type  : " + roomType);
			System.out.println("Room Price : ₹" + roomPrice);
		} else {
			System.out.println("❌ Booking Failed");
		}
		System.out.println("********************************************");
	}
}
