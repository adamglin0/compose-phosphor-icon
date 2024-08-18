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

public val FillGroup.`Martini-fill`: ImageVector
    get() {
        if (`_martini-fill` != null) {
            return `_martini-fill`!!
        }
        `_martini-fill` = Builder(name = "Martini-fill", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(237.66f, 45.66f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 232.0f, 32.0f)
                lineTo(24.0f, 32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -5.66f, 13.66f)
                lineTo(120.0f, 147.31f)
                lineTo(120.0f, 208.0f)
                lineTo(88.0f, 208.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                lineTo(136.0f, 208.0f)
                lineTo(136.0f, 147.31f)
                close()
                moveTo(212.66f, 48.0f)
                lineTo(196.66f, 64.0f)
                lineTo(59.31f, 64.0f)
                lineToRelative(-16.0f, -16.0f)
                close()
            }
        }
        .build()
        return `_martini-fill`!!
    }

private var `_martini-fill`: ImageVector? = null
