<template>
  <div class="common-layout">
    <!--    头部-->
    <Header style="position: fixed; width: 100vw; z-index: 20; background-color: #1E4460"/>
    <!--    主体-->
    <Aside class="wrapper__aside"/>
    <el-container style="display: flex" class="wrapper">
      <!--      内容区域-->
        <el-main class="wrapper__body">
          <div>
            <span class="dot192"></span><span class="dot193"></span><span class="dot195"></span><span class="dot196"></span>
            <span class="dot208"></span><span class="dot210"></span><span class="dot211"></span><span class="dot212"></span>
            <span class="dot213"></span><span class="dot214"></span><span class="dot215"></span><span class="dot216"></span>
            <span class="dot220"></span><span class="dot221"></span>
            <h1 style="font-size: 50px; color: #1E4460; width: 660px; margin-top: 18vh; line-height: 116%;margin-left: 14vw">Your
              <span style="color: #CA8228">bright</span> and <span style="color: #CA8228">successful</span>
              professional future is what we strive for.
            </h1>

            <div style="display: flex; flex-direction: row; margin-left: 14vw">
              <p class="opening">It's the beginning of the quarter. You stop in front of Geisel, excited and eager to
                explore your future. But wait, as you look into the long, crowded Library Walk, you suddenly feel lost.
                Where should I go? Where can I find help to figure out my dream career? How should I be prepared for my
                next big challenge which hasn't been cemented? A hundred questions whirl in your head. <br>
                <br>
                But hey, we were once on the same page. As UCSD undergraduates, we have experienced the same struggles,
                asked the same questions. But, with professional help, we now found and built solutions to all your
                confusions.
              </p>
              <div style="position: relative; display: inline-block">
                <span class="sun"></span>
                <img src="/home/mountain.svg" alt="mountain" style="width: 95%; margin-top: -40px;">
                <img id="student" src="/home/student.svg" alt="student">
              </div>
            </div>

            <div style="display: flex; flex-direction: row; margin-top: 180px; margin-left: 14vw; z-index: 3">
              <el-popover
                  placement="right"
                  offset="50"
                  trigger="hover"
                  width="415px"
              >
                <template #reference>
                  <img src="/home/homeCalendar.svg" alt="calendar" width="420">
                </template>
                <template #default>
                  <span style="font-weight: 600; color: #1e4460">UCSD Career and Networking Fairs</span>
                  <Calendar />
                </template>
              </el-popover>
              <h2 style="margin-left: 125px; width: 400px; margin-top:72px">Check out our calendar
                <i style="color: #5F99B6">(in the header)</i>
                to &nbsp;&nbsp;&nbsp;&nbsp; see updated career events.</h2>
            </div>

            <div style="margin-top: 150px">
              <h2 style="margin-left: 14vw">Enjoy this road map to your brand new future...</h2>

              <div class="timeline">
                <div class="one1">
                  <div style="position: relative; display: inline-block">
                    <img src="/home/exploreCareer.svg" alt="frame">
                    <button style="position: absolute; top: 180px; left: 112px; z-index: 2; display: inline">
                      In Progress
                    </button>
                  </div>
                </div>

                <div class="one3">
                  <div style="position: relative; display: inline-block">
                    <img src="/home/startApplying.svg" alt="frame">
                    <button style="position: absolute; top: 180px; left: 110px; z-index: 2; display: inline">
                      In Progress
                    </button>
                  </div>
                </div>

                <div class="one5">
                  <div style="position: relative; display: inline-block">
                    <img src="/home/startPreparing.svg" alt="frame" >
                    <button style="position: absolute; top: 180px; left: 110px; z-index: 2; display: inline"
                            @click="$router.push('/interview#opening')">
                      Start Preparing
                    </button>
                  </div>
                </div>

                <div class="two">
                  <img src="/home/midline.svg" alt="line" style="height: 98%">
                </div>

                <div class="three2">
                  <div style="position: relative; display: inline-block">
                    <img src="/home/startNetworking.svg" alt="frame">
                    <button style="position: absolute; top: 180px; left: 110px; z-index: 2; display: inline"
                            @click="$router.push('/fakeNetworking#fakeNetworkingTop')">
                      Start Networking
                    </button>
                  </div>

                </div>
                <div class="three4">
                  <div style="position: relative; display: inline-block">
                    <img src="/home/startWriting.svg" alt="frame" >
                    <button style="position: absolute; top: 180px; left: 110px; z-index: 2; display: inline"
                            @click="$router.push('/resume#resumeTop')">
                      Start Writing
                    </button>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </el-main>
        <el-footer style="z-index: 2">
          <Footer/>
        </el-footer>
    </el-container>
  </div>
</template>

<script>
import Header from "../components/Header.vue";
import Footer from "../components/Footer.vue";
import Calendar from "../views/Calendar.vue";

export default {
  name: "Home",
  components: {
    Footer,
    Header,
    Calendar
  },
  data() {
    return {}
  }
}
</script>

