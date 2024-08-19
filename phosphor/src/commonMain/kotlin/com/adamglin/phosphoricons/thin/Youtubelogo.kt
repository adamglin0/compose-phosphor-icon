package com.adamglin.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.ThinGroup

public val ThinGroup.Youtubelogo: ImageVector
    get() {
        if (_youtubelogo != null) {
            return _youtubelogo!!
        }
        _youtubelogo = Builder(name = "Youtubelogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(162.22f, 124.67f)
                lineToRelative(-48.0f, -32.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 108.0f, 96.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.11f, 3.53f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.11f, -0.2f)
                lineToRelative(48.0f, -32.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -6.66f)
                close()
                moveTo(116.0f, 152.53f)
                lineTo(116.0f, 103.47f)
                lineTo(152.79f, 128.0f)
                close()
                moveTo(230.46f, 70.53f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 218.4f, 56.85f)
                curveTo(184.6f, 43.79f, 130.27f, 44.0f, 128.0f, 44.0f)
                reflectiveCurveTo(71.4f, 43.79f, 37.6f, 56.85f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 25.54f, 70.52f)
                curveTo(23.0f, 80.27f, 20.0f, 98.16f, 20.0f, 128.0f)
                reflectiveCurveToRelative(3.0f, 47.73f, 5.54f, 57.48f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 37.6f, 199.15f)
                curveTo(71.4f, 212.21f, 125.73f, 212.0f, 128.0f, 212.0f)
                horizontalLineToRelative(0.71f)
                curveToRelative(6.89f, 0.0f, 57.58f, -0.43f, 89.72f, -12.85f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 12.06f, -13.67f)
                curveTo(233.0f, 175.72f, 236.0f, 157.84f, 236.0f, 128.0f)
                reflectiveCurveTo(233.0f, 80.27f, 230.46f, 70.52f)
                close()
                moveTo(222.72f, 183.53f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -7.21f, 8.22f)
                curveTo(183.14f, 204.19f, 128.57f, 204.0f, 128.0f, 204.0f)
                reflectiveCurveToRelative(-55.11f, 0.19f, -87.48f, -12.31f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -7.21f, -8.22f)
                curveTo(30.87f, 174.17f, 28.0f, 157.0f, 28.0f, 128.0f)
                reflectiveCurveToRelative(2.87f, -46.17f, 5.28f, -55.47f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 7.21f, -8.22f)
                curveTo(72.86f, 51.81f, 127.43f, 52.0f, 128.0f, 52.0f)
                reflectiveCurveToRelative(55.11f, -0.2f, 87.48f, 12.31f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 7.21f, 8.22f)
                curveTo(225.13f, 81.83f, 228.0f, 99.0f, 228.0f, 128.0f)
                reflectiveCurveTo(225.13f, 174.17f, 222.72f, 183.47f)
                close()
            }
        }
        .build()
        return _youtubelogo!!
    }

private var _youtubelogo: ImageVector? = null
