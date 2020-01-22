package com.cg.jdbc.controller;

import java.util.List;
import java.util.Scanner;

import com.cg.jdbc.Validation.Validation;
import com.cg.jdbc.bean.SchedulerBean;
import com.cg.jdbc.dao.SchedulerDao;
import com.cg.jdbc.factory.SchedulerFactory;


public class Scheduler {
	public static void main() {

		Scanner sc = new Scanner(System.in);
		SchedulerBean bean = new SchedulerBean();
		SchedulerDao dao = SchedulerFactory.instanceOfSchedulerDaoImpl();

		while (true) {
			System.out.println("Press 1 to Insert Scheduler data");
			System.out.println("Press 2 to Delete Scheduler data");
			System.out.println("Press 3 to Get All Scheduler data");
			System.out.println("press 4 to Go back to home page");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				char ch = 'y';
				while (ch == 'y') {

					System.out.println("Enter Scheduler Id");

					String schid = sc.next();

					if (Validation.isNumber(schid)) {
						int schid1 = Integer.parseInt(schid);
						ch = 'n';
						bean.setScheduleId(schid1);
					} else {
						System.err.println("Enter only Numbers");
					}

				}
				char a = 'y';
				while (a == 'y') {
					System.out.println("Enter Contract id");

					String contractid = sc.next();

					if (Validation.isNumber(contractid)) {
						int contractid1 = Integer.parseInt(contractid);
						a = 'n';
						bean.setContractId(contractid1);
					} else {
						System.err.println("Enter only Numbers");
					}
				}

				char b = 'y';
				while (b == 'y') {
					System.out.println("Enter Product id");

					String prodid = sc.next();

					if (Validation.isNumber(prodid)) {
						int prodid1 = Integer.parseInt(prodid);
						b = 'n';
						bean.setProductId(prodid1);
					} else {
						System.err.println("Enter only Numbers");
					}
				}
				
				char i = 'y';
				while (i == 'y') {
					System.out.println("Enter  Quantity");

					String quant = sc.next();

					if (Validation.isNumber(quant)) {
						int quant1 = Integer.parseInt(quant);
						i = 'n';
						bean.setQuantity(quant1);
					} else {
						System.err.println("Enter only Numbers");
					}
				}

				

				char d = 'y';
				while (d == 'y') {
					System.out.println("Enter Delivery Date");
					String deliveryDate = sc.next();

					if (Validation.isValidDate(deliveryDate)) {
						d = 'n';
						bean.setDelivaryDate(deliveryDate);
					} else {
						System.err.println("Enter correct date format ");
					}
				}

				
			
				boolean check = dao.addScheduler(bean);
				if (check) {
					System.out.println("Scheduler added Successfully....");
				} else {
					System.err.println("Scheduler not added");
				}

				break;

			case 2:
				char f = 'y';
				while (f == 'y') {

					System.out.println("Enter Scheduler id to be Deleted");

					String schedulerid = sc.next();

					if (Validation.isNumber(schedulerid)) {
						int schedulerid1 = Integer.parseInt(schedulerid);

						f = 'n';
						bean.setScheduleId(schedulerid1);
						boolean check2 = dao.deleteScheduler(schedulerid1);
						if (check2) {
							System.out.println("Scheduler Deleted Successfully....");
						} else {
							System.err.println("Scheduler not Found");
						}
					} else {
						System.err.println("Enter only Numbers");
					}

				}
                 break;
			case 3:

				List<SchedulerBean> c1 = dao.getAllScheduler(bean);

				System.out.println(c1);

				break;
			case 4:
				Home.home();
				break;
			default:
				break;

			}
		}

	}

}
