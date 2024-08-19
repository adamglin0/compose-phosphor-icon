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

public val LightGroup.Graph: ImageVector
    get() {
        if (_graph != null) {
            return _graph!!
        }
        _graph = Builder(name = "Graph", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.0f, 154.0f)
                arcToRelative(29.87f, 29.87f, 0.0f, false, false, -19.5f, 7.23f)
                lineTo(154.88f, 141.3f)
                arcTo(29.83f, 29.83f, 0.0f, false, false, 158.0f, 128.0f)
                arcToRelative(30.52f, 30.52f, 0.0f, false, false, -0.22f, -3.6f)
                lineTo(174.0f, 119.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, true, false, -4.0f, -15.0f)
                arcToRelative(30.52f, 30.52f, 0.0f, false, false, 0.22f, 3.6f)
                lineTo(154.0f, 113.0f)
                arcToRelative(29.91f, 29.91f, 0.0f, false, false, -32.42f, -14.31f)
                lineToRelative(-8.14f, -18.3f)
                arcToRelative(30.0f, 30.0f, 0.0f, true, false, -11.0f, 4.88f)
                lineToRelative(8.14f, 18.3f)
                arcTo(29.92f, 29.92f, 0.0f, false, false, 102.06f, 143.0f)
                lineTo(74.0f, 168.0f)
                arcToRelative(30.08f, 30.08f, 0.0f, true, false, 8.0f, 9.0f)
                lineTo(110.0f, 152.0f)
                arcToRelative(29.91f, 29.91f, 0.0f, false, false, 37.47f, -1.23f)
                lineToRelative(25.62f, 19.93f)
                arcTo(30.0f, 30.0f, 0.0f, true, false, 200.0f, 154.0f)
                close()
                moveTo(200.0f, 86.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, true, true, -18.0f, 18.0f)
                arcTo(18.0f, 18.0f, 0.0f, false, true, 200.0f, 86.0f)
                close()
                moveTo(78.0f, 56.0f)
                arcTo(18.0f, 18.0f, 0.0f, true, true, 96.0f, 74.0f)
                arcTo(18.0f, 18.0f, 0.0f, false, true, 78.0f, 56.0f)
                close()
                moveTo(56.0f, 210.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, true, true, 18.0f, -18.0f)
                arcTo(18.0f, 18.0f, 0.0f, false, true, 56.0f, 210.0f)
                close()
                moveTo(128.0f, 146.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, true, true, 18.0f, -18.0f)
                arcTo(18.0f, 18.0f, 0.0f, false, true, 128.0f, 146.0f)
                close()
                moveTo(200.0f, 202.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, true, true, 18.0f, -18.0f)
                arcTo(18.0f, 18.0f, 0.0f, false, true, 200.0f, 202.0f)
                close()
            }
        }
        .build()
        return _graph!!
    }

private var _graph: ImageVector? = null
