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

public val DuotoneGroup.SpeakerHigh: ImageVector
    get() {
        if (_speakerHigh != null) {
            return _speakerHigh!!
        }
        _speakerHigh = Builder(name = "SpeakerHigh", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(80.0f, 88.0f)
                verticalLineToRelative(80.0f)
                horizontalLineTo(32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                verticalLineTo(96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(155.51f, 24.81f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.42f, 0.88f)
                lineTo(77.25f, 80.0f)
                lineTo(32.0f, 80.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 16.0f, 96.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(77.25f, 176.0f)
                lineToRelative(69.84f, 54.31f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 160.0f, 224.0f)
                lineTo(160.0f, 32.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 155.51f, 24.81f)
                close()
                moveTo(32.0f, 96.0f)
                lineTo(72.0f, 96.0f)
                verticalLineToRelative(64.0f)
                lineTo(32.0f, 160.0f)
                close()
                moveTo(144.0f, 207.64f)
                lineTo(88.0f, 164.09f)
                lineTo(88.0f, 91.91f)
                lineToRelative(56.0f, -43.55f)
                close()
                moveTo(198.0f, 101.56f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, 0.0f, 52.88f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -12.0f, -10.58f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 0.0f, -31.72f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 12.0f, -10.58f)
                close()
                moveTo(248.0f, 128.0f)
                arcToRelative(79.9f, 79.9f, 0.0f, false, true, -20.37f, 53.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.92f, -10.67f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, false, 0.0f, -85.33f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 11.92f, -10.67f)
                arcTo(79.83f, 79.83f, 0.0f, false, true, 248.0f, 128.0f)
                close()
            }
        }
        .build()
        return _speakerHigh!!
    }

private var _speakerHigh: ImageVector? = null
