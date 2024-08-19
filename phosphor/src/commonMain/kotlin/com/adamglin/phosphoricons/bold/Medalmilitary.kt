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

public val BoldGroup.Medalmilitary: ImageVector
    get() {
        if (_medalmilitary != null) {
            return _medalmilitary!!
        }
        _medalmilitary = Builder(name = "Medalmilitary", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(207.0f, 36.0f)
                lineTo(49.0f, 36.0f)
                arcTo(21.0f, 21.0f, 0.0f, false, false, 28.0f, 57.0f)
                verticalLineToRelative(49.21f)
                arcToRelative(21.0f, 21.0f, 0.0f, false, false, 12.31f, 19.11f)
                lineToRelative(56.0f, 25.47f)
                arcToRelative(52.0f, 52.0f, 0.0f, true, false, 63.32f, 0.0f)
                lineToRelative(56.0f, -25.47f)
                arcTo(21.0f, 21.0f, 0.0f, false, false, 228.0f, 106.21f)
                lineTo(228.0f, 57.0f)
                arcTo(21.0f, 21.0f, 0.0f, false, false, 207.0f, 36.0f)
                close()
                moveTo(128.0f, 138.82f)
                lineToRelative(-28.0f, -12.73f)
                lineTo(100.0f, 60.0f)
                horizontalLineToRelative(56.0f)
                verticalLineToRelative(66.09f)
                close()
                moveTo(52.0f, 60.0f)
                lineTo(76.0f, 60.0f)
                verticalLineToRelative(55.18f)
                lineTo(52.0f, 104.27f)
                close()
                moveTo(128.0f, 220.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, true, 28.0f, -28.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 128.0f, 220.0f)
                close()
                moveTo(204.0f, 104.27f)
                lineTo(180.0f, 115.18f)
                lineTo(180.0f, 60.0f)
                horizontalLineToRelative(24.0f)
                close()
            }
        }
        .build()
        return _medalmilitary!!
    }

private var _medalmilitary: ImageVector? = null
