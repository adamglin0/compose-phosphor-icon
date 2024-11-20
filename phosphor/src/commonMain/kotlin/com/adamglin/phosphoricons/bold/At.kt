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

public val BoldGroup.At: ImageVector
    get() {
        if (_at != null) {
            return _at!!
        }
        _at = Builder(name = "At", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth =
                256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 20.0f)
                arcToRelative(108.0f, 108.0f, 0.0f, false, false, 0.0f, 216.0f)
                curveToRelative(22.27f, 0.0f, 45.69f, -6.73f, 62.64f, -18.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, -13.29f, -20.0f)
                curveToRelative(-13.0f, 8.63f, -31.89f, 14.0f, -49.35f, 14.0f)
                arcToRelative(84.0f, 84.0f, 0.0f, true, true, 84.0f, -84.0f)
                curveToRelative(0.0f, 9.29f, -1.67f, 17.08f, -4.69f, 21.95f)
                curveToRelative(-2.64f, 4.24f, -6.0f, 6.05f, -11.31f, 6.05f)
                reflectiveCurveToRelative(-8.67f, -1.81f, -11.31f, -6.05f)
                curveToRelative(-3.0f, -4.87f, -4.69f, -12.66f, -4.69f, -21.95f)
                lineTo(180.0f, 88.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -23.49f, -3.46f)
                arcToRelative(52.0f, 52.0f, 0.0f, true, false, 8.86f, 79.57f)
                curveTo(172.3f, 174.3f, 182.81f, 180.0f, 196.0f, 180.0f)
                curveToRelative(24.67f, 0.0f, 40.0f, -19.92f, 40.0f, -52.0f)
                arcTo(108.12f, 108.12f, 0.0f, false, false, 128.0f, 20.0f)
                close()
                moveTo(128.0f, 156.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, true, 28.0f, -28.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 128.0f, 156.0f)
                close()
            }
        }
        .build()
        return _at!!
    }

private var _at: ImageVector? = null
