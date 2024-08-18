package com.adamglin.phosphor.phosphoricon.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphor.phosphoricon.RegularGroup

public val RegularGroup.`Youtube-logo`: ImageVector
    get() {
        if (`_youtube-logo` != null) {
            return `_youtube-logo`!!
        }
        `_youtube-logo` = Builder(name = "Youtube-logo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(164.44f, 121.34f)
                lineToRelative(-48.0f, -32.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 104.0f, 96.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 12.44f, 6.66f)
                lineToRelative(48.0f, -32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -13.32f)
                close()
                moveTo(120.0f, 145.05f)
                lineTo(120.0f, 111.0f)
                lineToRelative(25.58f, 17.0f)
                close()
                moveTo(234.33f, 69.52f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, -14.49f, -16.4f)
                curveTo(185.56f, 39.88f, 131.0f, 40.0f, 128.0f, 40.0f)
                reflectiveCurveToRelative(-57.56f, -0.12f, -91.84f, 13.12f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, -14.49f, 16.4f)
                curveTo(19.08f, 79.5f, 16.0f, 97.74f, 16.0f, 128.0f)
                reflectiveCurveToRelative(3.08f, 48.5f, 5.67f, 58.48f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 14.49f, 16.41f)
                curveTo(69.0f, 215.56f, 120.4f, 216.0f, 127.34f, 216.0f)
                horizontalLineToRelative(1.32f)
                curveToRelative(6.94f, 0.0f, 58.37f, -0.44f, 91.18f, -13.11f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 14.49f, -16.41f)
                curveToRelative(2.59f, -10.0f, 5.67f, -28.22f, 5.67f, -58.48f)
                reflectiveCurveTo(236.92f, 79.5f, 234.33f, 69.52f)
                close()
                moveTo(218.84f, 182.52f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -4.77f, 5.49f)
                curveToRelative(-31.65f, 12.22f, -85.48f, 12.0f, -86.0f, 12.0f)
                lineTo(128.0f, 200.01f)
                curveToRelative(-0.54f, 0.0f, -54.33f, 0.2f, -86.0f, -12.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -4.77f, -5.49f)
                curveTo(34.8f, 173.39f, 32.0f, 156.57f, 32.0f, 128.0f)
                reflectiveCurveToRelative(2.8f, -45.39f, 5.16f, -54.47f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 41.93f, 68.0f)
                curveToRelative(30.52f, -11.79f, 81.66f, -12.0f, 85.85f, -12.0f)
                horizontalLineToRelative(0.27f)
                curveToRelative(0.54f, 0.0f, 54.38f, -0.18f, 86.0f, 12.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 4.77f, 5.49f)
                curveTo(221.2f, 82.61f, 224.0f, 99.43f, 224.0f, 128.0f)
                reflectiveCurveTo(221.2f, 173.39f, 218.84f, 182.47f)
                close()
            }
        }
        .build()
        return `_youtube-logo`!!
    }

private var `_youtube-logo`: ImageVector? = null
