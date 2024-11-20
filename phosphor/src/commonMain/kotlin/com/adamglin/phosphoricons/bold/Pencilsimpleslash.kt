package com.adamglin.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.BoldGroup

public val BoldGroup.PencilSimpleSlash: ImageVector
    get() {
        if (_pencilSimpleSlash != null) {
            return _pencilSimpleSlash!!
        }
        _pencilSimpleSlash = Builder(name = "PencilSimpleSlash", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(56.88f, 31.93f)
                arcTo(12.0f, 12.0f, 0.0f, true, false, 39.12f, 48.07f)
                lineToRelative(45.64f, 50.2f)
                lineToRelative(-50.9f, 50.9f)
                arcTo(19.86f, 19.86f, 0.0f, false, false, 28.0f, 163.31f)
                verticalLineTo(208.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                horizontalLineTo(92.69f)
                arcToRelative(19.85f, 19.85f, 0.0f, false, false, 14.14f, -5.86f)
                lineToRelative(47.43f, -47.42f)
                lineToRelative(44.87f, 49.35f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 17.76f, -16.14f)
                close()
                moveTo(91.0f, 204.0f)
                horizontalLineTo(52.0f)
                verticalLineTo(165.0f)
                lineToRelative(48.92f, -48.92f)
                lineToRelative(37.18f, 40.89f)
                close()
                moveTo(230.15f, 70.54f)
                lineTo(185.46f, 25.86f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -28.28f, 0.0f)
                lineToRelative(-36.0f, 36.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 14.55f, 18.82f)
                lineTo(175.0f, 120.0f)
                lineToRelative(-0.54f, 0.53f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 17.0f, 17.0f)
                lineToRelative(38.67f, -38.67f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 230.15f, 70.54f)
                close()
                moveTo(192.0f, 103.0f)
                lineTo(153.0f, 64.0f)
                lineToRelative(18.34f, -18.34f)
                lineToRelative(39.0f, 39.0f)
                close()
            }
        }
        .build()
        return _pencilSimpleSlash!!
    }

private var _pencilSimpleSlash: ImageVector? = null