<style scoped>
@font-face { font-family: work-sans-semi;
  src: url('/WorkSans/WorkSans-Semibold.woff');
}
button {
  font-style: normal;
  font-weight: 600;
  font-size: 14px;
  width: 166px;
  height: 40px;
  border-radius: 0.5rem;
  padding: 0.5rem 1rem;
  background-color: #1E4460;
  border: hidden;
  margin-top: 50px;
  color: white;
  box-shadow: 0 4px 4px rgb(30 68 96 / 0.25);
}
button:hover {
  background-color: #F4CE71;
  color: darkblue;
  border: hidden;
}
h1{
  font-family: work-sans-semi;
  font-style: normal;
  font-weight: 700;
}
h2 {
  font-family: work-sans-semi;
  font-size: 34px;
  /*font-weight: 800;*/
  line-height: 141%;
  color: #1e4460;
}
.dot192 {
  position: absolute;
  width: 264px;
  height: 237px;
  left: 27px;
  top: 90px;
  z-index: -1;

  background: rgba(244, 206, 113, 0.45);
  filter: blur(150px);
}
.dot193 {
  position: absolute;
  width: 106px;
  height: 85px;
  left: 857px;
  top: 380px;
  z-index: -1;

  background: #F4CE71;
  filter: blur(150px);
}
.dot195 {
  position: absolute;
  width: 588px;
  height: 400px;
  left: 1290px;
  top: 1486px;
  z-index: -1;

  background: rgba(244, 206, 113, 0.2);
  filter: blur(150px);
}
.dot196 {
  position: absolute;
  width: 264px;
  height: 237px;
  left: -192px;
  top: 743px;
  z-index: -1;

  background: rgba(95, 153, 182, 0.35);
  filter: blur(150px);
}
.dot208 {
  position: absolute;
  width: 314px;
  height: 237px;
  left: 58px;
  top: 1394px;
  z-index: -1;

  background: rgba(95, 153, 182, 0.15);
  filter: blur(150px);
}
.dot210 {
  position: absolute;
  width: 412px;
  height: 281px;
  left: 900px;
  top: 923px;
  z-index: -1;

  background: rgba(244, 206, 113, 0.2);
  filter: blur(150px);
}
.dot211 {
  position: absolute;
  width: 314px;
  height: 237px;
  left: 1208px;
  top: 666px;
  z-index: -1;

  background: rgba(95, 153, 182, 0.15);
  filter: blur(150px);
}
.dot212 {
  position: absolute;
  width: 438px;
  height: 369px;
  left: -165px;
  top: 3594px;
  z-index: -1;
  background: rgba(244, 206, 113, 0.2);
  filter: blur(150px);
}
.dot213 {
  position: absolute;
  width: 314px;
  height: 237px;
  left: 750px;
  top: 1805px;
  z-index: -1;

  background: rgba(95, 153, 182, 0.2);
  filter: blur(150px);
}
.dot214 {
  position: absolute;
  width: 261px;
  height: 237px;
  left: 382px;
  top: 1138px;
  z-index: -1;

  background: rgba(95, 153, 182, 0.35);
  filter: blur(150px);
}
.dot215 {
  position: absolute;
  width: 617px;
  height: 466px;
  left: 480px;
  top: 2117px;
  z-index: -1;

  background: rgba(95, 153, 182, 0.1);
  filter: blur(150px);
}
.dot216 {
  position: absolute;
  width: 296px;
  height: 223px;
  left: 477px;
  top: 613px;
  z-index: -1;

  background: rgba(244, 206, 113, 0.2);
  filter: blur(150px);
}
.dot220 {
  position: absolute;
  width: 314px;
  height: 237px;
  left: 742px;
  top: 425px;
  z-index: -1;

  background: rgba(95, 153, 182, 0.2);
  filter: blur(150px);
}
.dot221 {
  position: absolute;
  width: 126px;
  height: 95px;
  left: 800px;
  top: 430px;
  z-index: -1;

  background: #F4CE71;
  filter: blur(150px);
}
.sun {
  position: absolute;
  width: 60px;
  height: 60px;
  left: 100px;
  top: -32px;
  transition: 2s;
  background:
    radial-gradient(48.01% 48.01% at 49.46% 51.99%, #F4CE71 20%, rgba(244, 206, 113, 0) 100%, rgba(244, 206, 113, 0) 100%),
    radial-gradient(48.01% 48.01% at 49.46% 51.99%, #F8CE67 20%, rgba(244, 206, 113, 0) 100%, rgba(244, 206, 113, 0) 100%);
}
.sun:hover {
  filter: brightness(112%);
  left: 85px;
  top: -47px;
  width: 90px;
  height: 90px;
}

.opening {
  font-size: 16px;
  font-weight: 400;
  line-height: 141%;
  width: 555px;
  margin-top: 62px;
}

.wrapper {
  position: relative;
  background-color: #F9F9F9;
}

.wrapper__body {
  flex: 1;
  position: relative;
  overflow-x: hidden;
  overflow-y: clip;
  padding-top: 6.3%;
  padding-bottom: 15%;
  /*margin-bottom: 12%;*/
  z-index: 2;
}

#student {
  position: absolute;
  top: 100px;
  left: 280px;
  z-index: 1;
  border: 100px;
  display: inline;
  width: 200px;
  /*transition: 4s;*/
}

/*#student:hover {*/
/*  margin-top: -75px;*/
/*  left: -100px;*/
/*  filter: brightness(200%);*/
/*}*/
.timeline {
  margin-left: calc((100vw - 976px) / 2);
  margin-top: 80px;
  display: grid;
  grid-template-columns: repeat(3, 1fr);
  gap: 0;
  height: min-content;
  width: min-content;
}
.one1 {
  grid-column: 1;
  grid-row: 1;
  text-align: right;
  height: min-content;
}
.one3 {
  grid-column: 1;
  grid-row: 3;
  text-align: right;
  margin-top: -60px;
  padding-top: 18px;
  height: min-content;
}
.one5 {
  grid-column: 1;
  grid-row: 5;
  height: min-content;
  margin-top: -52px;
}
.two {
  grid-column: 2;
  grid-row: 1/6;
  padding-top: 122px;
  margin-left: -2px;
  margin-right: -4px;
}
.three2 {
  grid-column: 3;
  grid-row: 2;
  margin-top: -60px;
  height: min-content;
  padding-top: 18px;
}
.three4 {
  grid-column: 3;
  grid-row: 4;
  height: min-content;
  margin-top: -60px;
}


</style>