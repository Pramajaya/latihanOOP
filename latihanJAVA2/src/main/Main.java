package main;

import java.util.Scanner;

public class Main {
	Scanner scan = new Scanner(System.in);
	FootwearList fList = new FootwearList();

	String name;
	int price;
	String type;
	double height;
	int wheel;

	int index;
	int x;

	boolean done;

	void Add() {
		do {
			done = false;
			try {
				while (true) {
					System.out.print("Footwear name [3 - 25 characters]: ");
					name = scan.nextLine();

					if (name.length() >= 3 && name.length() <= 25) {
						break;
					}
				}
			} catch (Exception e) {
				done = true;
				scan.next();
			}
		} while (done);

		do {
			done = false;
			try {
				while (true) {
					System.out.println("Footwear price [more than 10000]");
					price = scan.nextInt();
					scan.nextLine();

					if (price > 10000) {
						break;
					}
				}
			} catch (Exception e) {
				done = true;
				scan.next();
			}
		} while (done);

		do {
			done = false;
			try {
				while (true) {
					System.out.println("Footwear type [Heels / RollerSkate]: ");
					type = scan.nextLine();

					switch (type) {
					case "Heels":
						do {
							done = false;
							try {
								while (true) {
									System.out.println("Footwear height [1.0 - 9.0]: ");
									height = scan.nextDouble();
									scan.nextLine();

									if (height >= 1.0 && height <= 9.0) {
										fList.addFootwearList(new Heels(name, price, type, height));
										break;
									}
								}
							} catch (Exception e) {
								done = true;
								scan.next();
							}
						} while (done);
						break;

					case "RollerSkate":
						do {
							done = false;
							try {
								while (true) {
									System.out.println("Footwear total wheel [2 - 4 inclusive]: ");
									wheel = scan.nextInt();
									scan.nextLine();

									if (wheel >= 2 && wheel <= 4) {
										fList.addFootwearList(new RollerSkate(name, price, type, wheel));
										break;
									}
								}
							} catch (Exception e) {
								done = true;
								scan.next();
							}
						} while (done);
						break;
					}

					if (type.equals("Heels") || type.equals("RollerSkate")) {
						break;
					}
				}
			} catch (Exception e) {
				done = true;
				scan.next();
			}
		} while (done);
		System.out.println("Foot wear added successfully !!");
	}

	void View() {
		if (fList.footwearListSize() <= 0) {
			System.out.println("There are no footwears to display !");
		} else {
			fList.displayFootwearList();
		}
	}

	void Update() {
		if (fList.footwearListSize() <= 0) {
			System.out.println("There are no footwears to display !");
		} else {
			do {
				done = false;
				try {
					while (true) {
						fList.displayFootwearList();
						
						System.out.println("Input footwear index to update : ");
						index = scan.nextInt();
						scan.nextLine();
						x = index - 1;

						if (x >= 0 && x <= fList.footwearListSize()) {
							break;
						}
					}
				} catch (Exception e) {
					done = true;
					scan.next();
				}
			} while (done);

			do {
				done = false;
				try {
					while (true) {
						System.out.print("Footwear name [3 - 25 characters]: ");
						name = scan.nextLine();

						if (name.length() >= 3 && name.length() <= 25) {
							break;
						}
					}
				} catch (Exception e) {
					done = true;
					scan.next();
				}
			} while (done);

			do {
				done = false;
				try {
					while (true) {
						System.out.println("Footwear price [more than 10000]");
						price = scan.nextInt();
						scan.nextLine();

						if (price > 10000) {
							break;
						}
					}
				} catch (Exception e) {
					done = true;
					scan.next();
				}
			} while (done);

			if(fList.heelsFootwearList()) {
				do {
					done = false;
					try {
						while (true) {
							System.out.println("Footwear height [1.0 - 9.0]: ");
							height = scan.nextDouble();
							scan.nextLine();

							if (height >= 1.0 && height <= 9.0) {
								fList.updateFootwearList(index, new Heels(name, price, "Heels", height));
								break;
							}
						}
					} catch (Exception e) {
						done = true;
						scan.next();
					}
				} while (done);
			} else if(fList.rollerSkateFootwearList()) {
				do {
					done = false;
					try {
						while (true) {
							System.out.println("Footwear total wheel [2 - 4 inclusive]: ");
							wheel = scan.nextInt();
							scan.nextLine();

							if (wheel >= 2 && wheel <= 4) {
								fList.updateFootwearList(index, new RollerSkate(name, price, "RollerSkate", wheel));
								break;
							}
						}
					} catch (Exception e) {
						done = true;
						scan.next();
					}
				} while (done);
			}
			
			System.out.println("Footwear updated successfully !!");
		}
	}

	void Delete() {
		if (fList.footwearListSize() <= 0) {
			System.out.println("There are no footwears to display !");
		} else {

			do {
				done = false;
				try {
					while (true) {
						fList.displayFootwearList();

						System.out.print("Input footwear index to update : ");
						index = scan.nextInt();
						scan.nextLine();
						x = index - 1;

						if (x >= 0 && x <= fList.footwearListSize()) {
							fList.deleteFootwearList(x);
							break;
						}
					}
				} catch (Exception e) {
					done = true;
					scan.next();
				}
			} while (done);

			System.out.println("Footwear deleted successfully !!");
		}
	}

	void Exit() {
		System.out.println("Thanks for using Just DU It Program !");
	}

	// ========================================================
	public Main() {
		int home = 0;
		do {
			done = false;
			try {
				do {
					System.out.println("Just Du It !!");
					System.out.println("=============");
					System.out.println("1. Add Footwear");
					System.out.println("2. View Footwear");
					System.out.println("3. Update Footwear");
					System.out.println("4. Delete Footwear");
					System.out.println("5. Exit");
					System.out.print(">> ");
					home = scan.nextInt();
					scan.nextLine();
					switch (home) {
					case 1:
						Add();
						break;
					case 2:
						View();
						break;
					case 3:
						Update();
						break;
					case 4:
						Delete();
						break;
					case 5:
						Exit();
						break;
					}
				} while (home != 5);
			} catch (Exception e) {
				done = true;
				scan.next();
			}
		} while (done);
	}

	public static void main(String[] args) {
		new Main();
	}

}
