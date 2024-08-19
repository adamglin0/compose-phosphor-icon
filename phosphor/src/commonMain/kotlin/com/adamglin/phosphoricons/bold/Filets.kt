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

public val BoldGroup.Filets: ImageVector
    get() {
        if (_filets != null) {
            return _filets!!
        }
        _filets = Builder(name = "Filets", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.49f, 79.51f)
                lineToRelative(-56.0f, -56.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 152.0f, 20.0f)
                lineTo(56.0f, 20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 36.0f, 40.0f)
                verticalLineToRelative(68.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                lineTo(60.0f, 44.0f)
                horizontalLineToRelative(76.0f)
                lineTo(136.0f, 92.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                horizontalLineToRelative(48.0f)
                lineTo(196.0f, 212.0f)
                lineTo(180.0f, 212.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(20.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(220.0f, 88.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 216.49f, 79.51f)
                close()
                moveTo(160.0f, 57.0f)
                lineToRelative(23.0f, 23.0f)
                lineTo(160.0f, 80.0f)
                close()
                moveTo(155.78f, 196.85f)
                arcToRelative(24.75f, 24.75f, 0.0f, false, true, -10.95f, 18.06f)
                curveToRelative(-6.0f, 4.0f, -13.27f, 5.15f, -19.73f, 5.15f)
                arcToRelative(63.75f, 63.75f, 0.0f, false, true, -16.23f, -2.21f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 6.46f, -23.12f)
                curveToRelative(6.81f, 1.86f, 15.0f, 1.61f, 16.39f, 0.06f)
                arcToRelative(2.48f, 2.48f, 0.0f, false, false, 0.21f, -0.71f)
                curveToRelative(-1.94f, -1.23f, -6.83f, -2.64f, -9.88f, -3.52f)
                curveToRelative(-5.39f, -1.56f, -11.0f, -3.18f, -15.75f, -6.27f)
                curveToRelative(-7.62f, -4.92f, -11.21f, -12.45f, -10.11f, -21.2f)
                arcToRelative(24.45f, 24.45f, 0.0f, false, true, 10.69f, -17.75f)
                curveToRelative(6.06f, -4.09f, 14.17f, -5.83f, 24.1f, -5.18f)
                arcTo(68.53f, 68.53f, 0.0f, false, true, 143.0f, 142.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -6.1f, 23.21f)
                curveToRelative(-6.36f, -1.63f, -13.62f, -1.51f, -16.07f, -0.33f)
                arcToRelative(79.5f, 79.5f, 0.0f, false, false, 7.91f, 2.59f)
                curveToRelative(5.48f, 1.58f, 11.68f, 3.37f, 16.8f, 6.82f)
                curveTo(153.33f, 179.55f, 157.0f, 187.55f, 155.78f, 196.82f)
                close()
                moveTo(92.0f, 152.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                lineTo(72.0f, 164.0f)
                verticalLineToRelative(44.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(48.0f, 164.0f)
                lineTo(40.0f, 164.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                lineTo(80.0f, 140.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 92.0f, 152.0f)
                close()
            }
        }
        .build()
        return _filets!!
    }

private var _filets: ImageVector? = null
