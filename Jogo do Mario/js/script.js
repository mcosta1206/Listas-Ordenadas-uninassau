const mario = document.querySelector('.mario');
const pipe = document.querySelector('.pipe');

const jump = () => {
    mario.classList.add('jump');

    setTimeout(() => {
        mario.classList.remove('jump')
    }, 500);
}

const loop = setInterval(() => {
    
    const pipeposition = pipe.offsetLeft;
    const marioposition = +window.getComputedStyle(mario).bottom.replace('px', '');
    
    
    if (pipeposition <= 75 && pipeposition > 0 && marioposition < 80) {

        pipe.style.animation = 'nome';
        pipe.style.left = `${pipeposition}px`;

        mario.style.animation = 'nome';
        mario.style.bottom = `${marioposition}px`;

        mario.src = './images/game-over.png'
        mario.style.width = '65px'
        mario.style,merginleft = '40px'

        clearinterval(loop);

    }

}, 10);

document.addEventListener("keydown" , jump);