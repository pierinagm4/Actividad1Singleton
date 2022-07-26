CREATE DATABASE TransactionDB;
GO
USE [TransactionDB]
GO
/****** Object:  Table [dbo].[Personas]    Script Date: 22/7/2022 16:30:15 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Personas](
	[PersonaID] [int] IDENTITY(1,1) NOT NULL,
	[Nombre] [nvarchar](50) NOT NULL,
	[Genero] [nvarchar](1) NOT NULL,
	[Edad] [int] NOT NULL,
	[Identificacion] [nvarchar](14) NOT NULL,
	[Direccion] [nvarchar](150) NOT NULL,
	[Telefono] [nvarchar](10) NOT NULL,
 CONSTRAINT [PK_Personas] PRIMARY KEY CLUSTERED 
(
	[PersonaID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO

INSERT INTO TransactionDB.dbo.Personas (Nombre,Genero,Edad,Identificacion,Direccion,Telefono) VALUES
	 (N'Jose Lema',N'M',24,N'0987654321',N'Otavalo sn y principal',N'098254785'),
	 (N'Marianela Montalvo',N'F',25,N'0987654322',N'Amazonas y NNUU',N'097548965'),
	 (N'Juan Osorio',N'M',26,N'0987654323',N'13 junio y Equinoccial',N'098874587'),
	 (N'Pierina Galvez',N'F',22,N'0930649314',N'Cdla Paraiso',N'0982406266'),
	 (N'Lucas Garces',N'M',27,N'0987654321',N'Ceibos',N'0987654321'),
	 (N'Lucas Garces',N'M',27,N'0987654321',N'Ceibos',N'0987654321'),
	 (N'Lucas Garces',N'M',27,N'0987654321',N'Ceibos',N'0987654321');
GO
