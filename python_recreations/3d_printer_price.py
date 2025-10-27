import betterPrint
import time

def main():
    # Defining the variables
    filament_cost = 0.03
    electricity_cost = 0.00035
    labor_cost = 3.0
    profit_margin = 2.0

    # getting inputs
    print_duration_hrs = int(input("Print duration hours: "))
    print_duration_mins = int(input("Print duration min: "))
    filament_usage = float(input("Filament usage: "))
    has_supports_str = input("Has supports (y/n): ")
    has_supports = True
    if has_supports_str == "n":
        has_supports = False
        labor_cost = 0.0

    print()
    betterPrint.betterPrint(betterPrint.strColor("Calculating...", "cyan"))
    # calculating
    hours_to_min = int(convert_hours_to_min(print_duration_hrs, print_duration_mins))
    calculated_elec = electricity_cost * hours_to_min
    calculated_fil = filament_cost * filament_usage

    # Final calculation
    final_cost = calculated_elec + calculated_fil + labor_cost + profit_margin
    formatted_final_cost = "{:.2f}".format(final_cost)


    betterPrint.betterPrint(f"Print takes {betterPrint.strColor(str(hours_to_min), "yellow")} minutes.")
    betterPrint.betterPrint(f"Print will cost {betterPrint.strColor(f"${formatted_final_cost}", "green")}. Happy printing!")
    print()
    time.sleep(1)

    breakdown_input = input("Would you like price breakdown (y/n)? ")
    if breakdown_input == "y":
        betterPrint.betterPrint(f"Electricity costs: {betterPrint.strColor(f"${(calculated_elec)}", "green")}")
        betterPrint.betterPrint(f"Filament costs: {betterPrint.strColor(f"${calculated_fil}", "green")}")
        betterPrint.betterPrint(f"Other costs: {betterPrint.strColor(f"${labor_cost + profit_margin}", "green")}")


def convert_hours_to_min(hrs, mins):
    return (hrs * 60) + mins

main()