import VueRouter from 'vue-router'

//引入组件
import Index from '../pages'
import Home from '../pages/home/home'
import Login from '../pages/login/login'
import Register from '../pages/register/register'
import Center from '../pages/center/center'
import Messages from '../pages/messages/list'
import Storeup from '../pages/storeup/list'
import News from '../pages/news/news-list'
import NewsDetail from '../pages/news/news-detail'
import payList from '../pages/pay'

import yonghuList from '../pages/yonghu/list'
import yonghuDetail from '../pages/yonghu/detail'
import yonghuAdd from '../pages/yonghu/add'
import shangjiaList from '../pages/shangjia/list'
import shangjiaDetail from '../pages/shangjia/detail'
import shangjiaAdd from '../pages/shangjia/add'
import peisongyuanList from '../pages/peisongyuan/list'
import peisongyuanDetail from '../pages/peisongyuan/detail'
import peisongyuanAdd from '../pages/peisongyuan/add'
import xianhualeixingList from '../pages/xianhualeixing/list'
import xianhualeixingDetail from '../pages/xianhualeixing/detail'
import xianhualeixingAdd from '../pages/xianhualeixing/add'
import xianhuaxinxiList from '../pages/xianhuaxinxi/list'
import xianhuaxinxiDetail from '../pages/xianhuaxinxi/detail'
import xianhuaxinxiAdd from '../pages/xianhuaxinxi/add'
import dingdanxinxiList from '../pages/dingdanxinxi/list'
import dingdanxinxiDetail from '../pages/dingdanxinxi/detail'
import dingdanxinxiAdd from '../pages/dingdanxinxi/add'
import peisongdingdanList from '../pages/peisongdingdan/list'
import peisongdingdanDetail from '../pages/peisongdingdan/detail'
import peisongdingdanAdd from '../pages/peisongdingdan/add'
import peisongjiedanList from '../pages/peisongjiedan/list'
import peisongjiedanDetail from '../pages/peisongjiedan/detail'
import peisongjiedanAdd from '../pages/peisongjiedan/add'
import peisongwanchengList from '../pages/peisongwancheng/list'
import peisongwanchengDetail from '../pages/peisongwancheng/detail'
import peisongwanchengAdd from '../pages/peisongwancheng/add'
import dingdanpingjiaList from '../pages/dingdanpingjia/list'
import dingdanpingjiaDetail from '../pages/dingdanpingjia/detail'
import dingdanpingjiaAdd from '../pages/dingdanpingjia/add'
import newstypeList from '../pages/newstype/list'
import newstypeDetail from '../pages/newstype/detail'
import newstypeAdd from '../pages/newstype/add'
import discussxianhuaxinxiList from '../pages/discussxianhuaxinxi/list'
import discussxianhuaxinxiDetail from '../pages/discussxianhuaxinxi/detail'
import discussxianhuaxinxiAdd from '../pages/discussxianhuaxinxi/add'

const originalPush = VueRouter.prototype.push
VueRouter.prototype.push = function push(location) {
	return originalPush.call(this, location).catch(err => err)
}

//配置路由
export default new VueRouter({
	routes:[
		{
      path: '/',
      redirect: '/index/home'
    },
		{
			path: '/index',
			component: Index,
			children:[
				{
					path: 'home',
					component: Home
				},
				{
					path: 'center',
					component: Center,
				},
				{
					path: 'pay',
					component: payList,
				},
				{
					path: 'messages',
					component: Messages
				},
				{
					path: 'storeup',
					component: Storeup
				},
				{
					path: 'news',
					component: News
				},
				{
					path: 'newsDetail',
					component: NewsDetail
				},
				{
					path: 'yonghu',
					component: yonghuList
				},
				{
					path: 'yonghuDetail',
					component: yonghuDetail
				},
				{
					path: 'yonghuAdd',
					component: yonghuAdd
				},
				{
					path: 'shangjia',
					component: shangjiaList
				},
				{
					path: 'shangjiaDetail',
					component: shangjiaDetail
				},
				{
					path: 'shangjiaAdd',
					component: shangjiaAdd
				},
				{
					path: 'peisongyuan',
					component: peisongyuanList
				},
				{
					path: 'peisongyuanDetail',
					component: peisongyuanDetail
				},
				{
					path: 'peisongyuanAdd',
					component: peisongyuanAdd
				},
				{
					path: 'xianhualeixing',
					component: xianhualeixingList
				},
				{
					path: 'xianhualeixingDetail',
					component: xianhualeixingDetail
				},
				{
					path: 'xianhualeixingAdd',
					component: xianhualeixingAdd
				},
				{
					path: 'xianhuaxinxi',
					component: xianhuaxinxiList
				},
				{
					path: 'xianhuaxinxiDetail',
					component: xianhuaxinxiDetail
				},
				{
					path: 'xianhuaxinxiAdd',
					component: xianhuaxinxiAdd
				},
				{
					path: 'dingdanxinxi',
					component: dingdanxinxiList
				},
				{
					path: 'dingdanxinxiDetail',
					component: dingdanxinxiDetail
				},
				{
					path: 'dingdanxinxiAdd',
					component: dingdanxinxiAdd
				},
				{
					path: 'peisongdingdan',
					component: peisongdingdanList
				},
				{
					path: 'peisongdingdanDetail',
					component: peisongdingdanDetail
				},
				{
					path: 'peisongdingdanAdd',
					component: peisongdingdanAdd
				},
				{
					path: 'peisongjiedan',
					component: peisongjiedanList
				},
				{
					path: 'peisongjiedanDetail',
					component: peisongjiedanDetail
				},
				{
					path: 'peisongjiedanAdd',
					component: peisongjiedanAdd
				},
				{
					path: 'peisongwancheng',
					component: peisongwanchengList
				},
				{
					path: 'peisongwanchengDetail',
					component: peisongwanchengDetail
				},
				{
					path: 'peisongwanchengAdd',
					component: peisongwanchengAdd
				},
				{
					path: 'dingdanpingjia',
					component: dingdanpingjiaList
				},
				{
					path: 'dingdanpingjiaDetail',
					component: dingdanpingjiaDetail
				},
				{
					path: 'dingdanpingjiaAdd',
					component: dingdanpingjiaAdd
				},
				{
					path: 'newstype',
					component: newstypeList
				},
				{
					path: 'newstypeDetail',
					component: newstypeDetail
				},
				{
					path: 'newstypeAdd',
					component: newstypeAdd
				},
				{
					path: 'discussxianhuaxinxi',
					component: discussxianhuaxinxiList
				},
				{
					path: 'discussxianhuaxinxiDetail',
					component: discussxianhuaxinxiDetail
				},
				{
					path: 'discussxianhuaxinxiAdd',
					component: discussxianhuaxinxiAdd
				},
			]
		},
		{
			path: '/login',
			component: Login
		},
		{
			path: '/register',
			component: Register
		},
	]
})
