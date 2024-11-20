package com.adamglin.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.BoldGroup

public val BoldGroup.Queue: ImageVector
    get() {
        if (_queue != null) {
            return _queue!!
        }
        _queue = Builder(name = "Queue", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(28.0f, 64.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 40.0f, 52.0f)
                lineTo(216.0f, 52.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                lineTo(40.0f, 76.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 28.0f, 64.0f)
                close()
                moveTo(132.0f, 116.0f)
                lineTo(40.0f, 116.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(92.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                close()
                moveTo(132.0f, 180.0f)
                lineTo(40.0f, 180.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(92.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                close()
                moveTo(252.0f, 160.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -5.64f, 10.18f)
                lineToRelative(-64.0f, 40.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 164.0f, 200.0f)
                lineTo(164.0f, 120.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 18.36f, -10.18f)
                lineToRelative(64.0f, 40.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 252.0f, 160.0f)
                close()
                moveTo(217.36f, 160.0f)
                lineTo(188.0f, 141.65f)
                verticalLineToRelative(36.7f)
                close()
            }
        }
        .build()
        return _queue!!
    }

private var _queue: ImageVector? = null
