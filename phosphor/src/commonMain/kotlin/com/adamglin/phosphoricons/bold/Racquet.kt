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

public val BoldGroup.Racquet: ImageVector
    get() {
        if (_racquet != null) {
            return _racquet!!
        }
        _racquet = Builder(name = "Racquet", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.7f, 23.3f)
                curveTo(218.05f, 8.66f, 197.43f, 2.0f, 174.62f, 4.53f)
                curveToRelative(-21.81f, 2.42f, -43.15f, 13.08f, -60.09f, 30.0f)
                reflectiveCurveToRelative(-27.59f, 38.27f, -30.0f, 60.09f)
                curveToRelative(-2.0f, 18.33f, 1.89f, 35.24f, 11.1f, 48.78f)
                lineToRelative(-20.3f, 20.31f)
                lineToRelative(-1.86f, -1.86f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -28.28f, 0.0f)
                lineTo(13.86f, 193.18f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 0.0f, 28.29f)
                lineToRelative(20.68f, 20.68f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 28.29f, 0.0f)
                horizontalLineToRelative(0.0f)
                lineToRelative(31.31f, -31.31f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 0.0f, -28.29f)
                lineToRelative(-1.86f, -1.85f)
                lineToRelative(20.31f, -20.31f)
                curveTo(123.78f, 168.0f, 137.28f, 172.0f, 152.0f, 172.0f)
                arcToRelative(83.09f, 83.09f, 0.0f, false, false, 9.38f, -0.53f)
                curveToRelative(21.81f, -2.42f, 43.15f, -13.08f, 60.08f, -30.0f)
                reflectiveCurveToRelative(27.6f, -38.27f, 30.0f, -60.09f)
                curveTo(254.0f, 58.57f, 247.34f, 38.0f, 232.7f, 23.3f)
                close()
                moveTo(48.7f, 222.3f)
                lineTo(33.7f, 207.3f)
                lineTo(59.35f, 181.65f)
                lineTo(74.35f, 196.65f)
                close()
                moveTo(128.0f, 141.76f)
                arcTo(39.33f, 39.33f, 0.0f, false, true, 114.25f, 128.0f)
                lineTo(128.0f, 128.0f)
                close()
                moveTo(108.0f, 104.01f)
                arcToRelative(68.85f, 68.85f, 0.0f, false, true, 8.38f, -32.0f)
                lineTo(128.0f, 72.01f)
                verticalLineToRelative(32.0f)
                close()
                moveTo(152.0f, 72.0f)
                horizontalLineToRelative(32.0f)
                verticalLineToRelative(32.0f)
                lineTo(152.0f, 104.0f)
                close()
                moveTo(208.0f, 104.0f)
                lineTo(208.0f, 72.0f)
                horizontalLineToRelative(20.0f)
                arcToRelative(68.68f, 68.68f, 0.0f, false, true, -8.37f, 32.0f)
                close()
                moveTo(221.75f, 48.0f)
                lineTo(208.0f, 48.0f)
                lineTo(208.0f, 34.26f)
                arcTo(39.47f, 39.47f, 0.0f, false, true, 221.74f, 48.0f)
                close()
                moveTo(183.82f, 28.0f)
                lineTo(184.0f, 28.0f)
                lineTo(184.0f, 48.0f)
                lineTo(152.0f, 48.0f)
                lineTo(152.0f, 36.34f)
                curveTo(162.47f, 30.82f, 173.48f, 28.0f, 183.82f, 28.0f)
                close()
                moveTo(152.0f, 148.06f)
                lineTo(152.0f, 128.0f)
                horizontalLineToRelative(32.0f)
                verticalLineToRelative(11.67f)
                arcTo(68.7f, 68.7f, 0.0f, false, true, 152.0f, 148.06f)
                close()
            }
        }
        .build()
        return _racquet!!
    }

private var _racquet: ImageVector? = null
