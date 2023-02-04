USE
[DA]
GO

CREATE TABLE [dbo].[categories]
(
    [
    id] [
    bigint]
    IDENTITY
(
    1,
    1
) NOT NULL,
    [cate_name] [varchar]
(
    255
) NULL,
    [description] [varchar]
(
    255
) NULL,
    PRIMARY KEY CLUSTERED
(
[
    id] ASC
) WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON)
  ON [PRIMARY]
    )
  ON [PRIMARY]
    GO
    SET ANSI_PADDING OFF
    GO
/****** Object:  Table [dbo].[feature_detail]    Script Date: 3/23/2022 1:38:59 AM ******/
    SET ANSI_NULLS
  ON
    GO
    SET QUOTED_IDENTIFIER
  ON
    GO
CREATE TABLE [dbo].[feature_detail]
(
    [
    product_id] [
    bigint]
    NOT
    NULL, [
    feature_id]
[
    bigint]
    NOT
    NULL
) ON [PRIMARY]
    GO
/****** Object:  Table [dbo].[features]    Script Date: 3/23/2022 1:38:59 AM ******/
    SET ANSI_NULLS
  ON
    GO
    SET QUOTED_IDENTIFIER
  ON
    GO
    SET ANSI_PADDING
  ON
    GO
CREATE TABLE [dbo].[features]
(
    [
    feature_id] [
    bigint]
    IDENTITY
(
    1,
    1
) NOT NULL,
    [point] [bigint] NULL,
    [specific] [varchar]
(
    255
) NULL,
    [feature_type_id] [bigint] NULL,
    CONSTRAINT [PK__features__7906CBD7121DBD45] PRIMARY KEY CLUSTERED
(
[
    feature_id] ASC
) WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON)
  ON [PRIMARY]
    )
  ON [PRIMARY]
    GO
    SET ANSI_PADDING OFF
    GO
/****** Object:  Table [dbo].[featuretype]    Script Date: 3/23/2022 1:38:59 AM ******/
    SET ANSI_NULLS
  ON
    GO
    SET QUOTED_IDENTIFIER
  ON
    GO
    SET ANSI_PADDING
  ON
    GO
CREATE TABLE [dbo].[featuretype]
(
    [
    id] [
    bigint]
    IDENTITY
(
    1,
    1
) NOT NULL,
    [name] [varchar]
(
    255
) NULL,
    [unit] [varchar]
(
    255
) NULL,
    PRIMARY KEY CLUSTERED
(
[
    id] ASC
) WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON)
  ON [PRIMARY]
    )
  ON [PRIMARY]
    GO
    SET ANSI_PADDING OFF
    GO
/****** Object:  Table [dbo].[image]    Script Date: 3/23/2022 1:38:59 AM ******/
    SET ANSI_NULLS
  ON
    GO
    SET QUOTED_IDENTIFIER
  ON
    GO
    SET ANSI_PADDING
  ON
    GO
CREATE TABLE [dbo].[image]
(
    [
    id] [
    bigint]
    IDENTITY
(
    1,
    1
) NOT NULL,
    [alt] [varchar]
(
    255
) NULL,
    [height] [bigint] NULL,
    [url] [varchar]
(
    255
) NULL,
    [width] [bigint] NULL,
    [product_id] [bigint] NULL,
    CONSTRAINT [PK__image__3213E83FEABD06BA] PRIMARY KEY CLUSTERED
(
[
    id] ASC
) WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON)
  ON [PRIMARY]
    )
  ON [PRIMARY]
    GO
    SET ANSI_PADDING OFF
    GO
/****** Object:  Table [dbo].[orderdetails]    Script Date: 3/23/2022 1:38:59 AM ******/
    SET ANSI_NULLS
  ON
    GO
    SET QUOTED_IDENTIFIER
  ON
    GO
CREATE TABLE [dbo].[orderdetails]
(
    [
    amount] [
    int]
    NULL, [
    product_id] [
    bigint]
    NOT
    NULL, [
    order_id] [
    bigint]
    NOT
    NULL,
    CONSTRAINT [
    PK__orderdet__022945F6535CC1FE]
    PRIMARY
    KEY
    CLUSTERED
    (
    [
    order_id]
    ASC,
[
    product_id]
    ASC
) WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON)
  ON [PRIMARY]
    )
  ON [PRIMARY]
    GO
/****** Object:  Table [dbo].[orders]    Script Date: 3/23/2022 1:38:59 AM ******/
    SET ANSI_NULLS
  ON
    GO
    SET QUOTED_IDENTIFIER
  ON
    GO
    SET ANSI_PADDING
  ON
    GO
CREATE TABLE [dbo].[orders]
(
    [
    orderid] [
    bigint]
    IDENTITY
(
    1,
    1
) NOT NULL,
    [address] [varchar]
(
    255
) NULL,
    [phone] [varchar]
(
    255
) NULL,
    [status] [varchar]
(
    255
) NULL,
    [time] [datetime2]
(
    7
) NULL,
    [user_id] [bigint] NULL,
    CONSTRAINT [PK__orders__080E37758ABF859B] PRIMARY KEY CLUSTERED
(
[
    orderid] ASC
) WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON)
  ON [PRIMARY]
    )
  ON [PRIMARY]
    GO
    SET ANSI_PADDING OFF
    GO
/****** Object:  Table [dbo].[products]    Script Date: 3/23/2022 1:38:59 AM ******/
    SET ANSI_NULLS
  ON
    GO
    SET QUOTED_IDENTIFIER
  ON
    GO
    SET ANSI_PADDING
  ON
    GO
CREATE TABLE [dbo].[products]
(
    [
    id] [
    bigint]
    IDENTITY
(
    1,
    1
) NOT NULL,
    [create_date] [datetime2]
(
    7
) NULL,
    [description] [varchar]
(
    255
) NULL,
    [name] [varchar]
(
    255
) NULL,
    [price] [numeric]
(
    19,
    2
) NULL,
    [remain] [bigint] NULL,
    [update_date] [datetime2]
(
    7
) NULL,
    [category_id] [bigint] NULL,
    CONSTRAINT [PK__products__3213E83F371886B0] PRIMARY KEY CLUSTERED
(
[
    id] ASC
) WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON)
  ON [PRIMARY]
    )
  ON [PRIMARY]
    GO
    SET ANSI_PADDING OFF
    GO
/****** Object:  Table [dbo].[rates]    Script Date: 3/23/2022 1:38:59 AM ******/
    SET ANSI_NULLS
  ON
    GO
    SET QUOTED_IDENTIFIER
  ON
    GO
    SET ANSI_PADDING
  ON
    GO
CREATE TABLE [dbo].[rates]
(
    [
    comment] [
    varchar]
(
    255
) NULL,
    [point] [bigint] NULL,
    [product_id] [bigint] NOT NULL,
    [user_id] [bigint] NOT NULL,
    CONSTRAINT [PK__rates__AC999E85F5F18C22] PRIMARY KEY CLUSTERED
(
    [
    product_id]
    ASC,
[
    user_id]
    ASC
) WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON)
  ON [PRIMARY]
    )
  ON [PRIMARY]
    GO
    SET ANSI_PADDING OFF
    GO
/****** Object:  Table [dbo].[roles]    Script Date: 3/23/2022 1:38:59 AM ******/
    SET ANSI_NULLS
  ON
    GO
    SET QUOTED_IDENTIFIER
  ON
    GO
    SET ANSI_PADDING
  ON
    GO
CREATE TABLE [dbo].[roles]
(
    [
    id] [
    bigint]
    IDENTITY
(
    1,
    1
) NOT NULL,
    [name] [varchar]
(
    60
) NULL,
    CONSTRAINT [PK__roles__3213E83FDE54CB6C] PRIMARY KEY CLUSTERED
(
[
    id] ASC
) WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON)
  ON [PRIMARY]
    )
  ON [PRIMARY]
    GO
    SET ANSI_PADDING OFF
    GO
/****** Object:  Table [dbo].[user_roles]    Script Date: 3/23/2022 1:38:59 AM ******/
    SET ANSI_NULLS
  ON
    GO
    SET QUOTED_IDENTIFIER
  ON
    GO
CREATE TABLE [dbo].[user_roles]
(
    [
    user_id] [
    bigint]
    NOT
    NULL, [
    role_id] [
    bigint]
    NOT
    NULL,
    CONSTRAINT [
    PK__user_rol__6EDEA153A2FFB3D5]
    PRIMARY
    KEY
    CLUSTERED
    (
    [
    user_id]
    ASC,
[
    role_id]
    ASC
) WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON)
  ON [PRIMARY]
    )
  ON [PRIMARY]
    GO
/****** Object:  Table [dbo].[userdetails]    Script Date: 3/23/2022 1:38:59 AM ******/
    SET ANSI_NULLS
  ON
    GO
    SET QUOTED_IDENTIFIER
  ON
    GO
    SET ANSI_PADDING
  ON
    GO
CREATE TABLE [dbo].[userdetails]
(
    [
    id] [
    bigint]
    NOT
    NULL, [
    address] [
    varchar]
(
    255
) NULL,
    [first_name] [varchar]
(
    255
) NULL,
    [last_name] [varchar]
(
    255
) NULL,
    CONSTRAINT [PK__userdeta__3213E83FCAD77952] PRIMARY KEY CLUSTERED
(
[
    id] ASC
) WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON)
  ON [PRIMARY]
    )
  ON [PRIMARY]
    GO
    SET ANSI_PADDING OFF
    GO
/****** Object:  Table [dbo].[username]    Script Date: 3/23/2022 1:38:59 AM ******/
    SET ANSI_NULLS
  ON
    GO
    SET QUOTED_IDENTIFIER
  ON
    GO
    SET ANSI_PADDING
  ON
    GO
CREATE TABLE [dbo].[username]
(
    [
    id] [
    bigint]
    IDENTITY
(
    1,
    1
) NOT NULL,
    [email] [varchar]
(
    255
) NULL,
    [password] [varchar]
(
    255
) NULL,
    [username] [varchar]
(
    255
) NULL,
    CONSTRAINT [PK__username__3213E83F6DC3EF1A] PRIMARY KEY CLUSTERED
(
[
    id] ASC
) WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON)
  ON [PRIMARY]
    )
  ON [PRIMARY]
    GO
    SET ANSI_PADDING OFF
    GO
    SET IDENTITY_INSERT [dbo].[categories]
  ON
    INSERT [dbo].[categories]
(
    [
    id], [
    cate_name],
[
    description]
) VALUES
(
    1,
    N'
home decorations',
    N'All of

home decorations'
)
    INSERT [dbo].[categories]
(
    [
    id], [
    cate_name],
[
    description]
) VALUES
(
    2,
    N'
kitchen and dining room  furniture',
    N'All of
kitchen and dining room  furniture'
)
    INSERT [dbo].[categories]
(
    [
    id], [
    cate_name],
[
    description]
) VALUES
(
    3,
    N'living room furniture',
    N'All of living room furniture'
)
    INSERT [dbo].[categories]
(
    [
    id], [
    cate_name],
[
    description]
) VALUES
(
    4,
    N'
bedroom furniture',
    N'All of
bedroom furniture'
)
    INSERT [dbo].[categories]
(
    [
    id], [
    cate_name],
[
    description]
) VALUES
(
    6,
    N'
cabinet',
    N'Alll of
cabinet'
)
    INSERT [dbo].[categories]
(
    [
    id], [
    cate_name],
[
    description]
) VALUES
(
    7,
    N'office furniture',
    N'All of office furniture'
)
    INSERT [dbo].[categories]
(
    [
    id], [
    cate_name],
[
    description]
) VALUES
(
    8,
    N'lawn and garden',
    N'All of lawn and garden'
)
    INSERT [dbo].[categories]
(
    [
    id], [
    cate_name],
[
    description]
) VALUES
(
    9,
    N'
car interior accessories',
    N'All of
car interior accessories'
)
    SET IDENTITY_INSERT [dbo].[categories] OFF
    SET IDENTITY_INSERT [dbo].[image]
  ON
    INSERT [dbo].[image]
(
    [
    id], [
    alt], [
    height], [
    url], [
    width],
[
    product_id]
) VALUES
(
    1,
    NULL,
    NULL,
    N'https://g-search3.alicdn.com/img/bao/uploaded/i4/i2/2347380245/TB11DgGohPI8KJjSspfXXcCFXXa_!!0-item_pic.jpg',
    NULL,
    1
)
    INSERT [dbo].[image]
(
    [
    id], [
    alt], [
    height], [
    url], [
    width],
[
    product_id]
) VALUES
(
    2,
    NULL,
    NULL,
    N'https://imgs.michaels.com/MAM/assets/1/5E3C12034D34434F8A9BAAFDDF0F8E1B/img/04F2B61C48AF41F9816E341529E0A23B/B_90565_1.jpg?fit=inside|1024:1024',
    NULL,
    1
)
    INSERT [dbo].[image]
(
    [
    id], [
    alt], [
    height], [
    url], [
    width],
[
    product_id]
) VALUES
(
    3,
    NULL,
    NULL,
    N'https://ae01.alicdn.com/kf/HTB1aNDwVxTpK1RjSZFKq6y2wXXaz/Ch-u-u-Treo-T-ng-Kim-Lo-i-Ph-ng-Ho-ng-Con-C-ng.jpg_Q90.jpg_.webp',
    NULL,
    2
)
    INSERT [dbo].[image]
(
    [
    id], [
    alt], [
    height], [
    url], [
    width],
[
    product_id]
) VALUES
(
    4,
    NULL,
    NULL,
    N'https://sc04.alicdn.com/kf/H4079273d85e84e59828d1da714db6c95H.jpg',
    NULL,
    2
)
    INSERT [dbo].[image]
(
    [
    id], [
    alt], [
    height], [
    url], [
    width],
[
    product_id]
) VALUES
(
    5,
    NULL,
    NULL,
    N'https://cdn.shopify.com/s/files/1/0550/0141/5931/products/ACT99025.jpg?v=1637675153',
    NULL,
    3
)
    INSERT [dbo].[image]
(
    [
    id], [
    alt], [
    height], [
    url], [
    width],
[
    product_id]
) VALUES
(
    6,
    NULL,
    NULL,
    N'https://ae01.alicdn.com/kf/H9c21e1e3d8ac4af3b0001f7a30d647a2X/Kim-Lo-i-B-ng-ng-L-Phong-nh-D-u-Trang-Sinh-Vi-n-nh.jpg_Q90.jpg_.webp',
    NULL,
    3
)
    INSERT [dbo].[image]
(
    [
    id], [
    alt], [
    height], [
    url], [
    width],
[
    product_id]
) VALUES
(
    7,
    NULL,
    NULL,
    N'https://ae01.alicdn.com/kf/HTB1KqOBSXXXXXadXFXXq6xXFXXX4/C-i-n-B-nh-Hoa-G-m-S-M-u-Tr-ng-Trung-Qu-c.jpg_Q90.jpg_.webp',
    NULL,
    4
)
    INSERT [dbo].[image]
(
    [
    id], [
    alt], [
    height], [
    url], [
    width],
[
    product_id]
) VALUES
(
    8,
    NULL,
    NULL,
    N'https://cb.scene7.com/is/image/Crate/WarrickVasesFSSS22/$web_pdp_main_carousel_high$/211116171034/warrick-white-vases.jpg',
    NULL,
    4
)
    INSERT [dbo].[image]
(
    [
    id], [
    alt], [
    height], [
    url], [
    width],
[
    product_id]
) VALUES
(
    9,
    NULL,
    NULL,
    N'https://sc04.alicdn.com/kf/HTB13pdzaULrK1Rjy0Fjq6zYXFXaC.jpg',
    NULL,
    5
)
    INSERT [dbo].[image]
(
    [
    id], [
    alt], [
    height], [
    url], [
    width],
[
    product_id]
) VALUES
(
    10,
    NULL,
    NULL,
    N'https://img2.tradewheel.com/uploads/images/products/3/2/wholesale-factory-beautiful-clear-cylinder-glass-vase-for-christmas-decor-910cm5-0788033001554310528.jpg.webp',
    NULL,
    5
)
    INSERT [dbo].[image]
