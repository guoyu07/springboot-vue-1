// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
import Vue from 'vue'
import router from './router'
import ElementUI from 'element-ui'
import VueProgressBar from 'vue-progressbar'
import VueQuillEditor from 'vue-quill-editor'
import axios from 'axios'

import App from './App.vue'
import './assets/global.css'
import 'font-awesome/css/font-awesome.css'
import 'element-ui/lib/theme-default/index.css'
import $ from 'jquery'

Vue.config.productionTip = false;
Vue.use(ElementUI);
Vue.use(VueQuillEditor);

Vue.prototype.$axios = axios;

// 进度条
Vue.use(VueProgressBar, {
  color: '#a6a9f6',
  failedColor: '#874b4b',
  thickness: '5px',
  transition: {
    speed: '0.2s',
    opacity: '0.6s',
    termination: 300
  },
  autoRevert: true,
  location: 'top',
  inverse: false
});

/* eslint-disable no-new */
new Vue({
  el: '#app',
  router,
  template: '<App/>',
  components: {
    App
  },
  render: h => h(App)
});
