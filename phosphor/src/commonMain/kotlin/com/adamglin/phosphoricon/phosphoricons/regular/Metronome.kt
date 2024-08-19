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

public val RegularGroup.Metronome: ImageVector
    get() {
        if (_metronome != null) {
            return _metronome!!
        }
        _metronome = Builder(name = "Metronome", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(187.14f, 114.84f)
                lineToRelative(26.78f, -29.46f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.84f, -10.76f)
                lineToRelative(-20.55f, 22.6f)
                lineToRelative(-17.2f, -54.07f)
                arcTo(15.94f, 15.94f, 0.0f, false, false, 149.08f, 32.0f)
                horizontalLineTo(106.91f)
                arcTo(15.94f, 15.94f, 0.0f, false, false, 91.66f, 43.15f)
                lineToRelative(-50.91f, 160.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 56.0f, 224.0f)
                horizontalLineTo(200.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 15.25f, -20.85f)
                close()
                moveTo(184.72f, 160.0f)
                horizontalLineTo(146.08f)
                lineToRelative(28.62f, -31.48f)
                close()
                moveTo(106.91f, 48.0f)
                horizontalLineToRelative(42.17f)
                lineToRelative(20.0f, 62.9f)
                lineTo(124.46f, 160.0f)
                horizontalLineTo(71.27f)
                close()
                moveTo(56.0f, 208.0f)
                lineToRelative(10.18f, -32.0f)
                horizontalLineTo(189.81f)
                lineTo(200.0f, 208.0f)
                close()
            }
        }
        .build()
        return _metronome!!
    }

private var _metronome: ImageVector? = null
