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

public val FillGroup.`Arrow-up-left-fill`: ImageVector
    get() {
        if (`_arrow-up-left-fill` != null) {
            return `_arrow-up-left-fill`!!
        }
        `_arrow-up-left-fill` = Builder(name = "Arrow-up-left-fill", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(197.66f, 197.66f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, 0.0f)
                lineTo(116.0f, 127.31f)
                lineTo(69.66f, 173.66f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 56.0f, 168.0f)
                verticalLineTo(64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineTo(168.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 5.66f, 13.66f)
                lineTo(127.31f, 116.0f)
                lineToRelative(70.35f, 70.34f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 197.66f, 197.66f)
                close()
            }
        }
        .build()
        return `_arrow-up-left-fill`!!
    }

private var `_arrow-up-left-fill`: ImageVector? = null