(
    [
    id], [
    alt], [
    height], [
    url], [
    width],
[
    product_id]
) VALUES
(
    11,
    NULL,
    NULL,
    N'https://ae01.alicdn.com/kf/H4314bae6621747ca8725a520aa995577F/100-Thi-t-Th-c-V-t-D-ng-Gia-nh-100-Thi-t-Th-c.jpg_Q90.jpg_.webp',
    NULL,
    6
)
    INSERT [dbo].[image]
(
    [
    id], [
    alt], [
    height], [
    url], [
    width],
[
    product_id]
) VALUES
(
    12,
    NULL,
    NULL,
    N'https://sc04.alicdn.com/kf/H55c6b961457940389b41390601370c365.jpg',
    NULL,
    6
)
    INSERT [dbo].[image]
(
    [
    id], [
    alt], [
    height], [
    url], [
    width],
[
    product_id]
) VALUES
(
    13,
    NULL,
    NULL,
    N'https://www.thespruce.com/thmb/XE_T_YM_EHZsmY_22Um6Piteej8=/941x0/filters:no_upscale():max_bytes(150000):strip_icc():format(webp)/wall-art-hacks-4088827-hero-84ab114ff8e84530bb7c0d620cf09768.jpg',
    NULL,
    7
)
    INSERT [dbo].[image]
(
    [
    id], [
    alt], [
    height], [
    url], [
    width],
[
    product_id]
) VALUES
(
    14,
    NULL,
    NULL,
    N'https://cdn.thewirecutter.com/wp-content/uploads/2019/06/pictureframes-2x1-7657.jpg?auto=webp&quality=75&crop=2:1&width=980&dpr=2',
    NULL,
    7
)
    INSERT [dbo].[image]
(
    [
    id], [
    alt], [
    height], [
    url], [
    width],
[
    product_id]
) VALUES
(
    15,
    NULL,
    NULL,
    N'https://cdn.shopify.com/s/files/1/0408/3646/4799/products/product-image-1420304024_700x.jpg?v=1593380300',
    NULL,
    8
)
    INSERT [dbo].[image]
(
    [
    id], [
    alt], [
    height], [
    url], [
    width],
[
    product_id]
) VALUES
(
    16,
    NULL,
    NULL,
    N'https://5.imimg.com/data5/KT/FA/MY-7030618/2-500x500.jpg',
    NULL,
    8
)
    INSERT [dbo].[image]
(
    [
    id], [
    alt], [
    height], [
    url], [
    width],
[
    product_id]
) VALUES
(
    17,
    NULL,
    NULL,
    N'https://image.made-in-china.com/202f0j00HfDYZqSGszpb/Kp-Chinese-Wholesale-High-Quality-Classic-Fashionable-Paper-Luxury-Decor-Fake-Decorating-Covers-Simulation-Faux-Decoration-Book-Box-for-Home-Decor.webp',
    NULL,
    9
)
    INSERT [dbo].[image]
(
    [
    id], [
    alt], [
    height], [
    url], [
    width],
[
    product_id]
) VALUES
(
    18,
    NULL,
    NULL,
    N'https://m.media-amazon.com/images/I/61jfCidU7qL._AC_SX679_.jpg',
    NULL,
    9
)
    INSERT [dbo].[image]
(
    [
    id], [
    alt], [
    height], [
    url], [
    width],
[
    product_id]
) VALUES
(
    19,
    NULL,
    NULL,
    N'https://ae01.alicdn.com/kf/HTB1itysNxnaK1RjSZFBq6AW7VXan/L-n-3D-T-L-m-H-nh-C-y-Acrylic-D-n-T-ng-Trang.jpg_Q90.jpg_.webp',
    NULL,
    10
)
    INSERT [dbo].[image]
(
    [
    id], [
    alt], [
    height], [
    url], [
    width],
[
    product_id]
) VALUES
(
    20,
    NULL,
    NULL,
    N'https://i5.walmartimages.com/asr/2cc56b1a-b898-4d3e-abdc-2822cc394332_1.d9436eb6d2ff360a6a50a79ea97de251.jpeg?odnHeight=450&odnWidth=450&odnBg=ffffff',
    NULL,
    10
)
    INSERT [dbo].[image]
(
    [
    id], [
    alt], [
    height], [
    url], [
    width],
[
    product_id]
) VALUES
(
    21,
    NULL,
    NULL,
    N'https://ae01.alicdn.com/kf/He1b45e82a3e447d292998f05c3a2e37en/S-K-t-H-p-C-a-n-V-6-Gh-C-M-m-Xoay-Inox.jpg_Q90.jpg_.webp',
    NULL,
    11
)
    INSERT [dbo].[image]
(
    [
    id], [
    alt], [
    height], [
    url], [
    width],
[
    product_id]
) VALUES
(
    22,
    NULL,
    NULL,
    N'https://m.media-amazon.com/images/I/71q+Iw3BRlL._SX522_.jpg',
    NULL,
    11
)
    INSERT [dbo].[image]
(
    [
    id], [
    alt], [
    height], [
    url], [
    width],
[
    product_id]
) VALUES
(
    23,
    NULL,
    NULL,
    N'https://cdn11.bigcommerce.com/s-a2m7tk4lks/images/stencil/1280x1280/products/204/933/Dining-Table-Set-4-Chairs-Minimalist-Modern-Reception-Negotiation-Coffee-Tables-Living-Room-Furniture-Kitchen-Table__97788.1643062245.jpg?c=1',
    NULL,
    12
)
    INSERT [dbo].[image]
(
    [
    id], [
    alt], [
    height], [
    url], [
    width],
[
    product_id]
) VALUES
(
    24,
    NULL,
    NULL,
    N'https://i.ebayimg.com/images/g/SuIAAOSwkdpfnSIm/s-l300.jpg',
    NULL,
    12
)
    INSERT [dbo].[image]
(
    [
    id], [
    alt], [
    height], [
    url], [
    width],
[
    product_id]
) VALUES
(
    25,
    NULL,
    NULL,
    N'https://i.pinimg.com/564x/e8/12/ae/e812ae55143163d49387364aedf1ef13.jpg',
    NULL,
    13
)
    INSERT [dbo].[image]
(
    [
    id], [
    alt], [
    height], [
    url], [
    width],
[
    product_id]
) VALUES
(
    26,
    NULL,
    NULL,
    N'https://foter.com/photos/title/large-dining-room-tables-seats-10.jpg',
    NULL,
    13
)
    INSERT [dbo].[image]
(
    [
    id], [
    alt], [
    height], [
    url], [
    width],
[
    product_id]
) VALUES
(
    27,
    NULL,
    NULL,
    N'https://d3dmq92854myzj.cloudfront.net/wp-content/uploads/2018/09/ghe-armchair-dep-gia-re-7.jpg',
    NULL,
    14
)
    INSERT [dbo].[image]
(
    [
    id], [
    alt], [
    height], [
    url], [
    width],
[
    product_id]
) VALUES
(
    28,
    NULL,
    NULL,
    N'https://d3dmq92854myzj.cloudfront.net/wp-content/uploads/2018/09/ghe-armchair-dep-gia-re-13.jpg',
    NULL,
    14
)
    INSERT [dbo].[image]
(
    [
    id], [
    alt], [
    height], [
    url], [
    width],
[
    product_id]
) VALUES
(
    29,
    NULL,
    NULL,
    N'https://cdn-amz.fadoglobal.io/images/I/51gFIvDDK7L.jpg',
    NULL,
    15
)
    INSERT [dbo].[image]
(
    [
    id], [
    alt], [
    height], [
    url], [
    width],
[
    product_id]
) VALUES
(
    30,
    NULL,
    NULL,
    N'https://m.media-amazon.com/images/I/513+R0d0JML._AC_SX679_.jpg',
    NULL,
    15
)
    INSERT [dbo].[image]
(
    [
    id], [
    alt], [
    height], [
    url], [
    width],
[
    product_id]
) VALUES
(
    31,
    NULL,
    NULL,
    N'https://ae01.alicdn.com/kf/Hb3072405600649899207375528069d68W/C-m-Th-ch-B-n-n-gi-n-hi-n-i-b-n-c.jpg_Q90.jpg_.webp',
    NULL,
    16
)
    INSERT [dbo].[image]
(
    [
    id], [
    alt], [
    height], [
    url], [
    width],
[
    product_id]
) VALUES
(
    32,
    NULL,
    NULL,
    N'https://futonland.com/common/images/products/large/77261_jenkin_coffee_table_1.jpg',
    NULL,
    16
)
    INSERT [dbo].[image]
(
    [
    id], [
    alt], [
    height], [
    url], [
    width],
[
    product_id]
) VALUES
(
    33,
    NULL,
    NULL,
    N'https://cdn.decoist.com/wp-content/uploads/2015/10/Carrara-marble-and-brass-dining-table-from-Jonathan-Adler.jpg',
    NULL,
    17
)
    INSERT [dbo].[image]
(
    [
    id], [
    alt], [
    height], [
    url], [
    width],
[
    product_id]
) VALUES
(
    34,
    NULL,
    NULL,
    N'https://m.media-amazon.com/images/I/81akd-3FyyL._AC_SX679_.jpg',
    NULL,
    17
)
    INSERT [dbo].[image]
(
    [
    id], [
    alt], [
    height], [
    url], [
    width],
[
    product_id]
) VALUES
(
    35,
    NULL,
    NULL,
    N'https://sc04.alicdn.com/kf/H030c1611ed474955a22d3343d148fdf8t.jpg_200x200xzq50.jpg',
    NULL,
    18
)
    INSERT [dbo].[image]
(
    [
    id], [
    alt], [
    height], [
    url], [
    width],
[
    product_id]
) VALUES
(
    36,
    NULL,
    NULL,
    N'https://www.zgallerie.com/content/images/hero-images/dining-room.jpg',
    NULL,
    18
)
    INSERT [dbo].[image]
(
    [
    id], [
    alt], [
    height], [
    url], [
    width],
[
    product_id]
) VALUES
(
    37,
    NULL,
    NULL,
    N'https://m.media-amazon.com/images/I/31CFx0y-naL._AC_US200_.jpg',
    NULL,
    19
)
    INSERT [dbo].[image]
(
    [
    id], [
    alt], [
    height], [
    url], [
    width],
[
    product_id]
) VALUES
(
    38,
    NULL,
    NULL,
    N'https://m.media-amazon.com/images/I/51Bfdgg5NML._AC_US200_.jpg',
    NULL,
    19
)
    INSERT [dbo].[image]
(
    [
    id], [
    alt], [
    height], [
    url], [
    width],
[
    product_id]
) VALUES
(
    39,
    NULL,
    NULL,
    N'https://sc04.alicdn.com/kf/H60440991f9be4564b910c08c0f9e23013.jpg',
    NULL,
    20
)
    INSERT [dbo].[image]
(
    [
    id], [
    alt], [
    height], [
    url], [
    width],
[
    product_id]
) VALUES
(
    40,
    NULL,
    NULL,
    N'https://static.turbosquid.com/Preview/2019/12/30__17_27_16/bailey_7.jpgC277A2AA-B43A-4212-9E45-44C758682CE1DefaultHQ.jpg',
    NULL,
    20
)
    INSERT [dbo].[image]
(
    [
    id], [
    alt], [
    height], [
    url], [
    width],
[
    product_id]
) VALUES
(
    41,
    NULL,
    NULL,
    N'http://noithat.biz.vn/public/data/product/tu-giay-dep-3-canh-go-cao-su_1507289815.jpg',
    NULL,
    21
)
    INSERT [dbo].[image]
(
    [
    id], [
    alt], [
    height], [
    url], [
    width],
[
    product_id]
) VALUES
(
    42,
    NULL,
    NULL,
    N'https://www.jecams.com.ph/assets/img/products/djg3T1BQQnFLTUdMbEVkMWdhdTlaZz09/custom-wood-cabinets-hcn1261.jpg',
    NULL,
    21
)
    INSERT [dbo].[image]
(
    [
    id], [
    alt], [
    height], [
    url], [
    width],
[
    product_id]
) VALUES
(
    43,
    NULL,
    NULL,
    N'https://kdtvn.com/wp-content/uploads/2019/03/sofa-ni-mau-den-ghi-KD029.jpg',
    NULL,
    22
)
    INSERT [dbo].[image]
(
    [
    id], [
    alt], [
    height], [
    url], [
    width],
[
    product_id]
) VALUES
(
    44,
    NULL,
    NULL,
    N'https://kdtvn.com/wp-content/uploads/2019/07/sofa-ni-cho-phong-khach-nho-kd181b.jpg',
    NULL,
    22
)
    INSERT [dbo].[image]
(
    [
    id], [
    alt], [
    height], [
    url], [
    width],
[
    product_id]
) VALUES
(
    45,
    NULL,
    NULL,
    N'https://product.hstatic.net/200000258925/product/new_project111_2e59f20e3bde459283d2ff6fa240ca40_master.jpg',
    NULL,
    23
)
    INSERT [dbo].[image]
(
    [
    id], [
    alt], [
    height], [
    url], [
    width],
[
    product_id]
) VALUES
(
    46,
    NULL,
    NULL,
    N'https://nhaxinh.com/wp-content/uploads/2021/10/ban_ben_1.jpg',
    NULL,
    23
)
    INSERT [dbo].[image]
(
    [
    id], [
    alt], [
    height], [
    url], [
    width],
[
    product_id]
) VALUES
(
    47,
    NULL,
    NULL,
    N'https://m.media-amazon.com/images/I/611OwRmSopL._AC_SX679_.jpg',
    NULL,
    24
)
    INSERT [dbo].[image]
(
    [
    id], [
    alt], [
    height], [
    url], [
    width],
[
    product_id]
) VALUES
(
    48,
    NULL,
    NULL,
    N'https://m.media-amazon.com/images/I/710UUa5P+QL._AC_SX615_SY462_.jpg',
    NULL,
    24
)
    INSERT [dbo].[image]
(
    [
    id], [
    alt], [
    height], [
    url], [
    width],
[
    product_id]
) VALUES
(
    49,
    NULL,
    NULL,
    N'https://m.media-amazon.com/images/I/61FM5QeAlhL._AC_SX569_.jpg',
    NULL,
    25
)
    INSERT [dbo].[image]
(
    [
    id], [
    alt], [
    height], [
    url], [
    width],
[
    product_id]
) VALUES
(
    50,
    NULL,
    NULL,
    N'https://m.media-amazon.com/images/I/613fZudglmL._AC_SX569_.jpg',
    NULL,
    25
)
    INSERT [dbo].[image]
(
    [
    id], [
    alt], [
    height], [
    url], [
    width],
[
    product_id]
) VALUES
(
    51,
    NULL,
    NULL,
    N'https://m.media-amazon.com/images/I/61ezdEXjBqL.jpg',
    NULL,
    26
)
    INSERT [dbo].[image]
(
    [
    id], [
    alt], [
    height], [
    url], [
    width],
[
    product_id]
) VALUES
(
    52,
    NULL,
    NULL,
    N'https://image.made-in-china.com/202f0j00hLGfTUNEmRob/Custom-Solid-Wood-Small-Narrow-Slim-Shoe-Organizer-Storage-Cabinet.webp',
    NULL,
    26
)
    INSERT [dbo].[image]
(
    [
    id], [
    alt], [
    height], [
    url], [
    width],
[
    product_id]
) VALUES
(
    53,
    NULL,
    NULL,
    N'https://sc04.alicdn.com/kf/H10cb7775f66c405e8fdc9b35cd5f3bb60.jpg',
    NULL,
    27
)
    INSERT [dbo].[image]
(
    [
    id], [
    alt], [
    height], [
    url], [
    width],
[
    product_id]
) VALUES
(
    54,
    NULL,
    NULL,
    N'https://5.imimg.com/data5/SW/RU/ET/SELLER-57483845/u-shape-8-seater-sectional-sofa-set-500x500.jpg',
    NULL,
    27
)
    INSERT [dbo].[image]
