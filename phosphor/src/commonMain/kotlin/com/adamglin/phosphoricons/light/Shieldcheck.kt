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

public val LightGroup.ShieldCheck: ImageVector
    get() {
        if (_shieldCheck != null) {
            return _shieldCheck!!
        }
        _shieldCheck = Builder(name = "ShieldCheck", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 42.0f)
                lineTo(48.0f, 42.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 34.0f, 56.0f)
                verticalLineToRelative(56.0f)
                curveToRelative(0.0f, 51.94f, 25.12f, 83.4f, 46.2f, 100.64f)
                curveToRelative(22.73f, 18.6f, 45.27f, 24.89f, 46.22f, 25.15f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 3.16f, 0.0f)
                curveToRelative(0.95f, -0.26f, 23.49f, -6.55f, 46.22f, -25.15f)
                curveTo(196.88f, 195.4f, 222.0f, 163.94f, 222.0f, 112.0f)
                lineTo(222.0f, 56.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 208.0f, 42.0f)
                close()
                moveTo(210.0f, 112.0f)
                curveToRelative(0.0f, 37.76f, -13.94f, 68.39f, -41.44f, 91.06f)
                arcTo(131.17f, 131.17f, 0.0f, false, true, 128.0f, 225.72f)
                arcToRelative(130.94f, 130.94f, 0.0f, false, true, -40.56f, -22.66f)
                curveTo(59.94f, 180.39f, 46.0f, 149.76f, 46.0f, 112.0f)
                lineTo(46.0f, 56.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                lineTo(208.0f, 54.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                close()
                moveTo(172.24f, 99.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 8.48f)
                lineToRelative(-56.0f, 56.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.48f, 0.0f)
                lineToRelative(-24.0f, -24.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.48f, -8.48f)
                lineTo(112.0f, 151.51f)
                lineToRelative(51.76f, -51.75f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 172.24f, 99.76f)
                close()
            }
        }
        .build()
        return _shieldCheck!!
    }

private var _shieldCheck: ImageVector? = null
