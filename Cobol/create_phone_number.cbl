       identification division.
       program-id. CreatePhoneNumber.
       data division.
      
       linkage section.
       01  arr    pic 9(10).
       01  result pic x(14).
      
       procedure division using arr result.
       
      *AQUI VAMOS       
       STRING "(" ARR(1:3) ") " ARR(4:3) "-"  ARR(7:4)
       DELIMITED BY SIZE INTO result
          
          goback.
       end program CreatePhoneNumber.