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

public val BoldGroup.Tooth: ImageVector
    get() {
        if (_tooth != null) {
            return _tooth!!
        }
        _tooth = Builder(name = "Tooth", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(172.46f, 83.15f)
                lineTo(160.31f, 88.0f)
                lineToRelative(12.15f, 4.85f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -8.92f, 22.29f)
                lineTo(128.0f, 100.93f)
                lineTo(92.46f, 115.15f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -8.92f, -22.29f)
                lineTo(95.69f, 88.0f)
                lineTo(83.54f, 83.15f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 8.92f, -22.29f)
                lineTo(128.0f, 75.08f)
                lineToRelative(35.54f, -14.22f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 8.92f, 22.29f)
                close()
                moveTo(228.0f, 79.75f)
                curveToRelative(0.08f, 76.45f, -25.2f, 135.68f, -49.0f, 152.59f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -31.44f, -14.92f)
                curveToRelative(-0.67f, -9.06f, -2.33f, -22.0f, -6.46f, -32.23f)
                curveTo(135.76f, 172.0f, 129.92f, 172.0f, 128.0f, 172.0f)
                curveToRelative(-7.76f, 0.0f, -11.77f, 9.92f, -13.08f, 13.18f)
                curveToRelative(-4.13f, 10.22f, -5.79f, 23.17f, -6.46f, 32.23f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 88.51f, 236.0f)
                arcTo(19.86f, 19.86f, 0.0f, false, true, 77.0f, 232.34f)
                curveTo(53.2f, 215.43f, 27.92f, 156.2f, 28.0f, 79.75f)
                arcTo(60.0f, 60.0f, 0.0f, false, true, 88.0f, 20.0f)
                horizontalLineToRelative(80.0f)
                arcTo(60.0f, 60.0f, 0.0f, false, true, 228.0f, 79.75f)
                close()
                moveTo(204.0f, 79.75f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 168.0f, 44.0f)
                lineTo(88.0f, 44.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 52.0f, 79.78f)
                curveToRelative(-0.06f, 61.09f, 17.83f, 109.52f, 33.3f, 127.66f)
                curveTo(91.24f, 156.0f, 114.32f, 148.0f, 128.0f, 148.0f)
                reflectiveCurveToRelative(36.76f, 8.0f, 42.7f, 59.43f)
                curveTo(186.17f, 189.31f, 204.06f, 140.88f, 204.0f, 79.78f)
                close()
            }
        }
        .build()
        return _tooth!!
    }

private var _tooth: ImageVector? = null
