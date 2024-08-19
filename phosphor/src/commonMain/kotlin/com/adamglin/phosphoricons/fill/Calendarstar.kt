package com.adamglin.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.FillGroup

public val FillGroup.Calendarstar: ImageVector
    get() {
        if (_calendarstar != null) {
            return _calendarstar!!
        }
        _calendarstar = Builder(name = "Calendarstar", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 32.0f)
                lineTo(184.0f, 32.0f)
                lineTo(184.0f, 24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                verticalLineToRelative(8.0f)
                lineTo(88.0f, 32.0f)
                lineTo(88.0f, 24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                verticalLineToRelative(8.0f)
                lineTo(48.0f, 32.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 32.0f, 48.0f)
                lineTo(32.0f, 208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(208.0f, 224.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(224.0f, 48.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 208.0f, 32.0f)
                close()
                moveTo(72.0f, 64.0f)
                lineTo(72.0f, 56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                close()
                moveTo(178.55f, 124.7f)
                lineTo(154.09f, 144.89f)
                lineTo(161.55f, 175.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -1.49f, 4.17f)
                arcToRelative(4.05f, 4.05f, 0.0f, false, true, -2.39f, 0.79f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.0f, -0.55f)
                lineTo(128.0f, 163.18f)
                lineToRelative(-27.64f, 16.27f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 94.45f, 175.0f)
                lineToRelative(7.46f, -30.15f)
                lineTo(77.45f, 124.7f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 2.24f, -7.08f)
                lineToRelative(32.24f, -2.49f)
                lineToRelative(12.4f, -28.71f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 7.34f, 0.0f)
                lineToRelative(12.4f, 28.71f)
                lineToRelative(32.24f, 2.49f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 2.24f, 7.08f)
                close()
                moveTo(184.0f, 64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(168.0f, 56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                close()
            }
        }
        .build()
        return _calendarstar!!
    }

private var _calendarstar: ImageVector? = null
