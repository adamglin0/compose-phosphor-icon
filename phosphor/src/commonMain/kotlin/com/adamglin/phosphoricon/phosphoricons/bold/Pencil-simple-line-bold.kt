package com.adamglin.phosphoricon.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.BoldGroup

public val BoldGroup.`Pencil-simple-line-bold`: ImageVector
    get() {
        if (`_pencil-simple-line-bold` != null) {
            return `_pencil-simple-line-bold`!!
        }
        `_pencil-simple-line-bold` = Builder(name = "Pencil-simple-line-bold", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(230.15f, 70.54f)
                lineTo(185.46f, 25.86f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -28.28f, 0.0f)
                lineTo(33.86f, 149.17f)
                arcTo(19.86f, 19.86f, 0.0f, false, false, 28.0f, 163.31f)
                verticalLineTo(208.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                horizontalLineTo(216.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                horizontalLineTo(125.0f)
                lineTo(230.15f, 98.83f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 230.15f, 70.54f)
                close()
                moveTo(91.0f, 204.0f)
                horizontalLineTo(52.0f)
                verticalLineTo(165.0f)
                lineToRelative(84.0f, -84.0f)
                lineToRelative(39.0f, 39.0f)
                close()
                moveTo(192.0f, 103.0f)
                lineTo(153.0f, 64.0f)
                lineToRelative(18.34f, -18.34f)
                lineToRelative(39.0f, 39.0f)
                close()
            }
        }
        .build()
        return `_pencil-simple-line-bold`!!
    }

private var `_pencil-simple-line-bold`: ImageVector? = null