(
    [
    id], [
    alt], [
    height], [
    url], [
    width],
[
    product_id]
) VALUES
(
    55,
    NULL,
    NULL,
    N'https://www.kfrooms.com/wp-content/uploads/2019/02/shanish-nesting-coffee-table-81110-1.jpg',
    NULL,
    28
)
    INSERT [dbo].[image]
(
    [
    id], [
    alt], [
    height], [
    url], [
    width],
[
    product_id]
) VALUES
(
    56,
    NULL,
    NULL,
    N'https://cdn.decorpad.com/photos/2018/01/23/round-elisha-table-gold-nesting-coffee-tables.jpeg',
    NULL,
    28
)
    INSERT [dbo].[image]
(
    [
    id], [
    alt], [
    height], [
    url], [
    width],
[
    product_id]
) VALUES
(
    57,
    NULL,
    NULL,
    N'https://img1.homary.com/filters:format(webp)/mall/2021/04/06/0572541f77ed4f199b0fc7881cda77a6.jpg',
    NULL,
    29
)
    INSERT [dbo].[image]
(
    [
    id], [
    alt], [
    height], [
    url], [
    width],
[
    product_id]
) VALUES
(
    58,
    NULL,
    NULL,
    N'https://cdn.shopify.com/s/files/1/1425/0242/products/Minimalist-modern-styel-marble-stainless-steel-coffee-table-round-U-shape-tea-table-leisure-area-furniture.jpg?v=1610705359',
    NULL,
    29
)
    INSERT [dbo].[image]
(
    [
    id], [
    alt], [
    height], [
    url], [
    width],
[
    product_id]
) VALUES
(
    59,
    NULL,
    NULL,
    N'https://ae01.alicdn.com/kf/H298ab908c38d47ada03aea42e3f23daaI/17-Tho-i-M-i-u-T-i-Gh-L-i-Sofa-n-u-T-i.jpg_Q90.jpg_.webp',
    NULL,
    30
)
    INSERT [dbo].[image]
(
    [
    id], [
    alt], [
    height], [
    url], [
    width],
[
    product_id]
) VALUES
(
    60,
    NULL,
    NULL,
    N'https://ae01.alicdn.com/kf/H2f82c4779b5641198eedc55c2321fa1av/Nh-Sofa-n-Ng-i-L-i-Ng-i-B-Ng-Ph-ng-Ng-Nh-ng.jpg_Q90.jpg_.webp',
    NULL,
    30
)
    INSERT [dbo].[image]
(
    [
    id], [
    alt], [
    height], [
    url], [
    width],
[
    product_id]
) VALUES
(
    61,
    NULL,
    NULL,
    N'https://ae01.alicdn.com/kf/Hf823e89f9764425a90848fbf066411f2y/H-ng-M-i-V-Gi-ng-Ng-Hi-n-i-Thi-t-K-Da-Tr.jpg_Q90.jpg_.webp',
    NULL,
    31
)
    INSERT [dbo].[image]
(
    [
    id], [
    alt], [
    height], [
    url], [
    width],
[
    product_id]
) VALUES
(
    62,
    NULL,
    NULL,
    N'https://sc04.alicdn.com/kf/H882cb3db62e448afb45f076ff4f62f0bY.jpg',
    NULL,
    31
)
    INSERT [dbo].[image]
(
    [
    id], [
    alt], [
    height], [
    url], [
    width],
[
    product_id]
) VALUES
(
    63,
    NULL,
    NULL,
    N'https://sc04.alicdn.com/kf/H6f17162fcc984929b2788343cddfab43C.jpg',
    NULL,
    32
)
    INSERT [dbo].[image]
(
    [
    id], [
    alt], [
    height], [
    url], [
    width],
[
    product_id]
) VALUES
(
    64,
    NULL,
    NULL,
    N'https://i.pinimg.com/564x/41/83/05/41830525954dd73db6f22ed095f6f71f.jpg',
    NULL,
    32
)
    INSERT [dbo].[image]
(
    [
    id], [
    alt], [
    height], [
    url], [
    width],
[
    product_id]
) VALUES
(
    65,
    NULL,
    NULL,
    N'https://i5.walmartimages.com/asr/3b277ef8-bc3f-4f86-8c3a-9567280600ec_1.6ff17e6d4db3e8af9ff7876e7349c878.jpeg?odnHeight=612&odnWidth=612&odnBg=FFFFFF',
    NULL,
    33
)
    INSERT [dbo].[image]
(
    [
    id], [
    alt], [
    height], [
    url], [
    width],
[
    product_id]
) VALUES
(
    66,
    NULL,
    NULL,
    N'https://m.media-amazon.com/images/I/914jZHaErQL._AC_SX425_.jpg',
    NULL,
    33
)
    INSERT [dbo].[image]
(
    [
    id], [
    alt], [
    height], [
    url], [
    width],
[
    product_id]
) VALUES
(
    67,
    NULL,
    NULL,
    N'https://i.pinimg.com/564x/bf/bf/b4/bfbfb45351fca346921106e7c2da8eac.jpg',
    NULL,
    34
)
    INSERT [dbo].[image]
(
    [
    id], [
    alt], [
    height], [
    url], [
    width],
[
    product_id]
) VALUES
(
    68,
    NULL,
    NULL,
    N'https://image.made-in-china.com/43f34j00UTuGzpLdRfco/European-Style-New-Fashion-Solid-Wood-Bedroom-Furniture-Bed.webp',
    NULL,
    34
)
    INSERT [dbo].[image]
(
    [
    id], [
    alt], [
    height], [
    url], [
    width],
[
    product_id]
) VALUES
(
    69,
    NULL,
    NULL,
    N'https://sc04.alicdn.com/kf/H830eb18139a249f9ba7f972258e564cb1.jpg',
    NULL,
    35
)
    INSERT [dbo].[image]
(
    [
    id], [
    alt], [
    height], [
    url], [
    width],
[
    product_id]
) VALUES
(
    70,
    NULL,
    NULL,
    N'https://sc04.alicdn.com/kf/Hcbcd62218f4f45aea2c37a6067787a5dR.jpg',
    NULL,
    35
)
    INSERT [dbo].[image]
(
    [
    id], [
    alt], [
    height], [
    url], [
    width],
[
    product_id]
) VALUES
(
    71,
    NULL,
    NULL,
    N'https://sc04.alicdn.com/kf/H7e0fc302614142528268a6e231b09e9dR.jpg',
    NULL,
    36
)
    INSERT [dbo].[image]
(
    [
    id], [
    alt], [
    height], [
    url], [
    width],
[
    product_id]
) VALUES
(
    72,
    NULL,
    NULL,
    N'https://sc04.alicdn.com/kf/HTB1dFGGedLO8KJjSZFxq6yGEVXaf.jpg',
    NULL,
    36
)
    INSERT [dbo].[image]
(
    [
    id], [
    alt], [
    height], [
    url], [
    width],
[
    product_id]
) VALUES
(
    73,
    NULL,
    NULL,
    N'https://m.media-amazon.com/images/I/819pBH9sm6L._AC_SX679_.jpg',
    NULL,
    37
)
    INSERT [dbo].[image]
(
    [
    id], [
    alt], [
    height], [
    url], [
    width],
[
    product_id]
) VALUES
(
    74,
    NULL,
    NULL,
    N'https://www.hernest.com/pub/media/catalog/product/c/o/corner_use_space_optimizing_dressing_table_with_chair_hernest_makeup_vanity-1_1.jpg',
    NULL,
    37
)
    INSERT [dbo].[image]
(
    [
    id], [
    alt], [
    height], [
    url], [
    width],
[
    product_id]
) VALUES
(
    75,
    NULL,
    NULL,
    N'https://ae01.alicdn.com/kf/H394bc5a4e14b42198c31c0dd4594182fm/Th-ng-Minh-Hi-n-i-u-Gi-ng-C-Kh-a-B-c-u-Nh.jpg_Q90.jpg_.webp',
    NULL,
    38
)
    INSERT [dbo].[image]
(
    [
    id], [
    alt], [
    height], [
    url], [
    width],
[
    product_id]
) VALUES
(
    76,
    NULL,
    NULL,
    N'https://m.media-amazon.com/images/I/61bIUgXnttL._AC_SX569_.jpg',
    NULL,
    38
)
    INSERT [dbo].[image]
(
    [
    id], [
    alt], [
    height], [
    url], [
    width],
[
    product_id]
) VALUES
(
    77,
    NULL,
    NULL,
    N'https://image.made-in-china.com/202f0j00IklRNFLWfbqo/Custom-Walking-in-Solid-Wood-Portable-Closet-Cabinets-Set-Bedroom-Furniture-Organizer-Wardrobe.webp',
    NULL,
    39
)
    INSERT [dbo].[image]
(
    [
    id], [
    alt], [
    height], [
    url], [
    width],
[
    product_id]
) VALUES
(
    78,
    NULL,
    NULL,
    N'https://1.bp.blogspot.com/-SV6jdm1O1yc/YKfDO_Ojs_I/AAAAAAAAGdQ/jEpUmBCCrCkzIe39wcpyxZL4z6gJBcpGACLcBGAsYHQ/s813/bedroom%2Bcupboard%2B%25282%2529.png',
    NULL,
    39
)
    INSERT [dbo].[image]
(
    [
    id], [
    alt], [
    height], [
    url], [
    width],
[
    product_id]
) VALUES
(
    79,
    NULL,
    NULL,
    N'https://imageresizer.furnituredealer.net/img/remote/images.furnituredealer.net/img/products/flexsteel_wynwood_collection/color/ludwig_w1085-90fl-b1.jpg?width=878&height=600&scale=both&trim.threshold=80',
    NULL,
    40
)
    INSERT [dbo].[image]
(
    [
    id], [
    alt], [
    height], [
    url], [
    width],
[
    product_id]
) VALUES
(
    80,
    NULL,
    NULL,
    N'https://m.media-amazon.com/images/I/81kUXHM-FSL._AC_SX425_.jpg',
    NULL,
    40
)
    INSERT [dbo].[image]
(
    [
    id], [
    alt], [
    height], [
    url], [
    width],
[
    product_id]
) VALUES
(
    81,
    NULL,
    NULL,
    N'https://sc04.alicdn.com/kf/HTB1aP71LNTpK1RjSZFMq6zG_VXac.jpg',
    NULL,
    41
)
    INSERT [dbo].[image]
(
    [
    id], [
    alt], [
    height], [
    url], [
    width],
[
    product_id]
) VALUES
(
    82,
    NULL,
    NULL,
    N'https://sc04.alicdn.com/kf/HTB1aP71LNTpK1RjSZFMq6zG_VXac.jpg',
    NULL,
    41
)
    INSERT [dbo].[image]
(
    [
    id], [
    alt], [
    height], [
    url], [
    width],
[
    product_id]
) VALUES
(
    83,
    NULL,
    NULL,
    N'https://image.made-in-china.com/202f0j00yhNrQMeKSsgZ/Hot-Selling-Wood-Bathroom-Vanity-Artificial-Marble-Wash-Basin-Cabinet-with-LED-Mirror.webp',
    NULL,
    42
)
    INSERT [dbo].[image]
(
    [
    id], [
    alt], [
    height], [
    url], [
    width],
[
    product_id]
) VALUES
(
    84,
    NULL,
    NULL,
    N'https://www.singaporebathtubs.com/accessories/wp-content/uploads/2019/10/Verona14EW-min.jpg',
    NULL,
    42
)
    INSERT [dbo].[image]
(
    [
    id], [
    alt], [
    height], [
    url], [
    width],
[
    product_id]
) VALUES
(
    85,
    NULL,
    NULL,
    N'https://foter.com/photos/399/caines-tv-armoire.jpg?s=t4',
    NULL,
    43
)
    INSERT [dbo].[image]
(
    [
    id], [
    alt], [
    height], [
    url], [
    width],
[
    product_id]
) VALUES
(
    86,
    NULL,
    NULL,
    N'https://i.pinimg.com/564x/e2/20/82/e22082a1eb472f05dbc38010d637533e.jpg',
    NULL,
    43
)
    INSERT [dbo].[image]
(
    [
    id], [
    alt], [
    height], [
    url], [
    width],
[
    product_id]
) VALUES
(
    87,
    NULL,
    NULL,
    N'https://sc04.alicdn.com/kf/Hc42a8d95f4a2499cb32cc783d280a18dk.png',
    NULL,
    44
)
    INSERT [dbo].[image]
(
    [
    id], [
    alt], [
    height], [
    url], [
    width],
[
    product_id]
) VALUES
(
    88,
    NULL,
    NULL,
    N'https://5.imimg.com/data5/HK/NY/GI/SELLER-73881640/wall-mounted-bathroom-wash-basin-cabinet-500x500.jpg',
    NULL,
    44
)
    INSERT [dbo].[image]
(
    [
    id], [
    alt], [
    height], [
    url], [
    width],
[
    product_id]
) VALUES
(
    89,
    NULL,
    NULL,
    N'https://secure.img1-fg.wfcdn.com/im/96268465/resize-h800-w800%5Ecompr-r85/5430/54307977/Scholl+Armoire.jpg',
    NULL,
    45
)
    INSERT [dbo].[image]
(
    [
    id], [
    alt], [
    height], [
    url], [
    width],
[
    product_id]
) VALUES
(
    90,
    NULL,
    NULL,
    N'https://i.ebayimg.com/images/g/37EAAOSwbQBhNcet/s-l500.jpg',
    NULL,
    45
)
    INSERT [dbo].[image]
(
    [
    id], [
    alt], [
    height], [
    url], [
    width],
[
    product_id]
) VALUES
(
    91,
    NULL,
    NULL,
    N'https://sc04.alicdn.com/kf/H3b5eaf183dcf4be99c17506050005f63b.jpg',
    NULL,
    46
)
    INSERT [dbo].[image]
(
    [
    id], [
    alt], [
    height], [
    url], [
    width],
[
    product_id]
) VALUES
(
    92,
    NULL,
    NULL,
    N'https://sc04.alicdn.com/kf/Hcbc1d7beac684623a0f779c11fa44f35s.jpg',
    NULL,
    46
)
    INSERT [dbo].[image]
(
    [
    id], [
    alt], [
    height], [
    url], [
    width],
[
    product_id]
) VALUES
(
    93,
    NULL,
    NULL,
    N'http://m.pacabinets.com/uploads/202025001/2-tone-kitchen-cabinets-design03390157619.jpg',
    NULL,
    47
)
    INSERT [dbo].[image]
(
    [
    id], [
    alt], [
    height], [
    url], [
    width],
[
    product_id]
) VALUES
(
    94,
    NULL,
    NULL,
    N'http://m.pacabinets.com/uploads/202025001/modern-white-kitchen-cabinets26084488315.jpg',
    NULL,
    47
)
    INSERT [dbo].[image]
(
    [
    id], [
    alt], [
    height], [
    url], [
    width],
[
    product_id]
) VALUES
(
    95,
    NULL,
    NULL,
    N'https://sc04.alicdn.com/kf/H74df46d569c44aed97958ccdb1c329ad4.jpg',
    NULL,
    48
)
    INSERT [dbo].[image]
(
    [
    id], [
    alt], [
    height], [
    url], [
    width],
[
    product_id]
) VALUES
(
    96,
    NULL,
    NULL,
    N'https://m.media-amazon.com/images/I/711kUJwx1kL._AC_SX679_.jpg',
    NULL,
    48
)
    INSERT [dbo].[image]
(
    [
    id], [
    alt], [
    height], [
    url], [
    width],
[
    product_id]
) VALUES
(
    97,
    NULL,
    NULL,
    N'https://target.scene7.com/is/image/Target/GUEST_46126e9d-c80e-4bc3-a213-b81df4c9a258?wid=325&hei=325&qlt=80&fmt=pjpeg',
    NULL,
    49
)
    INSERT [dbo].[image]
(
    [
    id], [
    alt], [
    height], [
    url], [
    width],
[
    product_id]
) VALUES
(
    98,
    NULL,
    NULL,
    N'https://target.scene7.com/is/image/Target/GUEST_1ed4be72-efb1-4250-a8e6-1fcb8c1ceb4d?wid=325&hei=325&qlt=80&fmt=pjpeg',
    NULL,
    49
)
    INSERT [dbo].[image]
