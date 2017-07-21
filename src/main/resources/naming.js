var main = function(){
	

var assignEventHandlers = function() {
  $(".delete").click(function(event) {
    var buttonClicked = $(event.target);
    var listItemToRemove = buttonClicked.parent();
    listItemToRemove.remove();
  });

  $(".edit").click(function(event) {
    var newInput = prompt("What would you like to change?");
    var buttonClicked = $(event.target);
    var listItemToEdit = buttonClicked.parent();
    var taskText = listItemToEdit.children("span");
    taskText.text(newInput);
  });
};

var addItem = function() {
  $("#add").click(function() {
    var description = prompt("What task would you like to add?");
    var taskItem = $("<li><span>" + description + "</span></li>");
    $(".task").append(taskItem);

    var deleteButton = $('<button class="delete">DELETE</button>');
    taskItem.append(deleteButton);

    var editButton = $('<button class="edit">Edit Me</button>');
    taskItem.append(editButton);
    assignEventHandlers();
  });
};
};
$(document).ready(function() {
  addItem();
  editItem();
  assignEventHandlers();
});
