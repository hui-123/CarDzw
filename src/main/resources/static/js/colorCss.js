/*以下属性名不可更改，否则页面要进行相应调整*/
var colors = [{
		"cid": 1,
		"cname": "黑色",
		"color_href": "css/black.css"
	},
	{
		"cid": 2,
		"cname": "蓝色",
		"color_href": "css/blue.css"
	},
	{
		"cid": 3,
		"cname": "棕色",
		"color_href": "css/brown.css"
	},
	{
		"cid": 4,
		"cname": "绿色",
		"color_href": "css/green.css"
	},
	{
		"cid": 5,
		"cname": "红色",
		"color_href": "css/red.css"
	}
]

var typenames = [{
	"text": "首页"
}, {
	"text": "人事"
}, {
	"text": "系统"
}, {
	"text": "数据"
}, {
	"text": "客服"
}, {
	"text": "前台"
}, {
	"text": "维修"
}]

var tree = [{
		"text": "员工资料",
		"typename": "人事",
		list: [{
			"leftNav_id": "1",
			"name": "组织机构",
			"href": "html/RenShi/ZhuZhiJiGou.html"
		}, {
			"leftNav_id": "2",
			"name": "岗位定义",
			"href": "html/RenShi/GangWeiDingYi.html"
		}, {
			"leftNav_id": "3",
			"name": " 离职登记",
			"href": "html/RenShi/LiZhiDengJi.html"
		}, {
			"leftNav_id": "4",
			"name": "通讯名录",
			"href": "html/RenShi/TongXunMingLu.html"
		}]
	}, {
		"text": "技工管理",
		"typename": "人事",
		list: [{
			"leftNav_id": "5",
			"name": "技工星级",
			"href": "html/RenShi/JiGongXingJi.html"
		}, {
			"leftNav_id": "6",
			"name": "班组技工",
			"href": "html/RenShi/BanZuJiGong.html"
		}, {
			"leftNav_id": "7",
			"name": "外勤车俩",
			"href": "html/RenShi/WaiQingCheLiang.html"
		}]
	},

	{
		"text": "权限控制",
		"typename": "系统",
		list: [{
			"leftNav_id": "8",
			"name": "员工角色控制",
			"href": "html/XiTong/YuanGongJiaoSeKongZhi.html"
		}, {
			"leftNav_id": "9",
			"name": "员工权限控制",
			"href": "html/XiTong/YuanGongQuanXianKongZhi.html"
		}]
	},

	{
		"text": "主数据",
		"typename": "数据",
		list: [{
			"leftNav_id": "10",
			"name": "发动机品牌",
			"href": "html/ShuJu/FaDongJiPinPai.html"
		}, {
			"leftNav_id": "11",
			"name": "车型档案",
			"href": "html/ShuJu/CheXingDangAn.html"
		}, {
			"leftNav_id": "12",
			"name": "维修项目",
			"href": "html/ShuJu/WeiXiuXiangMu.html"
		}, {
			"leftNav_id": "13",
			"name": "商品资料",
			"href": "html/ShuJu/ShangPinZiLiao.html"
		}, {
			"leftNav_id": "14",
			"name": "供货单位",
			"href": "html/ShuJu/GongHuoDanWei.html"
		}]
	},

	{
		"text": "客户档案",
		"typename": "客服",
		list: [{
				"leftNav_id": "15",
				"name": "客户资料",
				"href": "html/KeFu/KeHuZiLiao.html"
			},

			{
				"leftNav_id": "16",
				"name": "车辆资料",
				"href": "html/KeFu/CheLiangZiLiao.html"
			}

		]
	}, {
		"text": "前台结算",
		"typename": "前台",
		list: [{
			"leftNav_id": "17",
			"name": "结算中心",
			"href": "html/QianTai/JieSuanZhongXin.html"
		}, {
			"leftNav_id": "18",
			"name": "会员充值卡管理",
			"href": "html/QianTai/ChuXuKaXiaoShowYuChongZhi.html"
		}]
	}, {
		"text": "维修救援",
		"typename": "维修",
		list: [{
			"leftNav_id": "19",
			"name": "维修接车",
			"href": "html/WeiXiu/WeiXiuJieChe.html"
		}, {
			"leftNav_id": "20",
			"name": "竣工检验",
			"href": "html/WeiXiu/JunGongJianYan.html"
		}]
	}, {
		"text": "全部",
		"typename": "首页",
		list: [{
				"leftNav_id": "1",
				"name": "组织机构",
				"href": "html/RenShi/ZhuZhiJiGou.html"
			}, {
				"leftNav_id": "2",
				"name": "岗位定义",
				"href": "html/RenShi/GangWeiDingYi.html"
			}, {
				"leftNav_id": "3",
				"name": " 离职登记",
				"href": "html/RenShi/LiZhiDengJi.html"
			}, {
				"leftNav_id": "4",
				"name": "通讯名录",
				"href": "html/RenShi/TongXunMingLu.html"
			}, {
				"leftNav_id": "5",
				"name": "技工星级",
				"href": "html/RenShi/JiGongXingJi.html"
			}, {
				"leftNav_id": "6",
				"name": "班组技工",
				"href": "html/RenShi/BanZuJiGong.html"
			}, {
				"leftNav_id": "7",
				"name": "外勤车俩",
				"href": "html/RenShi/WaiQingCheLiang.html"
			}, {
				"leftNav_id": "8",
				"name": "员工角色控制",
				"href": "html/XiTong/YuanGongJiaoSeKongZhi.html"
			}, {
				"leftNav_id": "9",
				"name": "员工权限控制",
				"href": "html/XiTong/YuanGongQuanXianKongZhi.html"
			}, {
				"leftNav_id": "10",
				"name": "发动机品牌",
				"href": "html/ShuJu/FaDongJiPinPai.html"
			}, {
				"leftNav_id": "11",
				"name": "车型档案",
				"href": "html/ShuJu/CheXingDangAn.html"
			}, {
				"leftNav_id": "12",
				"name": "维修项目",
				"href": "html/ShuJu/WeiXiuXiangMu.html"
			}, {
				"leftNav_id": "13",
				"name": "商品资料",
				"href": "html/ShuJu/ShangPinZiLiao.html"
			}, {
				"leftNav_id": "14",
				"name": "供货单位",
				"href": "html/ShuJu/GongHuoDanWei.html"
			}, {
				"leftNav_id": "15",
				"name": "客户资料",
				"href": "html/KeFu/KeHuZiLiao.html"
			},

			{
				"leftNav_id": "16",
				"name": "车辆资料",
				"href": "html/KeFu/CheLiangZiLiao.html"
			}, {
				"leftNav_id": "17",
				"name": "结算中心",
				"href": "html/QianTai/JieSuanZhongXin.html"
			}, {
				"leftNav_id": "18",
				"name": "会员充值卡管理",
				"href": "html/QianTai/ChuXuKaXiaoShowYuChongZhi.html"
			}, {
				"leftNav_id": "19",
				"name": "维修接车",
				"href": "html/WeiXiu/WeiXiuJieChe.html"
			}, {
				"leftNav_id": "20",
				"name": "竣工检验",
				"href": "html/WeiXiu/JunGongJianYan.html"
			}
		]
	}
]

