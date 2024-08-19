package com.adamglin.phosphoricon.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.FillGroup

public val FillGroup.`Cell-signal-x-fill`: ImageVector
    get() {
        if (`_cell-signal-x-fill` != null) {
            return `_cell-signal-x-fill`!!
        }
        `_cell-signal-x-fill` = Builder(name = "Cell-signal-x-fill", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(213.66f, 194.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, 11.32f)
                lineTo(184.0f, 187.31f)
                lineToRelative(-18.34f, 18.35f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, -11.32f)
                lineTo(172.69f, 176.0f)
                lineToRelative(-18.35f, -18.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, -11.32f)
                lineTo(184.0f, 164.69f)
                lineToRelative(18.34f, -18.35f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, 11.32f)
                lineTo(195.31f, 176.0f)
                close()
                moveTo(157.41f, 120.1f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, 23.92f, 8.05f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.34f, 0.0f)
                arcToRelative(31.88f, 31.88f, 0.0f, false, true, 17.77f, -8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.56f, -4.0f)
                verticalLineTo(40.46f)
                arcToRelative(16.41f, 16.41f, 0.0f, false, false, -9.18f, -14.93f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -18.14f, 3.16f)
                lineToRelative(-160.0f, 160.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -3.17f, 18.13f)
                arcTo(16.4f, 16.4f, 0.0f, false, false, 32.46f, 216.0f)
                horizontalLineToRelative(93.6f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.78f, -5.3f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, 6.31f, -32.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -5.34f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, 21.26f, -53.23f)
                close()
            }
        }
        .build()
        return `_cell-signal-x-fill`!!
    }

private var `_cell-signal-x-fill`: ImageVector? = null
