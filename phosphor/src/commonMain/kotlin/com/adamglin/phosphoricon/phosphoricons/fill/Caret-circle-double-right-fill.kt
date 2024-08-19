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

public val FillGroup.`Caret-circle-double-right-fill`: ImageVector
    get() {
        if (`_caret-circle-double-right-fill` != null) {
            return `_caret-circle-double-right-fill`!!
        }
        `_caret-circle-double-right-fill` = Builder(name = "Caret-circle-double-right-fill",
                defaultWidth = 256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f,
                viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(201.57f, 54.42f)
                arcToRelative(104.0f, 104.0f, 0.0f, true, false, 0.0f, 147.15f)
                arcTo(104.17f, 104.17f, 0.0f, false, false, 201.57f, 54.42f)
                close()
                moveTo(125.66f, 133.66f)
                lineTo(93.66f, 165.66f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -11.32f, -11.32f)
                lineTo(108.68f, 128.0f)
                lineTo(82.32f, 101.64f)
                arcTo(8.0f, 8.0f, 0.0f, true, true, 93.64f, 90.32f)
                lineToRelative(32.0f, 32.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 125.66f, 133.66f)
                close()
                moveTo(181.66f, 133.66f)
                lineTo(149.66f, 165.66f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, -11.32f)
                lineTo(164.71f, 128.0f)
                lineToRelative(-26.36f, -26.36f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 11.32f, -11.32f)
                lineToRelative(32.0f, 32.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 181.68f, 133.66f)
                close()
            }
        }
        .build()
        return `_caret-circle-double-right-fill`!!
    }

private var `_caret-circle-double-right-fill`: ImageVector? = null
