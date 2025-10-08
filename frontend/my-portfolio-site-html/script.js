const modal = document.getElementById("demoModal");
const openBtn = document.getElementById("openDemo");
const closeBtn = document.querySelector(".close");
const iframe = document.querySelector("#demoModal iframe");
const videoSrc = iframe.src; // store original src

// Open modal - for youtube iframe
openBtn.onclick = () => {
    modal.style.display = "flex"; // flex centers modal if using flex CSS
};

// Close modal
function closeModal() {
    modal.style.display = "none";
    iframe.src = "";       // stop video
    iframe.src = videoSrc; // reset src for next open
}

closeBtn.onclick = closeModal;

// Click outside modal to close
window.onclick = (e) => {
    if (e.target === modal) closeModal();
};

// concerning the fade up effect

const projects = document.querySelectorAll(".project");

const observer = new IntersectionObserver((entries, observer) => {
    entries.forEach(entry => {
        if (entry.isIntersecting) {
            entry.target.classList.add("in-view");
            observer.unobserve(entry.target); // optional: stops re-triggering
        }
    });
}, { threshold: 0.1 });

projects.forEach(project => observer.observe(project));
