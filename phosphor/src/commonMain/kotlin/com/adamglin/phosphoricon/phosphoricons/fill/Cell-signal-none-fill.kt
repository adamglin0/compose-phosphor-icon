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

public val FillGroup.`Cell-signal-none-fill`: ImageVector
    get() {
        if (`_cell-signal-none-fill` != null) {
            return `_cell-signal-none-fill`!!
        }
        `_cell-signal-none-fill` = Builder(name = "Cell-signal-none-fill", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(198.12f, 25.23f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -17.44f, 3.46f)
                lineToRelative(-160.0f, 160.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 32.0f, 216.0f)
                horizontalLineTo(192.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                verticalLineTo(40.0f)
                arcTo(15.94f, 15.94f, 0.0f, false, false, 198.12f, 25.23f)
                close()
                moveTo(192.0f, 200.0f)
                horizontalLineTo(32.0f)
                lineTo(192.0f, 40.0f)
                close()
            }
        }
        .build()
        return `_cell-signal-none-fill`!!
    }

private var `_cell-signal-none-fill`: ImageVector? = null
