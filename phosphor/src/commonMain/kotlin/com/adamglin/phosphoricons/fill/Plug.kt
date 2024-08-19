package com.adamglin.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.FillGroup

public val FillGroup.Plug: ImageVector
    get() {
        if (_plug != null) {
            return _plug!!
        }
        _plug = Builder(name = "Plug", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(237.66f, 77.66f)
                lineTo(203.31f, 112.0f)
                lineToRelative(26.35f, 26.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, 11.32f)
                lineTo(212.0f, 143.31f)
                lineToRelative(-53.0f, 53.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, -56.57f, 0.0f)
                lineTo(86.75f, 180.57f)
                lineTo(37.66f, 229.66f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, -11.32f)
                lineToRelative(49.09f, -49.09f)
                lineTo(59.72f, 153.54f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, 0.0f, -56.57f)
                lineToRelative(53.0f, -53.0f)
                lineToRelative(-6.35f, -6.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, -11.32f)
                lineTo(144.0f, 52.69f)
                lineToRelative(34.34f, -34.35f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 11.32f, 11.32f)
                lineTo(155.31f, 64.0f)
                lineTo(192.0f, 100.69f)
                lineToRelative(34.34f, -34.35f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, 11.32f)
                close()
            }
        }
        .build()
        return _plug!!
    }

private var _plug: ImageVector? = null
