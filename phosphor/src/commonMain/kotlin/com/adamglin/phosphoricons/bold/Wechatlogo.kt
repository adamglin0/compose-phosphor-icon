package com.adamglin.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.BoldGroup

public val BoldGroup.WechatLogo: ImageVector
    get() {
        if (_wechatLogo != null) {
            return _wechatLogo!!
        }
        _wechatLogo = Builder(name = "WechatLogo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(152.0f, 144.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 152.0f, 144.0f)
                close()
                moveTo(184.0f, 128.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, 16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 184.0f, 128.0f)
                close()
                moveTo(243.18f, 210.35f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -24.83f, 24.83f)
                lineToRelative(-23.26f, -6.84f)
                arcTo(84.0f, 84.0f, 0.0f, false, true, 83.72f, 187.11f)
                arcToRelative(83.2f, 83.2f, 0.0f, false, true, -22.82f, -6.77f)
                lineToRelative(-23.25f, 6.84f)
                arcTo(20.24f, 20.24f, 0.0f, false, true, 32.0f, 188.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -19.19f, -25.64f)
                lineToRelative(6.84f, -23.26f)
                arcTo(84.0f, 84.0f, 0.0f, false, true, 172.33f, 68.91f)
                arcToRelative(84.0f, 84.0f, 0.0f, false, true, 64.0f, 118.18f)
                close()
                moveTo(76.46f, 160.75f)
                arcTo(83.94f, 83.94f, 0.0f, false, true, 145.0f, 69.37f)
                arcTo(60.0f, 60.0f, 0.0f, false, false, 43.08f, 132.3f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.93f, 9.06f)
                lineToRelative(-6.09f, 20.72f)
                lineTo(58.64f, 156.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 9.06f, 0.93f)
                arcTo(60.08f, 60.08f, 0.0f, false, false, 76.46f, 160.75f)
                close()
                moveTo(220.0f, 152.0f)
                arcToRelative(60.0f, 60.0f, 0.0f, true, false, -31.7f, 52.92f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 9.06f, -0.93f)
                lineToRelative(20.72f, 6.09f)
                lineTo(212.0f, 189.36f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.93f, -9.06f)
                arcTo(60.09f, 60.09f, 0.0f, false, false, 220.0f, 152.0f)
                close()
            }
        }
        .build()
        return _wechatLogo!!
    }

private var _wechatLogo: ImageVector? = null
