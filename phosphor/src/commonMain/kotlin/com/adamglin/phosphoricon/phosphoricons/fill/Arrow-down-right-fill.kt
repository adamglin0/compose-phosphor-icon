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

public val FillGroup.`Arrow-down-right-fill`: ImageVector
    get() {
        if (`_arrow-down-right-fill` != null) {
            return `_arrow-down-right-fill`!!
        }
        `_arrow-down-right-fill` = Builder(name = "Arrow-down-right-fill", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.0f, 88.0f)
                verticalLineTo(192.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                horizontalLineTo(88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -5.66f, -13.66f)
                lineTo(128.69f, 140.0f)
                lineTo(58.34f, 69.66f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 69.66f, 58.34f)
                lineTo(140.0f, 128.69f)
                lineToRelative(46.34f, -46.35f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 200.0f, 88.0f)
                close()
            }
        }
        .build()
        return `_arrow-down-right-fill`!!
    }

private var `_arrow-down-right-fill`: ImageVector? = null
