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

public val FillGroup.`Arrow-fat-right-fill`: ImageVector
    get() {
        if (`_arrow-fat-right-fill` != null) {
            return `_arrow-fat-right-fill`!!
        }
        `_arrow-fat-right-fill` = Builder(name = "Arrow-fat-right-fill", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(237.66f, 133.66f)
                lineToRelative(-96.0f, 96.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 128.0f, 224.0f)
                verticalLineTo(184.0f)
                horizontalLineTo(48.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                verticalLineTo(88.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 48.0f, 72.0f)
                horizontalLineToRelative(80.0f)
                verticalLineTo(32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 13.66f, -5.66f)
                lineToRelative(96.0f, 96.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 237.66f, 133.66f)
                close()
            }
        }
        .build()
        return `_arrow-fat-right-fill`!!
    }

private var `_arrow-fat-right-fill`: ImageVector? = null
