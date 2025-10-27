import sys
import time

def main():
    betterPrint("Hi there")
    colorPrint("Hi there", "red")
    colorPrint("blue", "blue")
    colorPrint("green", "green")
    betterPrint(strColor("cyan", "cyan"))
    betterPrint(strColor("purple", color="purple"))
    print(strColor("orange", color="orange"))
    print(strColor("yellow", color="yellow"))

def betterPrint(str, delay=0.05, nextLine=True):
    for char in str:
        sys.stdout.write(char)
        sys.stdout.flush()
        time.sleep(delay)
    if nextLine: print()

def colorPrint(str, printColor="none", delay=0.05, nextLine=True, getColor=False):
    RED = "\033[91m"
    BLUE = "\033[94m"
    GREEN = "\033[92m"
    PURPLE = "\033[95m"
    CYAN = "\033[96m"
    ORANGE = "\033[38;5;208m"
    YELLOW = "\033[93m"
    RESET = "\033[0m"
    match printColor:
        case "red":
            print(f"{RED}{str}{RESET}")
        case "blue":
            print(f"{BLUE}{str}{RESET}")
        case "green":
            print(f"{GREEN}{str}{RESET}")
        case "purple":
            print(f"{PURPLE}{str}{RESET}")
        case "cyan":
            print(f"{CYAN}{str}{RESET}")
        case "orange":
            print(f"{ORANGE}{str}{RESET}")
        case "yellow":
            print(f"{YELLOW}{str}{RESET}")
        case _:
            print(str)

def strColor(str, color):
    RED = "\033[91m"
    BLUE = "\033[94m"
    GREEN = "\033[92m"
    PURPLE = "\033[95m"
    CYAN = "\033[96m"
    ORANGE = "\033[38;5;208m"
    YELLOW = "\033[93m"
    RESET = "\033[0m"
    match color:
        case "red":
            return f"{RED}{str}{RESET}"
        case "blue":
            return f"{BLUE}{str}{RESET}"
        case "green":
            return f"{GREEN}{str}{RESET}"
        case "purple":
            return f"{PURPLE}{str}{RESET}"
        case "cyan":
            return f"{CYAN}{str}{RESET}"
        case "orange":
            return f"{ORANGE}{str}{RESET}"
        case "yellow":
            return f"{YELLOW}{str}{RESET}"
        case _:
            return str

def throwError(error):
    match error:
        case "input":
            betterPrint(strColor("Invalid input. Try again."))
        case "":
            ...

if __name__ == "__main__":
    main()











# 67 :O