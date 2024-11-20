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

public val BoldGroup.Airplane: ImageVector
    get() {
        if (_airplane != null) {
            return _airplane!!
        }
        _airplane = Builder(name = "Airplane", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(237.37f, 125.27f)
                lineTo(164.0f, 88.58f)
                verticalLineTo(48.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, -72.0f, 0.0f)
                verticalLineTo(88.58f)
                lineTo(18.63f, 125.27f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 12.0f, 136.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 14.35f, 11.77f)
                lineTo(92.0f, 166.64f)
                verticalLineTo(179.0f)
                lineTo(79.51f, 191.51f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 76.0f, 200.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 16.46f, 11.14f)
                lineTo(128.0f, 228.92f)
                lineToRelative(35.54f, 14.22f)
                arcTo(11.91f, 11.91f, 0.0f, false, false, 168.0f, 244.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                verticalLineTo(200.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -3.51f, -8.49f)
                lineTo(164.0f, 179.0f)
                verticalLineTo(166.64f)
                lineToRelative(65.65f, 13.13f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 244.0f, 168.0f)
                verticalLineTo(136.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 237.37f, 125.27f)
                close()
                moveTo(220.0f, 153.36f)
                lineToRelative(-65.65f, -13.13f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 140.0f, 152.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 3.51f, 8.49f)
                lineTo(156.0f, 205.0f)
                verticalLineToRelative(9.31f)
                lineToRelative(-23.54f, -9.42f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -8.92f, 0.0f)
                lineTo(100.0f, 214.28f)
                verticalLineTo(205.0f)
                lineToRelative(12.49f, -12.48f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 116.0f, 184.0f)
                verticalLineTo(152.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -14.35f, -11.77f)
                lineTo(36.0f, 153.36f)
                verticalLineToRelative(-9.94f)
                lineToRelative(73.37f, -36.69f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 116.0f, 96.0f)
                verticalLineTo(48.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                verticalLineTo(96.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 6.63f, 10.73f)
                lineTo(220.0f, 143.42f)
                close()
            }
        }
        .build()
        return _airplane!!
    }

private var _airplane: ImageVector? = null
