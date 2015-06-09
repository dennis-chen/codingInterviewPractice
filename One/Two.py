def reverseIgnoringLast(s):
    return s[:-1][::-1] + s[-1]

if __name__ == '__main__':
    print reverseIgnoringLast("abcdefgh.")
