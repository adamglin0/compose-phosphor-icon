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

public val LightGroup.ShieldCheckered: ImageVector
    get() {
        if (_shieldCheckered != null) {
            return _shieldCheckered!!
        }
        _shieldCheckered = Builder(name = "ShieldCheckered", defaultWidth = 24.0.dp, defaultHeight =
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
                moveTo(210.0f, 56.0f)
                verticalLineToRelative(56.0f)
                curveToRelative(0.0f, 3.39f, -0.12f, 6.72f, -0.34f, 10.0f)
                lineTo(134.0f, 122.0f)
                lineTo(134.0f, 54.0f)
                horizontalLineToRelative(74.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 210.0f, 56.0f)
                close()
                moveTo(46.0f, 56.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                horizontalLineToRelative(74.0f)
                verticalLineToRelative(68.0f)
                lineTo(46.34f, 122.0f)
                curveToRelative(-0.22f, -3.28f, -0.34f, -6.61f, -0.34f, -10.0f)
                close()
                moveTo(47.71f, 134.0f)
                lineTo(122.0f, 134.0f)
                verticalLineToRelative(89.52f)
                arcToRelative(133.13f, 133.13f, 0.0f, false, true, -34.56f, -20.46f)
                curveTo(65.5f, 185.0f, 52.2f, 161.8f, 47.71f, 134.0f)
                close()
                moveTo(168.56f, 203.06f)
                arcTo(133.13f, 133.13f, 0.0f, false, true, 134.0f, 223.52f)
                lineTo(134.0f, 134.0f)
                horizontalLineToRelative(74.29f)
                curveTo(203.8f, 161.8f, 190.5f, 185.0f, 168.56f, 203.06f)
                close()
            }
        }
        .build()
        return _shieldCheckered!!
    }

private var _shieldCheckered: ImageVector? = null
