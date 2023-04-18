//All JS callback functions are asynchronous
function slowTask() {
    console.log("slow task started");
    //setTimeout set the current function to sleep, and the next function runs
    setTimeout(() => console.log("slow task completed", 4000));
}

function fastTask() {
    console.log("fast task started");
    console.log("fast task completed");
}

fastTask();
slowTask();
fastTask();
slowTask();
fastTask();