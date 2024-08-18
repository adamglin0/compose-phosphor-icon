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

public val FillGroup.`Pencil-simple-slash-fill`: ImageVector
    get() {
        if (`_pencil-simple-slash-fill` != null) {
            return `_pencil-simple-slash-fill`!!
        }
        `_pencil-simple-slash-fill` = Builder(name = "Pencil-simple-slash-fill", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(227.32f, 73.37f)
                lineTo(182.63f, 28.69f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -22.63f, 0.0f)
                lineTo(115.64f, 73.05f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -0.14f, 5.52f)
                lineToRelative(58.73f, 64.6f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.79f, 0.13f)
                lineTo(227.32f, 96.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 227.32f, 73.37f)
                close()
                moveTo(192.0f, 108.69f)
                lineTo(147.32f, 64.0f)
                lineToRelative(24.0f, -24.0f)
                lineTo(216.0f, 84.69f)
                close()
                moveTo(213.92f, 210.62f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -11.84f, 10.76f)
                lineTo(154.4f, 168.92f)
                lineTo(104.0f, 219.31f)
                arcTo(15.86f, 15.86f, 0.0f, false, true, 92.69f, 224.0f)
                lineTo(48.0f, 224.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                lineTo(32.0f, 163.31f)
                arcTo(15.89f, 15.89f, 0.0f, false, true, 36.68f, 152.0f)
                lineToRelative(53.6f, -53.6f)
                lineToRelative(-48.0f, -52.82f)
                arcToRelative(8.18f, 8.18f, 0.0f, false, true, -0.37f, -10.75f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 12.0f, -0.21f)
                close()
            }
        }
        .build()
        return `_pencil-simple-slash-fill`!!
    }

private var `_pencil-simple-slash-fill`: ImageVector? = null