(
    [
    id], [
    alt], [
    height], [
    url], [
    width],
[
    product_id]
) VALUES
(
    99,
    NULL,
    NULL,
    N'https://deavita.net/wp-content/uploads/2015/11/2016-modern-kitchen-cabinets-white-cabinets-minimalist-design.jpg',
    NULL,
    50
)
    GO
    INSERT [dbo].[image]
(
    [
    id], [
    alt], [
    height], [
    url], [
    width],
[
    product_id]
) VALUES
(
    100,
    NULL,
    NULL,
    N'https://www.rtacabinetsupply.com/media/wysiwyg/gallery/victoria-white-shaker/victoria-white-shaker-1.jpg',
    NULL,
    50
)
    INSERT [dbo].[image]
(
    [
    id], [
    alt], [
    height], [
    url], [
    width],
[
    product_id]
) VALUES
(
    101,
    NULL,
    NULL,
    N'https://sc04.alicdn.com/kf/HTB1yOcMr2uSBuNkHFqDq6xfhVXas.jpg',
    NULL,
    51
)
    INSERT [dbo].[image]
(
    [
    id], [
    alt], [
    height], [
    url], [
    width],
[
    product_id]
) VALUES
(
    102,
    NULL,
    NULL,
    N'https://5.imimg.com/data5/US/VH/MY-109575/l-series-office-desk-500x500.png',
    NULL,
    51
)
    INSERT [dbo].[image]
(
    [
    id], [
    alt], [
    height], [
    url], [
    width],
[
    product_id]
) VALUES
(
    111,
    NULL,
    NULL,
    N'https://image.made-in-china.com/43f34j00FkGUnCHIrNbV/2020-Modern-Furniture-Manager-Home-Office-Computer-Desk-Table-Office-Desk.webp',
    NULL,
    53
)
    INSERT [dbo].[image]
(
    [
    id], [
    alt], [
    height], [
    url], [
    width],
[
    product_id]
) VALUES
(
    113,
    NULL,
    NULL,
    N'https://image.made-in-china.com/202f0j00karUjRPCJwoE/Modern-Office-Furniture-Executive-L-Shape-Desk.webp',
    NULL,
    53
)
    INSERT [dbo].[image]
(
    [
    id], [
    alt], [
    height], [
    url], [
    width],
[
    product_id]
) VALUES
(
    114,
    NULL,
    NULL,
    N'https://i.pinimg.com/564x/2a/19/19/2a19195cd74676fd0ff0b9f3fc7d9aca.jpg',
    NULL,
    54
)
    INSERT [dbo].[image]
(
    [
    id], [
    alt], [
    height], [
    url], [
    width],
[
    product_id]
) VALUES
(
    115,
    NULL,
    NULL,
    N'https://5.imimg.com/data5/HQ/EO/VX/SELLER-9802413/modular-office-workstation-500x500.jpg',
    NULL,
    54
)
    INSERT [dbo].[image]
(
    [
    id], [
    alt], [
    height], [
    url], [
    width],
[
    product_id]
) VALUES
(
    116,
    NULL,
    NULL,
    N'https://i5.walmartimages.com/asr/e541a71a-8703-4058-a61c-430489a8fd9e.2e5d33d4564163d0595a21208f6281aa.jpeg?odnHeight=612&odnWidth=612&odnBg=FFFFFF',
    NULL,
    55
)
    INSERT [dbo].[image]
(
    [
    id], [
    alt], [
    height], [
    url], [
    width],
[
    product_id]
) VALUES
(
    117,
    NULL,
    NULL,
    N'https://m.media-amazon.com/images/I/61mo0o-pALS._AC_SX679_.jpg',
    NULL,
    55
)
    INSERT [dbo].[image]
(
    [
    id], [
    alt], [
    height], [
    url], [
    width],
[
    product_id]
) VALUES
(
    118,
    NULL,
    NULL,
    N'https://i.pinimg.com/564x/92/7d/0d/927d0d6279e75ad9363d939f791dd965.jpg',
    NULL,
    56
)
    INSERT [dbo].[image]
(
    [
    id], [
    alt], [
    height], [
    url], [
    width],
[
    product_id]
) VALUES
(
    119,
    NULL,
    NULL,
    N'http://mkdfurniture.com/admin-panel/product/pimage/181yGNtQ7oJL._SL1500_.jpg',
    NULL,
    56
)
    INSERT [dbo].[image]
(
    [
    id], [
    alt], [
    height], [
    url], [
    width],
[
    product_id]
) VALUES
(
    120,
    NULL,
    NULL,
    N'https://aladdinsupplies.s3.amazonaws.com/products/1645199139_HuwSoOOJsLf0kPLkVL82I519c56FvHrvp4Rs6nqT.jpg',
    NULL,
    57
)
    INSERT [dbo].[image]
(
    [
    id], [
    alt], [
    height], [
    url], [
    width],
[
    product_id]
) VALUES
(
    121,
    NULL,
    NULL,
    N'https://eg.jumia.is/unsafe/fit-in/680x680/filters:fill(white)/product/96/386771/1.jpg?7556',
    NULL,
    57
)
    INSERT [dbo].[image]
(
    [
    id], [
    alt], [
    height], [
    url], [
    width],
[
    product_id]
) VALUES
(
    122,
    NULL,
    NULL,
    N'https://5.imimg.com/data5/UJ/TB/HQ/SELLER-7565670/wooden-cupboards-500x500-500x500.jpg',
    NULL,
    58
)
    INSERT [dbo].[image]
(
    [
    id], [
    alt], [
    height], [
    url], [
    width],
[
    product_id]
) VALUES
(
    123,
    NULL,
    NULL,
    N'https://sc04.alicdn.com/kf/H4e7f9b496d084001a24bd6eb709879e2Y.jpg',
    NULL,
    58
)
    INSERT [dbo].[image]
(
    [
    id], [
    alt], [
    height], [
    url], [
    width],
[
    product_id]
) VALUES
(
    124,
    NULL,
    NULL,
    N'https://i.pinimg.com/564x/66/6d/1c/666d1c78fbc081bbb1a793ad7b896a4c.jpg',
    NULL,
    60
)
    INSERT [dbo].[image]
(
    [
    id], [
    alt], [
    height], [
    url], [
    width],
[
    product_id]
) VALUES
(
    125,
    NULL,
    NULL,
    N'https://cdn.shopify.com/s/files/1/1557/9661/products/N2802-1_copy_aef6e21b-a81e-4d7f-a5e0-d51c97fe6258_4000x@2x.progressive.jpg?v=1578813143',
    NULL,
    60
)
    INSERT [dbo].[image]
(
    [
    id], [
    alt], [
    height], [
    url], [
    width],
[
    product_id]
) VALUES
(
    126,
    NULL,
    NULL,
    N'https://ae01.alicdn.com/kf/Hb8f15ea509584e3a99693faa013c0f29A/B-2-n-Led-N-ng-L-ng-M-t-Tr-i-Ngo-i-Tr-i.jpg_Q90.jpg_.webp',
    NULL,
    61
)
    INSERT [dbo].[image]
(
    [
    id], [
    alt], [
    height], [
    url], [
    width],
[
    product_id]
) VALUES
(
    127,
    NULL,
    NULL,
    N'https://m.media-amazon.com/images/I/61XDEKYS6FL._AC_SX679_.jpg',
    NULL,
    61
)
    INSERT [dbo].[image]
(
    [
    id], [
    alt], [
    height], [
    url], [
    width],
[
    product_id]
) VALUES
(
    128,
    NULL,
    NULL,
    N'https://i.etsystatic.com/22981542/r/il/85b626/2692835318/il_75x75.2692835318_rbp0.jpg',
    NULL,
    63
)
    INSERT [dbo].[image]
(
    [
    id], [
    alt], [
    height], [
    url], [
    width],
[
    product_id]
) VALUES
(
    129,
    NULL,
    NULL,
    N'https://i.pinimg.com/564x/ac/0a/23/ac0a23d07b8186f4b624aeb3156e0b51.jpg',
    NULL,
    63
)
    INSERT [dbo].[image]
(
    [
    id], [
    alt], [
    height], [
    url], [
    width],
[
    product_id]
) VALUES
(
    130,
    NULL,
    NULL,
    N'https://m.media-amazon.com/images/I/81Ol+3i68IL._AC_SX522_.jpg',
    NULL,
    65
)
    INSERT [dbo].[image]
(
    [
    id], [
    alt], [
    height], [
    url], [
    width],
[
    product_id]
) VALUES
(
    131,
    NULL,
    NULL,
    N'https://m.media-amazon.com/images/I/8101xRSuLHL._AC_SX679_.jpg',
    NULL,
    65
)
    INSERT [dbo].[image]
(
    [
    id], [
    alt], [
    height], [
    url], [
    width],
[
    product_id]
) VALUES
(
    132,
    NULL,
    NULL,
    N'https://image.made-in-china.com/202f0j00liDraSEKAwoN/LED-Solar-Bollard-Light-for-Outdoor-Garden-Lawn-Patio-Path-Lighting.webp',
    NULL,
    66
)
    INSERT [dbo].[image]
(
    [
    id], [
    alt], [
    height], [
    url], [
    width],
[
    product_id]
) VALUES
(
    133,
    NULL,
    NULL,
    N'https://image.made-in-china.com/318f0j00ltRUIrmsgPVF/video.webp',
    NULL,
    66
)
    INSERT [dbo].[image]
(
    [
    id], [
    alt], [
    height], [
    url], [
    width],
[
    product_id]
) VALUES
(
    134,
    NULL,
    NULL,
    N'https://ae01.alicdn.com/kf/HTB12gwBXPLuK1Rjy0Fhq6xpdFXak/ng-ph-n-c-c-nh-s-ng-c-nh-quan-c-c-Ch-u.jpg_Q90.jpg_.webp',
    NULL,
    68
)
    INSERT [dbo].[image]
(
    [
    id], [
    alt], [
    height], [
    url], [
    width],
[
    product_id]
) VALUES
(
    135,
    NULL,
    NULL,
    N'https://m.media-amazon.com/images/I/610IyskpvqL._AC_SX522_.jpg',
    NULL,
    68
)
    INSERT [dbo].[image]
(
    [
    id], [
    alt], [
    height], [
    url], [
    width],
[
    product_id]
) VALUES
(
    136,
    NULL,
    NULL,
    N'https://m.media-amazon.com/images/I/71vYWy7jRjL._AC_SX425_.jpg',
    NULL,
    69
)
    INSERT [dbo].[image]
(
    [
    id], [
    alt], [
    height], [
    url], [
    width],
[
    product_id]
) VALUES
(
    137,
    NULL,
    NULL,
    N'https://m.media-amazon.com/images/I/61eysQGDsjL._AC_SX425_.jpg',
    NULL,
    69
)
    INSERT [dbo].[image]
(
    [
    id], [
    alt], [
    height], [
    url], [
    width],
[
    product_id]
) VALUES
(
    138,
    NULL,
    NULL,
    N'https://cdn-amz.fadoglobal.io/images/I/71SujkZMDcL.jpg',
    NULL,
    70
)
    INSERT [dbo].[image]
(
    [
    id], [
    alt], [
    height], [
    url], [
    width],
[
    product_id]
) VALUES
(
    139,
    NULL,
    NULL,
    N'https://viet-solar.com/wp-content/uploads/2018/09/led-cam-bien-chuyen-dong.jpg',
    NULL,
    70
)
    INSERT [dbo].[image]
(
    [
    id], [
    alt], [
    height], [
    url], [
    width],
[
    product_id]
) VALUES
(
    140,
    NULL,
    NULL,
    N'https://m.media-amazon.com/images/I/71bGx4VN73L._AC_SY450_.jpg',
    NULL,
    71
)
    INSERT [dbo].[image]
(
    [
    id], [
    alt], [
    height], [
    url], [
    width],
[
    product_id]
) VALUES
(
    141,
    NULL,
    NULL,
    N'https://m.media-amazon.com/images/I/611h0B2YBAL._AC_SY450_.jpg',
    NULL,
    71
)
    INSERT [dbo].[image]
(
    [
    id], [
    alt], [
    height], [
    url], [
    width],
[
    product_id]
) VALUES
(
    142,
    NULL,
    NULL,
    N'https://image.made-in-china.com/318f0j00CautmAZWrshi/video.webp',
    NULL,
    74
)
    INSERT [dbo].[image]
(
    [
    id], [
    alt], [
    height], [
    url], [
    width],
[
    product_id]
) VALUES
(
    143,
    NULL,
    NULL,
    N'https://m.media-amazon.com/images/I/71g274hbhqL._AC_SX679_.jpg',
    NULL,
    74
)
    INSERT [dbo].[image]
(
    [
    id], [
    alt], [
    height], [
    url], [
    width],
[
    product_id]
) VALUES
(
    144,
    NULL,
    NULL,
    N'https://sc04.alicdn.com/kf/HTB1Gm17KVXXXXc0XXXXq6xXFXXXo.jpg',
    NULL,
    75
)
    INSERT [dbo].[image]
(
    [
    id], [
    alt], [
    height], [
    url], [
    width],
[
    product_id]
) VALUES
(
    145,
    NULL,
    NULL,
    N'https://m.media-amazon.com/images/I/41hPIvf6aXL._AC_.jpg',
    NULL,
    75
)
    INSERT [dbo].[image]
(
    [
    id], [
    alt], [
    height], [
    url], [
    width],
[
    product_id]
) VALUES
(
    146,
    NULL,
    NULL,
    N'https://www.homestratosphere.com/wp-content/uploads/2018/07/artificial-grass-july272018-min.jpg',
    NULL,
    76
)
    INSERT [dbo].[image]
(
    [
    id], [
    alt], [
    height], [
    url], [
    width],
[
    product_id]
) VALUES
(
    147,
    NULL,
    NULL,
    N'https://ae01.alicdn.com/kf/H2070cfff28a64757ab18953929e55998o/L-m-V-n-o-C-T-ng-H-p-C-Nh-n-T-o-Th.jpeg_Q90.jpeg_.webp',
    NULL,
    76
)
    INSERT [dbo].[image]
(
    [
    id], [
    alt], [
    height], [
    url], [
    width],
[
    product_id]
) VALUES
(
    148,
    NULL,
    NULL,
    N'https://ae01.alicdn.com/kf/Hddc4f2609de1464d93152a18f96991b26/n-N-ng-L-ng-M-t-Tr-i-S-n-V-n-B-i.jpg_Q90.jpg_.webp',
    NULL,
    78
)
    INSERT [dbo].[image]
(
    [
    id], [
    alt], [
    height], [
    url], [
    width],
[
    product_id]
) VALUES
(
    149,
    NULL,
    NULL,
    N'https://ae01.alicdn.com/kf/H83a821604fd04ac2887955ea89eb9cc2q/8-Chi-c-n-LED-S-n-V-n-N-ng-L-ng-M-t-Tr.jpg_Q90.jpg_.webp',
    NULL,
    78
)
    INSERT [dbo].[image]
(
    [
    id], [
    alt], [
    height], [
    url], [
    width],
[
    product_id]
) VALUES
(
    150,
    NULL,
    NULL,
    N'https://ae01.alicdn.com/kf/H33f9a7cc229a41429eb87bbe7f90d022h/Kim-Lo-i-T-c-K-S-n-Trang-Tr-S-n-V-n-Ngo-i.jpg_Q90.jpg_.webp',
    NULL,
    79
)
    INSERT [dbo].[image]
(
    [
    id], [
    alt], [
    height], [
    url], [
    width],
[
    product_id]
) VALUES
(
    151,
    NULL,
    NULL,
    N'https://ae01.alicdn.com/kf/Hb3d74ce1d4ba4c6189778f45b1052c2aE/B-2-T-ng-H-ng-R-o-Th-C-ng-Trang-Tr-Treo-T-ng.jpg_Q90.jpg_.webp',
    NULL,
    79
)
    INSERT [dbo].[image]
