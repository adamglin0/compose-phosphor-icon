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

public val LightGroup.Boxarrowup: ImageVector
    get() {
        if (_boxarrowup != null) {
            return _boxarrowup!!
        }
        _boxarrowup = Builder(name = "Boxarrowup", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(221.37f, 69.32f)
                lineToRelative(-16.0f, -32.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 200.0f, 34.0f)
                lineTo(56.0f, 34.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -5.37f, 3.32f)
                lineToRelative(-16.0f, 32.0f)
                arcTo(6.07f, 6.07f, 0.0f, false, false, 34.0f, 72.0f)
                lineTo(34.0f, 208.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                lineTo(208.0f, 222.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                lineTo(222.0f, 72.0f)
                arcTo(6.07f, 6.07f, 0.0f, false, false, 221.37f, 69.32f)
                close()
                moveTo(59.71f, 46.0f)
                lineTo(196.29f, 46.0f)
                lineToRelative(10.0f, 20.0f)
                lineTo(49.71f, 66.0f)
                close()
                moveTo(208.0f, 210.0f)
                lineTo(48.0f, 210.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                lineTo(46.0f, 78.0f)
                lineTo(210.0f, 78.0f)
                lineTo(210.0f, 208.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 208.0f, 210.0f)
                close()
                moveTo(164.24f, 131.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -8.48f, 8.48f)
                lineTo(134.0f, 118.49f)
                lineTo(134.0f, 184.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(122.0f, 118.49f)
                lineToRelative(-21.76f, 21.75f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.48f, -8.48f)
                lineToRelative(32.0f, -32.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.48f, 0.0f)
                close()
            }
        }
        .build()
        return _boxarrowup!!
    }

private var _boxarrowup: ImageVector? = null
