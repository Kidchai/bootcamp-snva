function slowTask() {
    console.log("slow task started");
    let now = new Date().getTime();
    while (new Date().getTime() < now + 4000);

    console.log("slow task completed");
}

function fastTask() {
    console.log("fast task started");
    console.log("slow task completed");
}

fastTask();
slowTask();
fastTask();
slowTask();
fastTask();