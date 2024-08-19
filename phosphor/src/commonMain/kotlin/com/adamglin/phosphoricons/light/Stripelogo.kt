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

public val LightGroup.Stripelogo: ImageVector
    get() {
        if (_stripelogo != null) {
            return _stripelogo!!
        }
        _stripelogo = Builder(name = "Stripelogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(166.0f, 152.0f)
                curveToRelative(0.0f, 16.54f, -17.05f, 30.0f, -38.0f, 30.0f)
                reflectiveCurveToRelative(-38.0f, -13.46f, -38.0f, -30.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                curveToRelative(0.0f, 9.76f, 11.91f, 18.0f, 26.0f, 18.0f)
                reflectiveCurveToRelative(26.0f, -8.24f, 26.0f, -18.0f)
                curveToRelative(0.0f, -11.21f, -10.7f, -15.1f, -28.33f, -20.18f)
                curveToRelative(-15.89f, -4.58f, -33.89f, -9.77f, -33.89f, -27.82f)
                curveToRelative(0.0f, -17.1f, 15.57f, -30.0f, 36.22f, -30.0f)
                curveToRelative(15.0f, 0.0f, 27.74f, 6.88f, 33.34f, 18.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -10.71f, 5.42f)
                curveTo(147.08f, 90.36f, 138.41f, 86.0f, 128.0f, 86.0f)
                curveToRelative(-13.81f, 0.0f, -24.22f, 7.74f, -24.22f, 18.0f)
                curveToRelative(0.0f, 8.41f, 9.52f, 11.76f, 25.21f, 16.29f)
                curveTo(145.48f, 125.0f, 166.0f, 131.0f, 166.0f, 152.0f)
                close()
                moveTo(222.0f, 48.0f)
                lineTo(222.0f, 208.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, -14.0f, 14.0f)
                lineTo(48.0f, 222.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, -14.0f, -14.0f)
                lineTo(34.0f, 48.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 48.0f, 34.0f)
                lineTo(208.0f, 34.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 222.0f, 48.0f)
                close()
                moveTo(210.0f, 48.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                lineTo(48.0f, 46.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                lineTo(46.0f, 208.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                lineTo(208.0f, 210.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                close()
            }
        }
        .build()
        return _stripelogo!!
    }

private var _stripelogo: ImageVector? = null
