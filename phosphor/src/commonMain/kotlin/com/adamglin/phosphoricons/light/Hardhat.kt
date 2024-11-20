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

public val LightGroup.HardHat: ImageVector
    get() {
        if (_hardHat != null) {
            return _hardHat!!
        }
        _hardHat = Builder(name = "HardHat", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 154.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(222.0f, 136.0f)
                arcToRelative(94.37f, 94.37f, 0.0f, false, false, -64.0f, -89.1f)
                lineTo(158.0f, 40.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -14.0f, -14.0f)
                lineTo(112.0f, 26.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 98.0f, 40.0f)
                verticalLineToRelative(6.9f)
                arcTo(94.37f, 94.37f, 0.0f, false, false, 34.0f, 136.0f)
                verticalLineToRelative(18.0f)
                lineTo(32.0f, 154.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -14.0f, 14.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                lineTo(224.0f, 206.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                lineTo(238.0f, 168.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 224.0f, 154.0f)
                close()
                moveTo(210.0f, 136.0f)
                verticalLineToRelative(18.0f)
                lineTo(158.0f, 154.0f)
                lineTo(158.0f, 59.68f)
                arcTo(82.33f, 82.33f, 0.0f, false, true, 210.0f, 136.0f)
                close()
                moveTo(112.0f, 38.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                lineTo(146.0f, 154.0f)
                lineTo(110.0f, 154.0f)
                lineTo(110.0f, 40.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 112.0f, 38.0f)
                close()
                moveTo(46.0f, 136.0f)
                arcTo(82.33f, 82.33f, 0.0f, false, true, 98.0f, 59.68f)
                lineTo(98.0f, 154.0f)
                lineTo(46.0f, 154.0f)
                close()
                moveTo(226.0f, 192.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(32.0f, 194.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                lineTo(30.0f, 168.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                lineTo(224.0f, 166.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                close()
            }
        }
        .build()
        return _hardHat!!
    }

private var _hardHat: ImageVector? = null
