package com.adamglin.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.LightGroup

public val LightGroup.WechatLogo: ImageVector
    get() {
        if (_wechatLogo != null) {
            return _wechatLogo!!
        }
        _wechatLogo = Builder(name = "WechatLogo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(142.0f, 140.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, -10.0f, -10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 142.0f, 140.0f)
                close()
                moveTo(188.0f, 130.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, false, 10.0f, 10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 188.0f, 130.0f)
                close()
                moveTo(237.42f, 212.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 220.0f, 229.42f)
                lineToRelative(-25.46f, -7.49f)
                arcTo(78.0f, 78.0f, 0.0f, false, true, 87.84f, 181.58f)
                arcToRelative(77.0f, 77.0f, 0.0f, false, true, -26.42f, -7.65f)
                lineTo(36.0f, 181.42f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 18.58f, 164.0f)
                lineToRelative(7.49f, -25.46f)
                arcTo(78.0f, 78.0f, 0.0f, true, true, 168.19f, 74.43f)
                arcToRelative(78.0f, 78.0f, 0.0f, false, true, 61.74f, 112.15f)
                close()
                moveTo(83.86f, 168.87f)
                arcToRelative(77.92f, 77.92f, 0.0f, false, true, 71.0f, -94.68f)
                arcToRelative(66.0f, 66.0f, 0.0f, true, false, -117.1f, 60.94f)
                arcToRelative(6.05f, 6.05f, 0.0f, false, true, 0.47f, 4.53f)
                lineToRelative(-8.17f, 27.76f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.48f, 2.49f)
                lineToRelative(27.77f, -8.17f)
                arcToRelative(6.06f, 6.06f, 0.0f, false, true, 4.53f, 0.47f)
                arcTo(65.2f, 65.2f, 0.0f, false, false, 83.86f, 168.87f)
                close()
                moveTo(218.21f, 183.13f)
                arcToRelative(66.0f, 66.0f, 0.0f, true, false, -27.08f, 27.08f)
                arcToRelative(6.06f, 6.06f, 0.0f, false, true, 4.53f, -0.47f)
                lineToRelative(27.77f, 8.17f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.48f, -2.48f)
                lineToRelative(-8.17f, -27.77f)
                arcTo(6.05f, 6.05f, 0.0f, false, true, 218.21f, 183.13f)
                close()
            }
        }
        .build()
        return _wechatLogo!!
    }

private var _wechatLogo: ImageVector? = null
