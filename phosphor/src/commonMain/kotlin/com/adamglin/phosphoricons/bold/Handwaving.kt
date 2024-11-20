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

public val BoldGroup.HandWaving: ImageVector
    get() {
        if (_handWaving != null) {
            return _handWaving!!
        }
        _handWaving = Builder(name = "HandWaving", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(184.63f, 23.14f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 15.0f, -8.0f)
                arcTo(72.34f, 72.34f, 0.0f, false, true, 228.4f, 32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -16.58f, 17.35f)
                arcToRelative(48.31f, 48.31f, 0.0f, false, false, -19.2f, -11.2f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 184.63f, 23.14f)
                close()
                moveTo(232.85f, 167.8f)
                arcTo(92.0f, 92.0f, 0.0f, false, true, 64.31f, 190.0f)
                lineToRelative(-40.0f, -69.32f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 36.0f, 77.0f)
                arcToRelative(31.72f, 31.72f, 0.0f, false, true, 7.54f, -3.14f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 88.65f, 32.45f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, 53.0f, 3.55f)
                lineToRelative(14.53f, 25.17f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 206.35f, 68.0f)
                lineToRelative(17.31f, 30.0f)
                arcTo(91.38f, 91.38f, 0.0f, false, true, 232.85f, 167.8f)
                close()
                moveTo(202.85f, 109.99f)
                lineTo(185.57f, 80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -13.86f, 8.0f)
                horizontalLineToRelative(0.0f)
                lineToRelative(6.68f, 11.57f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -3.18f, 15.59f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, -6.41f, 38.1f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -19.86f, 13.46f)
                arcToRelative(52.05f, 52.05f, 0.0f, false, true, 3.9f, -63.4f)
                lineTo(120.9f, 48.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 107.0f, 56.0f)
                lineToRelative(24.25f, 42.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -20.78f, 12.0f)
                lineTo(79.33f, 56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -13.85f, 8.0f)
                lineTo(99.0f, 122.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -20.78f, 12.0f)
                lineTo(58.93f, 100.67f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -13.85f, 8.0f)
                lineTo(85.1f, 178.0f)
                arcToRelative(68.0f, 68.0f, 0.0f, false, false, 117.78f, -68.0f)
                close()
                moveTo(50.46f, 198.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, -20.78f, 12.0f)
                arcToRelative(132.79f, 132.79f, 0.0f, false, false, 20.0f, 26.38f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 17.17f, -16.76f)
                arcTo(109.2f, 109.2f, 0.0f, false, true, 50.46f, 198.0f)
                close()
            }
        }
        .build()
        return _handWaving!!
    }

private var _handWaving: ImageVector? = null
