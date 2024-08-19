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

public val FillGroup.`Pencil-circle-fill`: ImageVector
    get() {
        if (`_pencil-circle-fill` != null) {
            return `_pencil-circle-fill`!!
        }
        `_pencil-circle-fill` = Builder(name = "Pencil-circle-fill", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(201.54f, 54.46f)
                arcTo(104.0f, 104.0f, 0.0f, false, false, 54.46f, 201.54f)
                arcTo(104.0f, 104.0f, 0.0f, false, false, 201.54f, 54.46f)
                close()
                moveTo(128.0f, 170.87f)
                arcToRelative(31.93f, 31.93f, 0.0f, false, false, -32.31f, -9.77f)
                lineTo(111.0f, 128.0f)
                lineTo(145.0f, 128.0f)
                lineToRelative(15.27f, 33.1f)
                arcTo(31.93f, 31.93f, 0.0f, false, false, 128.0f, 170.87f)
                close()
                moveTo(168.0f, 206.37f)
                arcToRelative(88.0f, 88.0f, 0.0f, false, true, -32.0f, 9.22f)
                lineTo(136.0f, 192.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 32.0f, 0.0f)
                close()
                moveTo(190.22f, 190.23f)
                curveToRelative(-2.0f, 2.0f, -4.08f, 3.87f, -6.22f, 5.64f)
                lineTo(184.0f, 176.0f)
                arcToRelative(7.91f, 7.91f, 0.0f, false, false, -0.74f, -3.35f)
                lineToRelative(-48.0f, -104.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -14.52f, 0.0f)
                lineToRelative(-48.0f, 104.0f)
                arcTo(7.91f, 7.91f, 0.0f, false, false, 72.0f, 176.0f)
                verticalLineToRelative(19.87f)
                curveToRelative(-2.14f, -1.77f, -4.22f, -3.64f, -6.22f, -5.64f)
                arcToRelative(88.0f, 88.0f, 0.0f, true, true, 124.44f, 0.0f)
                close()
            }
        }
        .build()
        return `_pencil-circle-fill`!!
    }

private var `_pencil-circle-fill`: ImageVector? = null
