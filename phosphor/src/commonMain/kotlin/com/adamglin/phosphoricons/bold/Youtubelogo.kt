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

public val BoldGroup.Youtubelogo: ImageVector
    get() {
        if (_youtubelogo != null) {
            return _youtubelogo!!
        }
        _youtubelogo = Builder(name = "Youtubelogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(170.49f, 117.91f)
                lineToRelative(-56.0f, -36.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 96.0f, 92.0f)
                verticalLineToRelative(72.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 18.49f, 10.09f)
                lineToRelative(56.0f, -36.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -20.18f)
                close()
                moveTo(120.0f, 142.0f)
                lineTo(120.0f, 114.0f)
                lineToRelative(21.81f, 14.0f)
                close()
                moveTo(238.21f, 68.5f)
                arcToRelative(28.05f, 28.05f, 0.0f, false, false, -16.93f, -19.14f)
                curveTo(186.4f, 35.91f, 131.29f, 36.0f, 128.0f, 36.0f)
                reflectiveCurveToRelative(-58.4f, -0.09f, -93.28f, 13.38f)
                arcTo(28.05f, 28.05f, 0.0f, false, false, 17.79f, 68.52f)
                curveTo(15.15f, 78.72f, 12.0f, 97.32f, 12.0f, 128.0f)
                reflectiveCurveToRelative(3.15f, 49.28f, 5.79f, 59.48f)
                arcToRelative(28.05f, 28.05f, 0.0f, false, false, 16.93f, 19.14f)
                curveTo(68.21f, 219.55f, 120.36f, 220.0f, 127.37f, 220.0f)
                horizontalLineToRelative(1.26f)
                curveToRelative(7.0f, 0.0f, 59.16f, -0.45f, 92.65f, -13.38f)
                arcToRelative(28.05f, 28.05f, 0.0f, false, false, 16.93f, -19.14f)
                curveToRelative(2.64f, -10.2f, 5.79f, -28.8f, 5.79f, -59.48f)
                reflectiveCurveTo(240.85f, 78.72f, 238.21f, 68.52f)
                close()
                moveTo(215.0f, 181.46f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.34f, 2.77f)
                curveTo(182.78f, 195.76f, 132.27f, 196.0f, 128.32f, 196.0f)
                horizontalLineToRelative(-0.39f)
                curveToRelative(-0.53f, 0.0f, -53.64f, 0.17f, -84.56f, -11.77f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 41.0f, 181.46f)
                curveToRelative(-1.88f, -7.24f, -5.0f, -23.82f, -5.0f, -53.46f)
                reflectiveCurveToRelative(3.15f, -46.22f, 5.0f, -53.46f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 2.34f, -2.77f)
                curveTo(74.29f, 59.83f, 127.39f, 60.0f, 127.92f, 60.0f)
                horizontalLineToRelative(0.15f)
                curveToRelative(0.54f, 0.0f, 53.64f, -0.17f, 84.56f, 11.77f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 215.0f, 74.54f)
                curveToRelative(1.88f, 7.24f, 5.0f, 23.82f, 5.0f, 53.46f)
                reflectiveCurveTo(216.85f, 174.22f, 215.0f, 181.46f)
                close()
            }
        }
        .build()
        return _youtubelogo!!
    }

private var _youtubelogo: ImageVector? = null
