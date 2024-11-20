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

public val LightGroup.TiktokLogo: ImageVector
    get() {
        if (_tiktokLogo != null) {
            return _tiktokLogo!!
        }
        _tiktokLogo = Builder(name = "TiktokLogo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 74.0f)
                arcToRelative(50.06f, 50.06f, 0.0f, false, true, -50.0f, -50.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, -6.0f)
                lineTo(128.0f, 18.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                lineTo(122.0f, 156.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, true, true, -31.43f, -19.89f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 94.0f, 130.69f)
                lineTo(94.0f, 88.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -7.0f, -5.91f)
                curveTo(52.2f, 88.28f, 26.0f, 120.05f, 26.0f, 156.0f)
                arcToRelative(74.0f, 74.0f, 0.0f, false, false, 148.0f, 0.0f)
                lineTo(174.0f, 112.93f)
                arcTo(101.28f, 101.28f, 0.0f, false, false, 224.0f, 126.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -6.0f)
                lineTo(230.0f, 80.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 224.0f, 74.0f)
                close()
                moveTo(218.0f, 113.8f)
                arcToRelative(89.13f, 89.13f, 0.0f, false, true, -46.5f, -16.69f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 162.0f, 102.0f)
                verticalLineToRelative(54.0f)
                arcToRelative(62.0f, 62.0f, 0.0f, false, true, -124.0f, 0.0f)
                curveToRelative(0.0f, -27.72f, 18.47f, -52.48f, 44.0f, -60.38f)
                verticalLineToRelative(31.53f)
                arcTo(34.0f, 34.0f, 0.0f, true, false, 134.0f, 156.0f)
                lineTo(134.0f, 30.0f)
                horizontalLineToRelative(28.29f)
                arcTo(62.09f, 62.09f, 0.0f, false, false, 218.0f, 85.71f)
                close()
            }
        }
        .build()
        return _tiktokLogo!!
    }

private var _tiktokLogo: ImageVector? = null
