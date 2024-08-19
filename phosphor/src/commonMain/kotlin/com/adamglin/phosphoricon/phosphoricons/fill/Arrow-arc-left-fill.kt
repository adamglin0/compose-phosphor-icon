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

public val FillGroup.`Arrow-arc-left-fill`: ImageVector
    get() {
        if (`_arrow-arc-left-fill` != null) {
            return `_arrow-arc-left-fill`!!
        }
        `_arrow-arc-left-fill` = Builder(name = "Arrow-arc-left-fill", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 184.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                arcTo(88.0f, 88.0f, 0.0f, false, false, 67.47f, 120.16f)
                lineToRelative(26.19f, 26.18f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 88.0f, 160.0f)
                horizontalLineTo(24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                verticalLineTo(88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 13.66f, -5.66f)
                lineToRelative(26.48f, 26.48f)
                arcTo(104.0f, 104.0f, 0.0f, false, true, 232.0f, 184.0f)
                close()
            }
        }
        .build()
        return `_arrow-arc-left-fill`!!
    }

private var `_arrow-arc-left-fill`: ImageVector? = null
