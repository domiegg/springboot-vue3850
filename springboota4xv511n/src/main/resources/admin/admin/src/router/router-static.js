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
    import news from '@/views/modules/news/list'
    import dingdanpingjia from '@/views/modules/dingdanpingjia/list'
    import dingdanxinxi from '@/views/modules/dingdanxinxi/list'
    import peisongjiedan from '@/views/modules/peisongjiedan/list'
    import discussxianhuaxinxi from '@/views/modules/discussxianhuaxinxi/list'
    import xianhuaxinxi from '@/views/modules/xianhuaxinxi/list'
    import peisongdingdan from '@/views/modules/peisongdingdan/list'
    import shangjia from '@/views/modules/shangjia/list'
    import peisongwancheng from '@/views/modules/peisongwancheng/list'
    import xianhualeixing from '@/views/modules/xianhualeixing/list'
    import yonghu from '@/views/modules/yonghu/list'
    import messages from '@/views/modules/messages/list'
    import config from '@/views/modules/config/list'
    import peisongyuan from '@/views/modules/peisongyuan/list'
    import newstype from '@/views/modules/newstype/list'


//2.配置路由   注意：名字
export const routes = [{
    path: '/',
    name: '系统首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '系统首页',
      component: Home,
      meta: {icon:'', title:'center', affix: true}
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
	path: '/news',
        name: '通知公告',
        component: news
      }
      ,{
	path: '/dingdanpingjia',
        name: '订单评价',
        component: dingdanpingjia
      }
      ,{
	path: '/dingdanxinxi',
        name: '订单信息',
        component: dingdanxinxi
      }
      ,{
	path: '/peisongjiedan',
        name: '配送接单',
        component: peisongjiedan
      }
      ,{
	path: '/discussxianhuaxinxi',
        name: '鲜花信息评论',
        component: discussxianhuaxinxi
      }
      ,{
	path: '/xianhuaxinxi',
        name: '鲜花信息',
        component: xianhuaxinxi
      }
      ,{
	path: '/peisongdingdan',
        name: '配送订单',
        component: peisongdingdan
      }
      ,{
	path: '/shangjia',
        name: '商家',
        component: shangjia
      }
      ,{
	path: '/peisongwancheng',
        name: '配送完成',
        component: peisongwancheng
      }
      ,{
	path: '/xianhualeixing',
        name: '鲜花类型',
        component: xianhualeixing
      }
      ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
      ,{
	path: '/messages',
        name: '在线留言',
        component: messages
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
      ,{
	path: '/peisongyuan',
        name: '配送员',
        component: peisongyuan
      }
      ,{
	path: '/newstype',
        name: '通知公告分类',
        component: newstype
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
const originalPush = VueRouter.prototype.push
//修改原型对象中的push方法
VueRouter.prototype.push = function push(location) {
   return originalPush.call(this, location).catch(err => err)
}
export default router;
