# -*- coding: utf-8 -*-

def print_name(fn, ln, mn):
    print "{0} {1}{2}".format(fn, mn, ln)

def print_full_name(fn, ln, mn=""):
    if mn:
        mn += " "
    print_name(fn, ln, mn)

if __name__ == "__main__":
    print_full_name("Hermione", "Granger", "Jean")
    print_full_name("Bellatrix", "Lestrange")
