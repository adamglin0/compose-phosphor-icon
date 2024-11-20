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

public val LightGroup.YoutubeLogo: ImageVector
    get() {
        if (_youtubeLogo != null) {
            return _youtubeLogo!!
        }
        _youtubeLogo = Builder(name = "YoutubeLogo", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(163.33f, 123.0f)
                lineToRelative(-48.0f, -32.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 106.0f, 96.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 9.33f, 5.0f)
                lineToRelative(48.0f, -32.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -10.0f)
                close()
                moveTo(118.0f, 148.79f)
                verticalLineTo(107.21f)
                lineTo(149.18f, 128.0f)
                close()
                moveTo(232.4f, 70.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, -13.28f, -15.0f)
                curveTo(185.0f, 41.79f, 130.27f, 42.0f, 128.0f, 42.0f)
                reflectiveCurveToRelative(-57.0f, -0.21f, -91.16f, 13.0f)
                arcTo(22.0f, 22.0f, 0.0f, false, false, 23.6f, 70.0f)
                curveTo(21.05f, 79.89f, 18.0f, 98.0f, 18.0f, 128.0f)
                reflectiveCurveToRelative(3.05f, 48.11f, 5.6f, 58.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, 13.28f, 15.0f)
                curveTo(71.0f, 214.21f, 125.72f, 214.0f, 128.0f, 214.0f)
                horizontalLineToRelative(0.71f)
                curveToRelative(6.91f, 0.0f, 58.0f, -0.44f, 90.45f, -13.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, 13.28f, -15.0f)
                curveToRelative(2.55f, -9.87f, 5.6f, -27.93f, 5.6f, -58.0f)
                reflectiveCurveTo(235.0f, 79.89f, 232.4f, 70.0f)
                close()
                moveTo(220.78f, 183.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, -6.0f, 6.86f)
                curveTo(182.78f, 202.19f, 128.58f, 202.0f, 128.0f, 202.0f)
                reflectiveCurveToRelative(-54.71f, 0.2f, -86.75f, -12.17f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, -6.0f, -6.86f)
                curveTo(32.84f, 173.78f, 30.0f, 156.78f, 30.0f, 128.0f)
                reflectiveCurveToRelative(2.84f, -45.78f, 5.22f, -55.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 6.0f, -6.86f)
                curveTo(72.06f, 54.26f, 123.53f, 54.0f, 127.76f, 54.0f)
                horizontalLineTo(128.0f)
                curveToRelative(0.54f, 0.0f, 54.71f, -0.2f, 86.75f, 12.17f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 6.0f, 6.86f)
                curveToRelative(2.38f, 9.19f, 5.22f, 26.19f, 5.22f, 55.0f)
                reflectiveCurveTo(223.16f, 173.78f, 220.78f, 183.0f)
                close()
            }
        }
        .build()
        return _youtubeLogo!!
    }

private var _youtubeLogo: ImageVector? = null
