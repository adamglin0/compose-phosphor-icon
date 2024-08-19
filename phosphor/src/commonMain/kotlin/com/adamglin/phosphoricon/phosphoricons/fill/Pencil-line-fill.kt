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

public val FillGroup.`Pencil-line-fill`: ImageVector
    get() {
        if (`_pencil-line-fill` != null) {
            return `_pencil-line-fill`!!
        }
        `_pencil-line-fill` = Builder(name = "Pencil-line-fill", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(227.32f, 73.37f)
                lineTo(182.63f, 28.69f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -22.63f, 0.0f)
                lineTo(36.69f, 152.0f)
                arcTo(15.86f, 15.86f, 0.0f, false, false, 32.0f, 163.31f)
                lineTo(32.0f, 208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(216.0f, 224.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                lineTo(115.32f, 208.0f)
                lineToRelative(112.0f, -112.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 227.32f, 73.37f)
                close()
                moveTo(79.32f, 188.0f)
                lineToRelative(90.34f, -90.34f)
                lineToRelative(16.69f, 16.68f)
                lineTo(96.0f, 204.69f)
                close()
                moveTo(158.32f, 86.34f)
                horizontalLineToRelative(0.0f)
                lineTo(68.0f, 176.69f)
                lineTo(51.31f, 160.0f)
                lineToRelative(90.35f, -90.34f)
                close()
                moveTo(48.0f, 179.31f)
                lineTo(76.69f, 208.0f)
                lineTo(48.0f, 208.0f)
                close()
            }
        }
        .build()
        return `_pencil-line-fill`!!
    }

private var `_pencil-line-fill`: ImageVector? = null
