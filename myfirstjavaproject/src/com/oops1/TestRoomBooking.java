package com.oops1;

import java.util.Scanner;

public class TestRoomBooking {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		HotelRoomBooking booking = new HotelRoomBooking();

		System.out.println("******** HOTEL ROOM BOOKING ********");
		System.out.print("Enter Guest Name: ");
		if (!booking.setGuestName(sc.nextLine()))
			return;

		System.out.print("Enter Room Number (>0): ");
		if (!booking.setRoomNumber(sc.nextInt()))
			return;

		System.out.print("Enter Room Type (normal / deluxe): ");
		if (!booking.setRoomType(sc.next()))
			return;

		booking.bookRoom();
		booking.displayBookingStatus();

		sc.close();
	}
}
