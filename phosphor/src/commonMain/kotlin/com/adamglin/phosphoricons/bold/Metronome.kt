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

public val BoldGroup.Metronome: ImageVector
    get() {
        if (_metronome != null) {
            return _metronome!!
        }
        _metronome = Builder(name = "Metronome", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(219.05f, 201.94f)
                lineToRelative(-27.4f, -86.12f)
                lineToRelative(25.23f, -27.75f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.76f, -16.14f)
                lineTo(183.24f, 89.39f)
                lineToRelative(-15.1f, -47.45f)
                arcTo(19.93f, 19.93f, 0.0f, false, false, 149.08f, 28.0f)
                horizontalLineTo(106.91f)
                arcTo(19.93f, 19.93f, 0.0f, false, false, 87.85f, 41.94f)
                lineToRelative(-50.91f, 160.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 56.0f, 228.0f)
                horizontalLineTo(200.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 19.06f, -26.06f)
                close()
                moveTo(179.25f, 156.0f)
                horizontalLineTo(155.12f)
                lineTo(173.0f, 136.34f)
                close()
                moveTo(109.83f, 52.0f)
                horizontalLineToRelative(36.33f)
                lineToRelative(18.42f, 57.91f)
                lineTo(122.69f, 156.0f)
                horizontalLineTo(76.74f)
                close()
                moveTo(61.47f, 204.0f)
                lineToRelative(7.63f, -24.0f)
                horizontalLineTo(186.89f)
                lineToRelative(7.63f, 24.0f)
                close()
            }
        }
        .build()
        return _metronome!!
    }

private var _metronome: ImageVector? = null
