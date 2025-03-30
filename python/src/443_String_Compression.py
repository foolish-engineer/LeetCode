def compress(self, chars):
        """
        :type chars: List[str]
        :rtype: int
        """
        def replace_chars(write_index, count):
            chars[write_index] = curr
            write_index += 1
            if count > 1:
                for char in str(count):
                    chars[write_index] = char
                    write_index += 1
            return write_index

        curr = chars[0]
        count = 1
        write_index = 0
        for i in range(1, len(chars)):
            if chars[i] == curr:
                count += 1
            else:
                write_index = replace_chars(write_index, count)
                count = 1
                curr = chars[i]
        write_index = replace_chars(write_index, count)
        return write_index