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

public val ThinGroup.Pokerchip: ImageVector
    get() {
        if (_pokerchip != null) {
            return _pokerchip!!
        }
        _pokerchip = Builder(name = "Pokerchip", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 28.0f)
                arcTo(100.0f, 100.0f, 0.0f, true, false, 228.0f, 128.0f)
                arcTo(100.11f, 100.11f, 0.0f, false, false, 128.0f, 28.0f)
                close()
                moveTo(128.0f, 180.0f)
                arcToRelative(52.0f, 52.0f, 0.0f, true, true, 52.0f, -52.0f)
                arcTo(52.06f, 52.06f, 0.0f, false, true, 128.0f, 180.0f)
                close()
                moveTo(167.47f, 82.87f)
                arcTo(59.7f, 59.7f, 0.0f, false, false, 132.0f, 68.15f)
                lineTo(132.0f, 36.09f)
                arcToRelative(91.64f, 91.64f, 0.0f, false, true, 58.13f, 24.12f)
                close()
                moveTo(124.0f, 68.15f)
                arcTo(59.7f, 59.7f, 0.0f, false, false, 88.53f, 82.87f)
                lineTo(65.87f, 60.21f)
                arcTo(91.64f, 91.64f, 0.0f, false, true, 124.0f, 36.09f)
                close()
                moveTo(82.87f, 88.53f)
                arcTo(59.7f, 59.7f, 0.0f, false, false, 68.15f, 124.0f)
                lineTo(36.09f, 124.0f)
                arcTo(91.64f, 91.64f, 0.0f, false, true, 60.21f, 65.87f)
                close()
                moveTo(68.15f, 132.0f)
                arcToRelative(59.7f, 59.7f, 0.0f, false, false, 14.72f, 35.47f)
                lineTo(60.21f, 190.13f)
                arcTo(91.64f, 91.64f, 0.0f, false, true, 36.09f, 132.0f)
                close()
                moveTo(88.53f, 173.13f)
                arcTo(59.7f, 59.7f, 0.0f, false, false, 124.0f, 187.85f)
                verticalLineToRelative(32.06f)
                arcToRelative(91.64f, 91.64f, 0.0f, false, true, -58.13f, -24.12f)
                close()
                moveTo(132.0f, 187.85f)
                arcToRelative(59.7f, 59.7f, 0.0f, false, false, 35.47f, -14.72f)
                lineToRelative(22.66f, 22.66f)
                arcTo(91.64f, 91.64f, 0.0f, false, true, 132.0f, 219.91f)
                close()
                moveTo(173.13f, 167.47f)
                arcTo(59.7f, 59.7f, 0.0f, false, false, 187.85f, 132.0f)
                horizontalLineToRelative(32.06f)
                arcToRelative(91.64f, 91.64f, 0.0f, false, true, -24.12f, 58.13f)
                close()
                moveTo(187.85f, 124.0f)
                arcToRelative(59.7f, 59.7f, 0.0f, false, false, -14.72f, -35.47f)
                lineToRelative(22.66f, -22.66f)
                arcTo(91.64f, 91.64f, 0.0f, false, true, 219.91f, 124.0f)
                close()
            }
        }
        .build()
        return _pokerchip!!
    }

private var _pokerchip: ImageVector? = null
