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

public val BoldGroup.Graph: ImageVector
    get() {
        if (_graph != null) {
            return _graph!!
        }
        _graph = Builder(name = "Graph", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.0f, 152.0f)
                arcToRelative(35.77f, 35.77f, 0.0f, false, false, -16.46f, 4.0f)
                lineToRelative(-21.39f, -16.64f)
                arcTo(35.49f, 35.49f, 0.0f, false, false, 164.0f, 128.65f)
                lineToRelative(10.35f, -3.44f)
                arcTo(36.0f, 36.0f, 0.0f, true, false, 164.0f, 100.0f)
                curveToRelative(0.0f, 1.11f, 0.06f, 2.21f, 0.16f, 3.3f)
                lineToRelative(-7.78f, 2.59f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 128.0f, 92.0f)
                curveToRelative(-1.0f, 0.0f, -1.88f, 0.0f, -2.81f, 0.12f)
                lineToRelative(-4.45f, -10.0f)
                arcTo(36.0f, 36.0f, 0.0f, true, false, 96.0f, 92.0f)
                curveToRelative(1.0f, 0.0f, 1.88f, 0.0f, 2.81f, -0.12f)
                lineToRelative(4.45f, 10.0f)
                arcToRelative(35.91f, 35.91f, 0.0f, false, false, -8.59f, 39.7f)
                lineTo(73.39f, 160.49f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, false, 15.94f, 17.93f)
                lineToRelative(21.28f, -18.91f)
                arcToRelative(35.91f, 35.91f, 0.0f, false, false, 36.8f, -1.21f)
                lineTo(167.0f, 173.56f)
                arcTo(36.0f, 36.0f, 0.0f, true, false, 200.0f, 152.0f)
                close()
                moveTo(200.0f, 88.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 200.0f, 88.0f)
                close()
                moveTo(84.0f, 56.0f)
                arcTo(12.0f, 12.0f, 0.0f, true, true, 96.0f, 68.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 84.0f, 56.0f)
                close()
                moveTo(56.0f, 204.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 56.0f, 204.0f)
                close()
                moveTo(116.0f, 128.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 116.0f, 128.0f)
                close()
                moveTo(200.0f, 200.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 200.0f, 200.0f)
                close()
            }
        }
        .build()
        return _graph!!
    }

private var _graph: ImageVector? = null
