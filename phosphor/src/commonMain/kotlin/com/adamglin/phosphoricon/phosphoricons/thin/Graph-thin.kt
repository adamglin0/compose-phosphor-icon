package com.adamglin.phosphoricon.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.ThinGroup

public val ThinGroup.`Graph-thin`: ImageVector
    get() {
        if (`_graph-thin` != null) {
            return `_graph-thin`!!
        }
        `_graph-thin` = Builder(name = "Graph-thin", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.0f, 156.0f)
                arcToRelative(27.87f, 27.87f, 0.0f, false, false, -19.4f, 7.84f)
                lineToRelative(-28.28f, -22.0f)
                arcTo(27.78f, 27.78f, 0.0f, false, false, 156.0f, 128.0f)
                arcToRelative(28.09f, 28.09f, 0.0f, false, false, -0.45f, -5.0f)
                lineTo(175.0f, 116.55f)
                arcToRelative(28.07f, 28.07f, 0.0f, true, false, -2.53f, -7.58f)
                lineTo(153.0f, 115.45f)
                arcTo(28.0f, 28.0f, 0.0f, false, false, 128.0f, 100.0f)
                arcToRelative(27.68f, 27.68f, 0.0f, false, false, -7.6f, 1.06f)
                lineToRelative(-9.5f, -21.37f)
                arcTo(28.0f, 28.0f, 0.0f, true, false, 96.0f, 84.0f)
                arcToRelative(27.68f, 27.68f, 0.0f, false, false, 7.6f, -1.06f)
                lineToRelative(9.5f, 21.37f)
                arcToRelative(27.95f, 27.95f, 0.0f, false, false, -8.46f, 39.1f)
                lineTo(74.0f, 170.61f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, false, 5.32f, 6.0f)
                lineToRelative(30.6f, -27.2f)
                arcToRelative(27.92f, 27.92f, 0.0f, false, false, 37.44f, -1.23f)
                lineToRelative(28.28f, 22.0f)
                arcTo(28.0f, 28.0f, 0.0f, true, false, 200.0f, 156.0f)
                close()
                moveTo(200.0f, 84.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, -20.0f, 20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 200.0f, 84.0f)
                close()
                moveTo(76.0f, 56.0f)
                arcTo(20.0f, 20.0f, 0.0f, true, true, 96.0f, 76.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 76.0f, 56.0f)
                close()
                moveTo(56.0f, 212.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, -20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 56.0f, 212.0f)
                close()
                moveTo(128.0f, 148.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, -20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 128.0f, 148.0f)
                close()
                moveTo(200.0f, 204.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, -20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 200.0f, 204.0f)
                close()
            }
        }
        .build()
        return `_graph-thin`!!
    }

private var `_graph-thin`: ImageVector? = null
