package com.adamglin.phosphoricon.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.RegularGroup

public val RegularGroup.Pencil: ImageVector
    get() {
        if (_pencil != null) {
            return _pencil!!
        }
        _pencil = Builder(name = "Pencil", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(227.31f, 73.37f)
                lineTo(182.63f, 28.68f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -22.63f, 0.0f)
                lineTo(36.69f, 152.0f)
                arcTo(15.86f, 15.86f, 0.0f, false, false, 32.0f, 163.31f)
                lineTo(32.0f, 208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(92.69f, 224.0f)
                arcTo(15.86f, 15.86f, 0.0f, false, false, 104.0f, 219.31f)
                lineTo(227.31f, 96.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.0f, -22.63f)
                close()
                moveTo(51.31f, 160.0f)
                lineTo(136.0f, 75.31f)
                lineTo(152.69f, 92.0f)
                lineTo(68.0f, 176.68f)
                close()
                moveTo(48.0f, 179.31f)
                lineTo(76.69f, 208.0f)
                lineTo(48.0f, 208.0f)
                close()
                moveTo(96.0f, 204.69f)
                lineTo(79.31f, 188.0f)
                lineTo(164.0f, 103.31f)
                lineTo(180.69f, 120.0f)
                close()
                moveTo(192.0f, 108.69f)
                lineTo(147.31f, 64.0f)
                lineToRelative(24.0f, -24.0f)
                lineTo(216.0f, 84.68f)
                close()
            }
        }
        .build()
        return _pencil!!
    }

private var _pencil: ImageVector? = null
