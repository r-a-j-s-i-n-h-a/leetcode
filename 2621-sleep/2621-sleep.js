/**
 * @param {number} millis
 */
async function sleep(millis) {
    await new Promise(resolve => setTimeout(resolve, millis),200);
}

/** 
 * let t = Datae.now()
 * sleep(100).then(() => console.log(Date.now() - t)) // 100
 */