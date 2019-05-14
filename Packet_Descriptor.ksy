meta:
  id: packet_descriptor
  endian: be
seq:
  - id: header_size
    type: str
    terminator: 13
    encoding: UTF-8

  - id: header
    type: str
    terminator: 13
    encoding: UTF-8
  
  - id: version
    type: str
    terminator: 13
    encoding: UTF-8

  - id: copyright_info 
    type: str
    terminator: 13
    encoding: UTF-8
 
  - id: signature
    type: str
    terminator: 13
    encoding: UTF-8
   
  - id: date
    type: str
    terminator: 13
    encoding: UTF-8

  - id: time
    type: str
    terminator: 13
    encoding: UTF-8

  - id: model_number
    type: str
    terminator: 13
    encoding: UTF-8

  - id: serial_number
    type: str
    terminator: 13
    encoding: UTF-8

  - id: firmware_version
    type: str
    terminator: 13
    encoding: UTF-8

  - id: host_id
    type: str
    terminator: 13
    encoding: UTF-8

  - id: system_fw
    type: str
    terminator: 13
    encoding: UTF-8

  - id: os
    type: str
    terminator: 13
    encoding: UTF-8

  - id: interfacee
    type: str
    terminator: 13
    encoding: UTF-8

  - id: attribute
    type: str
    terminator: 13
    encoding: UTF-8

  - id: number_of_record
    type: str
    terminator: 58
    encoding: UTF-8
 
  - id: record_length
    process: com.agsft.process.length
    type: str_trim
    terminator: 13
    

  - id: template
    type: template_type
    repeat: expr
    repeat-expr: record_length.length

types:

  template_type:
     seq:
         - id: byte_index
           type: str
           terminator: 13
           encoding: UTF-8

         - id: length
           type: str
           terminator: 13
           encoding: UTF-8

         - id: type
           type: str
           terminator: 13
           encoding: UTF-8

  str_trim:
     seq:
         - id: length
           type: s1
         

       




          





   

