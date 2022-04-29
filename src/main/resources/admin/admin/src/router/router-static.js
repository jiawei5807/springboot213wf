import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import cheliangxiaofei from '@/views/modules/cheliangxiaofei/list'
    import laichedengji from '@/views/modules/laichedengji/list'
    import cheliangyongliao from '@/views/modules/cheliangyongliao/list'
    import xitongbangzhu from '@/views/modules/xitongbangzhu/list'
    import yonghu from '@/views/modules/yonghu/list'
    import cailiaoruku from '@/views/modules/cailiaoruku/list'
    import kucuncailiao from '@/views/modules/kucuncailiao/list'
    import guanyuxitong from '@/views/modules/guanyuxitong/list'
    import meirongxiangmu from '@/views/modules/meirongxiangmu/list'
    import cheliangxinxi from '@/views/modules/cheliangxinxi/list'
    import cheliangmeirong from '@/views/modules/cheliangmeirong/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/cheliangxiaofei',
        name: '车辆消费',
        component: cheliangxiaofei
      }
      ,{
	path: '/laichedengji',
        name: '来车登记',
        component: laichedengji
      }
      ,{
	path: '/cheliangyongliao',
        name: '车辆用料',
        component: cheliangyongliao
      }
      ,{
	path: '/xitongbangzhu',
        name: '系统帮助',
        component: xitongbangzhu
      }
      ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
      ,{
	path: '/cailiaoruku',
        name: '材料入库',
        component: cailiaoruku
      }
      ,{
	path: '/kucuncailiao',
        name: '库存材料',
        component: kucuncailiao
      }
      ,{
	path: '/guanyuxitong',
        name: '关于系统',
        component: guanyuxitong
      }
      ,{
	path: '/meirongxiangmu',
        name: '美容项目',
        component: meirongxiangmu
      }
      ,{
	path: '/cheliangxinxi',
        name: '车辆信息',
        component: cheliangxinxi
      }
      ,{
	path: '/cheliangmeirong',
        name: '车辆美容',
        component: cheliangmeirong
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
