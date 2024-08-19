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

public val FillGroup.`Triangle-dashed-fill`: ImageVector
    get() {
        if (`_triangle-dashed-fill` != null) {
            return `_triangle-dashed-fill`!!
        }
        `_triangle-dashed-fill` = Builder(name = "Triangle-dashed-fill", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(236.8f, 188.09f)
                lineTo(149.35f, 36.22f)
                arcToRelative(24.76f, 24.76f, 0.0f, false, false, -42.7f, 0.0f)
                lineTo(19.2f, 188.09f)
                arcToRelative(23.51f, 23.51f, 0.0f, false, false, 0.0f, 23.72f)
                arcTo(24.34f, 24.34f, 0.0f, false, false, 40.55f, 224.0f)
                horizontalLineToRelative(174.9f)
                arcToRelative(24.34f, 24.34f, 0.0f, false, false, 21.33f, -12.19f)
                arcTo(23.51f, 23.51f, 0.0f, false, false, 236.8f, 188.09f)
                close()
                moveTo(108.0f, 200.0f)
                lineTo(60.79f, 200.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 50.4f, 182.0f)
                lineToRelative(24.18f, -42.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 13.87f, 8.0f)
                lineTo(67.71f, 184.0f)
                lineTo(108.0f, 184.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                close()
                moveTo(106.88f, 116.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 93.0f, 108.0f)
                lineToRelative(24.59f, -42.7f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 20.8f, 0.0f)
                lineTo(163.0f, 108.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -13.87f, 8.0f)
                lineTo(128.0f, 79.31f)
                close()
                moveTo(205.6f, 194.0f)
                arcToRelative(12.05f, 12.05f, 0.0f, false, true, -10.39f, 6.0f)
                lineTo(148.0f, 200.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(40.29f)
                lineToRelative(-20.74f, -36.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 13.87f, -8.0f)
                lineToRelative(24.18f, 42.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 205.6f, 194.0f)
                close()
            }
        }
        .build()
        return `_triangle-dashed-fill`!!
    }

private var `_triangle-dashed-fill`: ImageVector? = null