(
    [
    id], [
    alt], [
    height], [
    url], [
    width],
[
    product_id]
) VALUES
(
    158,
    NULL,
    NULL,
    N'https://i5.walmartimages.com/asr/1541eefe-cd42-49b5-b54f-45542acf8069.76d9cc84b08d243a1653191e6805eb03.jpeg?odnHeight=612&odnWidth=612&odnBg=FFFFFF',
    NULL,
    80
)
    INSERT [dbo].[image]
(
    [
    id], [
    alt], [
    height], [
    url], [
    width],
[
    product_id]
) VALUES
(
    159,
    NULL,
    NULL,
    N'https://salt.tikicdn.com/cache/400x400/ts/product/34/88/e5/d587a05f8026d94a802e92cac04539b7.jpg.webp',
    NULL,
    80
)
    INSERT [dbo].[image]
(
    [
    id], [
    alt], [
    height], [
    url], [
    width],
[
    product_id]
) VALUES
(
    160,
    NULL,
    NULL,
    N'https://m.media-amazon.com/images/I/61if-JufwCL._AC_SL1000_.jpg',
    NULL,
    81
)
    INSERT [dbo].[image]
(
    [
    id], [
    alt], [
    height], [
    url], [
    width],
[
    product_id]
) VALUES
(
    161,
    NULL,
    NULL,
    N'https://cdn-amz.fadoglobal.io/images/I/81Y6dC2h9oL.jpg',
    NULL,
    81
)
    INSERT [dbo].[image]
(
    [
    id], [
    alt], [
    height], [
    url], [
    width],
[
    product_id]
) VALUES
(
    162,
    NULL,
    NULL,
    N'https://alitools.io/en/showcase/image?url=https%3A%2F%2Fae01.alicdn.com%2Fkf%2FH1715ef9a7ea943249a92e274b8944ec9U.jpg_480x480.jpg_.webp',
    NULL,
    82
)
    INSERT [dbo].[image]
(
    [
    id], [
    alt], [
    height], [
    url], [
    width],
[
    product_id]
) VALUES
(
    163,
    NULL,
    NULL,
    N'https://ae01.alicdn.com/kf/He89f373b55754d128542da3940a768bcD/Baseus-M-y-L-c-Kh-ng-Kh-Lo-i-B-Formaldehyde-Xe-M-y-L.jpg_Q90.jpg_.webp',
    NULL,
    82
)
    INSERT [dbo].[image]
(
    [
    id], [
    alt], [
    height], [
    url], [
    width],
[
    product_id]
) VALUES
(
    164,
    NULL,
    NULL,
    N'https://ae01.alicdn.com/kf/H1de012f541af4d15b9846607d717afbdE/64-M-u-Sau-T-n-LED-Qu-t-i-u-H-a-Th-ng-H.jpg_Q90.jpg_.webp',
    NULL,
    83
)
    INSERT [dbo].[image]
(
    [
    id], [
    alt], [
    height], [
    url], [
    width],
[
    product_id]
) VALUES
(
    165,
    NULL,
    NULL,
    N'https://ae01.alicdn.com/kf/H082921f6bd004cddb1cf0e73ccf3a754y/Cho-C-E-GLC-L-p-W205-W213-X253-LED-Turbine-L-Th-ng-Kh-LED.jpg_Q90.jpg_.webp',
    NULL,
    83
)
    INSERT [dbo].[image]
(
    [
    id], [
    alt], [
    height], [
    url], [
    width],
[
    product_id]
) VALUES
(
    166,
    NULL,
    NULL,
    N'https://m.media-amazon.com/images/I/51bjhQFd98L._AC_SY450_.jpg',
    NULL,
    84
)
    INSERT [dbo].[image]
(
    [
    id], [
    alt], [
    height], [
    url], [
    width],
[
    product_id]
) VALUES
(
    167,
    NULL,
    NULL,
    N'https://img.joomcdn.net/364a367e451238e49384fbfd91a4eed33681308f_original.jpeg',
    NULL,
    84
)
    INSERT [dbo].[image]
(
    [
    id], [
    alt], [
    height], [
    url], [
    width],
[
    product_id]
) VALUES
(
    168,
    NULL,
    NULL,
    N'https://m.media-amazon.com/images/I/81QalCAPLQS._AC_SX679_.jpg',
    NULL,
    85
)
    INSERT [dbo].[image]
(
    [
    id], [
    alt], [
    height], [
    url], [
    width],
[
    product_id]
) VALUES
(
    169,
    NULL,
    NULL,
    N'https://image.made-in-china.com/43f34j00WQSfAzdslqrN/New-Design-Air-Fresheners-for-Car-and-Home-Wooden-Clip-Car-Diffuser-Hot-Sale-Car-Interior-Accessories-Private-Label-Car-Air-Freshener-Diffuser.webp',
    NULL,
    85
)
    INSERT [dbo].[image]
(
    [
    id], [
    alt], [
    height], [
    url], [
    width],
[
    product_id]
) VALUES
(
    170,
    NULL,
    NULL,
    N'https://i5.walmartimages.com/asr/c3f528a0-4903-4b5a-8df2-4d70257cc844_1.acdfdb479d19712a6c4fe8fdeaa310d4.jpeg?odnHeight=612&odnWidth=612&odnBg=FFFFFF',
    NULL,
    86
)
    INSERT [dbo].[image]
(
    [
    id], [
    alt], [
    height], [
    url], [
    width],
[
    product_id]
) VALUES
(
    171,
    NULL,
    NULL,
    N'https://img.joomcdn.net/784079668983d67d241d77cc0ab07d4bf23d66a5_original.jpeg',
    NULL,
    86
)
    INSERT [dbo].[image]
(
    [
    id], [
    alt], [
    height], [
    url], [
    width],
[
    product_id]
) VALUES
(
    172,
    NULL,
    NULL,
    N'https://ae01.alicdn.com/kf/HTB1NfHfa21G3KVjSZFkq6yK4XXaG/a-n-ng-a-ch-c-n-ng-Trong-B-ng-i-u-Khi-n.jpg_Q90.jpg_.webp',
    NULL,
    87
)
    INSERT [dbo].[image]
(
    [
    id], [
    alt], [
    height], [
    url], [
    width],
[
    product_id]
) VALUES
(
    173,
    NULL,
    NULL,
    N'https://ae01.alicdn.com/kf/H9cf030f962884d78a2955a6c832e17b1E/Silicone-Ch-ng-Tr-t-T-ng-i-n-Tho-i-Kh-ng-Tr-t-D.jpg_Q90.jpg_.webp',
    NULL,
    87
)
    INSERT [dbo].[image]
(
    [
    id], [
    alt], [
    height], [
    url], [
    width],
[
    product_id]
) VALUES
(
    174,
    NULL,
    NULL,
    N'https://m.media-amazon.com/images/I/61v5kCxRfQL._AC_SY450_.jpg',
    NULL,
    88
)
    INSERT [dbo].[image]
(
    [
    id], [
    alt], [
    height], [
    url], [
    width],
[
    product_id]
) VALUES
(
    175,
    NULL,
    NULL,
    N'https://m.media-amazon.com/images/I/61eGs5EqSqL._AC_SL1500_.jpg',
    NULL,
    88
)
    SET IDENTITY_INSERT [dbo].[image] OFF
    SET IDENTITY_INSERT [dbo].[orders]
  ON
    INSERT [dbo].[orders]
(
    [
    orderid], [
    address], [
    phone], [
    status], [
    time],
[
    user_id]
) VALUES
(
    1,
    N'TP Thu Duc',
    N'123456789',
    NULL,
    CAST
(
    N'2022-12-03 00:00:00.0000000' AS
    DateTime2
), 1)
    INSERT [dbo].[orders]
(
    [
    orderid], [
    address], [
    phone], [
    status], [
    time],
[
    user_id]
) VALUES
(
    2,
    N'Vung Tau',
    N'234567890',
    NULL,
    CAST
(
    N'2022-12-04 00:00:00.0000000' AS
    DateTime2
), 2)
    INSERT [dbo].[orders]
(
    [
    orderid], [
    address], [
    phone], [
    status], [
    time],
[
    user_id]
) VALUES
(
    3,
    N'Dong Nai',
    N'345678901',
    NULL,
    CAST
(
    N'2022-12-05 00:00:00.0000000' AS
    DateTime2
), 3)
    SET IDENTITY_INSERT [dbo].[orders] OFF
    SET IDENTITY_INSERT [dbo].[products]
  ON
    INSERT [dbo].[products]
(
    [
    id], [
    create_date], [
    description], [
    name], [
    price], [
    remain], [
    update_date],
[
    category_id]
) VALUES
(
    1,
    CAST
(
    N'2022-01-01 00:00:00.0000000' AS
    DateTime2
), N'Artificial leaf vine Artificial Vines Fake Green Leaf Wreath Willow Leaves Hanging Wedding Party Home Garden Wall Plant Decor', N'Wall Plant Decor', CAST
(
    0.23 AS
    Numeric
(
    19,
    2
)), 500, CAST
(
    N'2022-01-01 00:00:00.0000000' AS DateTime2
), 1)
    INSERT [dbo].[products]
(
    [
    id], [
    create_date], [
    description], [
    name], [
    price], [
    remain], [
    update_date],
[
    category_id]
) VALUES
(
    2,
    CAST
(
    N'2022-01-01 00:00:00.0000000' AS
    DateTime2
), N'EMAF Wholesale Modern Nordic Designer Peacecock Peacock Luxury Matal Wall Art Clock Sale Home Decoration Sweeper Clock For Home', N'Peacock Wall Clock', CAST
(
    19.88 AS
    Numeric
(
    19,
    2
)), 300, CAST
(
    N'2022-01-01 00:00:00.0000000' AS DateTime2
), 1)
    INSERT [dbo].[products]
(
    [
    id], [
    create_date], [
    description], [
    name], [
    price], [
    remain], [
    update_date],
[
    category_id]
) VALUES
(
    3,
    CAST
(
    N'2022-01-01 00:00:00.0000000' AS
    DateTime2
), N'Interior Modern Nordic Table Gold Accessories Wholesale Metal Maple Leaf Art Crafts Home Decor Pieces Luxury Crystal Decor', N'Metal Maple Leaf', CAST
(
    1.90 AS
    Numeric
(
    19,
    2
)), 200, CAST
(
    N'2022-01-01 00:00:00.0000000' AS DateTime2
), 1)
    INSERT [dbo].[products]
(
    [
    id], [
    create_date], [
    description], [
    name], [
    price], [
    remain], [
    update_date],
[
    category_id]
) VALUES
(
    4,
    CAST
(
    N'2022-01-01 00:00:00.0000000' AS
    DateTime2
), N'Biumart Nordic Decoration Ceramic Vase Ins Popular Modern Simple Style Flower White Ceramic Vase For Home Decor', N'White Ceramic Vase', CAST
(
    7.30 AS
    Numeric
(
    19,
    2
)), 266, CAST
(
    N'2022-01-01 00:00:00.0000000' AS DateTime2
), 1)
    INSERT [dbo].[products]
(
    [
    id], [
    create_date], [
    description], [
    name], [
    price], [
    remain], [
    update_date],
[
    category_id]
) VALUES
(
    5,
    CAST
(
    N'2022-01-01 00:00:00.0000000' AS
    DateTime2
), N'Clear Tall Cylinder Glass Floor Vase For Home Decor Crystal Vases For Flower', N'Clear Tall Cylinder Glass ', CAST
(
    5.90 AS
    Numeric
(
    19,
    2
)), 55, CAST
(
    N'2022-01-01 00:00:00.0000000' AS DateTime2
), 1)
    INSERT [dbo].[products]
(
    [
    id], [
    create_date], [
    description], [
    name], [
    price], [
    remain], [
    update_date],
[
    category_id]
) VALUES
(
    6,
    CAST
(
    N'2022-01-01 00:00:00.0000000' AS
    DateTime2
), N'Stock 12 pcs in One Set 3D Simulation Butterfly PVC Fridge Magnet for Home Decoration', N'Simulation Butterfly', CAST
(
    0.50 AS
    Numeric
(
    19,
    2
)), 607, CAST
(
    N'2022-01-01 00:00:00.0000000' AS DateTime2
), 1)
    INSERT [dbo].[products]
(
    [
    id], [
    create_date], [
    description], [
    name], [
    price], [
    remain], [
    update_date],
[
    category_id]
) VALUES
(
    7,
    CAST
(
    N'2022-01-01 00:00:00.0000000' AS
    DateTime2
), N'Wall Decor Interior Bedroom Living Room Frame Art Hanging Glass Mirrors Metal Modern Gold Luxury Decorative Home Wall Decor', N'Frame Art ', CAST
(
    5.60 AS
    Numeric
(
    19,
    2
)), 56, CAST
(
    N'2022-01-01 00:00:00.0000000' AS DateTime2
), 1)
    INSERT [dbo].[products]
(
    [
    id], [
    create_date], [
    description], [
    name], [
    price], [
    remain], [
    update_date],
[
    category_id]
) VALUES
(
    8,
    CAST
(
    N'2022-01-01 00:00:00.0000000' AS
    DateTime2
), N'Reticulated spherical Candlestick plating Crystal candlestick home decor Desktop decorations', N'plating Crystal candlestick ', CAST
(
    3.80 AS
    Numeric
(
    19,
    2
)), 445, CAST
(
    N'2022-01-01 00:00:00.0000000' AS DateTime2
), 1)
    INSERT [dbo].[products]
(
    [
    id], [
    create_date], [
    description], [
    name], [
    price], [
    remain], [
    update_date],
[
    category_id]
) VALUES
(
    9,
    CAST
(
    N'2022-01-01 00:00:00.0000000' AS
    DateTime2
), N'Fashionable faux books home decoration famous brand decor modern luxury books fake decorative book', N'Fashionable faux books ', CAST
(
    0.57 AS
    Numeric
(
    19,
    2
)), 345, CAST
(
    N'2022-01-01 00:00:00.0000000' AS DateTime2
), 1)
    INSERT [dbo].[products]
(
    [
    id], [
    create_date], [
    description], [
    name], [
    price], [
    remain], [
    update_date],
[
    category_id]
) VALUES
(
    10,
    CAST
(
    N'2022-01-01 00:00:00.0000000' AS
    DateTime2
), N'Little Things In Life Home Wood Plank Hanging Wall Home Decor', N'Wall Home Decor', CAST
(
    1.10 AS
    Numeric
(
    19,
    2
)), 22, CAST
(
    N'2022-01-01 00:00:00.0000000' AS DateTime2
), 1)
    INSERT [dbo].[products]
(
    [
    id], [
    create_date], [
    description], [
    name], [
    price], [
    remain], [
    update_date],
[
    category_id]
) VALUES
(
    11,
    CAST
(
    N'2022-01-01 00:00:00.0000000' AS
    DateTime2
), N'Modern Furniture kitchen dinning table and 6 chair Luxury restaurant metal stainless steel marble dining room sets dining tables', N'kitchen dinning table and 6 chair', CAST
(
    312.00 AS
    Numeric
(
    19,
    2
)), 14, CAST
(
    N'2022-01-01 00:00:00.0000000' AS DateTime2
), 2)
    INSERT [dbo].[products]
(
    [
    id], [
    create_date], [
    description], [
    name], [
    price], [
    remain], [
    update_date],
[
    category_id]
) VALUES
(
    12,
    CAST
(
    N'2022-01-01 00:00:00.0000000' AS
    DateTime2
), N'minimalist coffee table set Modern Design metal coffee table OEM Customized coffee table living room furniture', N'minimalist coffee table set', CAST
(
    39.00 AS
    Numeric
(
    19,
    2
)), 57, CAST
(
    N'2022-01-01 00:00:00.0000000' AS DateTime2
), 2)
    INSERT [dbo].[products]
