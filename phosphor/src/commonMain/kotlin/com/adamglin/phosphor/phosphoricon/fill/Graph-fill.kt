package com.adamglin.phosphor.phosphoricon.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphor.phosphoricon.FillGroup

public val FillGroup.`Graph-fill`: ImageVector
    get() {
        if (`_graph-fill` != null) {
            return `_graph-fill`!!
        }
        `_graph-fill` = Builder(name = "Graph-fill", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.0f, 152.0f)
                arcToRelative(31.84f, 31.84f, 0.0f, false, false, -19.53f, 6.68f)
                lineToRelative(-23.11f, -18.0f)
                arcTo(31.65f, 31.65f, 0.0f, false, false, 160.0f, 128.0f)
                curveToRelative(0.0f, -0.74f, 0.0f, -1.48f, -0.08f, -2.21f)
                lineToRelative(13.23f, -4.41f)
                arcTo(32.0f, 32.0f, 0.0f, true, false, 168.0f, 104.0f)
                curveToRelative(0.0f, 0.74f, 0.0f, 1.48f, 0.08f, 2.21f)
                lineToRelative(-13.23f, 4.41f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 128.0f, 96.0f)
                arcToRelative(32.59f, 32.59f, 0.0f, false, false, -5.27f, 0.44f)
                lineTo(115.89f, 81.0f)
                arcTo(32.0f, 32.0f, 0.0f, true, false, 96.0f, 88.0f)
                arcToRelative(32.59f, 32.59f, 0.0f, false, false, 5.27f, -0.44f)
                lineToRelative(6.84f, 15.4f)
                arcToRelative(31.92f, 31.92f, 0.0f, false, false, -8.57f, 39.64f)
                lineTo(73.83f, 165.44f)
                arcToRelative(32.06f, 32.06f, 0.0f, true, false, 10.63f, 12.0f)
                lineToRelative(25.71f, -22.84f)
                arcToRelative(31.91f, 31.91f, 0.0f, false, false, 37.36f, -1.24f)
                lineToRelative(23.11f, 18.0f)
                arcTo(31.65f, 31.65f, 0.0f, false, false, 168.0f, 184.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 32.0f, -32.0f)
                close()
                moveTo(200.0f, 88.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 200.0f, 88.0f)
                close()
                moveTo(80.0f, 56.0f)
                arcTo(16.0f, 16.0f, 0.0f, true, true, 96.0f, 72.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 80.0f, 56.0f)
                close()
                moveTo(56.0f, 208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 56.0f, 208.0f)
                close()
                moveTo(200.0f, 200.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 200.0f, 200.0f)
                close()
            }
        }
        .build()
        return `_graph-fill`!!
    }

private var `_graph-fill`: ImageVector? = null
