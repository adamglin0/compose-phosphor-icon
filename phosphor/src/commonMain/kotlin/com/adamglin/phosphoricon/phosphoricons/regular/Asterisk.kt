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

public val RegularGroup.Asterisk: ImageVector
    get() {
        if (_asterisk != null) {
            return _asterisk!!
        }
        _asterisk = Builder(name = "Asterisk", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(214.86f, 180.12f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.0f, 2.74f)
                lineTo(136.0f, 142.13f)
                verticalLineTo(216.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                verticalLineTo(142.13f)
                lineTo(52.12f, 182.86f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.23f, -13.72f)
                lineTo(112.45f, 128.0f)
                lineTo(43.89f, 86.86f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 8.23f, -13.72f)
                lineTo(120.0f, 113.87f)
                verticalLineTo(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                verticalLineToRelative(73.87f)
                lineToRelative(67.88f, -40.73f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 8.23f, 13.72f)
                lineTo(143.55f, 128.0f)
                lineToRelative(68.56f, 41.14f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 214.86f, 180.12f)
                close()
            }
        }
        .build()
        return _asterisk!!
    }

private var _asterisk: ImageVector? = null
