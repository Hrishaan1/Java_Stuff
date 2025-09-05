import sys
import time

def betterPrint(str, delay=0.05, nextLine=True):
    for char in str:
        sys.stdout.write(char)
        sys.stdout.flush()
        time.sleep(delay)
    if nextLine: print()

def main():
    betterPrint("Hi there")
    colorPrint("Hi there", "red")
    colorPrint("blue", "blue")
    colorPrint("green", "green")

def colorPrint(str, printColor="none", delay=0.05, nextLine=True, getColor=False):
    RED = "\033[91m"
    BLUE = "\033[94m"
    GREEN = "\033[92m"
    RESET = "\033[0m"
    match printColor:
        case "red":
            print(f"{RED}{str}{RESET}")
        case "blue":
            print(f"{BLUE}{str}{RESET}")
        case "green":
            print(f"{GREEN}{str}{RESET}")
        case _:
            print(str)

def strColor(str, color):
    RED = "\033[91m"
    BLUE = "\033[94m"
    GREEN = "\033[92m"
    RESET = "\033[0m"
    match color:
        case "red":
            return f"{RED}{str}{RESET}"
        case "blue":
            return f"{BLUE}{str}{RESET}"
        case "green":
            return f"{GREEN}{str}{RESET}"
        case _:
            return str

if __name__ == "__main__":
    main()