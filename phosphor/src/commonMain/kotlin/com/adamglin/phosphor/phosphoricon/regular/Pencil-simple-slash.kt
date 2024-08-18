package com.adamglin.phosphor.phosphoricon.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphor.phosphoricon.RegularGroup

public val RegularGroup.`Pencil-simple-slash`: ImageVector
    get() {
        if (`_pencil-simple-slash` != null) {
            return `_pencil-simple-slash`!!
        }
        `_pencil-simple-slash` = Builder(name = "Pencil-simple-slash", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(53.92f, 34.62f)
                arcTo(8.0f, 8.0f, 0.0f, true, false, 42.08f, 45.38f)
                lineToRelative(48.2f, 53.0f)
                lineTo(36.68f, 152.0f)
                arcTo(15.89f, 15.89f, 0.0f, false, false, 32.0f, 163.31f)
                verticalLineTo(208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineTo(92.69f)
                arcTo(15.86f, 15.86f, 0.0f, false, false, 104.0f, 219.31f)
                lineToRelative(50.4f, -50.39f)
                lineToRelative(47.69f, 52.46f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 11.84f, -10.76f)
                close()
                moveTo(92.69f, 208.0f)
                horizontalLineTo(48.0f)
                verticalLineTo(163.31f)
                lineToRelative(53.06f, -53.0f)
                lineToRelative(42.56f, 46.81f)
                close()
                moveTo(227.32f, 73.37f)
                lineTo(182.63f, 28.69f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -22.63f, 0.0f)
                lineTo(118.33f, 70.36f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.32f, 11.31f)
                lineTo(136.0f, 75.31f)
                lineTo(180.69f, 120.0f)
                lineToRelative(-9.0f, 9.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 183.0f, 140.34f)
                lineTo(227.32f, 96.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 227.32f, 73.37f)
                close()
                moveTo(192.0f, 108.69f)
                lineTo(147.32f, 64.0f)
                lineToRelative(24.0f, -24.0f)
                lineTo(216.0f, 84.69f)
                close()
            }
        }
        .build()
        return `_pencil-simple-slash`!!
    }

private var `_pencil-simple-slash`: ImageVector? = null
