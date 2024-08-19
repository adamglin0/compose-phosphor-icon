package com.adamglin.phosphoricon.phosphoricons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.DuotoneGroup

public val DuotoneGroup.`Pencil-simple-line-duotone`: ImageVector
    get() {
        if (`_pencil-simple-line-duotone` != null) {
            return `_pencil-simple-line-duotone`!!
        }
        `_pencil-simple-line-duotone` = Builder(name = "Pencil-simple-line-duotone", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(221.66f, 90.34f)
                lineTo(192.0f, 120.0f)
                lineTo(136.0f, 64.0f)
                lineToRelative(29.66f, -29.66f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.31f, 0.0f)
                lineTo(221.66f, 79.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 221.66f, 90.34f)
                close()
            }
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
                moveTo(48.0f, 163.31f)
                lineToRelative(88.0f, -88.0f)
                lineTo(180.69f, 120.0f)
                lineToRelative(-88.0f, 88.0f)
                lineTo(48.0f, 208.0f)
                close()
                moveTo(192.0f, 108.69f)
                lineTo(147.32f, 64.0f)
                lineToRelative(24.0f, -24.0f)
                lineTo(216.0f, 84.69f)
                close()
            }
        }
        .build()
        return `_pencil-simple-line-duotone`!!
    }

private var `_pencil-simple-line-duotone`: ImageVector? = null
