package com.adamglin.phosphoricons.duotone

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
import com.adamglin.phosphoricons.DuotoneGroup

public val DuotoneGroup.Pentagon: ImageVector
    get() {
        if (_pentagon != null) {
            return _pentagon!!
        }
        _pentagon = Builder(name = "Pentagon", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(223.61f, 102.83f)
                lineToRelative(-32.0f, 107.62f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 184.0f, 216.0f)
                horizontalLineTo(72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.62f, -5.55f)
                lineToRelative(-32.0f, -107.62f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 2.88f, -8.9f)
                lineToRelative(88.0f, -68.38f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 9.46f, 0.0f)
                lineToRelative(88.0f, 68.38f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 223.61f, 102.83f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(225.56f, 87.56f)
                lineTo(137.64f, 19.25f)
                lineToRelative(-0.18f, -0.14f)
                arcToRelative(15.93f, 15.93f, 0.0f, false, false, -18.92f, 0.0f)
                lineToRelative(-0.18f, 0.14f)
                lineTo(30.44f, 87.56f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -5.7f, 17.63f)
                lineToRelative(32.0f, 107.54f)
                lineToRelative(0.06f, 0.17f)
                arcTo(15.94f, 15.94f, 0.0f, false, false, 72.0f, 224.0f)
                lineTo(184.0f, 224.0f)
                arcToRelative(15.94f, 15.94f, 0.0f, false, false, 15.23f, -11.1f)
                lineToRelative(0.06f, -0.17f)
                lineToRelative(32.0f, -107.54f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 225.56f, 87.56f)
                close()
                moveTo(215.94f, 100.56f)
                lineTo(184.0f, 208.0f)
                lineTo(72.0f, 208.0f)
                lineToRelative(-32.0f, -107.44f)
                lineToRelative(-0.06f, -0.17f)
                horizontalLineToRelative(0.0f)
                lineToRelative(0.18f, -0.14f)
                lineTo(128.0f, 32.0f)
                lineToRelative(87.82f, 68.23f)
                lineToRelative(0.18f, 0.14f)
                close()
            }
        }
        .build()
        return _pentagon!!
    }

private var _pentagon: ImageVector? = null
