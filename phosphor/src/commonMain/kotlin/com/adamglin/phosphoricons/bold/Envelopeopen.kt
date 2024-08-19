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

public val BoldGroup.Envelopeopen: ImageVector
    get() {
        if (_envelopeopen != null) {
            return _envelopeopen!!
        }
        _envelopeopen = Builder(name = "Envelopeopen", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(230.66f, 86.0f)
                lineToRelative(-96.0f, -64.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -13.32f, 0.0f)
                lineToRelative(-96.0f, 64.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 20.0f, 96.0f)
                verticalLineTo(200.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                horizontalLineTo(216.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                verticalLineTo(96.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 230.66f, 86.0f)
                close()
                moveTo(89.81f, 152.0f)
                lineTo(44.0f, 184.31f)
                verticalLineToRelative(-65.0f)
                close()
                moveTo(114.36f, 164.0f)
                horizontalLineToRelative(27.28f)
                lineTo(187.0f, 196.0f)
                horizontalLineTo(69.05f)
                close()
                moveTo(166.19f, 152.0f)
                lineTo(212.0f, 119.29f)
                verticalLineToRelative(65.0f)
                close()
                moveTo(128.0f, 46.42f)
                lineToRelative(74.86f, 49.91f)
                lineTo(141.61f, 140.0f)
                horizontalLineTo(114.39f)
                lineTo(53.14f, 96.33f)
                close()
            }
        }
        .build()
        return _envelopeopen!!
    }

private var _envelopeopen: ImageVector? = null
