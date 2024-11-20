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

public val FillGroup.ArrowsDownUp: ImageVector
    get() {
        if (_arrowsDownUp != null) {
            return _arrowsDownUp!!
        }
        _arrowsDownUp = Builder(name = "ArrowsDownUp", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(119.39f, 172.94f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -1.73f, 8.72f)
                lineToRelative(-32.0f, 32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, 0.0f)
                lineToRelative(-32.0f, -32.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 48.0f, 168.0f)
                lineTo(72.0f, 168.0f)
                lineTo(72.0f, 48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                lineTo(88.0f, 168.0f)
                horizontalLineToRelative(24.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 119.39f, 172.94f)
                close()
                moveTo(213.66f, 74.34f)
                lineTo(181.66f, 42.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.32f, 0.0f)
                lineToRelative(-32.0f, 32.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 144.0f, 88.0f)
                horizontalLineToRelative(24.0f)
                lineTo(168.0f, 208.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(184.0f, 88.0f)
                horizontalLineToRelative(24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 5.66f, -13.66f)
                close()
            }
        }
        .build()
        return _arrowsDownUp!!
    }

private var _arrowsDownUp: ImageVector? = null