var yuantree = [{
		"text": "员工资料",
		"typename": "人事",
		list: [{
			"leftNav_id": "1",
			"name": "组织机构",
			"href": "html/RenShi/ZhuZhiJiGou.html"
		}, {
			"leftNav_id": "2",
			"name": "岗位定义",
			"href": "html/RenShi/GangWeiDingYi.html"
		}, {
			"leftNav_id": "3",
			"name": " 离职登记",
			"href": "html/RenShi/LiZhiDengJi.html"
		}, {
			"leftNav_id": "4",
			"name": "通讯名录",
			"href": "html/RenShi/TongXunMingLu.html"
		}]
	}, {
		"text": "技工管理",
		"typename": "人事",
		list: [{
			"leftNav_id": "5",
			"name": "技工星级",
			"href": "html/RenShi/JiGongXingJi.html"
		}, {
			"leftNav_id": "6",
			"name": "班组技工",
			"href": "html/RenShi/BanZuJiGong.html"
		}, {
			"leftNav_id": "7",
			"name": "外勤车俩",
			"href": "html/RenShi/WaiQingCheLiang.html"
		}]
	},

	{
		"text": "权限控制",
		"typename": "系统",
		list: [{
			"leftNav_id": "8",
			"name": "员工角色控制",
			"href": "html/XiTong/YuanGongJiaoSeKongZhi.html"
		}, {
			"leftNav_id": "9",
			"name": "员工权限控制",
			"href": "html/XiTong/YuanGongQuanXianKongZhi.html"
		}]
	},

	{
		"text": "主数据",
		"typename": "数据",
		list: [{
			"leftNav_id": "10",
			"name": "发动机品牌",
			"href": "html/ShuJu/FaDongJiPinPai.html"
		}, {
			"leftNav_id": "11",
			"name": "车型档案",
			"href": "html/ShuJu/CheXingDangAn.html"
		}, {
			"leftNav_id": "12",
			"name": "维修项目",
			"href": "html/ShuJu/WeiXiuXiangMu.html"
		}, {
			"leftNav_id": "13",
			"name": "商品资料",
			"href": "html/ShuJu/ShangPinZiLiao.html"
		}, {
			"leftNav_id": "14",
			"name": "供货单位",
			"href": "html/ShuJu/GongHuoDanWei.html"
		}]
	},

	{
		"text": "客户档案",
		"typename": "客服",
		list: [{
				"leftNav_id": "15",
				"name": "客户资料",
				"href": "html/KeFu/KeHuZiLiao.html"
			},

			{
				"leftNav_id": "16",
				"name": "车辆资料",
				"href": "html/KeFu/CheLiangZiLiao.html"
			}

		]
	}, {
		"text": "前台结算",
		"typename": "前台",
		list: [{
			"leftNav_id": "17",
			"name": "结算中心",
			"href": "html/QianTai/JieSuanZhongXin.html"
		}, {
			"leftNav_id": "18",
			"name": "会员充值卡管理",
			"href": "html/QianTai/ChuXuKaXiaoShowYuChongZhi.html"
		}]
	}, {
		"text": "维修救援",
		"typename": "维修",
		list: [{
			"leftNav_id": "19",
			"name": "维修接车",
			"href": "html/WeiXiu/WeiXiuJieChe.html"
		}, {
			"leftNav_id": "20",
			"name": "竣工检验",
			"href": "html/WeiXiu/JunGongJianYan.html"
		}]
	}, {
		"text": "全部",
		"typename": "首页",
		list: [{
				"leftNav_id": "1",
				"name": "组织机构",
				"href": "html/RenShi/ZhuZhiJiGou.html"
			}, {
				"leftNav_id": "2",
				"name": "岗位定义",
				"href": "html/RenShi/GangWeiDingYi.html"
			}, {
				"leftNav_id": "3",
				"name": " 离职登记",
				"href": "html/RenShi/LiZhiDengJi.html"
			}, {
				"leftNav_id": "4",
				"name": "通讯名录",
				"href": "html/RenShi/TongXunMingLu.html"
			}, {
				"leftNav_id": "5",
				"name": "技工星级",
				"href": "html/RenShi/JiGongXingJi.html"
			}, {
				"leftNav_id": "6",
				"name": "班组技工",
				"href": "html/RenShi/BanZuJiGong.html"
			}, {
				"leftNav_id": "7",
				"name": "外勤车俩",
				"href": "html/RenShi/WaiQingCheLiang.html"
			}, {
				"leftNav_id": "8",
				"name": "员工角色控制",
				"href": "html/XiTong/YuanGongJiaoSeKongZhi.html"
			}, {
				"leftNav_id": "9",
				"name": "员工权限控制",
				"href": "html/XiTong/YuanGongQuanXianKongZhi.html"
			}, {
				"leftNav_id": "10",
				"name": "发动机品牌",
				"href": "html/ShuJu/FaDongJiPinPai.html"
			}, {
				"leftNav_id": "11",
				"name": "车型档案",
				"href": "html/ShuJu/CheXingDangAn.html"
			}, {
				"leftNav_id": "12",
				"name": "维修项目",
				"href": "html/ShuJu/WeiXiuXiangMu.html"
			}, {
				"leftNav_id": "13",
				"name": "商品资料",
				"href": "html/ShuJu/ShangPinZiLiao.html"
			}, {
				"leftNav_id": "14",
				"name": "供货单位",
				"href": "html/ShuJu/GongHuoDanWei.html"
			}, {
				"leftNav_id": "15",
				"name": "客户资料",
				"href": "html/KeFu/KeHuZiLiao.html"
			},

			{
				"leftNav_id": "16",
				"name": "车辆资料",
				"href": "html/KeFu/CheLiangZiLiao.html"
			}, {
				"leftNav_id": "17",
				"name": "结算中心",
				"href": "html/QianTai/JieSuanZhongXin.html"
			}, {
				"leftNav_id": "18",
				"name": "会员充值卡管理",
				"href": "html/QianTai/ChuXuKaXiaoShowYuChongZhi.html"
			}, {
				"leftNav_id": "19",
				"name": "维修接车",
				"href": "html/WeiXiu/WeiXiuJieChe.html"
			}, {
				"leftNav_id": "20",
				"name": "竣工检验",
				"href": "html/WeiXiu/JunGongJianYan.html"
			}
		]
		
	}
]