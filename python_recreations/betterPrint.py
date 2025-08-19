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

if __name__ == "__main__":
    main()