(
    [
    id], [
    create_date], [
    description], [
    name], [
    price], [
    remain], [
    update_date],
[
    category_id]
) VALUES
(
    13,
    CAST
(
    N'2022-02-02 00:00:00.0000000' AS
    DateTime2
), N'Nordic Luxury European Furniture Space Saving Formal Dining Room Set 4 Seater Modern Elegant Kitchen Solid Wood Dining Table Set', N'Solid Wood Dining Table Set', CAST
(
    60.00 AS
    Numeric
(
    19,
    2
)), 66, CAST
(
    N'2022-01-01 00:00:00.0000000' AS DateTime2
), 2)
    INSERT [dbo].[products]
(
    [
    id], [
    create_date], [
    description], [
    name], [
    price], [
    remain], [
    update_date],
[
    category_id]
) VALUES
(
    14,
    CAST
(
    N'2022-02-02 00:00:00.0000000' AS
    DateTime2
), N'CARLFORD Velvet Flowered Armchair, Flower Shape Accent Chair with Golden Legs for Home Living Room', N'Armchair', CAST
(
    63.00 AS
    Numeric
(
    19,
    2
)), 79, CAST
(
    N'2022-01-01 00:00:00.0000000' AS DateTime2
), 2)
    INSERT [dbo].[products]
(
    [
    id], [
    create_date], [
    description], [
    name], [
    price], [
    remain], [
    update_date],
[
    category_id]
) VALUES
(
    15,
    CAST
(
    N'2022-02-02 00:00:00.0000000' AS
    DateTime2
), N'Hot Sale European Wooden Tea Table Modern Storage Cabinet Coffee Table Living Room Furniture', N'Wooden Tea Table', CAST
(
    21.00 AS
    Numeric
(
    19,
    2
)), 42, CAST
(
    N'2022-01-01 00:00:00.0000000' AS DateTime2
), 2)
    INSERT [dbo].[products]
(
    [
    id], [
    create_date], [
    description], [
    name], [
    price], [
    remain], [
    update_date],
[
    category_id]
) VALUES
(
    16,
    CAST
(
    N'2022-02-02 00:00:00.0000000' AS
    DateTime2
), N'Nordic Luxury Round Modern Gold Stainless Steel Furniture Leg living room home furniture Marble coffee table set', N'Marble coffee table set', CAST
(
    87.00 AS
    Numeric
(
    19,
    2
)), 77, CAST
(
    N'2022-01-01 00:00:00.0000000' AS DateTime2
), 2)
    INSERT [dbo].[products]
(
    [
    id], [
    create_date], [
    description], [
    name], [
    price], [
    remain], [
    update_date],
[
    category_id]
) VALUES
(
    17,
    CAST
(
    N'2022-02-02 00:00:00.0000000' AS
    DateTime2
), N'Elegant Luxury Quality Dining Room Furniture Set Modern Restaurant Kitchen Dining Tables with Chair', N'Kitchen Dining Tables with Chair', CAST
(
    48.00 AS
    Numeric
(
    19,
    2
)), 43, CAST
(
    N'2022-01-01 00:00:00.0000000' AS DateTime2
), 2)
    INSERT [dbo].[products]
(
    [
    id], [
    create_date], [
    description], [
    name], [
    price], [
    remain], [
    update_date],
[
    category_id]
) VALUES
(
    18,
    CAST
(
    N'2022-02-02 00:00:00.0000000' AS
    DateTime2
), N'Modern Style Luxury Contemporary 6 Seater Kitchen Furniture Expandable Wooden Dining Table And Chair Set For Dining Room', N'Wooden Dining Table And Chair Set', CAST
(
    110.00 AS
    Numeric
(
    19,
    2
)), 14, CAST
(
    N'2022-01-01 00:00:00.0000000' AS DateTime2
), 2)
    INSERT [dbo].[products]
(
    [
    id], [
    create_date], [
    description], [
    name], [
    price], [
    remain], [
    update_date],
[
    category_id]
) VALUES
(
    19,
    CAST
(
    N'2022-02-02 00:00:00.0000000' AS
    DateTime2
), N'elegant design metal MDF round side tables coffee table for living room furniture storage baske', N'coffee table', CAST
(
    5.70 AS
    Numeric
(
    19,
    2
)), 75, CAST
(
    N'2022-01-01 00:00:00.0000000' AS DateTime2
), 2)
    INSERT [dbo].[products]
(
    [
    id], [
    create_date], [
    description], [
    name], [
    price], [
    remain], [
    update_date],
[
    category_id]
) VALUES
(
    20,
    CAST
(
    N'2022-02-02 00:00:00.0000000' AS
    DateTime2
), N'Sofa Chair Wing Gold Luxury Cheap Nordic Furniture Modern Wholesale Lounge Accent Metal Dining Velvet Living Room Sofa Chairs', N'Sofa Chair', CAST
(
    79.00 AS
    Numeric
(
    19,
    2
)), 666, CAST
(
    N'2022-01-01 00:00:00.0000000' AS DateTime2
), 2)
    INSERT [dbo].[products]
(
    [
    id], [
    create_date], [
    description], [
    name], [
    price], [
    remain], [
    update_date],
[
    category_id]
) VALUES
(
    21,
    CAST
(
    N'2022-02-02 00:00:00.0000000' AS
    DateTime2
), N'Living room furniture storage cabinet solid wood cabinet 4-door wood cabinet', N'wood cabinet', CAST
(
    154.00 AS
    Numeric
(
    19,
    2
)), 44, CAST
(
    N'2022-01-01 00:00:00.0000000' AS DateTime2
), 3)
    INSERT [dbo].[products]
(
    [
    id], [
    create_date], [
    description], [
    name], [
    price], [
    remain], [
    update_date],
[
    category_id]
) VALUES
(
    22,
    CAST
(
    N'2022-02-02 00:00:00.0000000' AS
    DateTime2
), N'STEEL-LAND Factory price luxury design couch living room furniture sofa soft modern leather sofa', N'sofa', CAST
(
    1380.00 AS
    Numeric
(
    19,
    2
)), 5, CAST
(
    N'2022-01-01 00:00:00.0000000' AS DateTime2
), 3)
    INSERT [dbo].[products]
(
    [
    id], [
    create_date], [
    description], [
    name], [
    price], [
    remain], [
    update_date],
[
    category_id]
) VALUES
(
    23,
    CAST
(
    N'2022-02-02 00:00:00.0000000' AS
    DateTime2
), N'Modern style custom living room furniture bedside golden marb side table', N'side table', CAST
(
    105.00 AS
    Numeric
(
    19,
    2
)), 47, CAST
(
    N'2022-02-02 00:00:00.0000000' AS DateTime2
), 3)
    INSERT [dbo].[products]
(
    [
    id], [
    create_date], [
    description], [
    name], [
    price], [
    remain], [
    update_date],
[
    category_id]
) VALUES
(
    24,
    CAST
(
    N'2022-03-03 00:00:00.0000000' AS
    DateTime2
), N'Modern Living Room Metal Recliner Chair Set for Hotel Room Designer''s new dining chair Restaurant furniture', N'Metal Recliner Chair', CAST
(
    300.00 AS
    Numeric
(
    19,
    2
)), 68, CAST
(
    N'2022-02-02 00:00:00.0000000' AS DateTime2
), 3)
    INSERT [dbo].[products]
(
    [
    id], [
    create_date], [
    description], [
    name], [
    price], [
    remain], [
    update_date],
[
    category_id]
) VALUES
(
    25,
    CAST
(
    N'2022-03-03 00:00:00.0000000' AS
    DateTime2
), N'Luxury Grey Velvet Relaxing Lounge Chair Tufted Chair Living Room Chair with Golden Legs', N'Relaxing Lounge Chair ', CAST
(
    65.00 AS
    Numeric
(
    19,
    2
)), 333, CAST
(
    N'2022-02-02 00:00:00.0000000' AS DateTime2
), 3)
    INSERT [dbo].[products]
(
    [
    id], [
    create_date], [
    description], [
    name], [
    price], [
    remain], [
    update_date],
[
    category_id]
) VALUES
(
    26,
    CAST
(
    N'2022-03-03 00:00:00.0000000' AS
    DateTime2
), N'Living room furniture shoe rack cabinet wooden shoe storage cabinet shoe rack designs', N'wooden shoe storage cabinet ', CAST
(
    30.00 AS
    Numeric
(
    19,
    2
)), 46, CAST
(
    N'2022-02-02 00:00:00.0000000' AS DateTime2
), 3)
    INSERT [dbo].[products]
(
    [
    id], [
    create_date], [
    description], [
    name], [
    price], [
    remain], [
    update_date],
[
    category_id]
) VALUES
(
    27,
    CAST
(
    N'2022-03-03 00:00:00.0000000' AS
    DateTime2
), N'Modern Living Room Furniture Sets Design Fabric Corner Sofa Lounge Sectional Sofa Luxury L Shaped Sofa', N'L Shaped Sofa', CAST
(
    470.00 AS
    Numeric
(
    19,
    2
)), 67, CAST
(
    N'2022-02-02 00:00:00.0000000' AS DateTime2
), 3)
    INSERT [dbo].[products]
(
    [
    id], [
    create_date], [
    description], [
    name], [
    price], [
    remain], [
    update_date],
[
    category_id]
) VALUES
(
    28,
    CAST
(
    N'2022-03-03 00:00:00.0000000' AS
    DateTime2
), N'Gold Nesting Tables Clear Glass Top Coffee Table Desk Living Room Furniture', N'coffee table', CAST
(
    65.00 AS
    Numeric
(
    19,
    2
)), 33, CAST
(
    N'2022-02-02 00:00:00.0000000' AS DateTime2
), 3)
    INSERT [dbo].[products]
(
    [
    id], [
    create_date], [
    description], [
    name], [
    price], [
    remain], [
    update_date],
[
    category_id]
) VALUES
(
    29,
    CAST
(
    N'2022-03-03 00:00:00.0000000' AS
    DateTime2
), N'high quality luxury coffee table modern living room furniture style marble top stainless steel coffee table', N'coffee table', CAST
(
    190.00 AS
    Numeric
(
    19,
    2
)), 17, CAST
(
    N'2022-03-03 00:00:00.0000000' AS DateTime2
), 3)
    INSERT [dbo].[products]
(
    [
    id], [
    create_date], [
    description], [
    name], [
    price], [
    remain], [
    update_date],
[
    category_id]
) VALUES
(
    30,
    CAST
(
    N'2022-03-03 00:00:00.0000000' AS
    DateTime2
), N'free sample Custom luxury modern living room furniture l shaped European style comfortable fabric sofa(no filling)', N'fabric sofa', CAST
(
    35.00 AS
    Numeric
(
    19,
    2
)), 55, CAST
(
    N'2022-03-03 00:00:00.0000000' AS DateTime2
), 3)
    INSERT [dbo].[products]
(
    [
    id], [
    create_date], [
    description], [
    name], [
    price], [
    remain], [
    update_date],
[
    category_id]
) VALUES
(
    31,
    CAST
(
    N'2022-03-03 00:00:00.0000000' AS
    DateTime2
), N'home furniture bed new design bedroom furniture modern bed frame', N'home furniture bed', CAST
(
    260.00 AS
    Numeric
(
    19,
    2
)), 56, CAST
(
    N'2022-03-03 00:00:00.0000000' AS DateTime2
), 4)
    INSERT [dbo].[products]
(
    [
    id], [
    create_date], [
    description], [
    name], [
    price], [
    remain], [
    update_date],
[
    category_id]
) VALUES
(
    32,
    CAST
(
    N'2022-01-02 00:00:00.0000000' AS
    DateTime2
), N'Nordic Style Modern kleiderschrank High End Wardrobe Bedroom Furniture 2 Door Wardrobe Closet Cabinet', N'2 Door Wardrobe Closet', CAST
(
    145.00 AS
    Numeric
(
    19,
    2
)), 37, CAST
(
    N'2022-03-03 00:00:00.0000000' AS DateTime2
), 4)
    INSERT [dbo].[products]
(
    [
    id], [
    create_date], [
    description], [
    name], [
    price], [
    remain], [
    update_date],
[
    category_id]
) VALUES
(
    33,
    CAST
(
    N'2022-01-02 00:00:00.0000000' AS
    DateTime2
), N'HStex big velvet single sofa furniture sofa pouf foot stool with storage bedroom room pink ottomans bench', N'big velvet single sofa', CAST
(
    15.00 AS
    Numeric
(
    19,
    2
)), 67, CAST
(
    N'2022-03-03 00:00:00.0000000' AS DateTime2
), 4)
    INSERT [dbo].[products]
(
    [
    id], [
    create_date], [
    description], [
    name], [
    price], [
    remain], [
    update_date],
[
    category_id]
) VALUES
(
    34,
    CAST
(
    N'2022-01-02 00:00:00.0000000' AS
    DateTime2
), N'king size high gloss bedroom furniture modern design bedroom set', N'furniture modern design bedroom set', CAST
(
    433.00 AS
    Numeric
(
    19,
    2
)), 55, CAST
(
    N'2022-03-03 00:00:00.0000000' AS DateTime2
), 4)
    INSERT [dbo].[products]
(
    [
    id], [
    create_date], [
    description], [
    name], [
    price], [
    remain], [
    update_date],
[
    category_id]
) VALUES
(
    35,
    CAST
(
    N'2022-01-02 00:00:00.0000000' AS
    DateTime2
), N'Smart Round leather couple bed princess bed with multi-function speaker massage USB LED light bed bedroom furniture', N'Smart Round leather couple bed', CAST
(
    199.00 AS
    Numeric
(
    19,
    2
)), 700, CAST
(
    N'2022-03-03 00:00:00.0000000' AS DateTime2
), 4)
    INSERT [dbo].[products]
(
    [
    id], [
    create_date], [
    description], [
    name], [
    price], [
    remain], [
    update_date],
[
    category_id]
) VALUES
(
    36,
    CAST
(
    N'2022-01-02 00:00:00.0000000' AS
    DateTime2
), N'Children Furniture Wood and MDF Bunk Bed Furniture Wood Kids Beds bedroom sets for bedroom furniture', N'Bunk Bed', CAST
(
    78.00 AS
    Numeric
(
    19,
    2
)), 552, CAST
(
    N'2022-03-03 00:00:00.0000000' AS DateTime2
), 4)
    INSERT [dbo].[products]
(
    [
    id], [
    create_date], [
    description], [
    name], [
    price], [
    remain], [
    update_date],
[
    category_id]
) VALUES
(
    37,
    CAST
(
    N'2022-01-02 00:00:00.0000000' AS
    DateTime2
), N'modern Gold Leather Finishing Dresser Set Bedroom Furniture Modern Makeup Dressing Table with Mirror LED Light', N'Makeup Dressing Table', CAST
(
    340.00 AS
    Numeric
(
    19,
    2
)), 444, CAST
(
    N'2022-03-03 00:00:00.0000000' AS DateTime2
), 4)
    INSERT [dbo].[products]
(
    [
    id], [
    create_date], [
    description], [
    name], [
    price], [
    remain], [
    update_date],
[
    category_id]
) VALUES
(
    38,
    CAST
(
    N'2022-01-02 00:00:00.0000000' AS
    DateTime2
), N'bedroom furniture modern small white wood smart led light nightstand table night stand bedside table', N'bedside table', CAST
(
    60.00 AS
    Numeric
(
    19,
    2
)), 77, CAST
(
    N'2022-03-03 00:00:00.0000000' AS DateTime2
), 4)
    INSERT [dbo].[products]
(
    [
    id], [
    create_date], [
    description], [
    name], [
    price], [
    remain], [
    update_date],
[
    category_id]
) VALUES
(
    39,
    CAST
(
    N'2022-01-02 00:00:00.0000000' AS
    DateTime2
), N'Custom Walking in Solid Wood Portable Closet Cabinets Set Bedroom Furniture Organizer Wardrobe', N'Wood Portable Closet ', CAST
(
    200.00 AS
    Numeric
(
    19,
    2
)), 45, CAST
(
    N'2022-01-02 00:00:00.0000000' AS DateTime2
), 4)
    INSERT [dbo].[products]
