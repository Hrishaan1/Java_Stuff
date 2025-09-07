import csv
import time
import betterPrint

def main():
    print("-- Bank Manager --")
    running = True
    while running:
        print("\nMenu:")
        print("1. Create new account")
        print("2. Make a deposit")
        print("3. Make a withdrawal")
        print("4. Display all accounts")
        print("5. Exit program")
        try:
            choice = int(input(betterPrint.strColor("Choose one: ", "blue")))
            match choice:
                case 1:
                    # Gets first name and initial balance and creates new account
                    firstName = input(betterPrint.strColor("Enter first name: ", "blue"))
                    while True:
                        try:
                            balance = float(input(betterPrint.strColor("Enter initial balance: ", "blue")))
                            break
                        except ValueError:
                            giveError()
                    with open("bank.csv", "a", newline="") as csvfile:
                        writer = csv.writer(csvfile)
                        writer.writerow([firstName, balance])
                    betterPrint.betterPrint(betterPrint.strColor(f"Account created for {firstName} with balance ${balance:.2f}", "green"))

                case 2:
                    # Gets amount to deposit and updates balance.
                    name = input(betterPrint.strColor("Enter account holder's first name: ", "blue"))
                    depositAmt = 0
                    while True:
                        try:
                            depositAmt = float(input(betterPrint.strColor("Enter deposit amount: ", "blue")))
                            if depositAmt < 0:
                                giveError()
                                continue
                            break
                        except ValueError:
                            giveError()
                    accounts = []
                    found = False
                    with open("bank.csv", "r", newline="") as csvfile:
                        reader = csv.reader(csvfile)
                        for row in reader:
                            if row and row[0] == name:
                                new_balance = float(row[1] + depositAmt)
                                accounts.append([row[0], new_balance])
                                found = True
                            elif row:
                                accounts.append(row)
                    if found:
                        with open("bank.csv", "w", newline="") as csvfile:
                            writer = csv.writer(csvfile)
                            writer.writerows(accounts)
                        betterPrint.betterPrint(betterPrint.strColor(f"Deposited ${depositAmt:.2f} to {name}'s account", "green"))
                    else:
                        betterPrint.betterPrint(betterPrint.strColor(f"Account for '{name}' not found.", "red"))
                case 3:
                    # Gets amount to withdraw and updates balance.
                    ...
                case 4:
                    # Displays all accounts
                    ...
                case 5:
                    # Ends program
                    ...
        except ValueError:
            giveError()

def giveError():
    betterPrint.betterPrint(betterPrint.colorPrint("Invalid input. Try again."))

if __name__ == "__main__":
    main()