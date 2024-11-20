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

public val LightGroup.Buildings: ImageVector
    get() {
        if (_buildings != null) {
            return _buildings!!
        }
        _buildings = Builder(name = "Buildings", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.0f, 210.0f)
                lineTo(222.0f, 210.0f)
                lineTo(222.0f, 96.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -14.0f, -14.0f)
                lineTo(142.0f, 82.0f)
                lineTo(142.0f, 32.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -21.77f, -11.64f)
                lineToRelative(-80.0f, 53.33f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 34.0f, 85.34f)
                lineTo(34.0f, 210.0f)
                lineTo(16.0f, 210.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                lineTo(240.0f, 222.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
                moveTo(208.0f, 94.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                lineTo(210.0f, 210.0f)
                lineTo(142.0f, 210.0f)
                lineTo(142.0f, 94.0f)
                close()
                moveTo(46.0f, 85.34f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.89f, -1.66f)
                lineToRelative(80.0f, -53.34f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 130.0f, 32.0f)
                lineTo(130.0f, 210.0f)
                lineTo(46.0f, 210.0f)
                close()
                moveTo(110.0f, 112.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(98.0f, 112.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                close()
                moveTo(78.0f, 112.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(66.0f, 112.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                close()
                moveTo(78.0f, 168.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(66.0f, 168.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                close()
                moveTo(110.0f, 168.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(98.0f, 168.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                close()
            }
        }
        .build()
        return _buildings!!
    }

private var _buildings: ImageVector? = null
