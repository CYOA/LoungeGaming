$(".container").scrollText();

$(".container").scrollText({
    'direction': 'down' // or 'up'
  });
$(".container").scrollText({
   'duration': 2000
  });
$(".container").scrollText({

  // container
  'container': '.container', 

  // child elements
  'sections': 'li', 

  // scrolling speed
  'duration': 1000,

  // endless loop
  'loop': true,

  // CSS appended to the current item
  'currentClass': 'current',

  // or 'down'
  'direction': 'up'
  
});

