$(document).ready(
    setInterval(function () {
      getState(1);
      getState(2);
      getState(3);
    }, 3000)
);

function getState(id) {
  $.ajax({
    url: ("http://localhost:8080/getState?id=" + id)
  }).then(function (data) {
    if (data == "1") {
      if (id == 1) {
        $('#gadgetState1').attr("src", "images/on.png");
      } else if (id == 2) {
        $('#gadgetState2').attr("src", "images/on.png");
      } else {
        $('#gadgetState3').attr("src", "images/on.png");
      }
    } else {
      if (id == 1) {
        $('#gadgetState1').attr("src", "images/off.png");
      } else if (id == 2) {
        $('#gadgetState2').attr("src", "images/off.png");
      } else {
        $('#gadgetState3').attr("src", "images/off.png");
      }
    }
  });
}