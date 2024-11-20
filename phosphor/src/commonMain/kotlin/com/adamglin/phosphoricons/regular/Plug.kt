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

public val RegularGroup.Plug: ImageVector
    get() {
        if (_plug != null) {
            return _plug!!
        }
        _plug = Builder(name = "Plug", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(237.66f, 66.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.32f, 0.0f)
                lineTo(192.0f, 100.69f)
                lineTo(155.31f, 64.0f)
                lineToRelative(34.35f, -34.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -11.32f, -11.32f)
                lineTo(144.0f, 52.69f)
                lineTo(117.66f, 26.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.32f, 11.32f)
                lineTo(112.69f, 44.0f)
                lineToRelative(-53.0f, 53.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, 0.0f, 56.57f)
                lineToRelative(15.71f, 15.71f)
                lineTo(26.34f, 218.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.32f, 11.32f)
                lineToRelative(49.09f, -49.09f)
                lineToRelative(15.71f, 15.71f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, 56.57f, 0.0f)
                lineToRelative(53.0f, -53.0f)
                lineToRelative(6.34f, 6.35f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.32f, -11.32f)
                lineTo(203.31f, 112.0f)
                lineToRelative(34.35f, -34.34f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 237.66f, 66.34f)
                close()
                moveTo(147.72f, 185.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, -33.95f, 0.0f)
                lineTo(71.0f, 142.23f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, 0.0f, -33.95f)
                lineToRelative(53.0f, -53.0f)
                lineTo(200.69f, 132.0f)
                close()
            }
        }
        .build()
        return _plug!!
    }

private var _plug: ImageVector? = null
