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

public val DuotoneGroup.PokerChip: ImageVector
    get() {
        if (_pokerChip != null) {
            return _pokerChip!!
        }
        _pokerChip = Builder(name = "PokerChip", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(128.0f, 32.0f)
                arcToRelative(96.0f, 96.0f, 0.0f, true, false, 96.0f, 96.0f)
                arcTo(96.0f, 96.0f, 0.0f, false, false, 128.0f, 32.0f)
                close()
                moveTo(128.0f, 184.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, true, true, 56.0f, -56.0f)
                arcTo(56.0f, 56.0f, 0.0f, false, true, 128.0f, 184.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 24.0f)
                arcTo(104.0f, 104.0f, 0.0f, true, false, 232.0f, 128.0f)
                arcTo(104.11f, 104.11f, 0.0f, false, false, 128.0f, 24.0f)
                close()
                moveTo(128.0f, 176.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, true, 48.0f, -48.0f)
                arcTo(48.05f, 48.05f, 0.0f, false, true, 128.0f, 176.0f)
                close()
                moveTo(167.21f, 77.47f)
                arcToRelative(63.66f, 63.66f, 0.0f, false, false, -31.21f, -13.0f)
                lineTo(136.0f, 40.37f)
                arcToRelative(87.6f, 87.6f, 0.0f, false, true, 48.28f, 20.0f)
                close()
                moveTo(120.0f, 64.52f)
                arcToRelative(63.66f, 63.66f, 0.0f, false, false, -31.21f, 13.0f)
                lineTo(71.72f, 60.4f)
                arcToRelative(87.6f, 87.6f, 0.0f, false, true, 48.28f, -20.0f)
                close()
                moveTo(77.47f, 88.79f)
                arcToRelative(63.66f, 63.66f, 0.0f, false, false, -13.0f, 31.21f)
                lineTo(40.37f, 120.0f)
                arcToRelative(87.6f, 87.6f, 0.0f, false, true, 20.0f, -48.28f)
                close()
                moveTo(64.52f, 136.0f)
                arcToRelative(63.66f, 63.66f, 0.0f, false, false, 13.0f, 31.21f)
                lineTo(60.4f, 184.28f)
                arcToRelative(87.6f, 87.6f, 0.0f, false, true, -20.0f, -48.28f)
                close()
                moveTo(88.79f, 178.53f)
                arcTo(63.66f, 63.66f, 0.0f, false, false, 120.0f, 191.48f)
                verticalLineToRelative(24.15f)
                arcToRelative(87.6f, 87.6f, 0.0f, false, true, -48.28f, -20.0f)
                close()
                moveTo(136.0f, 191.48f)
                arcToRelative(63.66f, 63.66f, 0.0f, false, false, 31.21f, -12.95f)
                lineToRelative(17.07f, 17.07f)
                arcToRelative(87.6f, 87.6f, 0.0f, false, true, -48.28f, 20.0f)
                close()
                moveTo(178.53f, 167.21f)
                arcTo(63.66f, 63.66f, 0.0f, false, false, 191.48f, 136.0f)
                horizontalLineToRelative(24.15f)
                arcToRelative(87.6f, 87.6f, 0.0f, false, true, -20.0f, 48.28f)
                close()
                moveTo(191.48f, 120.0f)
                arcToRelative(63.66f, 63.66f, 0.0f, false, false, -12.95f, -31.21f)
                lineTo(195.6f, 71.72f)
                arcToRelative(87.6f, 87.6f, 0.0f, false, true, 20.0f, 48.28f)
                close()
            }
        }
        .build()
        return _pokerChip!!
    }

private var _pokerChip: ImageVector? = null
