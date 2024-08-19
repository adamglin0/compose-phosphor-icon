package com.adamglin.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.LightGroup

public val LightGroup.Metronome: ImageVector
    get() {
        if (_metronome != null) {
            return _metronome!!
        }
        _metronome = Builder(name = "Metronome", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(213.33f, 203.75f)
                lineToRelative(-28.45f, -89.41f)
                lineTo(212.43f, 84.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 203.55f, 76.0f)
                lineToRelative(-22.87f, 25.17f)
                lineTo(162.42f, 43.75f)
                arcTo(13.94f, 13.94f, 0.0f, false, false, 149.08f, 34.0f)
                horizontalLineTo(106.92f)
                arcToRelative(13.94f, 13.94f, 0.0f, false, false, -13.34f, 9.75f)
                lineToRelative(-50.91f, 160.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 56.0f, 222.0f)
                horizontalLineTo(200.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 13.34f, -18.25f)
                close()
                moveTo(187.45f, 162.0f)
                horizontalLineTo(141.56f)
                lineToRelative(34.0f, -37.39f)
                close()
                moveTo(105.0f, 47.39f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 106.92f, 46.0f)
                horizontalLineToRelative(42.16f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 151.0f, 47.39f)
                lineToRelative(20.36f, 64.0f)
                lineToRelative(-46.0f, 50.61f)
                horizontalLineTo(68.55f)
                close()
                moveTo(201.6f, 209.18f)
                arcTo(1.94f, 1.94f, 0.0f, false, true, 200.0f, 210.0f)
                horizontalLineTo(56.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.9f, -2.61f)
                lineTo(64.73f, 174.0f)
                horizontalLineTo(191.27f)
                lineToRelative(10.62f, 33.39f)
                arcTo(1.94f, 1.94f, 0.0f, false, true, 201.6f, 209.18f)
                close()
            }
        }
        .build()
        return _metronome!!
    }

private var _metronome: ImageVector? = null
