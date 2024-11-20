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

public val LightGroup.Brain: ImageVector
    get() {
        if (_brain != null) {
            return _brain!!
        }
        _brain = Builder(name = "Brain", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(246.0f, 124.0f)
                arcToRelative(54.13f, 54.13f, 0.0f, false, false, -32.0f, -49.33f)
                lineTo(214.0f, 72.0f)
                arcToRelative(46.0f, 46.0f, 0.0f, false, false, -86.0f, -22.67f)
                arcTo(46.0f, 46.0f, 0.0f, false, false, 42.0f, 72.0f)
                verticalLineToRelative(2.67f)
                arcToRelative(54.0f, 54.0f, 0.0f, false, false, 0.0f, 98.63f)
                lineTo(42.0f, 176.0f)
                arcToRelative(46.0f, 46.0f, 0.0f, false, false, 86.0f, 22.67f)
                arcTo(46.0f, 46.0f, 0.0f, false, false, 214.0f, 176.0f)
                verticalLineToRelative(-2.7f)
                arcTo(54.07f, 54.07f, 0.0f, false, false, 246.0f, 124.0f)
                close()
                moveTo(88.0f, 210.0f)
                arcToRelative(34.0f, 34.0f, 0.0f, false, true, -34.0f, -32.94f)
                arcTo(53.67f, 53.67f, 0.0f, false, false, 64.0f, 178.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                lineTo(64.0f, 166.0f)
                arcTo(42.0f, 42.0f, 0.0f, false, true, 50.0f, 84.39f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 4.0f, -5.66f)
                lineTo(54.0f, 72.0f)
                arcToRelative(34.0f, 34.0f, 0.0f, false, true, 68.0f, 0.0f)
                verticalLineToRelative(73.05f)
                arcTo(45.89f, 45.89f, 0.0f, false, false, 88.0f, 130.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                arcToRelative(34.0f, 34.0f, 0.0f, false, true, 0.0f, 68.0f)
                close()
                moveTo(192.0f, 166.0f)
                horizontalLineToRelative(-8.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(53.67f, 53.67f, 0.0f, false, false, 10.0f, -0.94f)
                arcTo(34.0f, 34.0f, 0.0f, true, true, 168.0f, 142.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                arcToRelative(45.89f, 45.89f, 0.0f, false, false, -34.0f, 15.05f)
                lineTo(134.0f, 72.0f)
                arcToRelative(34.0f, 34.0f, 0.0f, false, true, 68.0f, 0.0f)
                verticalLineToRelative(6.73f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 4.0f, 5.66f)
                arcTo(42.0f, 42.0f, 0.0f, false, true, 192.0f, 166.0f)
                close()
                moveTo(206.0f, 112.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                horizontalLineToRelative(-4.0f)
                arcToRelative(34.0f, 34.0f, 0.0f, false, true, -34.0f, -34.0f)
                lineTo(162.0f, 80.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, 22.0f, 22.0f)
                horizontalLineToRelative(4.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 206.0f, 112.0f)
                close()
                moveTo(60.0f, 118.0f)
                lineTo(56.0f, 118.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineToRelative(4.0f)
                arcTo(22.0f, 22.0f, 0.0f, false, false, 82.0f, 84.0f)
                lineTo(82.0f, 80.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                verticalLineToRelative(4.0f)
                arcTo(34.0f, 34.0f, 0.0f, false, true, 60.0f, 118.0f)
                close()
            }
        }
        .build()
        return _brain!!
    }

private var _brain: ImageVector? = null
