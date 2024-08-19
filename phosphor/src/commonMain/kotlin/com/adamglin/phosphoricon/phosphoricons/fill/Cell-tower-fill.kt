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

public val FillGroup.`Cell-tower-fill`: ImageVector
    get() {
        if (`_cell-tower-fill` != null) {
            return `_cell-tower-fill`!!
        }
        `_cell-tower-fill` = Builder(name = "Cell-tower-fill", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(135.16f, 84.42f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -14.32f, 0.0f)
                lineToRelative(-72.0f, 144.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 14.31f, 7.16f)
                lineTo(77.0f, 208.0f)
                horizontalLineToRelative(102.1f)
                lineToRelative(13.79f, 27.58f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 200.0f, 240.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.15f, -11.58f)
                close()
                moveTo(128.0f, 105.89f)
                lineTo(155.06f, 160.0f)
                lineTo(100.94f, 160.0f)
                close()
                moveTo(159.49f, 93.74f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, -63.0f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -15.74f, 2.85f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, true, 94.46f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.86f, 6.58f)
                arcToRelative(8.74f, 8.74f, 0.0f, false, true, -1.43f, -0.13f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 159.49f, 93.74f)
                close()
                moveTo(64.15f, 136.21f)
                arcToRelative(80.0f, 80.0f, 0.0f, true, true, 127.7f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -12.76f, -9.65f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, false, -102.18f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -12.76f, 9.65f)
                close()
            }
        }
        .build()
        return `_cell-tower-fill`!!
    }

private var `_cell-tower-fill`: ImageVector? = null
