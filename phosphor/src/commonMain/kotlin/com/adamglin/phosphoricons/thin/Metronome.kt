package com.adamglin.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.ThinGroup

public val ThinGroup.Metronome: ImageVector
    get() {
        if (_metronome != null) {
            return _metronome!!
        }
        _metronome = Builder(name = "Metronome", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(182.63f, 113.85f)
                lineTo(211.0f, 82.69f)
                arcTo(4.0f, 4.0f, 0.0f, true, false, 205.0f, 77.31f)
                lineTo(179.82f, 105.0f)
                lineToRelative(-19.3f, -60.68f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 149.08f, 36.0f)
                horizontalLineTo(106.92f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -11.44f, 8.36f)
                lineToRelative(-50.9f, 160.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 56.0f, 220.0f)
                horizontalLineTo(200.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 11.43f, -15.64f)
                close()
                moveTo(190.19f, 164.0f)
                horizontalLineTo(137.0f)
                lineToRelative(39.37f, -43.31f)
                close()
                moveTo(103.1f, 46.79f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 106.92f, 44.0f)
                horizontalLineToRelative(42.16f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.82f, 2.79f)
                lineToRelative(20.71f, 65.09f)
                lineTo(126.23f, 164.0f)
                horizontalLineTo(65.81f)
                close()
                moveTo(203.22f, 210.36f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 200.0f, 212.0f)
                horizontalLineTo(56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.81f, -5.21f)
                lineTo(63.27f, 172.0f)
                horizontalLineTo(192.73f)
                lineToRelative(11.07f, 34.79f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 203.22f, 210.36f)
                close()
            }
        }
        .build()
        return _metronome!!
    }

private var _metronome: ImageVector? = null