(
    [
    id], [
    create_date], [
    description], [
    name], [
    price], [
    remain], [
    update_date],
[
    category_id]
) VALUES
(
    40,
    CAST
(
    N'2022-01-02 00:00:00.0000000' AS
    DateTime2
), N'American Mid-Century Modern Full Bedroom Furniture Set Queen King Size Tufed Wooden Sleigh Bed', N' Wooden Sleigh Bed', CAST
(
    820.00 AS
    Numeric
(
    19,
    2
)), 42, CAST
(
    N'2022-01-02 00:00:00.0000000' AS DateTime2
), 4)
    INSERT [dbo].[products]
(
    [
    id], [
    create_date], [
    description], [
    name], [
    price], [
    remain], [
    update_date],
[
    category_id]
) VALUES
(
    41,
    CAST
(
    N'2022-01-02 00:00:00.0000000' AS
    DateTime2
), N'Custom 16 year manufacturer mini modern display wood cabinet wine bar cabinet', N'display wood cabinet', CAST
(
    136.00 AS
    Numeric
(
    19,
    2
)), 76, CAST
(
    N'2022-01-02 00:00:00.0000000' AS DateTime2
), 6)
    INSERT [dbo].[products]
(
    [
    id], [
    create_date], [
    description], [
    name], [
    price], [
    remain], [
    update_date],
[
    category_id]
) VALUES
(
    42,
    CAST
(
    N'2022-01-02 00:00:00.0000000' AS
    DateTime2
), N'Modern Style Hot Sell Marble Bathroom Sink Countertop Basin Cabinet For Home', N'Sink Countertop Basin Cabinet', CAST
(
    26.00 AS
    Numeric
(
    19,
    2
)), 555, CAST
(
    N'2022-01-02 00:00:00.0000000' AS DateTime2
), 6)
    INSERT [dbo].[products]
(
    [
    id], [
    create_date], [
    description], [
    name], [
    price], [
    remain], [
    update_date],
[
    category_id]
) VALUES
(
    43,
    CAST
(
    N'2022-01-02 00:00:00.0000000' AS
    DateTime2
), N'wooden wardrobe living room furniture clothes storage cabinet DIY wardrobe', N'clothes storage cabinet', CAST
(
    390.00 AS
    Numeric
(
    19,
    2
)), 43, CAST
(
    N'2022-01-02 00:00:00.0000000' AS DateTime2
), 6)
    INSERT [dbo].[products]
(
    [
    id], [
    create_date], [
    description], [
    name], [
    price], [
    remain], [
    update_date],
[
    category_id]
) VALUES
(
    44,
    CAST
(
    N'2022-01-02 00:00:00.0000000' AS
    DateTime2
), N'GODI New Arrival Modern Bath cabinet Floating Mirrored Cabinet Luxury vanity wood Bathroom vanity cabinet', N'Modern Bath cabinet', CAST
(
    539.00 AS
    Numeric
(
    19,
    2
)), 55, CAST
(
    N'2022-01-02 00:00:00.0000000' AS DateTime2
), 6)
    INSERT [dbo].[products]
(
    [
    id], [
    create_date], [
    description], [
    name], [
    price], [
    remain], [
    update_date],
[
    category_id]
) VALUES
(
    45,
    CAST
(
    N'2022-01-02 00:00:00.0000000' AS
    DateTime2
), N'Wooden Wardrobe Cabinet Clothes Closet Drawer Bedroom Armoire Organizer Big Closet', N'Wooden Wardrobe Cabinet Clothes ', CAST
(
    49.00 AS
    Numeric
(
    19,
    2
)), 447, CAST
(
    N'2022-01-02 00:00:00.0000000' AS DateTime2
), 6)
    INSERT [dbo].[products]
(
    [
    id], [
    create_date], [
    description], [
    name], [
    price], [
    remain], [
    update_date],
[
    category_id]
) VALUES
(
    46,
    CAST
(
    N'2022-01-02 00:00:00.0000000' AS
    DateTime2
), N'natural rattan safe living room large storage cabinet wood legs', N'large storage cabinet', CAST
(
    67.00 AS
    Numeric
(
    19,
    2
)), 44, CAST
(
    N'2022-01-02 00:00:00.0000000' AS DateTime2
), 6)
    INSERT [dbo].[products]
(
    [
    id], [
    create_date], [
    description], [
    name], [
    price], [
    remain], [
    update_date],
[
    category_id]
) VALUES
(
    47,
    CAST
(
    N'2022-01-02 00:00:00.0000000' AS
    DateTime2
), N'Factory Direct Modern Modular Lacquer Finish Handless Plywood Kitchen Cabinets', N'Plywood Kitchen Cabinets', CAST
(
    220.00 AS
    Numeric
(
    19,
    2
)), 55, CAST
(
    N'2022-01-02 00:00:00.0000000' AS DateTime2
), 6)
    INSERT [dbo].[products]
(
    [
    id], [
    create_date], [
    description], [
    name], [
    price], [
    remain], [
    update_date],
[
    category_id]
) VALUES
(
    48,
    CAST
(
    N'2022-01-02 00:00:00.0000000' AS
    DateTime2
), N'Large White Merchant 9 Drawer Cabinet/Chest of Drawers/Sideboard/Brass Handles', N'Large White Merchant 9 Drawer Cabinet', CAST
(
    50.00 AS
    Numeric
(
    19,
    2
)), 442, CAST
(
    N'2022-01-02 00:00:00.0000000' AS DateTime2
), 6)
    INSERT [dbo].[products]
(
    [
    id], [
    create_date], [
    description], [
    name], [
    price], [
    remain], [
    update_date],
[
    category_id]
) VALUES
(
    49,
    CAST
(
    N'2022-01-02 00:00:00.0000000' AS
    DateTime2
), N'white drawer unit on casters 5 drawer Storage office drawer chest cabinet with wheels', N'office drawer chest cabinet', CAST
(
    19.00 AS
    Numeric
(
    19,
    2
)), 443, CAST
(
    N'2022-01-02 00:00:00.0000000' AS DateTime2
), 6)
    INSERT [dbo].[products]
(
    [
    id], [
    create_date], [
    description], [
    name], [
    price], [
    remain], [
    update_date],
[
    category_id]
) VALUES
(
    50,
    CAST
(
    N'2022-01-02 00:00:00.0000000' AS
    DateTime2
), N'Ready to assemble white shaker modern design kitchen cabinet', N'modern design kitchen cabinet', CAST
(
    160.00 AS
    Numeric
(
    19,
    2
)), 334, CAST
(
    N'2022-01-02 00:00:00.0000000' AS DateTime2
), 6)
    INSERT [dbo].[products]
(
    [
    id], [
    create_date], [
    description], [
    name], [
    price], [
    remain], [
    update_date],
[
    category_id]
) VALUES
(
    51,
    CAST
(
    N'2022-01-02 00:00:00.0000000' AS
    DateTime2
), N'New Modern Executive Desk Manager Desk Office Furniture On Sell', N'Manager Desk', CAST
(
    269.00 AS
    Numeric
(
    19,
    2
)), 55, CAST
(
    N'2022-01-02 00:00:00.0000000' AS DateTime2
), 7)
    INSERT [dbo].[products]
(
    [
    id], [
    create_date], [
    description], [
    name], [
    price], [
    remain], [
    update_date],
[
    category_id]
) VALUES
(
    53,
    CAST
(
    N'2022-01-02 00:00:00.0000000' AS
    DateTime2
), N'Modern furniture manager desk workstation Executive Office Desk office table', N'office table', CAST
(
    463.00 AS
    Numeric
(
    19,
    2
)), 55, CAST
(
    N'2022-01-02 00:00:00.0000000' AS DateTime2
), 7)
    INSERT [dbo].[products]
(
    [
    id], [
    create_date], [
    description], [
    name], [
    price], [
    remain], [
    update_date],
[
    category_id]
) VALUES
(
    54,
    CAST
(
    N'2001-01-03 00:00:00.0000000' AS
    DateTime2
), N'4 Person Seats Shape C Modular Cubicles Office Desk Furniture Office Workstation', N'4 Person Seats Shape C Modular Cubicles Office Desk Furniture Office Workstation', CAST
(
    168.00 AS
    Numeric
(
    19,
    2
)), 67, CAST
(
    N'2001-01-03 00:00:00.0000000' AS DateTime2
), 7)
    INSERT [dbo].[products]
(
    [
    id], [
    create_date], [
    description], [
    name], [
    price], [
    remain], [
    update_date],
[
    category_id]
) VALUES
(
    55,
    CAST
(
    N'2001-01-03 00:00:00.0000000' AS
    DateTime2
), N'Home Wooden Panel Laptop Computer Office Table Desk Furniture Modern L Shape Office Desks With Steel Legs', N'Modern L Shape Office Desks', CAST
(
    19.21 AS
    Numeric
(
    19,
    2
)), 462, CAST
(
    N'2001-01-03 00:00:00.0000000' AS DateTime2
), 7)
    INSERT [dbo].[products]
(
    [
    id], [
    create_date], [
    description], [
    name], [
    price], [
    remain], [
    update_date],
[
    category_id]
) VALUES
(
    56,
    CAST
(
    N'2001-01-03 00:00:00.0000000' AS
    DateTime2
), N'Office Furniture Luxury Manager Staff High Back Executive Ergonomic Office Chair', N'Office Chair', CAST
(
    38.00 AS
    Numeric
(
    19,
    2
)), 224, CAST
(
    N'2001-01-03 00:00:00.0000000' AS DateTime2
), 7)
    INSERT [dbo].[products]
(
    [
    id], [
    create_date], [
    description], [
    name], [
    price], [
    remain], [
    update_date],
[
    category_id]
) VALUES
(
    57,
    CAST
(
    N'2001-01-03 00:00:00.0000000' AS
    DateTime2
), N'Manufacturers Cheap Staff Task Computer Desk Swivel Mesh Office Chairs', N'Mesh Office Chairs', CAST
(
    9.70 AS
    Numeric
(
    19,
    2
)), 432, CAST
(
    N'2001-01-03 00:00:00.0000000' AS DateTime2
), 7)
    INSERT [dbo].[products]
(
    [
    id], [
    create_date], [
    description], [
    name], [
    price], [
    remain], [
    update_date],
[
    category_id]
) VALUES
(
    58,
    CAST
(
    N'2001-01-03 00:00:00.0000000' AS
    DateTime2
), N'Office Furniture Wholesalers 1+1+3 Grey Modern Disassemble Office Minimalist Leather Sofas', N'Office Furniture Wholesalers 1+1+3 Grey Modern Disassemble Office Minimalist Leather Sofas', CAST
(
    728.00 AS
    Numeric
(
    19,
    2
)), 342, CAST
(
    N'2001-01-03 00:00:00.0000000' AS DateTime2
), 7)
    INSERT [dbo].[products]
(
    [
    id], [
    create_date], [
    description], [
    name], [
    price], [
    remain], [
    update_date],
[
    category_id]
) VALUES
(
    60,
    CAST
(
    N'2001-01-03 00:00:00.0000000' AS
    DateTime2
), N'Industrial loft style design melamine office furniture stainless steel escritorio bureau design italien executive table desk', N'Industrial loft style design melamine office furniture stainless steel escritorio bureau design italien executive table desk', CAST
(
    808.00 AS
    Numeric
(
    19,
    2
)), 134, CAST
(
    N'2001-01-03 00:00:00.0000000' AS DateTime2
), 7)
    INSERT [dbo].[products]
(
    [
    id], [
    create_date], [
    description], [
    name], [
    price], [
    remain], [
    update_date],
[
    category_id]
) VALUES
(
    61,
    CAST
(
    N'2001-01-03 00:00:00.0000000' AS
    DateTime2
), N'LED Solar Powered Waterproof Outdoor Courtyard Landscape Park Garden Lawn Lamp Solar Pathway Light', N'Garden Lawn Lamp', CAST
(
    1.10 AS
    Numeric
(
    19,
    2
)), 22, CAST
(
    N'2001-01-03 00:00:00.0000000' AS DateTime2
), 8)
    INSERT [dbo].[products]
(
    [
    id], [
    create_date], [
    description], [
    name], [
    price], [
    remain], [
    update_date],
[
    category_id]
) VALUES
(
    63,
    CAST
(
    N'2001-01-03 00:00:00.0000000' AS
    DateTime2
), N'ustomized modern safe edge corten lawn edging for garden', N'safe edge ', CAST
(
    2.60 AS
    Numeric
(
    19,
    2
)), 678, CAST
(
    N'2001-01-03 00:00:00.0000000' AS DateTime2
), 8)
    INSERT [dbo].[products]
(
    [
    id], [
    create_date], [
    description], [
    name], [
    price], [
    remain], [
    update_date],
[
    category_id]
) VALUES
(
    65,
    CAST
(
    N'2001-01-03 00:00:00.0000000' AS
    DateTime2
), N'beautiful multi-color Solar Power Sakura Flower LED Light Outdoor Garden Yard Lawn Landscape Lamp Festival Garden Lawn light', N'Flower LED Light', CAST
(
    4.50 AS
    Numeric
(
    19,
    2
)), 466, CAST
(
    N'2001-01-03 00:00:00.0000000' AS DateTime2
), 8)
    INSERT [dbo].[products]
(
    [
    id], [
    create_date], [
    description], [
    name], [
    price], [
    remain], [
    update_date],
[
    category_id]
) VALUES
(
    66,
    CAST
(
    N'2001-01-03 00:00:00.0000000' AS
    DateTime2
), N'Hot Sale RGB Lawn Garden Pole Lamp Outdoor Solar Yard Post Pathway Light Led Bollard Solar Sensor Wall Light,Garden Solar Lights', N'Lawn Garden Pole Lamp', CAST
(
    18.00 AS
    Numeric
(
    19,
    2
)), 46, CAST
(
    N'2001-01-03 00:00:00.0000000' AS DateTime2
), 8)
    INSERT [dbo].[products]
(
    [
    id], [
    create_date], [
    description], [
    name], [
    price], [
    remain], [
    update_date],
[
    category_id]
) VALUES
(
    68,
    CAST
(
    N'2001-01-03 00:00:00.0000000' AS
    DateTime2
), N'Lawn Garden Pole Lamp', N'waterproof lamp', CAST
(
    2.70 AS
    Numeric
(
    19,
    2
)), 35, CAST
(
    N'2001-01-03 00:00:00.0000000' AS DateTime2
), 8)
    INSERT [dbo].[products]
(
    [
    id], [
    create_date], [
    description], [
    name], [
    price], [
    remain], [
    update_date],
[
    category_id]
) VALUES
(
    69,
    CAST
(
    N'2001-01-03 00:00:00.0000000' AS
    DateTime2
), N'FILLUX black decoration led garden solar light outdoor lawn lighting balcony villa', N'led garden solar light ', CAST
(
    153.10 AS
    Numeric
(
    19,
    2
)), 46, CAST
(
    N'2001-01-03 00:00:00.0000000' AS DateTime2
), 8)
    INSERT [dbo].[products]
(
    [
    id], [
    create_date], [
    description], [
    name], [
    price], [
    remain], [
    update_date],
[
    category_id]
) VALUES
(
    70,
    CAST
(
    N'2001-01-03 00:00:00.0000000' AS
    DateTime2
), N'led garden solar light ', N'led garden solar light ', CAST
(
    5.05 AS
    Numeric
(
    19,
    2
)), 57, CAST
(
    N'2001-01-03 00:00:00.0000000' AS DateTime2
), 8)
    INSERT [dbo].[products]
(
    [
    id], [
    create_date], [
    description], [
    name], [
    price], [
    remain], [
    update_date],
[
    category_id]
) VALUES
(
    71,
    CAST
(
    N'2001-01-03 00:00:00.0000000' AS
    DateTime2
), N'metal peacock light animal shape lawn and Garden Line Solar Produc', N'metal peacock light', CAST
(
    16.50 AS
    Numeric
(
    19,
    2
)), 467, CAST
(
    N'2001-01-03 00:00:00.0000000' AS DateTime2
), 8)
    INSERT [dbo].[products]
