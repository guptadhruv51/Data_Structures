/**
 * CallBack hell
 * Pyramid of Doom
 */

// bookHotel--> ProceedPayment --> showBookingStatus -->updateBooking History


bookHotel(hotelId, function(){ // 1
  if (error){
      handleError
  }else{
      proceedToPayment(hotelId, function(){ //2
          if (error){
              handleError
          }else{
              showBookingStatus(function(){ //3
                  if (error){
                      handleError
                  }else{
                      updateBookingHistory(function(){ //4
                          if (error){
                              handleError
                          }else{
                              success
                          }
                      })
                  }
              })
          }
      })
  }
})

bookHotel(hotelId, function(){
  proceedToPayment(hotelId, function(){
      
  })
})