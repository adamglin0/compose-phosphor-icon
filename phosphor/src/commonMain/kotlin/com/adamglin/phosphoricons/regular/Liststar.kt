package com.adamglin.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.RegularGroup

public val RegularGroup.Liststar: ImageVector
    get() {
        if (_liststar != null) {
            return _liststar!!
        }
        _liststar = Builder(name = "Liststar", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(32.0f, 64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                lineTo(216.0f, 56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                lineTo(40.0f, 72.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 32.0f, 64.0f)
                close()
                moveTo(40.0f, 136.0f)
                lineTo(96.0f, 136.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                lineTo(40.0f, 120.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                close()
                moveTo(112.0f, 184.0f)
                lineTo(40.0f, 184.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
                moveTo(237.09f, 143.78f)
                lineTo(214.57f, 162.37f)
                lineTo(221.43f, 190.08f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.82f, 8.81f)
                lineTo(184.0f, 183.82f)
                lineToRelative(-25.61f, 15.07f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.82f, -8.81f)
                lineToRelative(6.85f, -27.71f)
                lineToRelative(-22.51f, -18.59f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 4.47f, -14.14f)
                lineToRelative(29.84f, -2.31f)
                lineToRelative(11.43f, -26.5f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 14.7f, 0.0f)
                lineToRelative(11.43f, 26.5f)
                lineToRelative(29.84f, 2.31f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 4.47f, 14.14f)
                close()
                moveTo(211.62f, 144.06f)
                lineTo(196.73f, 142.91f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -6.73f, -4.8f)
                lineToRelative(-6.0f, -13.92f)
                lineToRelative(-6.0f, 13.92f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -6.73f, 4.8f)
                lineToRelative(-14.89f, 1.15f)
                lineToRelative(11.11f, 9.18f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 2.68f, 8.09f)
                lineToRelative(-3.5f, 14.12f)
                lineToRelative(13.27f, -7.81f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.12f, 0.0f)
                lineToRelative(13.27f, 7.81f)
                lineToRelative(-3.5f, -14.12f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 2.68f, -8.09f)
                close()
            }
        }
        .build()
        return _liststar!!
    }

private var _liststar: ImageVector? = null
