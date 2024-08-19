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

public val BoldGroup.Numbersquaretwo: ImageVector
    get() {
        if (_numbersquaretwo != null) {
            return _numbersquaretwo!!
        }
        _numbersquaretwo = Builder(name = "Numbersquaretwo", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 28.0f)
                lineTo(48.0f, 28.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 28.0f, 48.0f)
                lineTo(28.0f, 208.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(208.0f, 228.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(228.0f, 48.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 208.0f, 28.0f)
                close()
                moveTo(204.0f, 204.0f)
                lineTo(52.0f, 204.0f)
                lineTo(52.0f, 52.0f)
                lineTo(204.0f, 52.0f)
                close()
                moveTo(137.57f, 111.24f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -2.35f, -16.82f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -16.8f, 2.36f)
                arcToRelative(11.7f, 11.7f, 0.0f, false, false, -1.74f, 3.22f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -22.63f, -8.0f)
                arcToRelative(36.45f, 36.45f, 0.0f, false, true, 5.2f, -9.67f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, 57.5f, 43.34f)
                lineTo(128.0f, 164.0f)
                horizontalLineToRelative(24.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                lineTo(104.0f, 188.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -9.6f, -19.2f)
                close()
            }
        }
        .build()
        return _numbersquaretwo!!
    }

private var _numbersquaretwo: ImageVector? = null