(
    [
    id], [
    create_date], [
    description], [
    name], [
    price], [
    remain], [
    update_date],
[
    category_id]
) VALUES
(
    74,
    CAST
(
    N'2001-01-03 00:00:00.0000000' AS
    DateTime2
), N'LED artificial owl simulation outdoor LED solar garden light, used for lawn and garden decoration to turn into stake light', N'stake light', CAST
(
    3.00 AS
    Numeric
(
    19,
    2
)), 47, CAST
(
    N'2001-01-03 00:00:00.0000000' AS DateTime2
), 8)
    INSERT [dbo].[products]
(
    [
    id], [
    create_date], [
    description], [
    name], [
    price], [
    remain], [
    update_date],
[
    category_id]
) VALUES
(
    75,
    CAST
(
    N'2001-01-03 00:00:00.0000000' AS
    DateTime2
), N'Hot selling garden and home decoration craft art plastic blowing bird pink flamingo garden', N'bird pink flamingo garden', CAST
(
    6.50 AS
    Numeric
(
    19,
    2
)), 424, CAST
(
    N'2001-01-03 00:00:00.0000000' AS DateTime2
), 8)
    INSERT [dbo].[products]
(
    [
    id], [
    create_date], [
    description], [
    name], [
    price], [
    remain], [
    update_date],
[
    category_id]
) VALUES
(
    76,
    CAST
(
    N'2001-01-03 00:00:00.0000000' AS
    DateTime2
), N'Garden Lawn And Landscaping Artificial Grass Carpet Synthetic Turf For Kids Playground And Home Used', N'Garden Lawn', CAST
(
    7.00 AS
    Numeric
(
    19,
    2
)), 453, CAST
(
    N'2001-01-03 00:00:00.0000000' AS DateTime2
), 8)
    INSERT [dbo].[products]
(
    [
    id], [
    create_date], [
    description], [
    name], [
    price], [
    remain], [
    update_date],
[
    category_id]
) VALUES
(
    78,
    CAST
(
    N'2001-01-03 00:00:00.0000000' AS
    DateTime2
), N'Cheap Optical Fiber Lamp Other Led Lawn Garden Solar Light Outdoor Street', N'NULLFiber Lamp', CAST
(
    6.30 AS
    Numeric
(
    19,
    2
)), 245, CAST
(
    N'2001-01-03 00:00:00.0000000' AS DateTime2
), 8)
    INSERT [dbo].[products]
(
    [
    id], [
    create_date], [
    description], [
    name], [
    price], [
    remain], [
    update_date],
[
    category_id]
) VALUES
(
    79,
    CAST
(
    N'2001-01-03 00:00:00.0000000' AS
    DateTime2
), N'Lawn And Garden Wrought Iron Decorations Iron Gecko Hanging Decor', N'Iron Gecko Hanging Decor', CAST
(
    3.95 AS
    Numeric
(
    19,
    2
)), 553, CAST
(
    N'2001-01-03 00:00:00.0000000' AS DateTime2
), 8)
    INSERT [dbo].[products]
(
    [
    id], [
    create_date], [
    description], [
    name], [
    price], [
    remain], [
    update_date],
[
    category_id]
) VALUES
(
    80,
    CAST
(
    N'2001-01-03 00:00:00.0000000' AS
    DateTime2
), N'New Outdoor Waterproof Solar Color Lamp Acrylic Bubble Reed Lamp Outdoor Courtyard Garden Lawn Landscape Light', N'Landscape Light', CAST
(
    2.92 AS
    Numeric
(
    19,
    2
)), 443, CAST
(
    N'2001-01-03 00:00:00.0000000' AS DateTime2
), 8)
    INSERT [dbo].[products]
(
    [
    id], [
    create_date], [
    description], [
    name], [
    price], [
    remain], [
    update_date],
[
    category_id]
) VALUES
(
    81,
    CAST
(
    N'2001-01-03 00:00:00.0000000' AS
    DateTime2
), N'Car interior accessories high quality waterproof car seat cover', N'car seat cover', CAST
(
    11.20 AS
    Numeric
(
    19,
    2
)), 222, CAST
(
    N'2001-01-03 00:00:00.0000000' AS DateTime2
), 9)
    INSERT [dbo].[products]
(
    [
    id], [
    create_date], [
    description], [
    name], [
    price], [
    remain], [
    update_date],
[
    category_id]
) VALUES
(
    82,
    CAST
(
    N'2001-01-03 00:00:00.0000000' AS
    DateTime2
), N'Car Air Freshener Remove Formaldehyde Car Purifier Auto Purifier Car Interior Accessories', N'Car Air Freshener', CAST
(
    25.61 AS
    Numeric
(
    19,
    2
)), 422, CAST
(
    N'2001-01-03 00:00:00.0000000' AS DateTime2
), 9)
    INSERT [dbo].[products]
(
    [
    id], [
    create_date], [
    description], [
    name], [
    price], [
    remain], [
    update_date],
[
    category_id]
) VALUES
(
    83,
    CAST
(
    N'2001-01-03 00:00:00.0000000' AS
    DateTime2
), N'Car Interior Turbo Air Vent Outlet Atmosphere Decorative Ambient Lights For Mercedes-benz W205 X253', N'Ambient Lights', CAST
(
    273.80 AS
    Numeric
(
    19,
    2
)), 452, CAST
(
    N'2001-01-03 00:00:00.0000000' AS DateTime2
), 9)
    INSERT [dbo].[products]
(
    [
    id], [
    create_date], [
    description], [
    name], [
    price], [
    remain], [
    update_date],
[
    category_id]
) VALUES
(
    84,
    CAST
(
    N'2001-01-03 00:00:00.0000000' AS
    DateTime2
), N'Multifunction Car Interior Accessories Back Seat Organizer with tray and trash can', N'Car Interior Accessories', CAST
(
    6.20 AS
    Numeric
(
    19,
    2
)), 63, CAST
(
    N'2001-01-03 00:00:00.0000000' AS DateTime2
), 9)
    INSERT [dbo].[products]
(
    [
    id], [
    create_date], [
    description], [
    name], [
    price], [
    remain], [
    update_date],
[
    category_id]
) VALUES
(
    85,
    CAST
(
    N'2001-01-03 00:00:00.0000000' AS
    DateTime2
), N'New Portable Car Interior Accessories Mini Aromatherapy Car Diffuser Vent Clip', N'Interior Accessories Mini Aromatherapy', CAST
(
    0.79 AS
    Numeric
(
    19,
    2
)), 224, CAST
(
    N'2001-01-03 00:00:00.0000000' AS DateTime2
), 9)
    INSERT [dbo].[products]
(
    [
    id], [
    create_date], [
    description], [
    name], [
    price], [
    remain], [
    update_date],
[
    category_id]
) VALUES
(
    86,
    CAST
(
    N'2001-01-03 00:00:00.0000000' AS
    DateTime2
), N'Car interior LED atmosphere light RGB colorful voice control foot 48 lights decorative light strip', N'Car interior LED atmosphere light RGB colorful voice control foot 48 lights decorative light strip', CAST
(
    4.85 AS
    Numeric
(
    19,
    2
)), 135, CAST
(
    N'2001-01-03 00:00:00.0000000' AS DateTime2
), 9)
    INSERT [dbo].[products]
(
    [
    id], [
    create_date], [
    description], [
    name], [
    price], [
    remain], [
    update_date],
[
    category_id]
) VALUES
(
    87,
    CAST
(
    N'2001-01-03 00:00:00.0000000' AS
    DateTime2
), N'New car accessories interior with mobile phone silicone holders dashboard anti slip mat', N'mobile phone silicone holders ', CAST
(
    1.80 AS
    Numeric
(
    19,
    2
)), 145, CAST
(
    N'2001-01-03 00:00:00.0000000' AS DateTime2
), 9)
    INSERT [dbo].[products]
(
    [
    id], [
    create_date], [
    description], [
    name], [
    price], [
    remain], [
    update_date],
[
    category_id]
) VALUES
(
    88,
    CAST
(
    N'2022-01-04 00:00:00.0000000' AS
    DateTime2
), N'solar energy rotating car aromatherapy diffuser interior decoration accessories car air freshener', N'car air freshener', CAST
(
    4.99 AS
    Numeric
(
    19,
    2
)), 42, CAST
(
    N'2022-01-04 00:00:00.0000000' AS DateTime2
), 9)
    SET IDENTITY_INSERT [dbo].[products] OFF
    SET IDENTITY_INSERT [dbo].[roles]
  ON
    INSERT [dbo].[roles]
(
    [
    id],
[
    name]
) VALUES
(
    1,
    N'Company'
)
    INSERT [dbo].[roles]
(
    [
    id],
[
    name]
) VALUES
(
    3,
    N'Family'
)
    INSERT [dbo].[roles]
(
    [
    id],
[
    name]
) VALUES
(
    2,
    N'School'
)
    SET IDENTITY_INSERT [dbo].[roles] OFF
    INSERT [dbo].[user_roles]
(
    [
    user_id],
[
    role_id]
) VALUES
(
    1,
    1
)
    INSERT [dbo].[user_roles]
(
    [
    user_id],
[
    role_id]
) VALUES
(
    2,
    2
)
    INSERT [dbo].[user_roles]
(
    [
    user_id],
[
    role_id]
) VALUES
(
    3,
    3
)
    INSERT [dbo].[userdetails]
(
    [
    id], [
    address], [
    first_name],
[
    last_name]
) VALUES
(
    1,
    N'TP Thu Duc',
    N'Phan',
    N'An'
)
    INSERT [dbo].[userdetails]
(
    [
    id], [
    address], [
    first_name],
[
    last_name]
) VALUES
(
    2,
    N'Vung Tau',
    N'Hoang',
    N'Binh'
)
    INSERT [dbo].[userdetails]
(
    [
    id], [
    address], [
    first_name],
[
    last_name]
) VALUES
(
    3,
    N'Dong Nai',
    N'Dang',
    N'Lan'
)
    SET IDENTITY_INSERT [dbo].[username]
  ON
    INSERT [dbo].[username]
(
    [
    id], [
    email], [
    password],
[
    username]
) VALUES
(
    1,
    N'Company',
    N'1234',
    N'An'
)
    INSERT [dbo].[username]
(
    [
    id], [
    email], [
    password],
[
    username]
) VALUES
(
    2,
    N'School',
    N'2345',
    N'Binh'
)
    INSERT [dbo].[username]
(
    [
    id], [
    email], [
    password],
[
    username]
) VALUES
(
    3,
    N'Family',
    N'3456',
    N'Lan'
)
    SET IDENTITY_INSERT [dbo].[username] OFF
    SET ANSI_PADDING
  ON
    GO
/****** Object:  Index [UK_nb4h0p6txrmfc0xbrd1kglp9t]    Script Date: 3/23/2022 1:38:59 AM ******/
ALTER TABLE [dbo].[roles] ADD CONSTRAINT [UK_nb4h0p6txrmfc0xbrd1kglp9t] UNIQUE NONCLUSTERED
    (
    [name] ASC
    ) WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, IGNORE_DUP_KEY = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
    GO
    SET ANSI_PADDING ON
    GO
/****** Object:  Index [UK_r3xwopo6ga2sm1606e4hervd0]    Script Date: 3/23/2022 1:38:59 AM ******/
ALTER TABLE [dbo].[username] ADD CONSTRAINT [UK_r3xwopo6ga2sm1606e4hervd0] UNIQUE NONCLUSTERED
    (
    [username] ASC
    ) WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, IGNORE_DUP_KEY = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
    GO
    SET ANSI_PADDING ON
    GO
/****** Object:  Index [UK64iwq32n5ffgfjklmtjtjcwvn]    Script Date: 3/23/2022 1:38:59 AM ******/
ALTER TABLE [dbo].[username] ADD CONSTRAINT [UK64iwq32n5ffgfjklmtjtjcwvn] UNIQUE NONCLUSTERED
    (
    [email] ASC
    ) WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, IGNORE_DUP_KEY = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
    GO
ALTER TABLE [dbo].[feature_detail] WITH CHECK ADD CONSTRAINT [FK_Feature_Featuredetail] FOREIGN KEY ([feature_id])
    REFERENCES [dbo].[features] ([feature_id])
    GO
ALTER TABLE [dbo].[feature_detail] CHECK CONSTRAINT [FK_Feature_Featuredetail]
    GO
ALTER TABLE [dbo].[feature_detail] WITH CHECK ADD CONSTRAINT [FK_Product_featuredetail] FOREIGN KEY ([product_id])
    REFERENCES [dbo].[products] ([id])
    GO
ALTER TABLE [dbo].[feature_detail] CHECK CONSTRAINT [FK_Product_featuredetail]
    GO
ALTER TABLE [dbo].[features] WITH CHECK ADD CONSTRAINT [FK_Type_Feature] FOREIGN KEY ([feature_type_id])
    REFERENCES [dbo].[featuretype] ([id])
    GO
ALTER TABLE [dbo].[features] CHECK CONSTRAINT [FK_Type_Feature]
    GO
ALTER TABLE [dbo].[image] WITH CHECK ADD CONSTRAINT [FK_Product_Image] FOREIGN KEY ([product_id])
    REFERENCES [dbo].[products] ([id])
    GO
ALTER TABLE [dbo].[image] CHECK CONSTRAINT [FK_Product_Image]
    GO
ALTER TABLE [dbo].[orderdetails] WITH CHECK ADD CONSTRAINT [FK_Order_OrderDetail] FOREIGN KEY ([order_id])
    REFERENCES [dbo].[orders] ([orderid])
    GO
ALTER TABLE [dbo].[orderdetails] CHECK CONSTRAINT [FK_Order_OrderDetail]
    GO
ALTER TABLE [dbo].[orderdetails] WITH CHECK ADD CONSTRAINT [FK_Product_OrderDetails] FOREIGN KEY ([product_id])
    REFERENCES [dbo].[products] ([id])
    GO
ALTER TABLE [dbo].[orderdetails] CHECK CONSTRAINT [FK_Product_OrderDetails]
    GO
ALTER TABLE [dbo].[orders] WITH CHECK ADD CONSTRAINT [FK_user_order] FOREIGN KEY ([user_id])
    REFERENCES [dbo].[username] ([id])
    GO
ALTER TABLE [dbo].[orders] CHECK CONSTRAINT [FK_user_order]
    GO
ALTER TABLE [dbo].[products] WITH CHECK ADD CONSTRAINT [FK_Category_Product] FOREIGN KEY ([category_id])
    REFERENCES [dbo].[categories] ([id])
    GO
ALTER TABLE [dbo].[products] CHECK CONSTRAINT [FK_Category_Product]
    GO
ALTER TABLE [dbo].[rates] WITH CHECK ADD CONSTRAINT [FK_Product_Rate] FOREIGN KEY ([product_id])
    REFERENCES [dbo].[products] ([id])
    GO
ALTER TABLE [dbo].[rates] CHECK CONSTRAINT [FK_Product_Rate]
    GO
ALTER TABLE [dbo].[rates] WITH CHECK ADD CONSTRAINT [FK_user_Rate] FOREIGN KEY ([user_id])
    REFERENCES [dbo].[username] ([id])
    GO
ALTER TABLE [dbo].[rates] CHECK CONSTRAINT [FK_user_Rate]
    GO
ALTER TABLE [dbo].[user_roles] WITH CHECK ADD CONSTRAINT [FK_role_user] FOREIGN KEY ([role_id])
    REFERENCES [dbo].[roles] ([id])
    GO
ALTER TABLE [dbo].[user_roles] CHECK CONSTRAINT [FK_role_user]
    GO
ALTER TABLE [dbo].[user_roles] WITH CHECK ADD CONSTRAINT [FK_user_roles] FOREIGN KEY ([user_id])
    REFERENCES [dbo].[username] ([id])
    GO
ALTER TABLE [dbo].[user_roles] CHECK CONSTRAINT [FK_user_roles]
    GO
ALTER TABLE [dbo].[userdetails] WITH CHECK ADD CONSTRAINT [FK_user_detail] FOREIGN KEY ([id])
    REFERENCES [dbo].[username] ([id])
    GO
ALTER TABLE [dbo].[userdetails] CHECK CONSTRAINT [FK_user_detail]
    GO
    USE [master]
    GO
ALTER
DATABASE [DA] SET  READ_WRITE
GO
