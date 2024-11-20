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

public val LightGroup.Queue: ImageVector
    get() {
        if (_queue != null) {
            return _queue!!
        }
        _queue = Builder(name = "Queue", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(34.0f, 64.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.0f, -6.0f)
                lineTo(216.0f, 58.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f)
                lineTo(40.0f, 70.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 34.0f, 64.0f)
                close()
                moveTo(136.0f, 122.0f)
                lineTo(40.0f, 122.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
                moveTo(136.0f, 186.0f)
                lineTo(40.0f, 186.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
                moveTo(246.0f, 160.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -2.82f, 5.09f)
                lineToRelative(-64.0f, 40.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 170.0f, 200.0f)
                lineTo(170.0f, 120.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 9.18f, -5.09f)
                lineToRelative(64.0f, 40.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 246.0f, 160.0f)
                close()
                moveTo(228.68f, 160.0f)
                lineTo(182.0f, 130.83f)
                verticalLineToRelative(58.34f)
                close()
            }
        }
        .build()
        return _queue!!
    }

private var _queue: ImageVector? = null
