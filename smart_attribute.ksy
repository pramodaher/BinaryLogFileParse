meta:
     id: smart_attribute
     endian: le
instances:
  recored:
    pos: 0x002
    type: recored_type
    repeat: expr
    repeat-expr: 23

types:
      recored_type:
              seq:
                  - id: id
                    type: u1

                  - id: flag
                    type: u2le
             
                  - id: attr
                    type: u1

                  - id: worst
                    type: u1

                  - id: value
                    type: value_type
                    size: 6

                  - id: rsv
                    type: u1

      value_type:
              seq:
                  - id: first_word
                    type: u2le
 
                  - id: second_word
                    type: u2le

                  - id: third_word
                    type: u2le


