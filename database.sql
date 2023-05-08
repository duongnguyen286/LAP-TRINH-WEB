USE [game]
GO
/****** Object:  Table [dbo].[Account]    Script Date: 08/05/2023 8:21:43 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Account](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[UserName] [varchar](255) NOT NULL,
	[Pass] [varchar](255) NOT NULL,
	[email] [varchar](255) NOT NULL,
	[isAdmin] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[image]    Script Date: 08/05/2023 8:21:43 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[image](
	[idi] [int] NOT NULL,
	[a1] [nvarchar](max) NOT NULL,
	[a2] [nvarchar](max) NOT NULL,
	[a3] [nvarchar](max) NOT NULL,
	[a4] [nvarchar](max) NOT NULL,
	[a5] [nvarchar](max) NOT NULL,
	[a6] [nvarchar](max) NOT NULL,
	[a7] [nvarchar](max) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[idi] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[nick]    Script Date: 08/05/2023 8:21:43 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[nick](
	[idp] [int] NOT NULL,
	[taikhoan] [nvarchar](max) NOT NULL,
	[pass] [nvarchar](max) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[idp] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[product]    Script Date: 08/05/2023 8:21:43 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[product](
	[idp] [int] NOT NULL,
	[description] [nvarchar](max) NOT NULL,
	[rank] [nvarchar](max) NOT NULL,
	[ngoc] [nvarchar](max) NOT NULL,
	[tuong] [nvarchar](max) NOT NULL,
	[trangphuc] [nvarchar](max) NOT NULL,
	[loainick] [nvarchar](max) NOT NULL,
	[price] [int] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[idp] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
SET IDENTITY_INSERT [dbo].[Account] ON 
GO
INSERT [dbo].[Account] ([id], [UserName], [Pass], [email], [isAdmin]) VALUES (1, N'admin', N'abc@abc.com', N'123456', 1)
GO
INSERT [dbo].[Account] ([id], [UserName], [Pass], [email], [isAdmin]) VALUES (2, N'admin', N'123456', N'abc@abc.com', 1)
GO
INSERT [dbo].[Account] ([id], [UserName], [Pass], [email], [isAdmin]) VALUES (5, N'hoa', N'222222', N'zdjhcb@ddn.com', 0)
GO
INSERT [dbo].[Account] ([id], [UserName], [Pass], [email], [isAdmin]) VALUES (6, N'duong', N'333333', N'shgsvhg@vhvg.com', 0)
GO
SET IDENTITY_INSERT [dbo].[Account] OFF
GO
INSERT [dbo].[image] ([idi], [a1], [a2], [a3], [a4], [a5], [a6], [a7]) VALUES (1, N'image/acc1/a1.jpg', N'image/acc1/a2.jpg', N'image/acc1/a3.jpg', N'image/acc1/a4.jpg', N'image/acc1/a5.jpg', N'image/acc1/a6.jpg', N'image/acc1/a7.jpg')
GO
INSERT [dbo].[image] ([idi], [a1], [a2], [a3], [a4], [a5], [a6], [a7]) VALUES (2, N'image/acc2/a1.jpg', N'image/acc2/a2.jpg', N'image/acc2/a3.jpg', N'image/acc2/a4.jpg', N'image/acc2/a5.jpg', N'image/acc2/a6.jpg', N'image/acc2/a7.jpg')
GO
INSERT [dbo].[product] ([idp], [description], [rank], [ngoc], [tuong], [trangphuc], [loainick], [price]) VALUES (1, N'Nick ngon giá rẻ', N'Bạch Kim', N'Có', N'46', N'90', N'Trắng thông tin', 100000)
GO
INSERT [dbo].[product] ([idp], [description], [rank], [ngoc], [tuong], [trangphuc], [loainick], [price]) VALUES (2, N'Nick ngon giá rẻ', N'Kim Cương', N'Có', N'30', N'31', N'Trắng thông tin', 50000)
GO
INSERT [dbo].[product] ([idp], [description], [rank], [ngoc], [tuong], [trangphuc], [loainick], [price]) VALUES (3, N'Nick ngon', N'Cao Thủ', N'Không', N'22', N'66', N'Trắng thông tin', 120000)
GO
INSERT [dbo].[product] ([idp], [description], [rank], [ngoc], [tuong], [trangphuc], [loainick], [price]) VALUES (4, N'Nick ngon ', N'Bạch Kim', N'Có', N'33', N'60', N'Có thông tin', 10000)
GO
INSERT [dbo].[product] ([idp], [description], [rank], [ngoc], [tuong], [trangphuc], [loainick], [price]) VALUES (5, N'Nick rẻ', N'Đồng Ba', N'Không', N'40', N'100', N'Trắng thông tin', 50000)
GO
INSERT [dbo].[product] ([idp], [description], [rank], [ngoc], [tuong], [trangphuc], [loainick], [price]) VALUES (6, N'Nick ngon rẻ', N'Thách Đấu', N'có', N'200', N'400', N'Trắng thông tin', 200000)
GO
