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

public val LightGroup.Elevator: ImageVector
    get() {
        if (_elevator != null) {
            return _elevator!!
        }
        _elevator = Builder(name = "Elevator", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 34.0f)
                lineTo(48.0f, 34.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 34.0f, 48.0f)
                lineTo(34.0f, 208.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                lineTo(208.0f, 222.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                lineTo(222.0f, 48.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 208.0f, 34.0f)
                close()
                moveTo(178.0f, 110.0f)
                lineTo(178.0f, 210.0f)
                lineTo(134.0f, 210.0f)
                lineTo(134.0f, 110.0f)
                close()
                moveTo(122.0f, 210.0f)
                lineTo(78.0f, 210.0f)
                lineTo(78.0f, 110.0f)
                horizontalLineToRelative(44.0f)
                close()
                moveTo(210.0f, 208.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(190.0f, 210.0f)
                lineTo(190.0f, 104.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, -6.0f)
                lineTo(72.0f, 98.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                lineTo(66.0f, 210.0f)
                lineTo(48.0f, 210.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                lineTo(46.0f, 48.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                lineTo(208.0f, 46.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                close()
                moveTo(150.0f, 72.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                lineTo(112.0f, 78.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineToRelative(32.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 150.0f, 72.0f)
                close()
            }
        }
        .build()
        return _elevator!!
    }

private var _elevator: ImageVector? = null
