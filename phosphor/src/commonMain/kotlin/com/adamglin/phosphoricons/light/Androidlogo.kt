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

public val LightGroup.AndroidLogo: ImageVector
    get() {
        if (_androidLogo != null) {
            return _androidLogo!!
        }
        _androidLogo = Builder(name = "AndroidLogo", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(174.0f, 148.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, -10.0f, -10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 174.0f, 148.0f)
                close()
                moveTo(92.0f, 138.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, false, 10.0f, 10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 92.0f, 138.0f)
                close()
                moveTo(238.0f, 160.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, -14.0f, 14.0f)
                lineTo(32.0f, 198.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, -14.0f, -14.0f)
                lineTo(18.0f, 161.13f)
                arcTo(111.44f, 111.44f, 0.0f, false, true, 54.28f, 78.76f)
                lineTo(27.76f, 52.24f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 8.48f, -8.48f)
                lineTo(63.61f, 71.12f)
                arcToRelative(108.59f, 108.59f, 0.0f, false, true, 64.0f, -21.12f)
                lineTo(128.0f, 50.0f)
                arcToRelative(109.17f, 109.17f, 0.0f, false, true, 64.58f, 20.93f)
                lineToRelative(27.18f, -27.17f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.48f, 8.48f)
                lineTo(201.93f, 78.55f)
                curveToRelative(1.26f, 1.15f, 2.5f, 2.32f, 3.72f, 3.53f)
                arcTo(109.29f, 109.29f, 0.0f, false, true, 238.0f, 160.0f)
                close()
                moveTo(226.0f, 160.0f)
                arcToRelative(98.0f, 98.0f, 0.0f, false, false, -98.0f, -98.0f)
                horizontalLineToRelative(-0.35f)
                curveTo(73.81f, 62.19f, 30.0f, 106.66f, 30.0f, 161.13f)
                lineTo(30.0f, 184.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                lineTo(224.0f, 186.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                close()
            }
        }
        .build()
        return _androidLogo!!
    }

private var _androidLogo: ImageVector? = null
